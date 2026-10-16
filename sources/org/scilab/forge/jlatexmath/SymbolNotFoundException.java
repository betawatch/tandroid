package org.scilab.forge.jlatexmath;

import a1.g;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public class SymbolNotFoundException extends JMathTeXException {
    private static final long serialVersionUID = -3005021333407670912L;

    public SymbolNotFoundException(String str) {
        super(g.p("There's no symbol with the name '", str, "' defined in 'TeXSymbols.xml'!"));
    }
}
