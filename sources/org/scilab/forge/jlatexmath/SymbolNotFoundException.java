package org.scilab.forge.jlatexmath;

import a4.a;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public class SymbolNotFoundException extends JMathTeXException {
    private static final long serialVersionUID = -3005021333407670912L;

    public SymbolNotFoundException(String str) {
        super(a.q("There's no symbol with the name '", str, "' defined in 'TeXSymbols.xml'!"));
    }
}
