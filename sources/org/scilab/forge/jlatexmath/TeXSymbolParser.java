package org.scilab.forge.jlatexmath;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import ru.noties.jlatexmath.JLatexMathAndroid;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public class TeXSymbolParser {
    public static final String DELIMITER_ATTR = "del";
    public static final String RESOURCE_NAME = "TeXSymbols.xml";
    public static final String TYPE_ATTR = "type";
    private static Map<String, Integer> typeMappings = new HashMap();
    private Element root;

    public TeXSymbolParser(InputStream inputStream, String str) {
        try {
            DocumentBuilderFactory newInstance = DocumentBuilderFactory.newInstance();
            newInstance.setIgnoringElementContentWhitespace(true);
            newInstance.setIgnoringComments(true);
            this.root = newInstance.newDocumentBuilder().parse(inputStream).getDocumentElement();
            setTypeMappings();
        } catch (Exception e) {
            throw new XMLResourceParseException(str, e);
        }
    }

    private static String getAttrValueAndCheckIfNotNull(String str, Element element) {
        String attribute = element.getAttribute(str);
        if (!attribute.equals("")) {
            return attribute;
        }
        da3.b(RESOURCE_NAME, element.getTagName(), str, null);
        return null;
    }

    private void setTypeMappings() {
        typeMappings.put("ord", 0);
        typeMappings.put("op", 1);
        typeMappings.put("bin", 2);
        typeMappings.put("rel", 3);
        typeMappings.put("open", 4);
        typeMappings.put("close", 5);
        typeMappings.put("punct", 6);
        typeMappings.put("acc", 10);
    }

    public Map<String, SymbolAtom> readSymbols() {
        HashMap hashMap = new HashMap();
        NodeList elementsByTagName = this.root.getElementsByTagName("Symbol");
        for (int i = 0; i < elementsByTagName.getLength(); i++) {
            Element element = (Element) elementsByTagName.item(i);
            String attrValueAndCheckIfNotNull = getAttrValueAndCheckIfNotNull("name", element);
            String attrValueAndCheckIfNotNull2 = getAttrValueAndCheckIfNotNull(TYPE_ATTR, element);
            String attribute = element.getAttribute(DELIMITER_ATTR);
            boolean z = attribute != null && attribute.equals("true");
            Integer num = typeMappings.get(attrValueAndCheckIfNotNull2);
            if (num == null) {
                da3.b(RESOURCE_NAME, "Symbol", TYPE_ATTR, qd4.y("has an unknown value '", attrValueAndCheckIfNotNull2, "'!"));
                return null;
            }
            hashMap.put(attrValueAndCheckIfNotNull, new SymbolAtom(attrValueAndCheckIfNotNull, num.intValue(), z));
        }
        return hashMap;
    }

    public TeXSymbolParser() {
        this(JLatexMathAndroid.getResourceAsStream(RESOURCE_NAME), RESOURCE_NAME);
    }
}
