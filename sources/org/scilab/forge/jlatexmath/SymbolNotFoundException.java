package org.scilab.forge.jlatexmath;

import a1.g;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public class SymbolNotFoundException extends JMathTeXException {
    private static final long serialVersionUID = -3005021333407670912L;

    public SymbolNotFoundException(String str) {
        super(g.n("There's no symbol with the name '", str, "' defined in 'TeXSymbols.xml'!"));
    }
}
