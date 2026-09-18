package org.scilab.forge.jlatexmath;

import a4.a;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public class SymbolMappingNotFoundException extends JMathTeXException {
    private static final long serialVersionUID = 2659192520874275262L;

    public SymbolMappingNotFoundException(String str) {
        super(a.p("No mapping found for the symbol '", str, "'! Insert a <SymbolMapping>-element in 'DefaultTeXFont.xml'."));
    }
}
