/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ni.edu.uni.programacion.controllers;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import ni.edu.uni.programacion.view.panels.pnlTable;
/**
 *
 * @author Sistemas-09
 */
public class pnlTableController {
        private pnlTable pnlViewTable;
        private DefaultTableModel tblViewModel;
        private String[] Headers = new String[]{"Codigo","Nombre", "Cantidad", "Precio", "Subtotal"};
        private TableRowSorter<DefaultTableModel> tableRowSorter;

    public pnlTableController(pnlTable pnlTbl) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
        
    
}
