package org.scilab.forge.jlatexmath;

import a1.g;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes.dex */
public class SymbolNotFoundException extends JMathTeXException {
    private static final long serialVersionUID = -3005021333407670912L;

    public SymbolNotFoundException(String str) {
        super(g.p("There's no symbol with the name '", str, "' defined in 'TeXSymbols.xml'!"));
    }
}
