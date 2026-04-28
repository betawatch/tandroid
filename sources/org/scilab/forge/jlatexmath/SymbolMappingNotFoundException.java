package org.scilab.forge.jlatexmath;

/* loaded from: classes3.dex */
public class SymbolMappingNotFoundException extends JMathTeXException {
    private static final long serialVersionUID = 2659192520874275262L;

    protected SymbolMappingNotFoundException(String str) {
        super("No mapping found for the symbol '" + str + "'! Insert a <" + DefaultTeXFontParser.SYMBOL_MAPPING_EL + ">-element in '" + DefaultTeXFontParser.RESOURCE_NAME + "'.");
    }
}
