package com.google.android.gms.internal.clearcut;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import org.scilab.forge.jlatexmath.TeXFormulaSettingsParser;
import org.telegram.messenger.hs;

/* loaded from: classes.dex */
public final class l1 {
    public static final /* synthetic */ int[] b = {1, 2, 3, 4, 5, 6, 7};
    public static final int[] c = new int[0];
    public static final byte[] d = new byte[0];
    public final /* synthetic */ int a;

    public static int a(int i3, byte[] bArr) {
        return ((bArr[i3 + 3] & 255) << 24) | (bArr[i3] & 255) | ((bArr[i3 + 1] & 255) << 8) | ((bArr[i3 + 2] & 255) << 16);
    }

    public static int b(int i3, byte[] bArr, int i10, int i11, m mVar) {
        if ((i3 >>> 3) == 0) {
            throw new d0("Protocol message contained an invalid tag (zero).");
        }
        int i12 = i3 & 7;
        if (i12 == 0) {
            return m(bArr, i10, mVar);
        }
        if (i12 == 1) {
            return i10 + 8;
        }
        if (i12 == 2) {
            return f(bArr, i10, mVar) + mVar.a;
        }
        if (i12 != 3) {
            if (i12 == 5) {
                return i10 + 4;
            }
            throw new d0("Protocol message contained an invalid tag (zero).");
        }
        int i13 = (i3 & (-8)) | 4;
        int i14 = 0;
        while (i10 < i11) {
            i10 = f(bArr, i10, mVar);
            i14 = mVar.a;
            if (i14 == i13) {
                break;
            }
            i10 = b(i14, bArr, i10, i11, mVar);
        }
        if (i10 > i11 || i14 != i13) {
            throw d0.b();
        }
        return i10;
    }

    public static int c(int i3, byte[] bArr, int i10, int i11, b1 b1Var, m mVar) {
        if ((i3 >>> 3) == 0) {
            throw new d0("Protocol message contained an invalid tag (zero).");
        }
        int i12 = i3 & 7;
        if (i12 == 0) {
            int m10 = m(bArr, i10, mVar);
            b1Var.a(i3, Long.valueOf(mVar.b));
            return m10;
        }
        if (i12 == 1) {
            b1Var.a(i3, Long.valueOf(r(i10, bArr)));
            return i10 + 8;
        }
        if (i12 == 2) {
            int f10 = f(bArr, i10, mVar);
            int i13 = mVar.a;
            b1Var.a(i3, i13 == 0 ? o.c : o.i(f10, i13, bArr));
            return f10 + i13;
        }
        if (i12 != 3) {
            if (i12 != 5) {
                throw new d0("Protocol message contained an invalid tag (zero).");
            }
            b1Var.a(i3, Integer.valueOf(o(i10, bArr)));
            return i10 + 4;
        }
        b1 b10 = b1.b();
        int i14 = (i3 & (-8)) | 4;
        int i15 = 0;
        while (true) {
            if (i10 >= i11) {
                break;
            }
            int f11 = f(bArr, i10, mVar);
            int i16 = mVar.a;
            if (i16 == i14) {
                i15 = i16;
                i10 = f11;
                break;
            }
            i10 = c(i16, bArr, f11, i11, b10, mVar);
            i15 = i16;
        }
        if (i10 > i11 || i15 != i14) {
            throw d0.b();
        }
        b1Var.a(i3, b10);
        return i10;
    }

