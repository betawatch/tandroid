package org.scilab.forge.jlatexmath;

import java.util.HashMap;
import java.util.Map;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import ru.noties.jlatexmath.awt.Color;

/* loaded from: classes3.dex */
public class TeXFormulaParser {
    private static final String ARG_OBJ_ATTR = "formula";
    private static final String ARG_VAL_ATTR = "value";
    private static final int COMMAND = 0;
    private static final String RETURN_EL = "Return";
    private static final int TEXFORMULA = 1;
    private static Map<String, Class<?>> classMappings;
    private final Map<String, ActionParser> actionParsers;
    private final Map<String, ArgumentValueParser> argValueParsers;
    private final Element formula;
    private final String formulaName;
    private Object result;
    private final Map<String, MacroInfo> tempCommands;
    private final Map<String, TeXFormula> tempFormulas;
    private int type;

    private interface ActionParser {
        void parse(Element element);
    }

    private interface ArgumentValueParser {
        Object parseValue(String str, String str2);
    }

    private class MethodInvocationParser implements ActionParser {
        MethodInvocationParser() {
        }

        @Override // org.scilab.forge.jlatexmath.TeXFormulaParser.ActionParser
        public void parse(Element element) {
            String attrValueAndCheckIfNotNull = TeXFormulaParser.getAttrValueAndCheckIfNotNull("name", element);
            String attrValueAndCheckIfNotNull2 = TeXFormulaParser.getAttrValueAndCheckIfNotNull(TeXFormulaParser.ARG_OBJ_ATTR, element);
            Object obj = TeXFormulaParser.this.tempFormulas.get(attrValueAndCheckIfNotNull2);
            if (obj == null) {
                throw new XMLResourceParseException(PredefinedTeXFormulaParser.RESOURCE_NAME, "Argument", TeXFormulaParser.ARG_OBJ_ATTR, "has an unknown temporary TeXFormula name as value : '" + attrValueAndCheckIfNotNull2 + "'!");
            }
            NodeList elementsByTagName = element.getElementsByTagName("Argument");
            try {
                TeXFormula.class.getMethod(attrValueAndCheckIfNotNull, TeXFormulaParser.getArgumentClasses(elementsByTagName)).invoke((TeXFormula) obj, TeXFormulaParser.this.getArgumentValues(elementsByTagName));
            } catch (Exception e) {
                throw new XMLResourceParseException("Error invoking the method '" + attrValueAndCheckIfNotNull + "' on the temporary TeXFormula '" + attrValueAndCheckIfNotNull2 + "' while constructing the predefined TeXFormula '" + TeXFormulaParser.this.formulaName + "'!\n" + e.toString());
            }
        }
    }

    private class CreateTeXFormulaParser implements ActionParser {
        CreateTeXFormulaParser() {
        }

        @Override // org.scilab.forge.jlatexmath.TeXFormulaParser.ActionParser
        public void parse(Element element) {
            String attrValueAndCheckIfNotNull = TeXFormulaParser.getAttrValueAndCheckIfNotNull("name", element);
            NodeList elementsByTagName = element.getElementsByTagName("Argument");
            try {
                TeXFormulaParser.this.tempFormulas.put(attrValueAndCheckIfNotNull, (TeXFormula) TeXFormula.class.getConstructor(TeXFormulaParser.getArgumentClasses(elementsByTagName)).newInstance(TeXFormulaParser.this.getArgumentValues(elementsByTagName)));
            } catch (Exception e) {
                throw new XMLResourceParseException("Error creating the temporary TeXFormula '" + attrValueAndCheckIfNotNull + "' while constructing the predefined TeXFormula '" + TeXFormulaParser.this.formulaName + "'!\n" + e.toString());
            }
        }
    }

    private class CreateCommandParser implements ActionParser {
        CreateCommandParser() {
        }

