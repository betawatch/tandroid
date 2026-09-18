package org.scilab.forge.jlatexmath;

import a4.a;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes.dex */
public class SymbolNotFoundException extends JMathTeXException {
    private static final long serialVersionUID = -3005021333407670912L;

    public SymbolNotFoundException(String str) {
        super(a.p("There's no symbol with the name '", str, "' defined in 'TeXSymbols.xml'!"));
    }
}
