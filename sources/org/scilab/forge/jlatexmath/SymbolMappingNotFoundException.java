package org.scilab.forge.jlatexmath;

import a8.p0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public class SymbolMappingNotFoundException extends JMathTeXException {
    private static final long serialVersionUID = 2659192520874275262L;

    public SymbolMappingNotFoundException(String str) {
        super(p0.p("No mapping found for the symbol '", str, "'! Insert a <SymbolMapping>-element in 'DefaultTeXFont.xml'."));
    }
}
