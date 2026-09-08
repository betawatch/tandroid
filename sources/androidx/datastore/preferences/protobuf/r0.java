package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import org.scilab.forge.jlatexmath.TeXFormulaSettingsParser;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public abstract class r0 {
    public static final e1 a = new e1();
    public static final f1 b = new f1();

    public static void a(byte b10, byte b11, byte b12, byte b13, char[] cArr, int i10) {
        if (!h(b11)) {
            if ((((b11 + 112) + (b10 << 28)) >> 30) == 0 && !h(b12) && !h(b13)) {
                int i11 = ((b10 & 7) << 18) | ((b11 & 63) << 12) | ((b12 & 63) << 6) | (b13 & 63);
                cArr[i10] = (char) ((i11 >>> 10) + 55232);
                cArr[i10 + 1] = (char) ((i11 & 1023) + 56320);
                return;
            }
        }
        throw b0.a();
    }

    public static void b(byte b10, byte b11, char[] cArr, int i10) {
        if (b10 < -62 || h(b11)) {
            throw b0.a();
        }
        cArr[i10] = (char) (((b10 & 31) << 6) | (b11 & 63));
    }

    public static void c(byte b10, byte b11, byte b12, char[] cArr, int i10) {
        if (h(b11) || ((b10 == -32 && b11 < -96) || ((b10 == -19 && b11 >= -96) || h(b12)))) {
            throw b0.a();
        }
        cArr[i10] = (char) (((b10 & 15) << 12) | ((b11 & 63) << 6) | (b12 & 63));
    }

    public static final String d(String str) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < str.length(); i10++) {
            char charAt = str.charAt(i10);
            if (Character.isUpperCase(charAt)) {
                sb2.append("_");
            }
            sb2.append(Character.toLowerCase(charAt));
        }
        return sb2.toString();
    }

    public static String g(g gVar) {
        StringBuilder sb2 = new StringBuilder(gVar.size());
        for (int i10 = 0; i10 < gVar.size(); i10++) {
            byte b10 = gVar.b[i10];
            if (b10 == 34) {
                sb2.append("\\\"");
            } else if (b10 == 39) {
                sb2.append("\\'");
            } else if (b10 != 92) {
                switch (b10) {
                    case 7:
                        sb2.append("\\a");
                        break;
                    case 8:
                        sb2.append("\\b");
                        break;
                    case 9:
                        sb2.append("\\t");
                        break;
                    case 10:
                        sb2.append("\\n");
                        break;
                    case 11:
                        sb2.append("\\v");
                        break;
                    case 12:
                        sb2.append("\\f");
                        break;
                    case 13:
                        sb2.append("\\r");
                        break;
                    default:
                        if (b10 < 32 || b10 > 126) {
                            sb2.append('\\');
                            sb2.append((char) (((b10 >>> 6) & 3) + 48));
                            sb2.append((char) (((b10 >>> 3) & 7) + 48));
                            sb2.append((char) ((b10 & 7) + 48));
                            break;
                        } else {
                            sb2.append((char) b10);
                            break;
                        }
                        break;
                }
            } else {
                sb2.append("\\\\");
            }
        }
        return sb2.toString();
    }

    public static boolean h(byte b10) {
        return b10 > -65;
    }

    public static final void j(StringBuilder sb2, int i10, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                j(sb2, i10, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                j(sb2, i10, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb2.append('\n');
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            sb2.append(' ');
        }
        sb2.append(str);
        if (obj instanceof String) {
            sb2.append(": \"");
            g gVar = g.c;
            sb2.append(g(new g(((String) obj).getBytes(z.a))));
            sb2.append('\"');
            return;
        }
        if (obj instanceof g) {
            sb2.append(": \"");
            sb2.append(g((g) obj));
            sb2.append('\"');
            return;
        }
        if (obj instanceof w) {
            sb2.append(" {");
            k((w) obj, sb2, i10 + 2);
            sb2.append("\n");
            while (i11 < i10) {
                sb2.append(' ');
                i11++;
            }
            sb2.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb2.append(": ");
            sb2.append(obj.toString());
            return;
        }
        sb2.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i13 = i10 + 2;
        j(sb2, i13, "key", entry.getKey());
        j(sb2, i13, "value", entry.getValue());
        sb2.append("\n");
        while (i11 < i10) {
            sb2.append(' ');
            i11++;
        }
        sb2.append("}");
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x01ae, code lost:
    
        if (((java.lang.Integer) r11).intValue() == 0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01b0, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01c2, code lost:
    
        if (((java.lang.Float) r11).floatValue() == 0.0f) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01d4, code lost:
    
        if (((java.lang.Double) r11).doubleValue() == 0.0d) goto L57;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void k(w wVar, StringBuilder sb2, int i10) {
        boolean equals;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet treeSet = new TreeSet();
        for (Method method : wVar.getClass().getDeclaredMethods()) {
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
            String replaceFirst = str.replaceFirst("get", "");
            boolean z10 = true;
            if (replaceFirst.endsWith("List") && !replaceFirst.endsWith("OrBuilderList") && !replaceFirst.equals("List")) {
                String str2 = replaceFirst.substring(0, 1).toLowerCase() + replaceFirst.substring(1, replaceFirst.length() - 4);
                Method method2 = (Method) hashMap.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    j(sb2, i10, d(str2), w.f(method2, wVar, new Object[0]));
                }
            }
            if (replaceFirst.endsWith(TeXFormulaSettingsParser.CHARTODEL_MAPPING_EL) && !replaceFirst.equals(TeXFormulaSettingsParser.CHARTODEL_MAPPING_EL)) {
                String str3 = replaceFirst.substring(0, 1).toLowerCase() + replaceFirst.substring(1, replaceFirst.length() - 3);
                Method method3 = (Method) hashMap.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    j(sb2, i10, d(str3), w.f(method3, wVar, new Object[0]));
                }
            }
            if (((Method) hashMap2.get("set".concat(replaceFirst))) != null) {
                if (replaceFirst.endsWith("Bytes")) {
                    if (hashMap.containsKey("get" + replaceFirst.substring(0, replaceFirst.length() - 5))) {
                    }
                }
                String str4 = replaceFirst.substring(0, 1).toLowerCase() + replaceFirst.substring(1);
                Method method4 = (Method) hashMap.get("get".concat(replaceFirst));
                Method method5 = (Method) hashMap.get("has".concat(replaceFirst));
                if (method4 != null) {
                    Object f7 = w.f(method4, wVar, new Object[0]);
                    if (method5 == null) {
                        if (f7 instanceof Boolean) {
                            equals = !((Boolean) f7).booleanValue();
                        } else if (!(f7 instanceof Integer)) {
                            if (!(f7 instanceof Float)) {
                                if (!(f7 instanceof Double)) {
                                    equals = f7 instanceof String ? f7.equals("") : f7 instanceof g ? f7.equals(g.c) : !(f7 instanceof a) ? false : false;
                                }
                            }
                        }
                        if (equals) {
                            z10 = false;
                        }
                    } else {
                        z10 = ((Boolean) w.f(method5, wVar, new Object[0])).booleanValue();
                    }
                    if (z10) {
                        j(sb2, i10, d(str4), f7);
                    }
                }
            }
        }
        i1 i1Var = wVar.unknownFields;
        if (i1Var != null) {
            for (int i11 = 0; i11 < i1Var.a; i11++) {
                j(sb2, i10, String.valueOf(i1Var.b[i11] >>> 3), i1Var.c[i11]);
            }
        }
    }

    public abstract String e(int i10, int i11, byte[] bArr);

    public abstract int f(String str, byte[] bArr, int i10, int i11);

    public abstract int i(int i10, int i11, byte[] bArr);

    public abstract void l(int i10, int i11, byte[] bArr);
}
