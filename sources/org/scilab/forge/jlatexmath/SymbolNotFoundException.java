package org.scilab.forge.jlatexmath;

import a9.p;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public class SymbolNotFoundException extends JMathTeXException {
    private static final long serialVersionUID = -3005021333407670912L;

    public SymbolNotFoundException(String str) {
        super(p.m("There's no symbol with the name '", str, "' defined in 'TeXSymbols.xml'!"));
    }
}
