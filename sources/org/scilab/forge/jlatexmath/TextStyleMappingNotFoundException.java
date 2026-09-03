package org.scilab.forge.jlatexmath;

import android.support.v4.media.a;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public class TextStyleMappingNotFoundException extends JMathTeXException {
    private static final long serialVersionUID = 4887043712790844966L;

    public TextStyleMappingNotFoundException(String str) {
        super(a.o("No mapping found for the text style '", str, "'! Insert a <TextStyleMapping>-element in 'DefaultTeXFont.xml'."));
    }
}