        @Override // org.scilab.forge.jlatexmath.TeXFormulaParser.ActionParser
        public void parse(Element element) {
            String attrValueAndCheckIfNotNull = TeXFormulaParser.getAttrValueAndCheckIfNotNull("name", element);
            NodeList elementsByTagName = element.getElementsByTagName("Argument");
            Class[] argumentClasses = TeXFormulaParser.getArgumentClasses(elementsByTagName);
            Object[] argumentValues = TeXFormulaParser.this.getArgumentValues(elementsByTagName);
            try {
                TeXFormulaParser.this.tempCommands.put(attrValueAndCheckIfNotNull, (MacroInfo) MacroInfo.class.getConstructor(argumentClasses).newInstance(argumentValues));
            } catch (IllegalArgumentException unused) {
                String str = "IllegalArgumentException:\nClassLoader to load this class (TeXFormulaParser): " + getClass().getClassLoader() + "\n";
                for (Class cls : argumentClasses) {
                    str = str + "Created class: " + cls + " loaded with the ClassLoader: " + cls.getClassLoader() + "\n";
                }
                for (Object obj : argumentValues) {
                    str = str + "Created object: " + obj + "\n";
                }
                throw new XMLResourceParseException("Error creating the temporary command '" + attrValueAndCheckIfNotNull + "' while constructing the predefined command '" + TeXFormulaParser.this.formulaName + "'!\n" + str);
            } catch (Exception e) {
                throw new XMLResourceParseException("Error creating the temporary command '" + attrValueAndCheckIfNotNull + "' while constructing the predefined command '" + TeXFormulaParser.this.formulaName + "'!\n" + e.toString());
            }
        }
    }

    private class FloatValueParser implements ArgumentValueParser {
        FloatValueParser() {
        }

        @Override // org.scilab.forge.jlatexmath.TeXFormulaParser.ArgumentValueParser
        public Object parseValue(String str, String str2) {
            TeXFormulaParser.checkNullValue(str, str2);
            try {
                return new Float(Float.parseFloat(str));
            } catch (NumberFormatException e) {
                throw new XMLResourceParseException(PredefinedTeXFormulaParser.RESOURCE_NAME, "Argument", TeXFormulaParser.ARG_VAL_ATTR, "has an invalid '" + str2 + "'-value : '" + str + "'!", e);
            }
        }
    }

    private class CharValueParser implements ArgumentValueParser {
        CharValueParser() {
        }

        @Override // org.scilab.forge.jlatexmath.TeXFormulaParser.ArgumentValueParser
        public Object parseValue(String str, String str2) {
            TeXFormulaParser.checkNullValue(str, str2);
            if (str.length() == 1) {
                return new Character(str.charAt(0));
            }
            throw new XMLResourceParseException(PredefinedTeXFormulaParser.RESOURCE_NAME, "Argument", TeXFormulaParser.ARG_VAL_ATTR, "must have a value that consists of exactly 1 character!");
        }
    }

    private class BooleanValueParser implements ArgumentValueParser {
        BooleanValueParser() {
        }

        @Override // org.scilab.forge.jlatexmath.TeXFormulaParser.ArgumentValueParser
        public Object parseValue(String str, String str2) {
            TeXFormulaParser.checkNullValue(str, str2);
            if ("true".equals(str)) {
                return Boolean.TRUE;
            }
            if ("false".equals(str)) {
                return Boolean.FALSE;
            }
            throw new XMLResourceParseException(PredefinedTeXFormulaParser.RESOURCE_NAME, "Argument", TeXFormulaParser.ARG_VAL_ATTR, "has an invalid '" + str2 + "'-value : '" + str + "'!");
        }
    }

    private class IntValueParser implements ArgumentValueParser {
        IntValueParser() {
        }

