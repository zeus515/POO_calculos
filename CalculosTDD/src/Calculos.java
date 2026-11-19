
public class Calculos {

    /**
     * *
     * Calcula la sumatoria de los numeros entre "x" a "y", incluyendolas
     *
     * @param x
     * @param y
     * @return sumatoria
     */
    int sumarSerie(int x, int y) {
        if(x>y){ //intercambiar orden
            int temp=x;
            x=y;
            y=temp;
        }
        //Recorrer y sumar
        int suma=0;
        for (int i=x; i<=y;i++)
            suma=suma+i;
        return suma;
    }

    /**
     * *
     * Calcula el valor absoluto de un numero
     *
     * @param num
     * @return valor absoluto
     */
    float absoluto(float num) {
        float res=Math.abs(num);
        return res;
    }

    /**
     * *
     * Cuenta las vocales en una frase
     *
     * @param texto
     * @return cantidad de vocales
     */
    int vocales(String texto) {
        if(texto==null) //sin texto no hay vocales
            return 0;
        //Recorrer y contar
        String vocales="aeiouáéíóú";
        int cont=0;
        for (char letra : texto.toLowerCase().toCharArray())
            if(vocales.indexOf(letra)>=0)
                cont++;
        return cont;
    }

    /**
     * *
     * Invierte el orden de las letras en cada palabra, pero no altera el orden
     * de las palabras
     *
     * @param texto
     * @return texto invertida
     */
    String invertir(String texto) {
        if(texto==null) //sin texto no hay nada que invertir
            return null;
        //Separar las palabras e invertir cada una
        String[] palabras=texto.split(" ", -1);
        String res="";
        for (int i=0; i<palabras.length;i++){
            String invertida=new StringBuilder(palabras[i]).reverse().toString();
            res=res+invertida;
            if(i<palabras.length-1)
                res=res+" ";
        }
        return res;
    }

}
