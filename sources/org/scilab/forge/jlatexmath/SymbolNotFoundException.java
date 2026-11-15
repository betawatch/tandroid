package org.scilab.forge.jlatexmath;

import a8.p0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public class SymbolNotFoundException extends JMathTeXException {
    private static final long serialVersionUID = -3005021333407670912L;

    public SymbolNotFoundException(String str) {
        super(p0.p("There's no symbol with the name '", str, "' defined in 'TeXSymbols.xml'!"));
    }
}
