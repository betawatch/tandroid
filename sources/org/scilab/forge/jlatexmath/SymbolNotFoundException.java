package org.scilab.forge.jlatexmath;

import a4.a;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes.dex */
public class SymbolNotFoundException extends JMathTeXException {
    private static final long serialVersionUID = -3005021333407670912L;

    public SymbolNotFoundException(String str) {
        super(a.p("There's no symbol with the name '", str, "' defined in 'TeXSymbols.xml'!"));
    }
}
