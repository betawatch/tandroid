package org.scilab.forge.jlatexmath;

import android.support.v4.media.a;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public class SymbolNotFoundException extends JMathTeXException {
    private static final long serialVersionUID = -3005021333407670912L;

    public SymbolNotFoundException(String str) {
        super(a.o("There's no symbol with the name '", str, "' defined in 'TeXSymbols.xml'!"));
    }
}
