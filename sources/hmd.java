// default package

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import org.scilab.forge.jlatexmath.TeXFormulaSettingsParser;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class hmd {
    public static final String a(String str) {
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

    public static final void b(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                b(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                b(sb, i, str, (Map.Entry) it2.next());
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
            tke tkeVar = tke.c;
            sb.append(e5f.a(new tke(((String) obj).getBytes(iqe.a))));
            sb.append('\"');
            return;
        }
        if (obj instanceof tke) {
            sb.append(": \"");
            sb.append(e5f.a((tke) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof qpe) {
            sb.append(" {");
            c((qpe) obj, sb, i + 2);
            sb.append("\n");
            while (i2 < i) {
                sb.append(' ');
                i2++;
            }
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj.toString());
            return;
        }
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i4 = i + 2;
        b(sb, i4, "key", entry.getKey());
        b(sb, i4, "value", entry.getValue());
        sb.append("\n");
        while (i2 < i) {
            sb.append(' ');
            i2++;
        }
        sb.append("}");
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x01f7, code lost:
    
        if (((java.lang.Double) r4).doubleValue() == 0.0d) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01c5, code lost:
    
        if (((java.lang.Boolean) r4).booleanValue() == false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0230, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01d4, code lost:
    
        if (((java.lang.Integer) r4).intValue() == 0) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01e5, code lost:
    
        if (((java.lang.Float) r4).floatValue() == 0.0f) goto L115;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void c(qpe qpeVar, StringBuilder sb, int i) {
        boolean equals;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet treeSet = new TreeSet();
        for (Method method : qpeVar.getClass().getDeclaredMethods()) {
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
            String substring = str.startsWith("get") ? str.substring(3) : str;
            boolean z = true;
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List")) {
                String valueOf = String.valueOf(substring.substring(0, 1).toLowerCase());
                String m = ts2.m(4, 1, substring);
                String concat = m.length() != 0 ? valueOf.concat(m) : new String(valueOf);
                Method method2 = (Method) hashMap.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    b(sb, i, a(concat), qpe.e(method2, qpeVar, new Object[0]));
                }
            }
            if (substring.endsWith(TeXFormulaSettingsParser.CHARTODEL_MAPPING_EL) && !substring.equals(TeXFormulaSettingsParser.CHARTODEL_MAPPING_EL)) {
                String valueOf2 = String.valueOf(substring.substring(0, 1).toLowerCase());
                String m2 = ts2.m(3, 1, substring);
                String concat2 = m2.length() != 0 ? valueOf2.concat(m2) : new String(valueOf2);
                Method method3 = (Method) hashMap.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    b(sb, i, a(concat2), qpe.e(method3, qpeVar, new Object[0]));
                }
            }
            if (((Method) hashMap2.get(substring.length() != 0 ? "set".concat(substring) : new String("set"))) != null) {
                if (substring.endsWith("Bytes")) {
                    String m3 = ts2.m(5, 0, substring);
                    if (!hashMap.containsKey(m3.length() != 0 ? "get".concat(m3) : new String("get"))) {
                    }
                }
                String valueOf3 = String.valueOf(substring.substring(0, 1).toLowerCase());
                String substring2 = substring.substring(1);
                String concat3 = substring2.length() != 0 ? valueOf3.concat(substring2) : new String(valueOf3);
                Method method4 = (Method) hashMap.get(substring.length() != 0 ? "get".concat(substring) : new String("get"));
                Method method5 = (Method) hashMap.get(substring.length() != 0 ? "has".concat(substring) : new String("has"));
                if (method4 != null) {
                    Object e = qpe.e(method4, qpeVar, new Object[0]);
                    if (method5 == null) {
                        if (!(e instanceof Boolean)) {
                            if (!(e instanceof Integer)) {
                                if (!(e instanceof Float)) {
                                    if (!(e instanceof Double)) {
                                        equals = e instanceof String ? e.equals("") : e instanceof tke ? e.equals(tke.c) : !(e instanceof rfe) ? false : false;
                                    }
                                }
                            }
                        }
                        if (equals) {
                            z = false;
                        }
                    } else {
                        z = ((Boolean) qpe.e(method5, qpeVar, new Object[0])).booleanValue();
                    }
                    if (z) {
                        b(sb, i, a(concat3), e);
                    }
                }
            }
        }
        s1f s1fVar = qpeVar.zzb;
        if (s1fVar != null) {
            for (int i2 = 0; i2 < s1fVar.a; i2++) {
                b(sb, i, String.valueOf(s1fVar.b[i2] >>> 3), s1fVar.c[i2]);
            }
        }
    }
}
