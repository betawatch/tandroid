package org.scilab.forge.jlatexmath;

import aa.d;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class SymbolNotFoundException extends JMathTeXException {
    private static final long serialVersionUID = -3005021333407670912L;

    public SymbolNotFoundException(String str) {
        super(d.o("There's no symbol with the name '", str, "' defined in 'TeXSymbols.xml'!"));
    }
}
