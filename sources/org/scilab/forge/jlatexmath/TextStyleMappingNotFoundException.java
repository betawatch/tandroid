package org.scilab.forge.jlatexmath;

import a8.p0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public class TextStyleMappingNotFoundException extends JMathTeXException {
    private static final long serialVersionUID = 4887043712790844966L;

    public TextStyleMappingNotFoundException(String str) {
        super(p0.p("No mapping found for the text style '", str, "'! Insert a <TextStyleMapping>-element in 'DefaultTeXFont.xml'."));
    }
}
