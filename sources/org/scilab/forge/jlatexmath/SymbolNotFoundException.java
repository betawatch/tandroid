package org.scilab.forge.jlatexmath;

import a4.a;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
public class SymbolNotFoundException extends JMathTeXException {
    private static final long serialVersionUID = -3005021333407670912L;

    public SymbolNotFoundException(String str) {
        super(a.q("There's no symbol with the name '", str, "' defined in 'TeXSymbols.xml'!"));
    }
}