        @Override // org.scilab.forge.jlatexmath.TeXFormulaParser.ArgumentValueParser
        public Object parseValue(String str, String str2) {
            TeXFormulaParser.checkNullValue(str, str2);
            try {
                return new Float(Integer.parseInt(str));
            } catch (NumberFormatException e) {
                throw new XMLResourceParseException(PredefinedTeXFormulaParser.RESOURCE_NAME, "Argument", TeXFormulaParser.ARG_VAL_ATTR, "has an invalid '" + str2 + "'-value : '" + str + "'!", e);
            }
        }
    }

    private class ReturnParser implements ActionParser {
        ReturnParser() {
        }

        @Override // org.scilab.forge.jlatexmath.TeXFormulaParser.ActionParser
        public void parse(Element element) {
            String attrValueAndCheckIfNotNull = TeXFormulaParser.getAttrValueAndCheckIfNotNull("name", element);
            Object obj = (TeXFormulaParser.this.type == 0 ? TeXFormulaParser.this.tempCommands : TeXFormulaParser.this.tempFormulas).get(attrValueAndCheckIfNotNull);
            if (obj != null) {
                TeXFormulaParser.this.result = obj;
                return;
            }
            throw new XMLResourceParseException(PredefinedTeXFormulaParser.RESOURCE_NAME, TeXFormulaParser.RETURN_EL, "name", "contains an unknown temporary TeXFormula variable name '" + attrValueAndCheckIfNotNull + "' for the predefined TeXFormula '" + TeXFormulaParser.this.formulaName + "'!");
        }
    }

    private class StringValueParser implements ArgumentValueParser {
        @Override // org.scilab.forge.jlatexmath.TeXFormulaParser.ArgumentValueParser
        public Object parseValue(String str, String str2) {
            return str;
        }

        StringValueParser() {
        }
    }

    private class TeXFormulaValueParser implements ArgumentValueParser {
        TeXFormulaValueParser() {
        }

        @Override // org.scilab.forge.jlatexmath.TeXFormulaParser.ArgumentValueParser
        public Object parseValue(String str, String str2) {
            if (str == null) {
                return null;
            }
            Object obj = TeXFormulaParser.this.tempFormulas.get(str);
            if (obj == null) {
                throw new XMLResourceParseException(PredefinedTeXFormulaParser.RESOURCE_NAME, "Argument", TeXFormulaParser.ARG_VAL_ATTR, "has an unknown temporary TeXFormula name as value : '" + str + "'!");
            }
            return (TeXFormula) obj;
        }
    }

    private class TeXConstantsValueParser implements ArgumentValueParser {
        TeXConstantsValueParser() {
        }

        @Override // org.scilab.forge.jlatexmath.TeXFormulaParser.ArgumentValueParser
        public Object parseValue(String str, String str2) {
            TeXFormulaParser.checkNullValue(str, str2);
            try {
                return Integer.valueOf(TeXConstants.class.getDeclaredField(str).getInt(null));
            } catch (Exception e) {
                throw new XMLResourceParseException(PredefinedTeXFormulaParser.RESOURCE_NAME, "Argument", TeXFormulaParser.ARG_VAL_ATTR, "has an unknown constant name as value : '" + str + "'!", e);
            }
        }
    }

    private class ColorConstantValueParser implements ArgumentValueParser {
        ColorConstantValueParser() {
        }

        @Override // org.scilab.forge.jlatexmath.TeXFormulaParser.ArgumentValueParser
        public Object parseValue(String str, String str2) {
            TeXFormulaParser.checkNullValue(str, str2);
            try {
                return Color.class.getDeclaredField(str).get(null);
            } catch (Exception e) {
                throw new XMLResourceParseException(PredefinedTeXFormulaParser.RESOURCE_NAME, "Argument", TeXFormulaParser.ARG_VAL_ATTR, "has an unknown color constant name as value : '" + str + "'!", e);
            }
        }
    }

