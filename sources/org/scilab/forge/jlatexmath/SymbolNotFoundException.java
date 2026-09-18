package org.scilab.forge.jlatexmath;

import a4.a;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public class SymbolNotFoundException extends JMathTeXException {
    private static final long serialVersionUID = -3005021333407670912L;

    public SymbolNotFoundException(String str) {
        super(a.p("There's no symbol with the name '", str, "' defined in 'TeXSymbols.xml'!"));
    }
}
