package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import org.scilab.forge.jlatexmath.TeXFormulaSettingsParser;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public abstract class s0 {
    public static final f1 a = new f1();
    public static final g1 b = new g1();

    public static void a(byte b10, byte b11, byte b12, byte b13, char[] cArr, int i10) {
        if (!h(b11)) {
            if ((((b11 + 112) + (b10 << 28)) >> 30) == 0 && !h(b12) && !h(b13)) {
                int i11 = ((b10 & 7) << 18) | ((b11 & 63) << 12) | ((b12 & 63) << 6) | (b13 & 63);
                cArr[i10] = (char) ((i11 >>> 10) + 55232);
                cArr[i10 + 1] = (char) ((i11 & 1023) + 56320);
                return;
            }
        }
        throw c0.a();
    }

    public static void b(byte b10, byte b11, char[] cArr, int i10) {
        if (b10 < -62 || h(b11)) {
            throw c0.a();
        }
        cArr[i10] = (char) (((b10 & 31) << 6) | (b11 & 63));
    }

    public static void c(byte b10, byte b11, byte b12, char[] cArr, int i10) {
        if (h(b11) || ((b10 == -32 && b11 < -96) || ((b10 == -19 && b11 >= -96) || h(b12)))) {
            throw c0.a();
        }
        cArr[i10] = (char) (((b10 & 15) << 12) | ((b11 & 63) << 6) | (b12 & 63));
    }

    public static final String d(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i10 = 0; i10 < str.length(); i10++) {
            char charAt = str.charAt(i10);
            if (Character.isUpperCase(charAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(charAt));
        }
        return sb.toString();
    }

    public static String g(g gVar) {
        StringBuilder sb = new StringBuilder(gVar.size());
        for (int i10 = 0; i10 < gVar.size(); i10++) {
            byte b10 = gVar.b[i10];
            if (b10 == 34) {
                sb.append("\\\"");
            } else if (b10 == 39) {
                sb.append("\\'");
            } else if (b10 != 92) {
                switch (b10) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (b10 < 32 || b10 > 126) {
                            sb.append('\\');
                            sb.append((char) (((b10 >>> 6) & 3) + 48));
                            sb.append((char) (((b10 >>> 3) & 7) + 48));
                            sb.append((char) ((b10 & 7) + 48));
                            break;
                        } else {
                            sb.append((char) b10);
                            break;
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static boolean h(byte b10) {
        return b10 > -65;
    }

    public static final void j(StringBuilder sb, int i10, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                j(sb, i10, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                j(sb, i10, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            sb.append(' ');
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            g gVar = g.c;
            sb.append(g(new g(((String) obj).getBytes(a0.a))));
            sb.append('\"');
            return;
        }
        if (obj instanceof g) {
            sb.append(": \"");
            sb.append(g((g) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof x) {
            sb.append(" {");
            k((x) obj, sb, i10 + 2);
            sb.append("\n");
            while (i11 < i10) {
                sb.append(' ');
                i11++;
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
        int i13 = i10 + 2;
        j(sb, i13, "key", entry.getKey());
        j(sb, i13, "value", entry.getValue());
        sb.append("\n");
        while (i11 < i10) {
            sb.append(' ');
            i11++;
        }
        sb.append("}");
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
    public static void k(x xVar, StringBuilder sb, int i10) {
        boolean equals;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet treeSet = new TreeSet();
        for (Method method : xVar.getClass().getDeclaredMethods()) {
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
            boolean z4 = true;
            if (replaceFirst.endsWith("List") && !replaceFirst.endsWith("OrBuilderList") && !replaceFirst.equals("List")) {
                String str2 = replaceFirst.substring(0, 1).toLowerCase() + replaceFirst.substring(1, replaceFirst.length() - 4);
                Method method2 = (Method) hashMap.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    j(sb, i10, d(str2), x.f(method2, xVar, new Object[0]));
                }
            }
            if (replaceFirst.endsWith(TeXFormulaSettingsParser.CHARTODEL_MAPPING_EL) && !replaceFirst.equals(TeXFormulaSettingsParser.CHARTODEL_MAPPING_EL)) {
                String str3 = replaceFirst.substring(0, 1).toLowerCase() + replaceFirst.substring(1, replaceFirst.length() - 3);
                Method method3 = (Method) hashMap.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    j(sb, i10, d(str3), x.f(method3, xVar, new Object[0]));
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
                    Object f10 = x.f(method4, xVar, new Object[0]);
                    if (method5 == null) {
                        if (f10 instanceof Boolean) {
                            equals = !((Boolean) f10).booleanValue();
                        } else if (!(f10 instanceof Integer)) {
                            if (!(f10 instanceof Float)) {
                                if (!(f10 instanceof Double)) {
                                    equals = f10 instanceof String ? f10.equals("") : f10 instanceof g ? f10.equals(g.c) : !(f10 instanceof a) ? false : false;
                                }
                            }
                        }
                        if (equals) {
                            z4 = false;
                        }
                    } else {
                        z4 = ((Boolean) x.f(method5, xVar, new Object[0])).booleanValue();
                    }
                    if (z4) {
                        j(sb, i10, d(str4), f10);
                    }
                }
            }
        }
        j1 j1Var = xVar.unknownFields;
        if (j1Var != null) {
            for (int i11 = 0; i11 < j1Var.a; i11++) {
                j(sb, i10, String.valueOf(j1Var.b[i11] >>> 3), j1Var.c[i11]);
            }
        }
    }

    public abstract String e(int i10, int i11, byte[] bArr);

    public abstract int f(String str, byte[] bArr, int i10, int i11);

    public abstract int i(int i10, int i11, byte[] bArr);

    public abstract void l(int i10, int i11, byte[] bArr);
}
