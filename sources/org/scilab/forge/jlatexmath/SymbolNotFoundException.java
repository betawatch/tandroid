package org.scilab.forge.jlatexmath;

import a4.a;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public class SymbolNotFoundException extends JMathTeXException {
    private static final long serialVersionUID = -3005021333407670912L;

    public SymbolNotFoundException(String str) {
        super(a.p("There's no symbol with the name '", str, "' defined in 'TeXSymbols.xml'!"));
    }
}
