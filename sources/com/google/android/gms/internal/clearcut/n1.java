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

/* loaded from: classes.dex */
public final class n1 {
    public static final /* synthetic */ int[] b = {1, 2, 3, 4, 5, 6, 7};
    public static final int[] c = new int[0];
    public static final byte[] d = new byte[0];
    public final /* synthetic */ int a;

    public static int a(int i10, byte[] bArr) {
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    public static int b(int i10, byte[] bArr, int i11, int i12, m mVar) {
        if ((i10 >>> 3) == 0) {
            throw new d0("Protocol message contained an invalid tag (zero).");
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            return m(bArr, i11, mVar);
        }
        if (i13 == 1) {
            return i11 + 8;
        }
        if (i13 == 2) {
            return f(bArr, i11, mVar) + mVar.a;
        }
        if (i13 != 3) {
            if (i13 == 5) {
                return i11 + 4;
            }
            throw new d0("Protocol message contained an invalid tag (zero).");
        }
        int i14 = (i10 & (-8)) | 4;
        int i15 = 0;
        while (i11 < i12) {
            i11 = f(bArr, i11, mVar);
            i15 = mVar.a;
            if (i15 == i14) {
                break;
            }
            i11 = b(i15, bArr, i11, i12, mVar);
        }
        if (i11 > i12 || i15 != i14) {
            throw d0.b();
        }
        return i11;
    }

    public static int c(int i10, byte[] bArr, int i11, int i12, c1 c1Var, m mVar) {
        if ((i10 >>> 3) == 0) {
            throw new d0("Protocol message contained an invalid tag (zero).");
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            int m10 = m(bArr, i11, mVar);
            c1Var.a(i10, Long.valueOf(mVar.b));
            return m10;
        }
        if (i13 == 1) {
            c1Var.a(i10, Long.valueOf(r(i11, bArr)));
            return i11 + 8;
        }
        if (i13 == 2) {
            int f7 = f(bArr, i11, mVar);
            int i14 = mVar.a;
            c1Var.a(i10, i14 == 0 ? o.c : o.n(f7, i14, bArr));
            return f7 + i14;
        }
        if (i13 != 3) {
            if (i13 != 5) {
                throw new d0("Protocol message contained an invalid tag (zero).");
            }
            c1Var.a(i10, Integer.valueOf(o(i11, bArr)));
            return i11 + 4;
        }
        c1 b10 = c1.b();
        int i15 = (i10 & (-8)) | 4;
        int i16 = 0;
        while (true) {
            if (i11 >= i12) {
                break;
            }
            int f10 = f(bArr, i11, mVar);
            int i17 = mVar.a;
            if (i17 == i15) {
                i16 = i17;
                i11 = f10;
                break;
            }
            i11 = c(i17, bArr, f10, i12, b10, mVar);
            i16 = i17;
        }
        if (i11 > i12 || i16 != i15) {
            throw d0.b();
        }
        c1Var.a(i10, b10);
        return i11;
    }

    public static int d(int i10, byte[] bArr, int i11, m mVar) {
        int i12;
        int i13 = i10 & 127;
        int i14 = i11 + 1;
        byte b10 = bArr[i11];
        if (b10 >= 0) {
            i12 = b10 << 7;
        } else {
            int i15 = i13 | ((b10 & Byte.MAX_VALUE) << 7);
            int i16 = i11 + 2;
            byte b11 = bArr[i14];
            if (b11 >= 0) {
                mVar.a = i15 | (b11 << 14);
                return i16;
            }
            i13 = i15 | ((b11 & Byte.MAX_VALUE) << 14);
            i14 = i11 + 3;
            byte b12 = bArr[i16];
            if (b12 >= 0) {
                i12 = b12 << 21;
            } else {
                int i17 = i13 | ((b12 & Byte.MAX_VALUE) << 21);
                int i18 = i11 + 4;
                byte b13 = bArr[i14];
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
        }
        mVar.a = i13 | i12;
        return i14;
    }

    public static int e(long j3, byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            n1 n1Var = m1.a;
            if (i10 > -12) {
                return -1;
            }
            return i10;
        }
        if (i11 == 1) {
            byte a2 = k1.a(j3, bArr);
            n1 n1Var2 = m1.a;
            if (i10 > -12 || a2 > -65) {
                return -1;
            }
            return (a2 << 8) ^ i10;
        }
        if (i11 != 2) {
            throw new AssertionError();
        }
        byte a10 = k1.a(j3, bArr);
        byte a11 = k1.a(j3 + 1, bArr);
        n1 n1Var3 = m1.a;
        if (i10 > -12 || a10 > -65 || a11 > -65) {
            return -1;
        }
        return (a11 << 16) ^ ((a10 << 8) ^ i10);
    }

    public static int f(byte[] bArr, int i10, m mVar) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 < 0) {
            return d(b10, bArr, i11, mVar);
        }
        mVar.a = b10;
        return i11;
    }

    public static long g(long j3, long j10, long j11) {
        long j12 = (j3 ^ j10) * j11;
        long j13 = ((j12 ^ (j12 >>> 47)) ^ j10) * j11;
        return (j13 ^ (j13 >>> 47)) * j11;
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
        char c10 = 0;
        if (length <= 32) {
            if (length > 16) {
                long j3 = (length << 1) - 7286425919675154353L;
                long n10 = n(0, bArr2) * (-5435081209227447693L);
                long n11 = n(8, bArr2);
                long n12 = n(length - 8, bArr2) * j3;
                return g(Long.rotateRight(n12, 30) + Long.rotateRight(n10 + n11, 43) + (n(length - 16, bArr2) * (-7286425919675154353L)), Long.rotateRight(n11 - 7286425919675154353L, 18) + n10 + n12, j3);
            }
            if (length >= 8) {
                long j10 = (length << 1) - 7286425919675154353L;
                long n13 = n(0, bArr2) - 7286425919675154353L;
                long n14 = n(length - 8, bArr2);
                return g((Long.rotateRight(n14, 37) * j10) + n13, (Long.rotateRight(n13, 25) + n14) * j10, j10);
            }
            if (length >= 4) {
                return g(length + ((a(0, bArr2) & 4294967295L) << 3), a(length - 4, bArr2) & 4294967295L, (length << 1) - 7286425919675154353L);
            }
            if (length <= 0) {
                return -7286425919675154353L;
            }
            byte b10 = bArr2[0];
            byte b11 = bArr2[length >> 1];
            long j11 = ((length + ((bArr2[length - 1] & 255) << 2)) * (-4348849565147123417L)) ^ (((b10 & 255) + ((b11 & 255) << 8)) * (-7286425919675154353L));
            return (j11 ^ (j11 >>> 47)) * (-7286425919675154353L);
        }
        if (length <= 64) {
            long j12 = (length << 1) - 7286425919675154353L;
            long n15 = n(0, bArr2) * (-7286425919675154353L);
            long n16 = n(8, bArr2);
            long n17 = n(length - 8, bArr2) * j12;
            long rotateRight = Long.rotateRight(n17, 30) + Long.rotateRight(n15 + n16, 43) + (n(length - 16, bArr2) * (-7286425919675154353L));
            long g10 = g(rotateRight, Long.rotateRight(n16 - 7286425919675154353L, 18) + n15 + n17, j12);
            long n18 = n(16, bArr2) * j12;
            long n19 = n(24, bArr2);
            long n20 = (n(length - 32, bArr2) + rotateRight) * j12;
            return g(Long.rotateRight(n20, 30) + Long.rotateRight(n18 + n19, 43) + ((n(length - 24, bArr2) + g10) * j12), Long.rotateRight(n19 + n15, 18) + n18 + n20, j12);
        }
        long[] jArr = new long[2];
        long[] jArr2 = new long[2];
        long n21 = n(0, bArr2) + 95310865018149119L;
        int i10 = length - 1;
        int i11 = (i10 / 64) << 6;
        int i12 = i10 & 63;
        int i13 = i11 + i12;
        int i14 = i13 - 63;
        long j13 = 2480279821605975764L;
        long j14 = 1390051526045402406L;
        int i15 = i12;
        int i16 = 0;
        while (true) {
            long rotateRight2 = Long.rotateRight(n(i16 + 8, bArr2) + n21 + j13 + jArr[c10], 37) * (-5435081209227447693L);
            long rotateRight3 = Long.rotateRight(n(i16 + 48, bArr2) + j13 + jArr[1], 42) * (-5435081209227447693L);
            long j15 = rotateRight2 ^ jArr2[1];
            long n22 = n(i16 + 40, bArr2) + jArr[0] + rotateRight3;
            long rotateRight4 = Long.rotateRight(j14 + jArr2[0], 33) * (-5435081209227447693L);
            int i17 = i15;
            l(bArr2, i16, jArr[1] * (-5435081209227447693L), j15 + jArr2[0], jArr);
            int i18 = i16;
            long[] jArr3 = jArr;
            l(bArr2, i18 + 32, rotateRight4 + jArr2[1], n(i18 + 16, bArr2) + n22, jArr2);
            i16 = i18 + 64;
            if (i16 == i11) {
                long j16 = ((j15 & 255) << 1) - 5435081209227447693L;
                long j17 = jArr2[0] + i17;
                jArr2[0] = j17;
                long j18 = jArr3[0] + j17;
                jArr3[0] = j18;
                jArr2[0] = jArr2[0] + j18;
                long rotateRight5 = Long.rotateRight(n(i13 - 55, bArr2) + rotateRight4 + n22 + jArr3[0], 37) * j16;
                long rotateRight6 = Long.rotateRight(n(i13 - 15, bArr2) + n22 + jArr3[1], 42) * j16;
                long j19 = rotateRight5 ^ (jArr2[1] * 9);
                long n23 = n(i13 - 23, bArr2) + (jArr3[0] * 9) + rotateRight6;
                long rotateRight7 = Long.rotateRight(j15 + jArr2[0], 33) * j16;
                l(bArr2, i14, jArr3[1] * j16, jArr2[0] + j19, jArr3);
                l(bArr2, i13 - 31, jArr2[1] + rotateRight7, n(i13 - 47, bArr2) + n23, jArr2);
                return g((((n23 >>> 47) ^ n23) * (-4348849565147123417L)) + g(jArr3[0], jArr2[0], j16) + j19, g(jArr3[1], jArr2[1], j16) + rotateRight7, j16);
            }
            bArr2 = bArr;
            n21 = rotateRight4;
            jArr = jArr3;
            j14 = j15;
            j13 = n22;
            c10 = 0;
            i15 = i17;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0217, code lost:
    
        if (((java.lang.Double) r11).doubleValue() == 0.0d) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01e6, code lost:
    
        if (((java.lang.Boolean) r11).booleanValue() == false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x024a, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01f4, code lost:
    
        if (((java.lang.Integer) r11).intValue() == 0) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0205, code lost:
    
        if (((java.lang.Float) r11).floatValue() == 0.0f) goto L111;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void i(z zVar, StringBuilder sb2, int i10) {
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
                    k(sb2, i10, u(concat), z.b(method2, zVar, new Object[0]));
                }
            }
            if (replaceFirst.endsWith(TeXFormulaSettingsParser.CHARTODEL_MAPPING_EL) && !replaceFirst.equals(TeXFormulaSettingsParser.CHARTODEL_MAPPING_EL)) {
                String valueOf3 = String.valueOf(replaceFirst.substring(0, 1).toLowerCase());
                String valueOf4 = String.valueOf(replaceFirst.substring(1, replaceFirst.length() - 3));
                String concat2 = valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3);
                Method method3 = (Method) hashMap.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    k(sb2, i10, u(concat2), z.b(method3, zVar, new Object[0]));
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
                        k(sb2, i10, u(concat3), b10);
                    }
                }
            }
        }
        c1 c1Var = zVar.zzjp;
        if (c1Var != null) {
            for (int i11 = 0; i11 < c1Var.a; i11++) {
                k(sb2, i10, String.valueOf(c1Var.b[i11] >>> 3), c1Var.c[i11]);
            }
        }
    }

    public static void j(String str, Object obj, StringBuffer stringBuffer, StringBuffer stringBuffer2) {
        if (obj != null) {
            if (!(obj instanceof o1)) {
                String v = v(str);
                stringBuffer2.append(stringBuffer);
                stringBuffer2.append(v);
                stringBuffer2.append(": ");
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!str2.startsWith("http") && str2.length() > 200) {
                        str2 = String.valueOf(str2.substring(0, 200)).concat("[...]");
                    }
                    int length = str2.length();
                    StringBuilder sb2 = new StringBuilder(length);
                    for (int i10 = 0; i10 < length; i10++) {
                        char charAt = str2.charAt(i10);
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
                        int i11 = b10 & 255;
                        if (i11 == 92 || i11 == 34) {
                            stringBuffer2.append('\\');
                        } else if (i11 < 32 || i11 >= 127) {
                            stringBuffer2.append(String.format("\\%03o", Integer.valueOf(i11)));
                        }
                        stringBuffer2.append((char) i11);
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
                        for (int i12 = 0; i12 < length3; i12++) {
                            j(name, Array.get(obj2, i12), stringBuffer, stringBuffer2);
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

    public static final void k(StringBuilder sb2, int i10, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                k(sb2, i10, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                k(sb2, i10, str, (Map.Entry) it2.next());
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
            i((z) obj, sb2, i10 + 2);
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
        k(sb2, i13, "key", entry.getKey());
        k(sb2, i13, "value", entry.getValue());
        sb2.append("\n");
        while (i11 < i10) {
            sb2.append(' ');
            i11++;
        }
        sb2.append("}");
    }

    public static void l(byte[] bArr, int i10, long j3, long j10, long[] jArr) {
        long n10 = n(i10, bArr);
        long n11 = n(i10 + 8, bArr);
        long n12 = n(i10 + 16, bArr);
        long n13 = n(i10 + 24, bArr);
        long j11 = j3 + n10;
        long j12 = n11 + j11 + n12;
        long rotateRight = Long.rotateRight(j12, 44) + Long.rotateRight(j10 + j11 + n13, 21);
        jArr[0] = j12 + n13;
        jArr[1] = rotateRight + j11;
    }

    public static int m(byte[] bArr, int i10, m mVar) {
        int i11 = i10 + 1;
        long j3 = bArr[i10];
        if (j3 >= 0) {
            mVar.b = j3;
            return i11;
        }
        int i12 = i10 + 2;
        byte b10 = bArr[i11];
        long j10 = (j3 & 127) | ((b10 & Byte.MAX_VALUE) << 7);
        int i13 = 7;
        while (b10 < 0) {
            int i14 = i12 + 1;
            i13 += 7;
            j10 |= (r10 & Byte.MAX_VALUE) << i13;
            b10 = bArr[i12];
            i12 = i14;
        }
        mVar.b = j10;
        return i12;
    }

    public static long n(int i10, byte[] bArr) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr, i10, 8);
        wrap.order(ByteOrder.LITTLE_ENDIAN);
        return wrap.getLong();
    }

    public static int o(int i10, byte[] bArr) {
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    public static String p(o oVar) {
        String str;
        StringBuilder sb2 = new StringBuilder(oVar.size());
        for (int i10 = 0; i10 < oVar.size(); i10++) {
            int o9 = oVar.o(i10);
            if (o9 == 34) {
                str = "\\\"";
            } else if (o9 == 39) {
                str = "\\'";
            } else if (o9 != 92) {
                switch (o9) {
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
                        if (o9 < 32 || o9 > 126) {
                            sb2.append('\\');
                            sb2.append((char) (((o9 >>> 6) & 3) + 48));
                            sb2.append((char) (((o9 >>> 3) & 7) + 48));
                            o9 = (o9 & 7) + 48;
                        }
                        sb2.append((char) o9);
                        continue;
                }
            } else {
                str = "\\\\";
            }
            sb2.append(str);
        }
        return sb2.toString();
    }

    public static int q(byte[] bArr, int i10, m mVar) {
        int f7 = f(bArr, i10, mVar);
        int i11 = mVar.a;
        if (i11 == 0) {
            mVar.c = "";
            return f7;
        }
        int i12 = f7 + i11;
        if (!m1.a.t(bArr, f7, i12)) {
            throw new d0("Protocol message had invalid UTF-8.");
        }
        mVar.c = new String(bArr, f7, i11, a0.a);
        return i12;
    }

    public static long r(int i10, byte[] bArr) {
        return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
    }

    public static int s(byte[] bArr, int i10, m mVar) {
        int f7 = f(bArr, i10, mVar);
        int i11 = mVar.a;
        if (i11 == 0) {
            mVar.c = o.c;
            return f7;
        }
        mVar.c = o.n(f7, i11, bArr);
        return f7 + i11;
    }

    public static final String u(String str) {
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

    public static String v(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i10 = 0; i10 < str.length(); i10++) {
            char charAt = str.charAt(i10);
            if (i10 != 0) {
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

    /* JADX WARN: Removed duplicated region for block: B:31:0x017c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x017d A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean t(byte[] bArr, int i10, int i11) {
        boolean z10;
        boolean z11;
        int i12;
        long j3;
        int i13;
        byte b10;
        int i14;
        int i15 = i10;
        byte b11 = -16;
        byte b12 = -62;
        switch (this.a) {
            case 0:
                z10 = false;
                z11 = true;
                while (i15 < i11 && bArr[i15] >= 0) {
                    i15++;
                }
                if (i15 < i11) {
                    while (i15 < i11) {
                        int i16 = i15 + 1;
                        byte b13 = bArr[i15];
                        if (b13 >= 0) {
                            i15 = i16;
                        } else if (b13 >= -32) {
                            if (b13 < -16) {
                                if (i16 >= i11 - 1) {
                                    i12 = m1.a(i16, i11, bArr);
                                } else {
                                    int i17 = i15 + 2;
                                    byte b14 = bArr[i16];
                                    if (b14 <= -65 && ((b13 != -32 || b14 >= -96) && (b13 != -19 || b14 < -96))) {
                                        i15 += 3;
                                        if (bArr[i17] > -65) {
                                        }
                                    }
                                    i12 = -1;
                                }
                            } else if (i16 >= i11 - 2) {
                                i12 = m1.a(i16, i11, bArr);
                            } else {
                                int i18 = i15 + 2;
                                byte b15 = bArr[i16];
                                if (b15 <= -65 && (((b15 + 112) + (b13 << 28)) >> 30) == 0) {
                                    int i19 = i15 + 3;
                                    if (bArr[i18] <= -65) {
                                        i15 += 4;
                                        if (bArr[i19] > -65) {
                                        }
                                    }
                                }
                                i12 = -1;
                            }
                            if (i12 == 0) {
                            }
                        } else {
                            if (i16 >= i11) {
                                i12 = b13;
                                return i12 == 0 ? z11 : z10;
                            }
                            if (b13 >= -62) {
                                i15 += 2;
                                if (bArr[i16] > -65) {
                                }
                            }
                            i12 = -1;
                            if (i12 == 0) {
                            }
                        }
                    }
                }
                i12 = 0;
                if (i12 == 0) {
                }
                break;
            default:
                int i20 = 2;
                if ((i15 | i11 | (bArr.length - i11)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", Integer.valueOf(bArr.length), Integer.valueOf(i15), Integer.valueOf(i11)));
                }
                z10 = false;
                long j10 = i15;
                z11 = true;
                int i21 = (int) (i11 - j10);
                if (i21 < 16) {
                    j3 = 1;
                    i13 = 0;
                } else {
                    long j11 = j10;
                    j3 = 1;
                    i13 = 0;
                    while (true) {
                        if (i13 < i21) {
                            long j12 = j11 + 1;
                            if (k1.a(j11, bArr) >= 0) {
                                i13++;
                                j11 = j12;
                            }
                        } else {
                            i13 = i21;
                        }
                    }
                }
                int i22 = i21 - i13;
                long j13 = j10 + i13;
                while (true) {
                    b10 = 0;
                    while (true) {
                        if (i22 > 0) {
                            long j14 = j13 + j3;
                            byte a2 = k1.a(j13, bArr);
                            if (a2 >= 0) {
                                i22--;
                                j13 = j14;
                                b10 = a2;
                            } else {
                                j13 = j14;
                                b10 = a2;
                            }
                        }
                    }
                    if (i22 == 0) {
                        break;
                    } else {
                        i14 = i22 - 1;
                        if (b10 >= -32) {
                            if (b10 >= b11) {
                                if (i14 >= 3) {
                                    i22 -= 4;
                                    long j15 = j13 + j3;
                                    byte a10 = k1.a(j13, bArr);
                                    if (a10 <= -65 && (((a10 + 112) + (b10 << 28)) >> 30) == 0) {
                                        long j16 = j13 + 2;
                                        if (k1.a(j15, bArr) > -65) {
                                            break;
                                        } else {
                                            j13 += 3;
                                            if (k1.a(j16, bArr) > -65) {
                                                break;
                                            }
                                            b11 = -16;
                                            b12 = -62;
                                        }
                                    }
                                }
                            } else if (i14 >= i20) {
                                i22 -= 3;
                                long j17 = j13 + j3;
                                byte a11 = k1.a(j13, bArr);
                                if (a11 <= -65 && ((b10 != -32 || a11 >= -96) && (b10 != -19 || a11 < -96))) {
                                    j13 += 2;
                                    if (k1.a(j17, bArr) > -65) {
                                        break;
                                    }
                                }
                            }
                        } else if (i14 != 0) {
                            i22 -= 2;
                            if (b10 < b12) {
                                break;
                            } else {
                                long j18 = j13 + j3;
                                if (k1.a(j13, bArr) > -65) {
                                    break;
                                } else {
                                    j13 = j18;
                                    b11 = -16;
                                    b12 = -62;
                                }
                            }
                        } else {
                            i12 = b10;
                        }
                        i20 = 2;
                    }
                }
                i12 = e(j13, bArr, b10, i14);
                if (i12 == 0) {
                }
                break;
        }
    }
}
