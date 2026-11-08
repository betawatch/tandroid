package org.scilab.forge.jlatexmath;

import a8.p0;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public class SymbolNotFoundException extends JMathTeXException {
    private static final long serialVersionUID = -3005021333407670912L;

    public SymbolNotFoundException(String str) {
        super(p0.p("There's no symbol with the name '", str, "' defined in 'TeXSymbols.xml'!"));
    }
}
