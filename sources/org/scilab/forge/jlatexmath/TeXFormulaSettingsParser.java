package org.scilab.forge.jlatexmath;

import java.io.InputStream;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import ru.noties.jlatexmath.JLatexMathAndroid;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public class TeXFormulaSettingsParser {
    public static final String CHARTODEL_MAPPING_EL = "Map";
    public static final String RESOURCE_NAME = "TeXFormulaSettings.xml";
    private Element root;

    public TeXFormulaSettingsParser() {
        this(JLatexMathAndroid.getResourceAsStream(RESOURCE_NAME), RESOURCE_NAME);
    }

    private static void addFormulaToMap(NodeList nodeList, String[] strArr, String[] strArr2) {
        for (int i10 = 0; i10 < nodeList.getLength(); i10++) {
            Element element = (Element) nodeList.item(i10);
            String attribute = element.getAttribute("char");
            String attribute2 = element.getAttribute("formula");
            String attribute3 = element.getAttribute("text");
            if (attribute.equals("")) {
                throw new XMLResourceParseException(RESOURCE_NAME, element.getTagName(), "char", null);
            }
            if (attribute2.equals("")) {
                throw new XMLResourceParseException(RESOURCE_NAME, element.getTagName(), "formula", null);
            }
            if (attribute.length() != 1) {
                throw new XMLResourceParseException(RESOURCE_NAME, element.getTagName(), "char", "must have a value that contains exactly 1 character!");
            }
            strArr[attribute.charAt(0)] = attribute2;
            if (strArr2 != null && !attribute3.equals("")) {
                strArr2[attribute.charAt(0)] = attribute3;
            }
        }
    }

    private static void addToMap(NodeList nodeList, String[] strArr, String[] strArr2) {
        for (int i10 = 0; i10 < nodeList.getLength(); i10++) {
            Element element = (Element) nodeList.item(i10);
            String attribute = element.getAttribute("char");
            String attribute2 = element.getAttribute("symbol");
            String attribute3 = element.getAttribute("text");
            if (attribute.equals("")) {
                throw new XMLResourceParseException(RESOURCE_NAME, element.getTagName(), "char", null);
            }
            if (attribute2.equals("")) {
                throw new XMLResourceParseException(RESOURCE_NAME, element.getTagName(), "symbol", null);
            }
            if (attribute.length() != 1) {
                throw new XMLResourceParseException(RESOURCE_NAME, element.getTagName(), "char", "must have a value that contains exactly 1 character!");
            }
            strArr[attribute.charAt(0)] = attribute2;
            if (strArr2 != null && !attribute3.equals("")) {
                strArr2[attribute.charAt(0)] = attribute3;
            }
        }
    }

    public void parseSymbolMappings(String[] strArr, String[] strArr2) {
        Element element = (Element) this.root.getElementsByTagName("CharacterToSymbolMappings").item(0);
        if (element != null) {
            addToMap(element.getElementsByTagName(CHARTODEL_MAPPING_EL), strArr, strArr2);
        }
    }

    public void parseSymbolToFormulaMappings(String[] strArr, String[] strArr2) {
        Element element = (Element) this.root.getElementsByTagName("CharacterToFormulaMappings").item(0);
        if (element != null) {
            addFormulaToMap(element.getElementsByTagName(CHARTODEL_MAPPING_EL), strArr, strArr2);
        }
    }

    public TeXFormulaSettingsParser(InputStream inputStream, String str) {
        try {
            DocumentBuilderFactory newInstance = DocumentBuilderFactory.newInstance();
            newInstance.setIgnoringElementContentWhitespace(true);
            newInstance.setIgnoringComments(true);
            this.root = newInstance.newDocumentBuilder().parse(inputStream).getDocumentElement();
        } catch (Exception e) {
            throw new XMLResourceParseException(str, e);
        }
    }
}
