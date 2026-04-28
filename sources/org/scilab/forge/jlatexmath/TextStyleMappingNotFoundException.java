package org.scilab.forge.jlatexmath;

/* loaded from: classes3.dex */
public class TextStyleMappingNotFoundException extends JMathTeXException {
    private static final long serialVersionUID = 4887043712790844966L;

    protected TextStyleMappingNotFoundException(String str) {
        super("No mapping found for the text style '" + str + "'! Insert a <" + DefaultTeXFontParser.STYLE_MAPPING_EL + ">-element in '" + DefaultTeXFontParser.RESOURCE_NAME + "'.");
    }
}