    public static int d(int i3, byte[] bArr, int i10, m mVar) {
        int i11;
        int i12 = i3 & hs.L1;
        int i13 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 >= 0) {
            i11 = b10 << 7;
        } else {
            int i14 = i12 | ((b10 & Byte.MAX_VALUE) << 7);
            int i15 = i10 + 2;
            byte b11 = bArr[i13];
            if (b11 >= 0) {
                mVar.a = i14 | (b11 << 14);
                return i15;
            }
            i12 = i14 | ((b11 & Byte.MAX_VALUE) << 14);
            i13 = i10 + 3;
            byte b12 = bArr[i15];
            if (b12 >= 0) {
                i11 = b12 << 21;
            } else {
                int i16 = i12 | ((b12 & Byte.MAX_VALUE) << 21);
                int i17 = i10 + 4;
                byte b13 = bArr[i13];
                if (b13 >= 0) {
                    mVar.a = i16 | (b13 << 28);
                    return i17;
                }
                int i18 = i16 | ((b13 & Byte.MAX_VALUE) << 28);
                while (true) {
                    int i19 = i17 + 1;
                    if (bArr[i17] >= 0) {
                        mVar.a = i18;
                        return i19;
                    }
                    i17 = i19;
                }
            }
        }
        mVar.a = i12 | i11;
        return i13;
    }

    public static int e(long j10, byte[] bArr, int i3, int i10) {
        if (i10 == 0) {
            l1 l1Var = k1.a;
            if (i3 > -12) {
                return -1;
            }
            return i3;
        }
        if (i10 == 1) {
            byte a10 = i1.a(j10, bArr);
            l1 l1Var2 = k1.a;
            if (i3 > -12 || a10 > -65) {
                return -1;
            }
            return (a10 << 8) ^ i3;
        }
        if (i10 != 2) {
            throw new AssertionError();
        }
        byte a11 = i1.a(j10, bArr);
        byte a12 = i1.a(j10 + 1, bArr);
        l1 l1Var3 = k1.a;
        if (i3 > -12 || a11 > -65 || a12 > -65) {
            return -1;
        }
        return (a12 << 16) ^ ((a11 << 8) ^ i3);
    }

    public static int f(byte[] bArr, int i3, m mVar) {
        int i10 = i3 + 1;
        byte b10 = bArr[i3];
        if (b10 < 0) {
            return d(b10, bArr, i10, mVar);
        }
        mVar.a = b10;
        return i10;
    }

    public static long g(long j10, long j11, long j12) {
        long j13 = (j10 ^ j11) * j12;
        long j14 = ((j13 ^ (j13 >>> 47)) ^ j11) * j12;
        return (j14 ^ (j14 >>> 47)) * j12;
    }

    public static long h(byte[] bArr) {
        byte[] bArr2 = bArr;
        int length = bArr2.length;
        if (length < 0 || length > bArr2.length) {
            StringBuilder sb2 = new StringBuilder(67);
            sb2.append("Out of bound index with offput: 0 and length: ");
            sb2.append(length);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        char c2 = '/';
        char c10 = 0;
        if (length <= 32) {
            if (length > 16) {
                long j10 = (length << 1) - 7286425919675154353L;
                long n4 = n(0, bArr2) * (-5435081209227447693L);
                long n10 = n(8, bArr2);
                long n11 = n(length - 8, bArr2) * j10;
                return g(Long.rotateRight(n11, 30) + Long.rotateRight(n4 + n10, 43) + (n(length - 16, bArr2) * (-7286425919675154353L)), Long.rotateRight(n10 - 7286425919675154353L, 18) + n4 + n11, j10);
            }
            if (length >= 8) {
                long j11 = (length << 1) - 7286425919675154353L;
                long n12 = n(0, bArr2) - 7286425919675154353L;
                long n13 = n(length - 8, bArr2);
                return g((Long.rotateRight(n13, 37) * j11) + n12, (Long.rotateRight(n12, 25) + n13) * j11, j11);
            }
            if (length >= 4) {
                return g(length + ((a(0, bArr2) & 4294967295L) << 3), a(length - 4, bArr2) & 4294967295L, (length << 1) - 7286425919675154353L);
            }
            if (length <= 0) {
                return -7286425919675154353L;
            }
            byte b10 = bArr2[0];
            byte b11 = bArr2[length >> 1];
            long j12 = ((length + ((bArr2[length - 1] & 255) << 2)) * (-4348849565147123417L)) ^ (((b10 & 255) + ((b11 & 255) << 8)) * (-7286425919675154353L));
            return (j12 ^ (j12 >>> 47)) * (-7286425919675154353L);
        }
        char c11 = '@';
        if (length <= 64) {
            long j13 = (length << 1) - 7286425919675154353L;
            long n14 = n(0, bArr2) * (-7286425919675154353L);
            long n15 = n(8, bArr2);
            long n16 = n(length - 8, bArr2) * j13;
            long rotateRight = Long.rotateRight(n16, 30) + Long.rotateRight(n14 + n15, 43) + (n(length - 16, bArr2) * (-7286425919675154353L));
            long g7 = g(rotateRight, Long.rotateRight(n15 - 7286425919675154353L, 18) + n14 + n16, j13);
            long n17 = n(16, bArr2) * j13;
            long n18 = n(24, bArr2);
            long n19 = (n(length - 32, bArr2) + rotateRight) * j13;
            return g(Long.rotateRight(n19, 30) + Long.rotateRight(n17 + n18, 43) + ((n(length - 24, bArr2) + g7) * j13), Long.rotateRight(n18 + n14, 18) + n17 + n19, j13);
        }
        long[] jArr = new long[2];
        long[] jArr2 = new long[2];
        long n20 = n(0, bArr2) + 95310865018149119L;
        int i3 = length - 1;
        int i10 = (i3 / 64) << 6;
        int i11 = i3 & 63;
        int i12 = i10 + i11;
        int i13 = i12 - 63;
        long j14 = 2480279821605975764L;
        long j15 = 1390051526045402406L;
        int i14 = i11;
        int i15 = 0;
        while (true) {
            char c12 = c10;
            long rotateRight2 = Long.rotateRight(n(i15 + 8, bArr2) + n20 + j14 + jArr[c10], 37) * (-5435081209227447693L);
            long rotateRight3 = Long.rotateRight(n(i15 + 48, bArr2) + j14 + jArr[1], 42) * (-5435081209227447693L);
            long j16 = rotateRight2 ^ jArr2[1];
            char c13 = c11;
            long n21 = n(i15 + 40, bArr2) + jArr[c12] + rotateRight3;
            long rotateRight4 = Long.rotateRight(j15 + jArr2[c12], 33) * (-5435081209227447693L);
            char c14 = c2;
            int i16 = i14;
            l(bArr2, i15, jArr[1] * (-5435081209227447693L), j16 + jArr2[c12], jArr);
            int i17 = i15;
            long[] jArr3 = jArr;
            l(bArr2, i17 + 32, rotateRight4 + jArr2[1], n(i17 + 16, bArr2) + n21, jArr2);
            i15 = i17 + 64;
            if (i15 == i10) {
                long j17 = ((j16 & 255) << 1) - 5435081209227447693L;
                long j18 = jArr2[c12] + i16;
                jArr2[c12] = j18;
                long j19 = jArr3[c12] + j18;
                jArr3[c12] = j19;
                jArr2[c12] = jArr2[c12] + j19;
                long rotateRight5 = Long.rotateRight(n(i12 - 55, bArr2) + rotateRight4 + n21 + jArr3[c12], 37) * j17;
                long rotateRight6 = Long.rotateRight(n(i12 - 15, bArr2) + n21 + jArr3[1], 42) * j17;
                long j20 = rotateRight5 ^ (jArr2[1] * 9);
                long n22 = n(i12 - 23, bArr2) + (jArr3[c12] * 9) + rotateRight6;
                long rotateRight7 = Long.rotateRight(j16 + jArr2[c12], 33) * j17;
                l(bArr2, i13, jArr3[1] * j17, jArr2[c12] + j20, jArr3);
                l(bArr2, i12 - 31, jArr2[1] + rotateRight7, n(i12 - 47, bArr2) + n22, jArr2);
                return g((((n22 >>> c14) ^ n22) * (-4348849565147123417L)) + g(jArr3[c12], jArr2[c12], j17) + j20, g(jArr3[1], jArr2[1], j17) + rotateRight7, j17);
            }
            bArr2 = bArr;
            n20 = rotateRight4;
            jArr = jArr3;
            c10 = c12;
            j15 = j16;
            c11 = c13;
            j14 = n21;
            i14 = i16;
            c2 = c14;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0216, code lost:
    
        if (((java.lang.Double) r11).doubleValue() == 0.0d) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01e5, code lost:
    
        if (((java.lang.Boolean) r11).booleanValue() == false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0249, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01f3, code lost:
    
        if (((java.lang.Integer) r11).intValue() == 0) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0204, code lost:
    
        if (((java.lang.Float) r11).floatValue() == 0.0f) goto L111;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void i(z zVar, StringBuilder sb2, int i3) {
        boolean equals;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet treeSet = new TreeSet();
        for (Method method : zVar.getClass().getDeclaredMethods()) {
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
            boolean z10 = true;
            if (replaceFirst.endsWith("List") && !replaceFirst.endsWith("OrBuilderList") && !replaceFirst.equals("List")) {
                String valueOf = String.valueOf(replaceFirst.substring(0, 1).toLowerCase());
                String valueOf2 = String.valueOf(replaceFirst.substring(1, replaceFirst.length() - 4));
                String concat = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
                Method method2 = (Method) hashMap.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    k(sb2, i3, u(concat), z.b(method2, zVar, new Object[0]));
                }
            }
            if (replaceFirst.endsWith(TeXFormulaSettingsParser.CHARTODEL_MAPPING_EL) && !replaceFirst.equals(TeXFormulaSettingsParser.CHARTODEL_MAPPING_EL)) {
                String valueOf3 = String.valueOf(replaceFirst.substring(0, 1).toLowerCase());
                String valueOf4 = String.valueOf(replaceFirst.substring(1, replaceFirst.length() - 3));
                String concat2 = valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3);
                Method method3 = (Method) hashMap.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    k(sb2, i3, u(concat2), z.b(method3, zVar, new Object[0]));
                }
            }
            if (((Method) hashMap2.get(replaceFirst.length() != 0 ? "set".concat(replaceFirst) : new String("set"))) != null) {
                if (replaceFirst.endsWith("Bytes")) {
                    String valueOf5 = String.valueOf(replaceFirst.substring(0, replaceFirst.length() - 5));
                    if (!hashMap.containsKey(valueOf5.length() != 0 ? "get".concat(valueOf5) : new String("get"))) {
                    }
                }
                String valueOf6 = String.valueOf(replaceFirst.substring(0, 1).toLowerCase());
                String valueOf7 = String.valueOf(replaceFirst.substring(1));
                String concat3 = valueOf7.length() != 0 ? valueOf6.concat(valueOf7) : new String(valueOf6);
                Method method4 = (Method) hashMap.get(replaceFirst.length() != 0 ? "get".concat(replaceFirst) : new String("get"));
                Method method5 = (Method) hashMap.get(replaceFirst.length() != 0 ? "has".concat(replaceFirst) : new String("has"));
                if (method4 != null) {
                    Object b10 = z.b(method4, zVar, new Object[0]);
                    if (method5 == null) {
                        if (!(b10 instanceof Boolean)) {
                            if (!(b10 instanceof Integer)) {
                                if (!(b10 instanceof Float)) {
                                    if (!(b10 instanceof Double)) {
                                        if (!(b10 instanceof String)) {
                                            if (b10 instanceof o) {
                                                obj = o.c;
                                            } else {
                                                equals = !(b10 instanceof j) ? false : false;
                                            }
                                        }
                                        equals = b10.equals(obj);
                                    }
                                }
                            }
                        }
                        if (equals) {
                            z10 = false;
                        }
                    } else {
                        z10 = ((Boolean) z.b(method5, zVar, new Object[0])).booleanValue();
                    }
                    if (z10) {
                        k(sb2, i3, u(concat3), b10);
                    }
                }
            }
        }
        b1 b1Var = zVar.zzjp;
        if (b1Var != null) {
            for (int i10 = 0; i10 < b1Var.a; i10++) {
                k(sb2, i3, String.valueOf(b1Var.b[i10] >>> 3), b1Var.c[i10]);
            }
        }
    }

    public static void j(String str, Object obj, StringBuffer stringBuffer, StringBuffer stringBuffer2) {
        if (obj != null) {
            if (!(obj instanceof m1)) {
                String v = v(str);
                stringBuffer2.append(stringBuffer);
                stringBuffer2.append(v);
                stringBuffer2.append(": ");
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!str2.startsWith("http") && str2.length() > 200) {
                        str2 = String.valueOf(str2.substring(0, hs.e3)).concat("[...]");
                    }
                    int length = str2.length();
                    StringBuilder sb2 = new StringBuilder(length);
                    for (int i3 = 0; i3 < length; i3++) {
                        char charAt = str2.charAt(i3);
                        if (charAt < ' ' || charAt > '~' || charAt == '\"' || charAt == '\'') {
                            sb2.append(String.format("\\u%04x", Integer.valueOf(charAt)));
                        } else {
                            sb2.append(charAt);
                        }
                    }
                    String sb3 = sb2.toString();
                    stringBuffer2.append("\"");
                    stringBuffer2.append(sb3);
                    stringBuffer2.append("\"");
                } else if (obj instanceof byte[]) {
                    stringBuffer2.append('\"');
                    for (byte b10 : (byte[]) obj) {
                        int i10 = b10 & 255;
                        if (i10 == 92 || i10 == 34) {
                            stringBuffer2.append('\\');
                        } else if (i10 < 32 || i10 >= 127) {
                            stringBuffer2.append(String.format("\\%03o", Integer.valueOf(i10)));
                        }
                        stringBuffer2.append((char) i10);
                    }
                    stringBuffer2.append('\"');
                } else {
                    stringBuffer2.append(obj);
                }
                stringBuffer2.append("\n");
                return;
            }
            int length2 = stringBuffer.length();
            if (str != null) {
                stringBuffer2.append(stringBuffer);
                stringBuffer2.append(v(str));
                stringBuffer2.append(" <\n");
                stringBuffer.append("  ");
            }
            Class<?> cls = obj.getClass();
            for (Field field : cls.getFields()) {
                int modifiers = field.getModifiers();
                String name = field.getName();
                if (!"cachedSize".equals(name) && (modifiers & 1) == 1 && (modifiers & 8) != 8 && !name.startsWith("_") && !name.endsWith("_")) {
                    Class<?> type = field.getType();
                    Object obj2 = field.get(obj);
                    if (!type.isArray() || type.getComponentType() == Byte.TYPE) {
                        j(name, obj2, stringBuffer, stringBuffer2);
                    } else {
                        int length3 = obj2 == null ? 0 : Array.getLength(obj2);
                        for (int i11 = 0; i11 < length3; i11++) {
                            j(name, Array.get(obj2, i11), stringBuffer, stringBuffer2);
                        }
                    }
                }
            }
            for (Method method : cls.getMethods()) {
                String name2 = method.getName();
                if (name2.startsWith("set")) {
                    String substring = name2.substring(3);
                    try {
                        String valueOf = String.valueOf(substring);
                        if (((Boolean) cls.getMethod(valueOf.length() != 0 ? "has".concat(valueOf) : new String("has"), null).invoke(obj, null)).booleanValue()) {
                            String valueOf2 = String.valueOf(substring);
                            j(substring, cls.getMethod(valueOf2.length() != 0 ? "get".concat(valueOf2) : new String("get"), null).invoke(obj, null), stringBuffer, stringBuffer2);
                        }
                    } catch (NoSuchMethodException unused) {
                    }
                }
            }
            if (str != null) {
                stringBuffer.setLength(length2);
                stringBuffer2.append(stringBuffer);
                stringBuffer2.append(">\n");
            }
        }
    }

    public static final void k(StringBuilder sb2, int i3, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                k(sb2, i3, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                k(sb2, i3, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb2.append('\n');
        int i10 = 0;
        for (int i11 = 0; i11 < i3; i11++) {
            sb2.append(' ');
        }
        sb2.append(str);
        if (obj instanceof String) {
            sb2.append(": \"");
            o oVar = o.c;
            sb2.append(p(new o(((String) obj).getBytes(a0.a))));
            sb2.append('\"');
            return;
        }
        if (obj instanceof o) {
            sb2.append(": \"");
            sb2.append(p((o) obj));
            sb2.append('\"');
            return;
        }
        if (obj instanceof z) {
            sb2.append(" {");
            i((z) obj, sb2, i3 + 2);
            sb2.append("\n");
            while (i10 < i3) {
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
        int i12 = i3 + 2;
        k(sb2, i12, "key", entry.getKey());
        k(sb2, i12, "value", entry.getValue());
        sb2.append("\n");
        while (i10 < i3) {
            sb2.append(' ');
            i10++;
        }
        sb2.append("}");
    }

    public static void l(byte[] bArr, int i3, long j10, long j11, long[] jArr) {
        long n4 = n(i3, bArr);
        long n10 = n(i3 + 8, bArr);
        long n11 = n(i3 + 16, bArr);
        long n12 = n(i3 + 24, bArr);
        long j12 = j10 + n4;
        long j13 = n10 + j12 + n11;
        long rotateRight = Long.rotateRight(j13, 44) + Long.rotateRight(j11 + j12 + n12, 21);
        jArr[0] = j13 + n12;
        jArr[1] = rotateRight + j12;
    }

    public static int m(byte[] bArr, int i3, m mVar) {
        int i10 = i3 + 1;
        long j10 = bArr[i3];
        if (j10 >= 0) {
            mVar.b = j10;
            return i10;
        }
        int i11 = i3 + 2;
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

    public static long n(int i3, byte[] bArr) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr, i3, 8);
        wrap.order(ByteOrder.LITTLE_ENDIAN);
        return wrap.getLong();
    }

    public static int o(int i3, byte[] bArr) {
        return ((bArr[i3 + 3] & 255) << 24) | (bArr[i3] & 255) | ((bArr[i3 + 1] & 255) << 8) | ((bArr[i3 + 2] & 255) << 16);
    }

    public static String p(o oVar) {
        String str;
        StringBuilder sb2 = new StringBuilder(oVar.size());
        for (int i3 = 0; i3 < oVar.size(); i3++) {
            int j10 = oVar.j(i3);
            if (j10 == 34) {
                str = "\\\"";
            } else if (j10 == 39) {
                str = "\\'";
            } else if (j10 != 92) {
                switch (j10) {
                    case 7:
                        str = "\\a";
                        break;
                    case 8:
                        str = "\\b";
                        break;
                    case 9:
                        str = "\\t";
                        break;
                    case 10:
                        str = "\\n";
                        break;
                    case 11:
                        str = "\\v";
                        break;
                    case 12:
                        str = "\\f";
                        break;
                    case 13:
                        str = "\\r";
                        break;
                    default:
                        if (j10 < 32 || j10 > 126) {
                            sb2.append('\\');
                            sb2.append((char) (((j10 >>> 6) & 3) + 48));
                            sb2.append((char) (((j10 >>> 3) & 7) + 48));
                            j10 = (j10 & 7) + 48;
                        }
                        sb2.append((char) j10);
                        continue;
                }
            } else {
                str = "\\\\";
            }
            sb2.append(str);
        }
        return sb2.toString();
    }

    public static int q(byte[] bArr, int i3, m mVar) {
        int f10 = f(bArr, i3, mVar);
        int i10 = mVar.a;
        if (i10 == 0) {
            mVar.c = "";
            return f10;
        }
        int i11 = f10 + i10;
        if (!k1.a.t(bArr, f10, i11)) {
            throw new d0("Protocol message had invalid UTF-8.");
        }
        mVar.c = new String(bArr, f10, i10, a0.a);
        return i11;
    }

    public static long r(int i3, byte[] bArr) {
        return ((bArr[i3 + 7] & 255) << 56) | (bArr[i3] & 255) | ((bArr[i3 + 1] & 255) << 8) | ((bArr[i3 + 2] & 255) << 16) | ((bArr[i3 + 3] & 255) << 24) | ((bArr[i3 + 4] & 255) << 32) | ((bArr[i3 + 5] & 255) << 40) | ((bArr[i3 + 6] & 255) << 48);
    }

    public static int s(byte[] bArr, int i3, m mVar) {
        int f10 = f(bArr, i3, mVar);
        int i10 = mVar.a;
        if (i10 == 0) {
            mVar.c = o.c;
            return f10;
        }
        mVar.c = o.i(f10, i10, bArr);
        return f10 + i10;
    }

    public static final String u(String str) {
        StringBuilder sb2 = new StringBuilder();
        for (int i3 = 0; i3 < str.length(); i3++) {
            char charAt = str.charAt(i3);
            if (Character.isUpperCase(charAt)) {
                sb2.append("_");
            }
            sb2.append(Character.toLowerCase(charAt));
        }
        return sb2.toString();
    }

    public static String v(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i3 = 0; i3 < str.length(); i3++) {
            char charAt = str.charAt(i3);
            if (i3 != 0) {
                if (Character.isUpperCase(charAt)) {
                    stringBuffer.append('_');
                }
                stringBuffer.append(charAt);
            }
            charAt = Character.toLowerCase(charAt);
            stringBuffer.append(charAt);
        }
        return stringBuffer.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0085, code lost:
    
        r9 = e(r12, r22, r3, r4);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0185 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0186 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean t(byte[] bArr, int i3, int i10) {
        boolean z10;
        boolean z11;
        byte b10;
        int i11;
        long j10;
        int i12;
        int i13 = i3;
        byte b11 = -16;
        byte b12 = -62;
        switch (this.a) {
            case 0:
                z10 = false;
                z11 = true;
                while (i13 < i10 && bArr[i13] >= 0) {
                    i13++;
                }
                if (i13 < i10) {
                    while (i13 < i10) {
                        int i14 = i13 + 1;
                        byte b13 = bArr[i13];
                        if (b13 >= 0) {
                            i13 = i14;
                        } else if (b13 >= -32) {
                            if (b13 < -16) {
                                if (i14 >= i10 - 1) {
                                    b10 = k1.a(i14, i10, bArr);
                                } else {
                                    int i15 = i13 + 2;
                                    byte b14 = bArr[i14];
                                    if (b14 <= -65 && ((b13 != -32 || b14 >= -96) && (b13 != -19 || b14 < -96))) {
                                        i13 += 3;
                                        if (bArr[i15] > -65) {
                                        }
                                    }
                                    b10 = -1;
                                }
                            } else if (i14 >= i10 - 2) {
                                b10 = k1.a(i14, i10, bArr);
                            } else {
                                int i16 = i13 + 2;
                                byte b15 = bArr[i14];
                                if (b15 <= -65 && (((b15 + 112) + (b13 << 28)) >> 30) == 0) {
                                    int i17 = i13 + 3;
                                    if (bArr[i16] <= -65) {
                                        i13 += 4;
                                        if (bArr[i17] > -65) {
                                        }
                                    }
                                }
                                b10 = -1;
                            }
                            if (b10 == 0) {
                            }
                        } else {
                            if (i14 >= i10) {
                                b10 = b13;
                                return b10 == 0 ? z11 : z10;
                            }
                            if (b13 >= -62) {
                                i13 += 2;
                                if (bArr[i14] > -65) {
                                }
                            }
                            b10 = -1;
                            if (b10 == 0) {
                            }
                        }
                    }
                }
                b10 = z10;
                if (b10 == 0) {
                }
                break;
            default:
                int i18 = 2;
                if ((i13 | i10 | (bArr.length - i10)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", Integer.valueOf(bArr.length), Integer.valueOf(i13), Integer.valueOf(i10)));
                }
                z10 = false;
                long j11 = i13;
                z11 = true;
                int i19 = (int) (i10 - j11);
                if (i19 < 16) {
                    i11 = 0;
                    j10 = 1;
                } else {
                    long j12 = j11;
                    i11 = 0;
                    j10 = 1;
                    while (true) {
                        if (i11 < i19) {
                            long j13 = j12 + 1;
                            if (i1.a(j12, bArr) >= 0) {
                                i11++;
                                j12 = j13;
                            }
                        } else {
                            i11 = i19;
                        }
                    }
                }
                int i20 = i19 - i11;
                long j14 = j11 + i11;
                while (true) {
                    byte b16 = 0;
                    while (true) {
                        if (i20 > 0) {
                            long j15 = j14 + j10;
                            byte a10 = i1.a(j14, bArr);
                            if (a10 >= 0) {
                                i20--;
                                j14 = j15;
                                b16 = a10;
                            } else {
                                j14 = j15;
                                b16 = a10;
                            }
                        }
                    }
                    if (i20 == 0) {
                        break;
                    } else {
                        int i21 = i20 - 1;
                        if (b16 < -32) {
                            if (i21 == 0) {
                                b10 = b16;
                            } else {
                                i20 -= 2;
                                if (b16 >= b12) {
                                    long j16 = j14 + j10;
                                    if (i1.a(j14, bArr) <= -65) {
                                        j14 = j16;
                                        i12 = i18;
                                        i18 = i12;
                                        b11 = -16;
                                        b12 = -62;
                                    }
                                }
                            }
                        } else if (b16 >= b11) {
                            i12 = i18;
                            if (i21 < 3) {
                                break;
                            } else {
                                i20 -= 4;
                                long j17 = j14 + j10;
                                byte a11 = i1.a(j14, bArr);
                                if (a11 <= -65 && (((a11 + 112) + (b16 << 28)) >> 30) == 0) {
                                    long j18 = j14 + 2;
                                    if (i1.a(j17, bArr) <= -65) {
                                        j14 += 3;
                                        if (i1.a(j18, bArr) > -65) {
                                        }
                                        i18 = i12;
                                        b11 = -16;
                                        b12 = -62;
                                    }
                                }
                            }
                        } else if (i21 < i18) {
                            break;
                        } else {
                            i20 -= 3;
                            long j19 = j14 + j10;
                            byte a12 = i1.a(j14, bArr);
                            if (a12 <= -65 && (b16 != -32 || a12 >= -96)) {
                                int i22 = i18;
                                if (b16 != -19 || a12 < -96) {
                                    j14 += 2;
                                    if (i1.a(j19, bArr) <= -65) {
                                        i18 = i22;
                                    }
                                }
                            }
                        }
                    }
                }
                b10 = -1;
                if (b10 == 0) {
                }
                break;
        }
    }
}
