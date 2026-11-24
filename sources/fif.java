// default package

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.scilab.forge.jlatexmath.TeXFormulaSettingsParser;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class fif {
    public static final char[] a;

    static {
        char[] cArr = new char[80];
        a = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void a(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                a(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                a(sb, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        b(i, sb);
        if (!str.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Character.toLowerCase(str.charAt(0)));
            for (int i2 = 1; i2 < str.length(); i2++) {
                char charAt = str.charAt(i2);
                if (Character.isUpperCase(charAt)) {
                    sb2.append("_");
                }
                sb2.append(Character.toLowerCase(charAt));
            }
            str = sb2.toString();
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            sb.append(t6f.a(new yff(((String) obj).getBytes(fhf.a))));
            sb.append('\"');
            return;
        }
        if (obj instanceof yff) {
            sb.append(": \"");
            sb.append(t6f.a((yff) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof wgf) {
            sb.append(" {");
            c((wgf) obj, sb, i + 2);
            sb.append("\n");
            b(i, sb);
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj);
            return;
        }
        int i3 = i + 2;
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        a(sb, i3, "key", entry.getKey());
        a(sb, i3, "value", entry.getValue());
        sb.append("\n");
        b(i, sb);
        sb.append("}");
    }

    public static void b(int i, StringBuilder sb) {
        while (i > 0) {
            int i2 = 80;
            if (i <= 80) {
                i2 = i;
            }
            sb.append(a, 0, i2);
            i -= i2;
        }
    }

    public static void c(wgf wgfVar, StringBuilder sb, int i) {
        int i2;
        boolean equals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = wgfVar.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i3 = 0;
        while (true) {
            i2 = 3;
            if (i3 >= length) {
                break;
            }
            Method method3 = declaredMethods[i3];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        hashMap.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i3++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String substring = ((String) entry.getKey()).substring(i2);
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List") && (method2 = (Method) entry.getValue()) != null && method2.getReturnType().equals(List.class)) {
                a(sb, i, substring.substring(0, substring.length() - 4), wgf.c(method2, wgfVar, new Object[0]));
            } else if (substring.endsWith(TeXFormulaSettingsParser.CHARTODEL_MAPPING_EL) && !substring.equals(TeXFormulaSettingsParser.CHARTODEL_MAPPING_EL) && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                a(sb, i, substring.substring(0, substring.length() - 3), wgf.c(method, wgfVar, new Object[0]));
            } else if (hashSet.contains("set".concat(substring)) && (!substring.endsWith("Bytes") || !treeMap.containsKey("get".concat(substring.substring(0, substring.length() - 5))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object c = wgf.c(method4, wgfVar, new Object[0]);
                    if (method5 != null) {
                        if (!((Boolean) wgf.c(method5, wgfVar, new Object[0])).booleanValue()) {
                        }
                        a(sb, i, substring, c);
                    } else if (c instanceof Boolean) {
                        if (!((Boolean) c).booleanValue()) {
                        }
                        a(sb, i, substring, c);
                    } else if (c instanceof Integer) {
                        if (((Integer) c).intValue() == 0) {
                        }
                        a(sb, i, substring, c);
                    } else if (c instanceof Float) {
                        if (Float.floatToRawIntBits(((Float) c).floatValue()) == 0) {
                        }
                        a(sb, i, substring, c);
                    } else if (c instanceof Double) {
                        if (Double.doubleToRawLongBits(((Double) c).doubleValue()) == 0) {
                        }
                        a(sb, i, substring, c);
                    } else {
                        if (c instanceof String) {
                            equals = c.equals("");
                        } else if (c instanceof yff) {
                            equals = c.equals(yff.c);
                        } else if (c instanceof kff) {
                            if (c == ((wgf) ((wgf) ((kff) c)).h(6, null))) {
                            }
                            a(sb, i, substring, c);
                        } else {
                            if ((c instanceof Enum) && ((Enum) c).ordinal() == 0) {
                            }
                            a(sb, i, substring, c);
                        }
                        if (equals) {
                        }
                        a(sb, i, substring, c);
                    }
                }
            }
            i2 = 3;
        }
    }
}
