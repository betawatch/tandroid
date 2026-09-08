package org.scilab.forge.jlatexmath;

import a4.a;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import ru.noties.jlatexmath.JLatexMathAndroid;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public class TeXSymbolParser {
    public static final String DELIMITER_ATTR = "del";
    public static final String RESOURCE_NAME = "TeXSymbols.xml";
    public static final String TYPE_ATTR = "type";
    private static Map<String, Integer> typeMappings = new HashMap();
    private Element root;

    public TeXSymbolParser() {
        this(JLatexMathAndroid.getResourceAsStream(RESOURCE_NAME), RESOURCE_NAME);
    }

    private static String getAttrValueAndCheckIfNotNull(String str, Element element) {
        String attribute = element.getAttribute(str);
        if (attribute.equals("")) {
            throw new XMLResourceParseException(RESOURCE_NAME, element.getTagName(), str, null);
        }
        return attribute;
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
        for (int i10 = 0; i10 < elementsByTagName.getLength(); i10++) {
            Element element = (Element) elementsByTagName.item(i10);
            String attrValueAndCheckIfNotNull = getAttrValueAndCheckIfNotNull("name", element);
            String attrValueAndCheckIfNotNull2 = getAttrValueAndCheckIfNotNull(TYPE_ATTR, element);
            String attribute = element.getAttribute(DELIMITER_ATTR);
            boolean z10 = attribute != null && attribute.equals("true");
            Integer num = typeMappings.get(attrValueAndCheckIfNotNull2);
            if (num == null) {
                throw new XMLResourceParseException(RESOURCE_NAME, "Symbol", TYPE_ATTR, a.p("has an unknown value '", attrValueAndCheckIfNotNull2, "'!"));
            }
            hashMap.put(attrValueAndCheckIfNotNull, new SymbolAtom(attrValueAndCheckIfNotNull, num.intValue(), z10));
        }
        return hashMap;
    }

    public TeXSymbolParser(InputStream inputStream, String str) {
        try {
            DocumentBuilderFactory newInstance = DocumentBuilderFactory.newInstance();
            newInstance.setIgnoringElementContentWhitespace(true);
            newInstance.setIgnoringComments(true);
            this.root = newInstance.newDocumentBuilder().parse(inputStream).getDocumentElement();
            setTypeMappings();
        } catch (Exception e7) {
            throw new XMLResourceParseException(str, e7);
        }
    }
}
