package org.scilab.forge.jlatexmath;

import java.io.InputStream;
import java.util.Map;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import ru.noties.jlatexmath.JLatexMathAndroid;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public class PredefinedTeXFormulaParser {
    public static final String RESOURCE_NAME = "PredefinedTeXFormulas.xml";
    private Element root;
    private String type;

    public PredefinedTeXFormulaParser(InputStream inputStream, String str) {
        try {
            this.type = str;
            DocumentBuilderFactory newInstance = DocumentBuilderFactory.newInstance();
            newInstance.setIgnoringElementContentWhitespace(true);
            newInstance.setIgnoringComments(true);
            this.root = newInstance.newDocumentBuilder().parse(inputStream).getDocumentElement();
        } catch (Exception e7) {
            throw new XMLResourceParseException("", e7);
        }
    }

    private static String getAttrValueAndCheckIfNotNull(String str, Element element) {
        String attribute = element.getAttribute(str);
        if (attribute.equals("")) {
            throw new XMLResourceParseException(RESOURCE_NAME, element.getTagName(), str, null);
        }
        return attribute;
    }

    public void parse(Map map) {
        if ("true".equals(getAttrValueAndCheckIfNotNull("enabled", this.root))) {
            NodeList elementsByTagName = this.root.getElementsByTagName(this.type);
            for (int i10 = 0; i10 < elementsByTagName.getLength(); i10++) {
                Element element = (Element) elementsByTagName.item(i10);
                if ("true".equals(getAttrValueAndCheckIfNotNull("enabled", element))) {
                    String attrValueAndCheckIfNotNull = getAttrValueAndCheckIfNotNull("name", element);
                    if ("TeXFormula".equals(this.type)) {
                        map.put(attrValueAndCheckIfNotNull, (TeXFormula) new TeXFormulaParser(attrValueAndCheckIfNotNull, element, this.type).parse());
                    } else {
                        map.put(attrValueAndCheckIfNotNull, (MacroInfo) new TeXFormulaParser(attrValueAndCheckIfNotNull, element, this.type).parse());
                    }
                }
            }
        }
    }

    public PredefinedTeXFormulaParser(String str, String str2) {
        this(JLatexMathAndroid.getResourceAsStream(str), str2);
    }
}
