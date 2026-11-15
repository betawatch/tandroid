package org.scilab.forge.jlatexmath;

import a8.p0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public class SymbolNotFoundException extends JMathTeXException {
    private static final long serialVersionUID = -3005021333407670912L;

    public SymbolNotFoundException(String str) {
        super(p0.p("There's no symbol with the name '", str, "' defined in 'TeXSymbols.xml'!"));
    }
}