    static {
        HashMap hashMap = new HashMap();
        classMappings = hashMap;
        Class<?> cls = Integer.TYPE;
        hashMap.put("TeXConstants", cls);
        classMappings.put("TeXFormula", TeXFormula.class);
        classMappings.put("String", String.class);
        classMappings.put("float", Float.TYPE);
        classMappings.put("int", cls);
        classMappings.put("boolean", Boolean.TYPE);
        classMappings.put("char", Character.TYPE);
        classMappings.put("ColorConstant", Color.class);
    }

    public TeXFormulaParser(String str, Element element, String str2) {
        HashMap hashMap = new HashMap();
        this.argValueParsers = hashMap;
        HashMap hashMap2 = new HashMap();
        this.actionParsers = hashMap2;
        this.tempFormulas = new HashMap();
        this.tempCommands = new HashMap();
        this.result = new Object();
        this.formulaName = str;
        this.formula = element;
        this.type = !"Command".equals(str2) ? 1 : 0;
        if ("Command".equals(str2)) {
            hashMap2.put("CreateCommand", new CreateCommandParser());
        } else {
            hashMap2.put("CreateTeXFormula", new CreateTeXFormulaParser());
        }
        hashMap2.put("MethodInvocation", new MethodInvocationParser());
        hashMap2.put(RETURN_EL, new ReturnParser());
        hashMap.put("TeXConstants", new TeXConstantsValueParser());
        hashMap.put("TeXFormula", new TeXFormulaValueParser());
        hashMap.put("String", new StringValueParser());
        hashMap.put("float", new FloatValueParser());
        hashMap.put("int", new IntValueParser());
        hashMap.put("boolean", new BooleanValueParser());
        hashMap.put("char", new CharValueParser());
        hashMap.put("ColorConstant", new ColorConstantValueParser());
    }

    public Object parse() {
        NodeList childNodes = this.formula.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node item = childNodes.item(i);
            if (item.getNodeType() != 3) {
                Element element = (Element) item;
                ActionParser actionParser = this.actionParsers.get(element.getTagName());
                if (actionParser != null) {
                    actionParser.parse(element);
                }
            }
        }
        return this.result;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object[] getArgumentValues(NodeList nodeList) {
        Object[] objArr = new Object[nodeList.getLength()];
        int i = 0;
        for (int i2 = 0; i2 < nodeList.getLength(); i2++) {
            Element element = (Element) nodeList.item(i2);
            String attrValueAndCheckIfNotNull = getAttrValueAndCheckIfNotNull(TeXSymbolParser.TYPE_ATTR, element);
            objArr[i] = this.argValueParsers.get(attrValueAndCheckIfNotNull).parseValue(element.getAttribute(ARG_VAL_ATTR), attrValueAndCheckIfNotNull);
            i++;
        }
        return objArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Class<?>[] getArgumentClasses(NodeList nodeList) {
        Class<?>[] clsArr = new Class[nodeList.getLength()];
        int i = 0;
        for (int i2 = 0; i2 < nodeList.getLength(); i2++) {
            Class<?> cls = classMappings.get(getAttrValueAndCheckIfNotNull(TeXSymbolParser.TYPE_ATTR, (Element) nodeList.item(i2)));
            if (cls == null) {
                throw new XMLResourceParseException(PredefinedTeXFormulaParser.RESOURCE_NAME, "Argument", TeXSymbolParser.TYPE_ATTR, "has an invalid class name value!");
            }
            clsArr[i] = cls;
            i++;
        }
        return clsArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void checkNullValue(String str, String str2) {
        if (str.equals("")) {
            throw new XMLResourceParseException(PredefinedTeXFormulaParser.RESOURCE_NAME, "Argument", ARG_VAL_ATTR, "is required for an argument of type '" + str2 + "'!");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String getAttrValueAndCheckIfNotNull(String str, Element element) {
        String attribute = element.getAttribute(str);
        if (attribute.equals("")) {
            throw new XMLResourceParseException(PredefinedTeXFormulaParser.RESOURCE_NAME, element.getTagName(), str, null);
        }
        return attribute;
    }
}
