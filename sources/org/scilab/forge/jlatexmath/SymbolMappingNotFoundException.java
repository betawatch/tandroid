package org.scilab.forge.jlatexmath;

/* loaded from: classes3.dex */
public class SymbolMappingNotFoundException extends JMathTeXException {
    protected SymbolMappingNotFoundException(String str) {
        super("No mapping found for the symbol '" + str + "'! Insert a <SymbolMapping>-element in 'DefaultTeXFont.xml'.");
    }
}
