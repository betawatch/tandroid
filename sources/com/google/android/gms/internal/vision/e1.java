package com.google.android.gms.internal.vision;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import org.scilab.forge.jlatexmath.TeXFormulaSettingsParser;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class e1 {
    public static final /* synthetic */ int[] a = {1, 2, 3, 4, 5, 6, 7};

    public static boolean A(byte b10) {
        return b10 > -65;
    }

    public static int a(int i9, byte[] bArr) {
        return ((bArr[i9 + 3] & 255) << 24) | (bArr[i9] & 255) | ((bArr[i9 + 1] & 255) << 8) | ((bArr[i9 + 2] & 255) << 16);
    }

    public static int b(int i9, byte[] bArr, int i10, int i11, o1 o1Var, com.google.android.gms.internal.clearcut.m mVar) {
        h1 h1Var = (h1) o1Var;
        int j10 = j(bArr, i10, mVar);
        h1Var.n(mVar.a);
        while (j10 < i11) {
            int j11 = j(bArr, j10, mVar);
            if (i9 != mVar.a) {
                break;
            }
            j10 = j(bArr, j11, mVar);
            h1Var.n(mVar.a);
        }
        return j10;
    }

    public static int c(int i9, byte[] bArr, int i10, int i11, q2 q2Var, com.google.android.gms.internal.clearcut.m mVar) {
        if ((i9 >>> 3) == 0) {
            throw new n1("Protocol message contained an invalid tag (zero).");
        }
        int i12 = i9 & 7;
        if (i12 == 0) {
            int t10 = t(bArr, i10, mVar);
            q2Var.a(i9, Long.valueOf(mVar.b));
            return t10;
        }
        if (i12 == 1) {
            q2Var.a(i9, Long.valueOf(u(i10, bArr)));
            return i10 + 8;
        }
        if (i12 == 2) {
            int j10 = j(bArr, i10, mVar);
            int i13 = mVar.a;
            if (i13 < 0) {
                throw n1.b();
            }
            if (i13 > bArr.length - j10) {
                throw n1.a();
            }
            if (i13 == 0) {
                q2Var.a(i9, q0.c);
            } else {
                q2Var.a(i9, q0.o(j10, i13, bArr));
            }
            return j10 + i13;
        }
        if (i12 != 3) {
            if (i12 != 5) {
                throw new n1("Protocol message contained an invalid tag (zero).");
            }
            q2Var.a(i9, Integer.valueOf(a(i10, bArr)));
            return i10 + 4;
        }
        q2 b10 = q2.b();
        int i14 = (i9 & (-8)) | 4;
        int i15 = 0;
        while (true) {
            if (i10 >= i11) {
                break;
            }
            int j11 = j(bArr, i10, mVar);
            int i16 = mVar.a;
            if (i16 == i14) {
                i15 = i16;
                i10 = j11;
                break;
            }
            i10 = c(i16, bArr, j11, i11, b10, mVar);
            i15 = i16;
        }
        if (i10 > i11 || i15 != i14) {
            throw new n1("Failed to parse the message.");
        }
        q2Var.a(i9, b10);
        return i10;
    }

    public static int d(int i9, byte[] bArr, int i10, com.google.android.gms.internal.clearcut.m mVar) {
        int i11 = i9 & 127;
        int i12 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 >= 0) {
            mVar.a = i11 | (b10 << 7);
            return i12;
        }
        int i13 = i11 | ((b10 & Byte.MAX_VALUE) << 7);
        int i14 = i10 + 2;
        byte b11 = bArr[i12];
        if (b11 >= 0) {
            mVar.a = i13 | (b11 << 14);
            return i14;
        }
        int i15 = i13 | ((b11 & Byte.MAX_VALUE) << 14);
        int i16 = i10 + 3;
        byte b12 = bArr[i14];
        if (b12 >= 0) {
            mVar.a = i15 | (b12 << 21);
            return i16;
        }
        int i17 = i15 | ((b12 & Byte.MAX_VALUE) << 21);
        int i18 = i10 + 4;
        byte b13 = bArr[i16];
        if (b13 >= 0) {
            mVar.a = i17 | (b13 << 28);
            return i18;
        }
        int i19 = i17 | ((b13 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i20 = i18 + 1;
            if (bArr[i18] >= 0) {
                mVar.a = i19;
                return i20;
            }
            i18 = i20;
        }
    }

    public static int e(n2 n2Var, int i9, byte[] bArr, int i10, int i11, o1 o1Var, com.google.android.gms.internal.clearcut.m mVar) {
        int g10 = g(n2Var, bArr, i10, i11, mVar);
        o1Var.add(mVar.c);
        while (g10 < i11) {
            int j10 = j(bArr, g10, mVar);
            if (i9 != mVar.a) {
                break;
            }
            g10 = g(n2Var, bArr, j10, i11, mVar);
            o1Var.add(mVar.c);
        }
        return g10;
    }

    public static int f(n2 n2Var, byte[] bArr, int i9, int i10, int i11, com.google.android.gms.internal.clearcut.m mVar) {
        e2 e2Var = (e2) n2Var;
        Object zza = e2Var.zza();
        int j10 = e2Var.j(zza, bArr, i9, i10, i11, mVar);
        e2Var.b(zza);
        mVar.c = zza;
        return j10;
    }

    public static int g(n2 n2Var, byte[] bArr, int i9, int i10, com.google.android.gms.internal.clearcut.m mVar) {
        int i11 = i9 + 1;
        int i12 = bArr[i9];
        if (i12 < 0) {
            i11 = d(i12, bArr, i11, mVar);
            i12 = mVar.a;
        }
        int i13 = i11;
        if (i12 < 0 || i12 > i10 - i13) {
            throw n1.a();
        }
        Object zza = n2Var.zza();
        int i14 = i13 + i12;
        n2Var.f(zza, bArr, i13, i14, mVar);
        n2Var.b(zza);
        mVar.c = zza;
        return i14;
    }

    public static int j(byte[] bArr, int i9, com.google.android.gms.internal.clearcut.m mVar) {
        int i10 = i9 + 1;
        byte b10 = bArr[i9];
        if (b10 < 0) {
            return d(b10, bArr, i10, mVar);
        }
        mVar.a = b10;
        return i10;
    }

    public static String k(q0 q0Var) {
        StringBuilder sb2 = new StringBuilder(q0Var.n());
        for (int i9 = 0; i9 < q0Var.n(); i9++) {
            byte i10 = q0Var.i(i9);
            if (i10 == 34) {
                sb2.append("\\\"");
            } else if (i10 == 39) {
                sb2.append("\\'");
            } else if (i10 != 92) {
                switch (i10) {
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
                        if (i10 < 32 || i10 > 126) {
                            sb2.append('\\');
                            sb2.append((char) (((i10 >>> 6) & 3) + 48));
                            sb2.append((char) (((i10 >>> 3) & 7) + 48));
                            sb2.append((char) ((i10 & 7) + 48));
                            break;
                        } else {
                            sb2.append((char) i10);
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

    public static final String l(String str) {
        StringBuilder sb2 = new StringBuilder();
        for (int i9 = 0; i9 < str.length(); i9++) {
            char charAt = str.charAt(i9);
            if (Character.isUpperCase(charAt)) {
                sb2.append("_");
            }
            sb2.append(Character.toLowerCase(charAt));
        }
        return sb2.toString();
    }

    public static void m(byte b10, byte b11, byte b12, byte b13, char[] cArr, int i9) {
        if (!A(b11)) {
            if ((((b11 + 112) + (b10 << 28)) >> 30) == 0 && !A(b12) && !A(b13)) {
                int i10 = ((b10 & 7) << 18) | ((b11 & 63) << 12) | ((b12 & 63) << 6) | (b13 & 63);
                cArr[i9] = (char) ((i10 >>> 10) + 55232);
                cArr[i9 + 1] = (char) ((i10 & 1023) + 56320);
                return;
            }
        }
        throw n1.c();
    }

    public static void n(byte b10, byte b11, byte b12, char[] cArr, int i9) {
        if (A(b11) || ((b10 == -32 && b11 < -96) || ((b10 == -19 && b11 >= -96) || A(b12)))) {
            throw n1.c();
        }
        cArr[i9] = (char) (((b10 & 15) << 12) | ((b11 & 63) << 6) | (b12 & 63));
    }

    public static void o(byte b10, byte b11, char[] cArr, int i9) {
        if (b10 < -62 || A(b11)) {
            throw n1.c();
        }
        cArr[i9] = (char) (((b10 & 31) << 6) | (b11 & 63));
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0217, code lost:
    
        if (((java.lang.Double) r4).doubleValue() == 0.0d) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01e5, code lost:
    
        if (((java.lang.Boolean) r4).booleanValue() == false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0250, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01f4, code lost:
    
        if (((java.lang.Integer) r4).intValue() == 0) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0205, code lost:
    
        if (((java.lang.Float) r4).floatValue() == 0.0f) goto L115;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void p(f1 f1Var, StringBuilder sb2, int i9) {
        boolean equals;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet treeSet = new TreeSet();
        for (Method method : f1Var.getClass().getDeclaredMethods()) {
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
            boolean z10 = true;
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List")) {
                String valueOf = String.valueOf(substring.substring(0, 1).toLowerCase());
                String valueOf2 = String.valueOf(substring.substring(1, substring.length() - 4));
                String concat = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
                Method method2 = (Method) hashMap.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    r(sb2, i9, l(concat), f1.f(method2, f1Var, new Object[0]));
                }
            }
            if (substring.endsWith(TeXFormulaSettingsParser.CHARTODEL_MAPPING_EL) && !substring.equals(TeXFormulaSettingsParser.CHARTODEL_MAPPING_EL)) {
                String valueOf3 = String.valueOf(substring.substring(0, 1).toLowerCase());
                String valueOf4 = String.valueOf(substring.substring(1, substring.length() - 3));
                String concat2 = valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3);
                Method method3 = (Method) hashMap.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    r(sb2, i9, l(concat2), f1.f(method3, f1Var, new Object[0]));
                }
            }
            if (((Method) hashMap2.get(substring.length() != 0 ? "set".concat(substring) : new String("set"))) != null) {
                if (substring.endsWith("Bytes")) {
                    String valueOf5 = String.valueOf(substring.substring(0, substring.length() - 5));
                    if (!hashMap.containsKey(valueOf5.length() != 0 ? "get".concat(valueOf5) : new String("get"))) {
                    }
                }
                String valueOf6 = String.valueOf(substring.substring(0, 1).toLowerCase());
                String valueOf7 = String.valueOf(substring.substring(1));
                String concat3 = valueOf7.length() != 0 ? valueOf6.concat(valueOf7) : new String(valueOf6);
                Method method4 = (Method) hashMap.get(substring.length() != 0 ? "get".concat(substring) : new String("get"));
                Method method5 = (Method) hashMap.get(substring.length() != 0 ? "has".concat(substring) : new String("has"));
                if (method4 != null) {
                    Object f10 = f1.f(method4, f1Var, new Object[0]);
                    if (method5 == null) {
                        if (!(f10 instanceof Boolean)) {
                            if (!(f10 instanceof Integer)) {
                                if (!(f10 instanceof Float)) {
                                    if (!(f10 instanceof Double)) {
                                        equals = f10 instanceof String ? f10.equals("") : f10 instanceof q0 ? f10.equals(q0.c) : !(f10 instanceof l0) ? false : false;
                                    }
                                }
                            }
                        }
                        if (equals) {
                            z10 = false;
                        }
                    } else {
                        z10 = ((Boolean) f1.f(method5, f1Var, new Object[0])).booleanValue();
                    }
                    if (z10) {
                        r(sb2, i9, l(concat3), f10);
                    }
                }
            }
        }
        q2 q2Var = f1Var.zzb;
        if (q2Var != null) {
            for (int i10 = 0; i10 < q2Var.a; i10++) {
                r(sb2, i9, String.valueOf(q2Var.b[i10] >>> 3), q2Var.c[i10]);
            }
        }
    }

    public static final void r(StringBuilder sb2, int i9, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                r(sb2, i9, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                r(sb2, i9, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb2.append('\n');
        int i10 = 0;
        for (int i11 = 0; i11 < i9; i11++) {
            sb2.append(' ');
        }
        sb2.append(str);
        if (obj instanceof String) {
            sb2.append(": \"");
            q0 q0Var = q0.c;
            sb2.append(k(new q0(((String) obj).getBytes(j1.a))));
            sb2.append('\"');
            return;
        }
        if (obj instanceof q0) {
            sb2.append(": \"");
            sb2.append(k((q0) obj));
            sb2.append('\"');
            return;
        }
        if (obj instanceof f1) {
            sb2.append(" {");
            p((f1) obj, sb2, i9 + 2);
            sb2.append("\n");
            while (i10 < i9) {
                sb2.append(' ');
                i10++;
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
        int i12 = i9 + 2;
        r(sb2, i12, "key", entry.getKey());
        r(sb2, i12, "value", entry.getValue());
        sb2.append("\n");
        while (i10 < i9) {
            sb2.append(' ');
            i10++;
        }
        sb2.append("}");
    }

    public static int t(byte[] bArr, int i9, com.google.android.gms.internal.clearcut.m mVar) {
        int i10 = i9 + 1;
        long j10 = bArr[i9];
        if (j10 >= 0) {
            mVar.b = j10;
            return i10;
        }
        int i11 = i9 + 2;
        byte b10 = bArr[i10];
        long j11 = (j10 & 127) | ((b10 & Byte.MAX_VALUE) << 7);
        int i12 = 7;
        while (b10 < 0) {
            int i13 = i11 + 1;
            i12 += 7;
            j11 |= (r10 & Byte.MAX_VALUE) << i12;
            b10 = bArr[i11];
            i11 = i13;
        }
        mVar.b = j11;
        return i11;
    }

    public static long u(int i9, byte[] bArr) {
        return ((bArr[i9 + 7] & 255) << 56) | (bArr[i9] & 255) | ((bArr[i9 + 1] & 255) << 8) | ((bArr[i9 + 2] & 255) << 16) | ((bArr[i9 + 3] & 255) << 24) | ((bArr[i9 + 4] & 255) << 32) | ((bArr[i9 + 5] & 255) << 40) | ((bArr[i9 + 6] & 255) << 48);
    }

    public static int w(byte[] bArr, int i9, com.google.android.gms.internal.clearcut.m mVar) {
        int j10 = j(bArr, i9, mVar);
        int i10 = mVar.a;
        if (i10 < 0) {
            throw n1.b();
        }
        if (i10 == 0) {
            mVar.c = "";
            return j10;
        }
        mVar.c = new String(bArr, j10, i10, j1.a);
        return j10 + i10;
    }

    public static int x(byte[] bArr, int i9, com.google.android.gms.internal.clearcut.m mVar) {
        int j10 = j(bArr, i9, mVar);
        int i10 = mVar.a;
        if (i10 < 0) {
            throw n1.b();
        }
        if (i10 == 0) {
            mVar.c = "";
            return j10;
        }
        mVar.c = a3.a.v(j10, i10, bArr);
        return j10 + i10;
    }

    public static int y(int i9) {
        return (-(i9 & 1)) ^ (i9 >>> 1);
    }

    public static int z(byte[] bArr, int i9, com.google.android.gms.internal.clearcut.m mVar) {
        int j10 = j(bArr, i9, mVar);
        int i10 = mVar.a;
        if (i10 < 0) {
            throw n1.b();
        }
        if (i10 > bArr.length - j10) {
            throw n1.a();
        }
        if (i10 == 0) {
            mVar.c = q0.c;
            return j10;
        }
        mVar.c = q0.o(j10, i10, bArr);
        return j10 + i10;
    }

    public abstract int h(String str, byte[] bArr, int i9, int i10);

    public abstract int i(byte[] bArr, int i9, int i10);

    public abstract void q(Exception exc);

    public boolean s(int i9, int i10, byte[] bArr) {
        return i(bArr, i9, i10) == 0;
    }

    public abstract String v(int i9, int i10, byte[] bArr);
}
