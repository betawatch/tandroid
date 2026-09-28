package org.scilab.forge.jlatexmath;

import a4.a;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes.dex */
public class SymbolNotFoundException extends JMathTeXException {
    private static final long serialVersionUID = -3005021333407670912L;

    public SymbolNotFoundException(String str) {
        super(a.q("There's no symbol with the name '", str, "' defined in 'TeXSymbols.xml'!"));
    }
}
