package com.google.android.gms.internal.vision;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class o2 {
    public static final Class a;
    public static final p2 b;
    public static final p2 c;
    public static final p2 d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        a = cls;
        b = d(false);
        c = d(true);
        d = new p2();
    }

    public static int A(List list) {
        return list.size() << 2;
    }

    public static void B(int i10, List list, y1 y1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r0 r0Var = (r0) y1Var.a;
        if (!z10) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                int intValue = ((Integer) list.get(i11)).intValue();
                r0Var.D(i10, 0);
                r0Var.C(intValue);
            }
            return;
        }
        r0Var.D(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += r0.P(((Integer) list.get(i13)).intValue());
        }
        r0Var.H(i12);
        for (int i14 = 0; i14 < list.size(); i14++) {
            r0Var.C(((Integer) list.get(i14)).intValue());
        }
    }

    public static int C(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return r0.R(i10) * size;
    }

    public static int D(List list) {
        return list.size() << 3;
    }

    public static void E(int i10, List list, y1 y1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r0 r0Var = (r0) y1Var.a;
        if (!z10) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                int intValue = ((Integer) list.get(i11)).intValue();
                r0Var.D(i10, 0);
                r0Var.H(intValue);
            }
            return;
        }
        r0Var.D(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += r0.T(((Integer) list.get(i13)).intValue());
        }
        r0Var.H(i12);
        for (int i14 = 0; i14 < list.size(); i14++) {
            r0Var.H(((Integer) list.get(i14)).intValue());
        }
    }

    public static void F(int i10, List list, y1 y1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r0 r0Var = (r0) y1Var.a;
        if (!z10) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                int intValue = ((Integer) list.get(i11)).intValue();
                r0Var.D(i10, 0);
                r0Var.H((intValue >> 31) ^ (intValue << 1));
            }
            return;
        }
        r0Var.D(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            int intValue2 = ((Integer) list.get(i13)).intValue();
            i12 += r0.T((intValue2 >> 31) ^ (intValue2 << 1));
        }
        r0Var.H(i12);
        for (int i14 = 0; i14 < list.size(); i14++) {
            int intValue3 = ((Integer) list.get(i14)).intValue();
            r0Var.H((intValue3 >> 31) ^ (intValue3 << 1));
        }
    }

    public static void G(int i10, List list, y1 y1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r0 r0Var = (r0) y1Var.a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                int intValue = ((Integer) list.get(i11)).intValue();
                r0Var.D(i10, 5);
                r0Var.M(intValue);
                i11++;
            }
            return;
        }
        r0Var.D(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Integer) list.get(i13)).getClass();
            Logger logger = r0.f;
            i12 += 4;
        }
        r0Var.H(i12);
        while (i11 < list.size()) {
            r0Var.M(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    public static void H(int i10, List list, y1 y1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r0 r0Var = (r0) y1Var.a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                int intValue = ((Integer) list.get(i11)).intValue();
                r0Var.D(i10, 5);
                r0Var.M(intValue);
                i11++;
            }
            return;
        }
        r0Var.D(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Integer) list.get(i13)).getClass();
            Logger logger = r0.f;
            i12 += 4;
        }
        r0Var.H(i12);
        while (i11 < list.size()) {
            r0Var.M(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    public static void I(int i10, List list, y1 y1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r0 r0Var = (r0) y1Var.a;
        if (!z10) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                int intValue = ((Integer) list.get(i11)).intValue();
                r0Var.D(i10, 0);
                r0Var.C(intValue);
            }
            return;
        }
        r0Var.D(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += r0.P(((Integer) list.get(i13)).intValue());
        }
        r0Var.H(i12);
        for (int i14 = 0; i14 < list.size(); i14++) {
            r0Var.C(((Integer) list.get(i14)).intValue());
        }
    }

    public static void J(int i10, List list, y1 y1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r0 r0Var = (r0) y1Var.a;
        if (!z10) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                boolean booleanValue = ((Boolean) list.get(i11)).booleanValue();
                r0Var.D(i10, 0);
                r0Var.B(booleanValue ? (byte) 1 : (byte) 0);
            }
            return;
        }
        r0Var.D(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Boolean) list.get(i13)).getClass();
            Logger logger = r0.f;
            i12++;
        }
        r0Var.H(i12);
        for (int i14 = 0; i14 < list.size(); i14++) {
            r0Var.B(((Boolean) list.get(i14)).booleanValue() ? (byte) 1 : (byte) 0);
        }
    }

    public static int a(int i10, Object obj, n2 n2Var) {
        l0 l0Var = (l0) obj;
        int T = r0.T(i10 << 3);
        int c3 = l0Var.c();
        if (c3 == -1) {
            c3 = n2Var.zzb(l0Var);
            l0Var.b(c3);
        }
        return a4.w.z(c3, c3, T);
    }

    public static int b(int i10, List list, n2 n2Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int y8 = r0.y(i10) * size;
        for (int i11 = 0; i11 < size; i11++) {
            l0 l0Var = (l0) list.get(i11);
            int c3 = l0Var.c();
            if (c3 == -1) {
                c3 = n2Var.zzb(l0Var);
                l0Var.b(c3);
            }
            y8 = a4.w.z(c3, c3, y8);
        }
        return y8;
    }

    public static int c(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof v1) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            i10 += r0.O(((Long) list.get(i11)).longValue());
        }
        return i10;
    }

    public static p2 d(boolean z10) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls != null) {
            try {
                return (p2) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z10));
            } catch (Throwable unused2) {
            }
        }
        return null;
    }

    public static void e(int i10, List list, y1 y1Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r0 r0Var = (r0) y1Var.a;
        if (!(list instanceof t1)) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                String str = (String) list.get(i11);
                r0Var.D(i10, 2);
                byte[] bArr = r0Var.c;
                int i12 = r0Var.e;
                try {
                    int T = r0.T(str.length() * 3);
                    int T2 = r0.T(str.length());
                    if (T2 == T) {
                        int i13 = i12 + T2;
                        r0Var.e = i13;
                        int h = a3.a.h(str, bArr, i13, r0Var.F());
                        r0Var.e = i12;
                        r0Var.H((h - i12) - T2);
                        r0Var.e = h;
                    } else {
                        r0Var.H(a3.a(str));
                        r0Var.e = a3.a.h(str, bArr, r0Var.e, r0Var.F());
                    }
                } catch (b3 e10) {
                    r0Var.e = i12;
                    r0.f.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e10);
                    byte[] bytes = str.getBytes(j1.a);
                    try {
                        r0Var.H(bytes.length);
                        r0Var.L(bytes, 0, bytes.length);
                    } catch (s0 e11) {
                        throw e11;
                    } catch (IndexOutOfBoundsException e12) {
                        throw new s0(e12);
                    }
                } catch (IndexOutOfBoundsException e13) {
                    throw new s0(e13);
                }
            }
            return;
        }
        t1 t1Var = (t1) list;
        for (int i14 = 0; i14 < list.size(); i14++) {
            Object a2 = t1Var.a(i14);
            if (a2 instanceof String) {
                String str2 = (String) a2;
                r0Var.D(i10, 2);
                byte[] bArr2 = r0Var.c;
                int i15 = r0Var.e;
                try {
                    int T3 = r0.T(str2.length() * 3);
                    int T4 = r0.T(str2.length());
                    if (T4 == T3) {
                        int i16 = i15 + T4;
                        r0Var.e = i16;
                        int h10 = a3.a.h(str2, bArr2, i16, r0Var.F());
                        r0Var.e = i15;
                        r0Var.H((h10 - i15) - T4);
                        r0Var.e = h10;
                    } else {
                        r0Var.H(a3.a(str2));
                        r0Var.e = a3.a.h(str2, bArr2, r0Var.e, r0Var.F());
                    }
                } catch (b3 e14) {
                    r0Var.e = i15;
                    r0.f.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e14);
                    byte[] bytes2 = str2.getBytes(j1.a);
                    try {
                        r0Var.H(bytes2.length);
                        r0Var.L(bytes2, 0, bytes2.length);
                    } catch (s0 e15) {
                        throw e15;
                    } catch (IndexOutOfBoundsException e16) {
                        throw new s0(e16);
                    }
                } catch (IndexOutOfBoundsException e17) {
                    throw new s0(e17);
                }
            } else {
                q0 q0Var = (q0) a2;
                r0Var.D(i10, 2);
                r0Var.H(q0Var.n());
                r0Var.L(q0Var.b, q0Var.r(), q0Var.n());
            }
        }
    }

    public static void f(int i10, List list, y1 y1Var, n2 n2Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        y1Var.getClass();
        for (int i11 = 0; i11 < list.size(); i11++) {
            y1Var.b(i10, list.get(i11), n2Var);
        }
    }

    public static void g(int i10, List list, y1 y1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r0 r0Var = (r0) y1Var.a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                double doubleValue = ((Double) list.get(i11)).doubleValue();
                r0Var.getClass();
                long doubleToRawLongBits = Double.doubleToRawLongBits(doubleValue);
                r0Var.D(i10, 1);
                r0Var.K(doubleToRawLongBits);
                i11++;
            }
            return;
        }
        r0Var.D(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Double) list.get(i13)).getClass();
            Logger logger = r0.f;
            i12 += 8;
        }
        r0Var.H(i12);
        while (i11 < list.size()) {
            r0Var.K(Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
            i11++;
        }
    }

    public static void h(p2 p2Var, Object obj, Object obj2) {
        p2Var.getClass();
        f1 f1Var = (f1) obj;
        q2 q2Var = f1Var.zzb;
        q2 q2Var2 = ((f1) obj2).zzb;
        if (!q2Var2.equals(q2.f)) {
            int i10 = q2Var.a + q2Var2.a;
            int[] copyOf = Arrays.copyOf(q2Var.b, i10);
            System.arraycopy(q2Var2.b, 0, copyOf, q2Var.a, q2Var2.a);
            Object[] copyOf2 = Arrays.copyOf(q2Var.c, i10);
            System.arraycopy(q2Var2.c, 0, copyOf2, q2Var.a, q2Var2.a);
            q2Var = new q2(i10, copyOf, copyOf2, true);
        }
        f1Var.zzb = q2Var;
    }

    public static boolean i(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int j(int i10, List list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        int y8 = r0.y(i10) * size;
        if (!(list instanceof t1)) {
            while (i11 < size) {
                Object obj = list.get(i11);
                if (obj instanceof q0) {
                    int n10 = ((q0) obj).n();
                    y8 = a4.w.z(n10, n10, y8);
                } else {
                    y8 = r0.G((String) obj) + y8;
                }
                i11++;
            }
            return y8;
        }
        t1 t1Var = (t1) list;
        while (i11 < size) {
            Object a2 = t1Var.a(i11);
            if (a2 instanceof q0) {
                int n11 = ((q0) a2).n();
                y8 = a4.w.z(n11, n11, y8);
            } else {
                y8 = r0.G((String) a2) + y8;
            }
            i11++;
        }
        return y8;
    }

    public static int k(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof v1) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            i10 += r0.O(((Long) list.get(i11)).longValue());
        }
        return i10;
    }

    public static void l(int i10, List list, y1 y1Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        y1Var.getClass();
        for (int i11 = 0; i11 < list.size(); i11++) {
            r0 r0Var = (r0) y1Var.a;
            q0 q0Var = (q0) list.get(i11);
            r0Var.D(i10, 2);
            r0Var.H(q0Var.n());
            r0Var.L(q0Var.b, q0Var.r(), q0Var.n());
        }
    }

    public static void m(int i10, List list, y1 y1Var, n2 n2Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        y1Var.getClass();
        for (int i11 = 0; i11 < list.size(); i11++) {
            y1Var.c(i10, list.get(i11), n2Var);
        }
    }

    public static void n(int i10, List list, y1 y1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r0 r0Var = (r0) y1Var.a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                float floatValue = ((Float) list.get(i11)).floatValue();
                r0Var.getClass();
                int floatToRawIntBits = Float.floatToRawIntBits(floatValue);
                r0Var.D(i10, 5);
                r0Var.M(floatToRawIntBits);
                i11++;
            }
            return;
        }
        r0Var.D(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Float) list.get(i13)).getClass();
            Logger logger = r0.f;
            i12 += 4;
        }
        r0Var.H(i12);
        while (i11 < list.size()) {
            r0Var.M(Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
            i11++;
        }
    }

    public static int o(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int y8 = r0.y(i10) * size;
        for (int i11 = 0; i11 < list.size(); i11++) {
            int n10 = ((q0) list.get(i11)).n();
            y8 = a4.w.z(n10, n10, y8);
        }
        return y8;
    }

    public static int p(List list) {
        int size = list.size();
        if (size != 0) {
            if (!(list instanceof v1)) {
                int i10 = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    long longValue = ((Long) list.get(i11)).longValue();
                    i10 += r0.O((longValue >> 63) ^ (longValue << 1));
                }
                return i10;
            }
            if (size > 0) {
                throw null;
            }
        }
        return 0;
    }

    public static void q(int i10, List list, y1 y1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r0 r0Var = (r0) y1Var.a;
        if (!z10) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                long longValue = ((Long) list.get(i11)).longValue();
                r0Var.D(i10, 0);
                r0Var.E(longValue);
            }
            return;
        }
        r0Var.D(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += r0.O(((Long) list.get(i13)).longValue());
        }
        r0Var.H(i12);
        for (int i14 = 0; i14 < list.size(); i14++) {
            r0Var.E(((Long) list.get(i14)).longValue());
        }
    }

    public static int r(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof h1)) {
            int i11 = 0;
            while (i10 < size) {
                i11 += r0.P(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return i11;
        }
        h1 h1Var = (h1) list;
        int i12 = 0;
        while (i10 < size) {
            h1Var.o(i10);
            i12 += r0.P(h1Var.b[i10]);
            i10++;
        }
        return i12;
    }

    public static void s(int i10, List list, y1 y1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r0 r0Var = (r0) y1Var.a;
        if (!z10) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                long longValue = ((Long) list.get(i11)).longValue();
                r0Var.D(i10, 0);
                r0Var.E(longValue);
            }
            return;
        }
        r0Var.D(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += r0.O(((Long) list.get(i13)).longValue());
        }
        r0Var.H(i12);
        for (int i14 = 0; i14 < list.size(); i14++) {
            r0Var.E(((Long) list.get(i14)).longValue());
        }
    }

    public static int t(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof h1)) {
            int i11 = 0;
            while (i10 < size) {
                i11 += r0.P(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return i11;
        }
        h1 h1Var = (h1) list;
        int i12 = 0;
        while (i10 < size) {
            h1Var.o(i10);
            i12 += r0.P(h1Var.b[i10]);
            i10++;
        }
        return i12;
    }

    public static void u(int i10, List list, y1 y1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r0 r0Var = (r0) y1Var.a;
        if (!z10) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                long longValue = ((Long) list.get(i11)).longValue();
                r0Var.D(i10, 0);
                r0Var.E((longValue >> 63) ^ (longValue << 1));
            }
            return;
        }
        r0Var.D(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            long longValue2 = ((Long) list.get(i13)).longValue();
            i12 += r0.O((longValue2 >> 63) ^ (longValue2 << 1));
        }
        r0Var.H(i12);
        for (int i14 = 0; i14 < list.size(); i14++) {
            long longValue3 = ((Long) list.get(i14)).longValue();
            r0Var.E((longValue3 >> 63) ^ (longValue3 << 1));
        }
    }

    public static int v(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof h1)) {
            int i11 = 0;
            while (i10 < size) {
                i11 += r0.T(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return i11;
        }
        h1 h1Var = (h1) list;
        int i12 = 0;
        while (i10 < size) {
            h1Var.o(i10);
            i12 += r0.T(h1Var.b[i10]);
            i10++;
        }
        return i12;
    }

    public static void w(int i10, List list, y1 y1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r0 r0Var = (r0) y1Var.a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                long longValue = ((Long) list.get(i11)).longValue();
                r0Var.D(i10, 1);
                r0Var.K(longValue);
                i11++;
            }
            return;
        }
        r0Var.D(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Long) list.get(i13)).getClass();
            Logger logger = r0.f;
            i12 += 8;
        }
        r0Var.H(i12);
        while (i11 < list.size()) {
            r0Var.K(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    public static int x(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof h1)) {
            int i11 = 0;
            while (i10 < size) {
                int intValue = ((Integer) list.get(i10)).intValue();
                i11 += r0.T((intValue >> 31) ^ (intValue << 1));
                i10++;
            }
            return i11;
        }
        h1 h1Var = (h1) list;
        int i12 = 0;
        while (i10 < size) {
            h1Var.o(i10);
            int i13 = h1Var.b[i10];
            i12 += r0.T((i13 >> 31) ^ (i13 << 1));
            i10++;
        }
        return i12;
    }

    public static void y(int i10, List list, y1 y1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r0 r0Var = (r0) y1Var.a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                long longValue = ((Long) list.get(i11)).longValue();
                r0Var.D(i10, 1);
                r0Var.K(longValue);
                i11++;
            }
            return;
        }
        r0Var.D(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Long) list.get(i13)).getClass();
            Logger logger = r0.f;
            i12 += 8;
        }
        r0Var.H(i12);
        while (i11 < list.size()) {
            r0Var.K(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    public static int z(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return r0.V(i10) * size;
    }
}
