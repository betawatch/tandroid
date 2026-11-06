package androidx.datastore.preferences.protobuf;

import a8.q6;
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

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public abstract class s0 {
    public static final char[] a;

    static {
        char[] cArr = new char[80];
        a = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void a(int i7, StringBuilder sb2) {
        while (i7 > 0) {
            int i10 = 80;
            if (i7 <= 80) {
                i10 = i7;
            }
            sb2.append(a, 0, i10);
            i7 -= i10;
        }
    }

    public static void b(StringBuilder sb2, int i7, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                b(sb2, i7, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                b(sb2, i7, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb2.append('\n');
        a(i7, sb2);
        if (!str.isEmpty()) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(Character.toLowerCase(str.charAt(0)));
            for (int i10 = 1; i10 < str.length(); i10++) {
                char charAt = str.charAt(i10);
                if (Character.isUpperCase(charAt)) {
                    sb3.append("_");
                }
                sb3.append(Character.toLowerCase(charAt));
            }
            str = sb3.toString();
        }
        sb2.append(str);
        if (obj instanceof String) {
            sb2.append(": \"");
            h hVar = h.c;
            sb2.append(q6.a(new h(((String) obj).getBytes(c0.a))));
            sb2.append('\"');
            return;
        }
        if (obj instanceof h) {
            sb2.append(": \"");
            sb2.append(q6.a((h) obj));
            sb2.append('\"');
            return;
        }
        if (obj instanceof z) {
            sb2.append(" {");
            c((z) obj, sb2, i7 + 2);
            sb2.append("\n");
            a(i7, sb2);
            sb2.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb2.append(": ");
            sb2.append(obj);
            return;
        }
        sb2.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i11 = i7 + 2;
        b(sb2, i11, "key", entry.getKey());
        b(sb2, i11, "value", entry.getValue());
        sb2.append("\n");
        a(i7, sb2);
        sb2.append("}");
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x018b, code lost:
    
        if (((java.lang.Integer) r7).intValue() == 0) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x018d, code lost:
    
        r13 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01a0, code lost:
    
        if (java.lang.Float.floatToRawIntBits(((java.lang.Float) r7).floatValue()) == 0) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01b6, code lost:
    
        if (java.lang.Double.doubleToRawLongBits(((java.lang.Double) r7).doubleValue()) == 0) goto L74;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void c(z zVar, StringBuilder sb2, int i7) {
        int i10;
        boolean booleanValue;
        boolean equals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = zVar.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i11 = 0;
        while (true) {
            i10 = 3;
            if (i11 >= length) {
                break;
            }
            Method method3 = declaredMethods[i11];
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
            i11++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String substring = ((String) entry.getKey()).substring(i10);
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List") && (method2 = (Method) entry.getValue()) != null && method2.getReturnType().equals(List.class)) {
                b(sb2, i7, com.google.android.recaptcha.internal.a.k(substring, 4, 0), z.e(method2, zVar, new Object[0]));
            } else if (substring.endsWith(TeXFormulaSettingsParser.CHARTODEL_MAPPING_EL) && !substring.equals(TeXFormulaSettingsParser.CHARTODEL_MAPPING_EL) && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                b(sb2, i7, com.google.android.recaptcha.internal.a.k(substring, 3, 0), z.e(method, zVar, new Object[0]));
            } else if (hashSet.contains("set".concat(substring))) {
                if (substring.endsWith("Bytes")) {
                    if (treeMap.containsKey("get" + substring.substring(0, substring.length() - 5))) {
                    }
                }
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object e10 = z.e(method4, zVar, new Object[0]);
                    if (method5 == null) {
                        booleanValue = true;
                        if (e10 instanceof Boolean) {
                            equals = !((Boolean) e10).booleanValue();
                        } else if (!(e10 instanceof Integer)) {
                            if (!(e10 instanceof Float)) {
                                if (!(e10 instanceof Double)) {
                                    equals = e10 instanceof String ? e10.equals("") : e10 instanceof h ? e10.equals(h.c) : !(e10 instanceof a) ? false : false;
                                }
                            }
                        }
                        if (equals) {
                            booleanValue = false;
                        }
                    } else {
                        booleanValue = ((Boolean) z.e(method5, zVar, new Object[0])).booleanValue();
                    }
                    if (booleanValue) {
                        b(sb2, i7, substring, e10);
                    }
                }
            }
            i10 = 3;
        }
        h1 h1Var = zVar.unknownFields;
        if (h1Var != null) {
            for (int i12 = 0; i12 < h1Var.a; i12++) {
                b(sb2, i7, String.valueOf(h1Var.b[i12] >>> 3), h1Var.c[i12]);
            }
        }
    }
}
