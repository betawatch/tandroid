package org.scilab.forge.jlatexmath;

import a1.g;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes.dex */
public class SymbolNotFoundException extends JMathTeXException {
    private static final long serialVersionUID = -3005021333407670912L;

    public SymbolNotFoundException(String str) {
        super(g.p("There's no symbol with the name '", str, "' defined in 'TeXSymbols.xml'!"));
    }
}
