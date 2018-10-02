/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Certificatic_triangulo;

import javax.swing.JOptionPane;
 
/**
 *
 * @author Isnaeky Treiny
 */

public class triangulo {
     public static void main (String [ ] args) {
String base1 = null;
         int base =Integer.parseInt(JOptionPane.showInputDialog("ingrese la base"));
    String altura1 = null;
     int altura=Integer.parseInt(JOptionPane.showInputDialog("ingrese la altura"));
       int res;
       res=((base*altura)/2);
         System.out.println("la base del altura es" + res);
         String lado1 = null;
       int lado=Integer.parseInt(JOptionPane.showInputDialog("ingresa cuento mide el lado del tringulo"));
       int resul;
       resul=lado+lado+lado;
       JOptionPane.showMessageDialog(null, "El perimetro es"+resul);
   }

}


