package org.scilab.forge.jlatexmath;

import a4.a;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes.dex */
public class SymbolNotFoundException extends JMathTeXException {
    private static final long serialVersionUID = -3005021333407670912L;

    public SymbolNotFoundException(String str) {
        super(a.q("There's no symbol with the name '", str, "' defined in 'TeXSymbols.xml'!"));
    }
}
