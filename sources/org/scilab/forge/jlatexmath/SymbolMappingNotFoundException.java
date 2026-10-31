package org.scilab.forge.jlatexmath;

import a1.g;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public class SymbolMappingNotFoundException extends JMathTeXException {
    private static final long serialVersionUID = 2659192520874275262L;

    public SymbolMappingNotFoundException(String str) {
        super(g.n("No mapping found for the symbol '", str, "'! Insert a <SymbolMapping>-element in 'DefaultTeXFont.xml'."));
    }
}
