package org.scilab.forge.jlatexmath;

/* loaded from: classes3.dex */
public class SymbolNotFoundException extends JMathTeXException {
    protected SymbolNotFoundException(String str) {
        super("There's no symbol with the name '" + str + "' defined in 'TeXSymbols.xml'!");
    }
}
