package org.scilab.forge.jlatexmath;

import a1.g;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public class TextStyleMappingNotFoundException extends JMathTeXException {
    private static final long serialVersionUID = 4887043712790844966L;

    public TextStyleMappingNotFoundException(String str) {
        super(g.n("No mapping found for the text style '", str, "'! Insert a <TextStyleMapping>-element in 'DefaultTeXFont.xml'."));
    }
}
