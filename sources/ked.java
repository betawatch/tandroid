// default package

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import org.scilab.forge.jlatexmath.TeXFormulaSettingsParser;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class ked {
    public static final void a(StringBuilder sb, int i, String str, Object obj) {
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
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            sb.append(' ');
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            cdd cddVar = cdd.c;
            sb.append(o1f.a(new cdd(((String) obj).getBytes(ejd.a))));
            sb.append('\"');
            return;
        }
        if (obj instanceof cdd) {
            sb.append(": \"");
            sb.append(o1f.a((cdd) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof vid) {
            sb.append(" {");
            b((vid) obj, sb, i + 2);
            sb.append("\n");
            while (i2 < i) {
                sb.append(' ');
                i2++;
            }
        } else {
            if (!(obj instanceof Map.Entry)) {
                sb.append(": ");
                sb.append(obj.toString());
                return;
            }
            sb.append(" {");
            Map.Entry entry = (Map.Entry) obj;
            int i4 = i + 2;
            a(sb, i4, "key", entry.getKey());
            a(sb, i4, "value", entry.getValue());
            sb.append("\n");
            while (i2 < i) {
                sb.append(' ');
                i2++;
            }
        }
        sb.append("}");
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x01e5, code lost:
    
        if (((java.lang.Float) r7).floatValue() == 0.0f) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01f7, code lost:
    
        if (((java.lang.Double) r7).doubleValue() == 0.0d) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01c6, code lost:
    
        if (((java.lang.Boolean) r7).booleanValue() == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x022a, code lost:
    
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01d4, code lost:
    
        if (((java.lang.Integer) r7).intValue() == 0) goto L112;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b(vid vidVar, StringBuilder sb, int i) {
        Object b;
        String c;
        boolean equals;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet treeSet = new TreeSet();
        for (Method method : vidVar.getClass().getDeclaredMethods()) {
            hashMap2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                hashMap.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Object obj = "";
            String replaceFirst = str.replaceFirst("get", "");
            boolean z = true;
            if (replaceFirst.endsWith("List") && !replaceFirst.endsWith("OrBuilderList") && !replaceFirst.equals("List")) {
                String valueOf = String.valueOf(replaceFirst.substring(0, 1).toLowerCase());
                String n = ir2.n(4, 1, replaceFirst);
                String concat = n.length() != 0 ? valueOf.concat(n) : new String(valueOf);
                Method method2 = (Method) hashMap.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    c = c(concat);
                    b = vid.b(method2, vidVar, new Object[0]);
                    a(sb, i, c, b);
                }
            }
            if (replaceFirst.endsWith(TeXFormulaSettingsParser.CHARTODEL_MAPPING_EL) && !replaceFirst.equals(TeXFormulaSettingsParser.CHARTODEL_MAPPING_EL)) {
                String valueOf2 = String.valueOf(replaceFirst.substring(0, 1).toLowerCase());
                String n2 = ir2.n(3, 1, replaceFirst);
                String concat2 = n2.length() != 0 ? valueOf2.concat(n2) : new String(valueOf2);
                Method method3 = (Method) hashMap.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    a(sb, i, c(concat2), vid.b(method3, vidVar, new Object[0]));
                }
            }
            if (((Method) hashMap2.get(replaceFirst.length() != 0 ? "set".concat(replaceFirst) : new String("set"))) != null) {
                if (replaceFirst.endsWith("Bytes")) {
                    String n3 = ir2.n(5, 0, replaceFirst);
                    if (!hashMap.containsKey(n3.length() != 0 ? "get".concat(n3) : new String("get"))) {
                    }
                }
                String valueOf3 = String.valueOf(replaceFirst.substring(0, 1).toLowerCase());
                String substring = replaceFirst.substring(1);
                String concat3 = substring.length() != 0 ? valueOf3.concat(substring) : new String(valueOf3);
                Method method4 = (Method) hashMap.get(replaceFirst.length() != 0 ? "get".concat(replaceFirst) : new String("get"));
                Method method5 = (Method) hashMap.get(replaceFirst.length() != 0 ? "has".concat(replaceFirst) : new String("has"));
                if (method4 != null) {
                    b = vid.b(method4, vidVar, new Object[0]);
                    if (method5 == null) {
                        if (!(b instanceof Boolean)) {
                            if (!(b instanceof Integer)) {
                                if (!(b instanceof Float)) {
                                    if (!(b instanceof Double)) {
                                        if (!(b instanceof String)) {
                                            if (b instanceof cdd) {
                                                obj = cdd.c;
                                            } else {
                                                equals = !(b instanceof g9d) ? false : false;
                                            }
                                        }
                                        equals = b.equals(obj);
                                    }
                                }
                            }
                        }
                        if (equals) {
                            z = false;
                        }
                    } else {
                        z = ((Boolean) vid.b(method5, vidVar, new Object[0])).booleanValue();
                    }
                    if (z) {
                        c = c(concat3);
                        a(sb, i, c, b);
                    }
                }
            }
        }
        dyd dydVar = vidVar.zzjp;
        if (dydVar != null) {
            for (int i2 = 0; i2 < dydVar.a; i2++) {
                a(sb, i, String.valueOf(dydVar.b[i2] >>> 3), dydVar.c[i2]);
            }
        }
    }

    public static final String c(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(charAt));
        }
        return sb.toString();
    }
}
