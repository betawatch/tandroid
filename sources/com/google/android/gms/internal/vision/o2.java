package com.google.android.gms.internal.vision;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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

    public static void B(int i9, List list, y1 y1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r0 r0Var = (r0) y1Var.a;
        if (!z10) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                int intValue = ((Integer) list.get(i10)).intValue();
                r0Var.D(i9, 0);
                r0Var.C(intValue);
            }
            return;
        }
        r0Var.D(i9, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            i11 += r0.P(((Integer) list.get(i12)).intValue());
        }
        r0Var.H(i11);
        for (int i13 = 0; i13 < list.size(); i13++) {
            r0Var.C(((Integer) list.get(i13)).intValue());
        }
    }

    public static int C(int i9, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return r0.R(i9) * size;
    }

    public static int D(List list) {
        return list.size() << 3;
    }

    public static void E(int i9, List list, y1 y1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r0 r0Var = (r0) y1Var.a;
        if (!z10) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                int intValue = ((Integer) list.get(i10)).intValue();
                r0Var.D(i9, 0);
                r0Var.H(intValue);
            }
            return;
        }
        r0Var.D(i9, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            i11 += r0.T(((Integer) list.get(i12)).intValue());
        }
        r0Var.H(i11);
        for (int i13 = 0; i13 < list.size(); i13++) {
            r0Var.H(((Integer) list.get(i13)).intValue());
        }
    }

    public static void F(int i9, List list, y1 y1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r0 r0Var = (r0) y1Var.a;
        if (!z10) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                int intValue = ((Integer) list.get(i10)).intValue();
                r0Var.D(i9, 0);
                r0Var.H((intValue >> 31) ^ (intValue << 1));
            }
            return;
        }
        r0Var.D(i9, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            int intValue2 = ((Integer) list.get(i12)).intValue();
            i11 += r0.T((intValue2 >> 31) ^ (intValue2 << 1));
        }
        r0Var.H(i11);
        for (int i13 = 0; i13 < list.size(); i13++) {
            int intValue3 = ((Integer) list.get(i13)).intValue();
            r0Var.H((intValue3 >> 31) ^ (intValue3 << 1));
        }
    }

    public static void G(int i9, List list, y1 y1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r0 r0Var = (r0) y1Var.a;
        int i10 = 0;
        if (!z10) {
            while (i10 < list.size()) {
                int intValue = ((Integer) list.get(i10)).intValue();
                r0Var.D(i9, 5);
                r0Var.M(intValue);
                i10++;
            }
            return;
        }
        r0Var.D(i9, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Integer) list.get(i12)).getClass();
            Logger logger = r0.f;
            i11 += 4;
        }
        r0Var.H(i11);
        while (i10 < list.size()) {
            r0Var.M(((Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    public static void H(int i9, List list, y1 y1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r0 r0Var = (r0) y1Var.a;
        int i10 = 0;
        if (!z10) {
            while (i10 < list.size()) {
                int intValue = ((Integer) list.get(i10)).intValue();
                r0Var.D(i9, 5);
                r0Var.M(intValue);
                i10++;
            }
            return;
        }
        r0Var.D(i9, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Integer) list.get(i12)).getClass();
            Logger logger = r0.f;
            i11 += 4;
        }
        r0Var.H(i11);
        while (i10 < list.size()) {
            r0Var.M(((Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    public static void I(int i9, List list, y1 y1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r0 r0Var = (r0) y1Var.a;
        if (!z10) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                int intValue = ((Integer) list.get(i10)).intValue();
                r0Var.D(i9, 0);
                r0Var.C(intValue);
            }
            return;
        }
        r0Var.D(i9, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            i11 += r0.P(((Integer) list.get(i12)).intValue());
        }
        r0Var.H(i11);
        for (int i13 = 0; i13 < list.size(); i13++) {
            r0Var.C(((Integer) list.get(i13)).intValue());
        }
    }

    public static void J(int i9, List list, y1 y1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r0 r0Var = (r0) y1Var.a;
        if (!z10) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                boolean booleanValue = ((Boolean) list.get(i10)).booleanValue();
                r0Var.D(i9, 0);
                r0Var.B(booleanValue ? (byte) 1 : (byte) 0);
            }
            return;
        }
        r0Var.D(i9, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Boolean) list.get(i12)).getClass();
            Logger logger = r0.f;
            i11++;
        }
        r0Var.H(i11);
        for (int i13 = 0; i13 < list.size(); i13++) {
            r0Var.B(((Boolean) list.get(i13)).booleanValue() ? (byte) 1 : (byte) 0);
        }
    }

    public static int a(int i9, Object obj, n2 n2Var) {
        l0 l0Var = (l0) obj;
        int T = r0.T(i9 << 3);
        int c10 = l0Var.c();
        if (c10 == -1) {
            c10 = n2Var.zzb(l0Var);
            l0Var.b(c10);
        }
        return aa.d.A(c10, c10, T);
    }

    public static int b(int i9, List list, n2 n2Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int y10 = r0.y(i9) * size;
        for (int i10 = 0; i10 < size; i10++) {
            l0 l0Var = (l0) list.get(i10);
            int c10 = l0Var.c();
            if (c10 == -1) {
                c10 = n2Var.zzb(l0Var);
                l0Var.b(c10);
            }
            y10 = aa.d.A(c10, c10, y10);
        }
        return y10;
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
        int i9 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            i9 += r0.O(((Long) list.get(i10)).longValue());
        }
        return i9;
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

    public static void e(int i9, List list, y1 y1Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r0 r0Var = (r0) y1Var.a;
        if (!(list instanceof t1)) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                String str = (String) list.get(i10);
                r0Var.D(i9, 2);
                byte[] bArr = r0Var.c;
                int i11 = r0Var.e;
                try {
                    int T = r0.T(str.length() * 3);
                    int T2 = r0.T(str.length());
                    if (T2 == T) {
                        int i12 = i11 + T2;
                        r0Var.e = i12;
                        int h = a3.a.h(str, bArr, i12, r0Var.F());
                        r0Var.e = i11;
                        r0Var.H((h - i11) - T2);
                        r0Var.e = h;
                    } else {
                        r0Var.H(a3.a(str));
                        r0Var.e = a3.a.h(str, bArr, r0Var.e, r0Var.F());
                    }
                } catch (b3 e10) {
                    r0Var.e = i11;
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
        for (int i13 = 0; i13 < list.size(); i13++) {
            Object a2 = t1Var.a(i13);
            if (a2 instanceof String) {
                String str2 = (String) a2;
                r0Var.D(i9, 2);
                byte[] bArr2 = r0Var.c;
                int i14 = r0Var.e;
                try {
                    int T3 = r0.T(str2.length() * 3);
                    int T4 = r0.T(str2.length());
                    if (T4 == T3) {
                        int i15 = i14 + T4;
                        r0Var.e = i15;
                        int h10 = a3.a.h(str2, bArr2, i15, r0Var.F());
                        r0Var.e = i14;
                        r0Var.H((h10 - i14) - T4);
                        r0Var.e = h10;
                    } else {
                        r0Var.H(a3.a(str2));
                        r0Var.e = a3.a.h(str2, bArr2, r0Var.e, r0Var.F());
                    }
                } catch (b3 e14) {
                    r0Var.e = i14;
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
                r0Var.D(i9, 2);
                r0Var.H(q0Var.n());
                r0Var.L(q0Var.b, q0Var.r(), q0Var.n());
            }
        }
    }

    public static void f(int i9, List list, y1 y1Var, n2 n2Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        y1Var.getClass();
        for (int i10 = 0; i10 < list.size(); i10++) {
            y1Var.b(i9, list.get(i10), n2Var);
        }
    }

    public static void g(int i9, List list, y1 y1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r0 r0Var = (r0) y1Var.a;
        int i10 = 0;
        if (!z10) {
            while (i10 < list.size()) {
                double doubleValue = ((Double) list.get(i10)).doubleValue();
                r0Var.getClass();
                long doubleToRawLongBits = Double.doubleToRawLongBits(doubleValue);
                r0Var.D(i9, 1);
                r0Var.K(doubleToRawLongBits);
                i10++;
            }
            return;
        }
        r0Var.D(i9, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Double) list.get(i12)).getClass();
            Logger logger = r0.f;
            i11 += 8;
        }
        r0Var.H(i11);
        while (i10 < list.size()) {
            r0Var.K(Double.doubleToRawLongBits(((Double) list.get(i10)).doubleValue()));
            i10++;
        }
    }

    public static void h(p2 p2Var, Object obj, Object obj2) {
        p2Var.getClass();
        f1 f1Var = (f1) obj;
        q2 q2Var = f1Var.zzb;
        q2 q2Var2 = ((f1) obj2).zzb;
        if (!q2Var2.equals(q2.f)) {
            int i9 = q2Var.a + q2Var2.a;
            int[] copyOf = Arrays.copyOf(q2Var.b, i9);
            System.arraycopy(q2Var2.b, 0, copyOf, q2Var.a, q2Var2.a);
            Object[] copyOf2 = Arrays.copyOf(q2Var.c, i9);
            System.arraycopy(q2Var2.c, 0, copyOf2, q2Var.a, q2Var2.a);
            q2Var = new q2(i9, copyOf, copyOf2, true);
        }
        f1Var.zzb = q2Var;
    }

    public static boolean i(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int j(int i9, List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        int y10 = r0.y(i9) * size;
        if (!(list instanceof t1)) {
            while (i10 < size) {
                Object obj = list.get(i10);
                if (obj instanceof q0) {
                    int n10 = ((q0) obj).n();
                    y10 = aa.d.A(n10, n10, y10);
                } else {
                    y10 = r0.G((String) obj) + y10;
                }
                i10++;
            }
            return y10;
        }
        t1 t1Var = (t1) list;
        while (i10 < size) {
            Object a2 = t1Var.a(i10);
            if (a2 instanceof q0) {
                int n11 = ((q0) a2).n();
                y10 = aa.d.A(n11, n11, y10);
            } else {
                y10 = r0.G((String) a2) + y10;
            }
            i10++;
        }
        return y10;
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
        int i9 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            i9 += r0.O(((Long) list.get(i10)).longValue());
        }
        return i9;
    }

    public static void l(int i9, List list, y1 y1Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        y1Var.getClass();
        for (int i10 = 0; i10 < list.size(); i10++) {
            r0 r0Var = (r0) y1Var.a;
            q0 q0Var = (q0) list.get(i10);
            r0Var.D(i9, 2);
            r0Var.H(q0Var.n());
            r0Var.L(q0Var.b, q0Var.r(), q0Var.n());
        }
    }

    public static void m(int i9, List list, y1 y1Var, n2 n2Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        y1Var.getClass();
        for (int i10 = 0; i10 < list.size(); i10++) {
            y1Var.c(i9, list.get(i10), n2Var);
        }
    }

    public static void n(int i9, List list, y1 y1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r0 r0Var = (r0) y1Var.a;
        int i10 = 0;
        if (!z10) {
            while (i10 < list.size()) {
                float floatValue = ((Float) list.get(i10)).floatValue();
                r0Var.getClass();
                int floatToRawIntBits = Float.floatToRawIntBits(floatValue);
                r0Var.D(i9, 5);
                r0Var.M(floatToRawIntBits);
                i10++;
            }
            return;
        }
        r0Var.D(i9, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Float) list.get(i12)).getClass();
            Logger logger = r0.f;
            i11 += 4;
        }
        r0Var.H(i11);
        while (i10 < list.size()) {
            r0Var.M(Float.floatToRawIntBits(((Float) list.get(i10)).floatValue()));
            i10++;
        }
    }

    public static int o(int i9, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int y10 = r0.y(i9) * size;
        for (int i10 = 0; i10 < list.size(); i10++) {
            int n10 = ((q0) list.get(i10)).n();
            y10 = aa.d.A(n10, n10, y10);
        }
        return y10;
    }

    public static int p(List list) {
        int size = list.size();
        if (size != 0) {
            if (!(list instanceof v1)) {
                int i9 = 0;
                for (int i10 = 0; i10 < size; i10++) {
                    long longValue = ((Long) list.get(i10)).longValue();
                    i9 += r0.O((longValue >> 63) ^ (longValue << 1));
                }
                return i9;
            }
            if (size > 0) {
                throw null;
            }
        }
        return 0;
    }

    public static void q(int i9, List list, y1 y1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r0 r0Var = (r0) y1Var.a;
        if (!z10) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                long longValue = ((Long) list.get(i10)).longValue();
                r0Var.D(i9, 0);
                r0Var.E(longValue);
            }
            return;
        }
        r0Var.D(i9, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            i11 += r0.O(((Long) list.get(i12)).longValue());
        }
        r0Var.H(i11);
        for (int i13 = 0; i13 < list.size(); i13++) {
            r0Var.E(((Long) list.get(i13)).longValue());
        }
    }

    public static int r(List list) {
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof h1)) {
            int i10 = 0;
            while (i9 < size) {
                i10 += r0.P(((Integer) list.get(i9)).intValue());
                i9++;
            }
            return i10;
        }
        h1 h1Var = (h1) list;
        int i11 = 0;
        while (i9 < size) {
            h1Var.o(i9);
            i11 += r0.P(h1Var.b[i9]);
            i9++;
        }
        return i11;
    }

    public static void s(int i9, List list, y1 y1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r0 r0Var = (r0) y1Var.a;
        if (!z10) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                long longValue = ((Long) list.get(i10)).longValue();
                r0Var.D(i9, 0);
                r0Var.E(longValue);
            }
            return;
        }
        r0Var.D(i9, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            i11 += r0.O(((Long) list.get(i12)).longValue());
        }
        r0Var.H(i11);
        for (int i13 = 0; i13 < list.size(); i13++) {
            r0Var.E(((Long) list.get(i13)).longValue());
        }
    }

    public static int t(List list) {
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof h1)) {
            int i10 = 0;
            while (i9 < size) {
                i10 += r0.P(((Integer) list.get(i9)).intValue());
                i9++;
            }
            return i10;
        }
        h1 h1Var = (h1) list;
        int i11 = 0;
        while (i9 < size) {
            h1Var.o(i9);
            i11 += r0.P(h1Var.b[i9]);
            i9++;
        }
        return i11;
    }

    public static void u(int i9, List list, y1 y1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r0 r0Var = (r0) y1Var.a;
        if (!z10) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                long longValue = ((Long) list.get(i10)).longValue();
                r0Var.D(i9, 0);
                r0Var.E((longValue >> 63) ^ (longValue << 1));
            }
            return;
        }
        r0Var.D(i9, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            long longValue2 = ((Long) list.get(i12)).longValue();
            i11 += r0.O((longValue2 >> 63) ^ (longValue2 << 1));
        }
        r0Var.H(i11);
        for (int i13 = 0; i13 < list.size(); i13++) {
            long longValue3 = ((Long) list.get(i13)).longValue();
            r0Var.E((longValue3 >> 63) ^ (longValue3 << 1));
        }
    }

    public static int v(List list) {
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof h1)) {
            int i10 = 0;
            while (i9 < size) {
                i10 += r0.T(((Integer) list.get(i9)).intValue());
                i9++;
            }
            return i10;
        }
        h1 h1Var = (h1) list;
        int i11 = 0;
        while (i9 < size) {
            h1Var.o(i9);
            i11 += r0.T(h1Var.b[i9]);
            i9++;
        }
        return i11;
    }

    public static void w(int i9, List list, y1 y1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r0 r0Var = (r0) y1Var.a;
        int i10 = 0;
        if (!z10) {
            while (i10 < list.size()) {
                long longValue = ((Long) list.get(i10)).longValue();
                r0Var.D(i9, 1);
                r0Var.K(longValue);
                i10++;
            }
            return;
        }
        r0Var.D(i9, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Long) list.get(i12)).getClass();
            Logger logger = r0.f;
            i11 += 8;
        }
        r0Var.H(i11);
        while (i10 < list.size()) {
            r0Var.K(((Long) list.get(i10)).longValue());
            i10++;
        }
    }

    public static int x(List list) {
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof h1)) {
            int i10 = 0;
            while (i9 < size) {
                int intValue = ((Integer) list.get(i9)).intValue();
                i10 += r0.T((intValue >> 31) ^ (intValue << 1));
                i9++;
            }
            return i10;
        }
        h1 h1Var = (h1) list;
        int i11 = 0;
        while (i9 < size) {
            h1Var.o(i9);
            int i12 = h1Var.b[i9];
            i11 += r0.T((i12 >> 31) ^ (i12 << 1));
            i9++;
        }
        return i11;
    }

    public static void y(int i9, List list, y1 y1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r0 r0Var = (r0) y1Var.a;
        int i10 = 0;
        if (!z10) {
            while (i10 < list.size()) {
                long longValue = ((Long) list.get(i10)).longValue();
                r0Var.D(i9, 1);
                r0Var.K(longValue);
                i10++;
            }
            return;
        }
        r0Var.D(i9, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Long) list.get(i12)).getClass();
            Logger logger = r0.f;
            i11 += 8;
        }
        r0Var.H(i11);
        while (i10 < list.size()) {
            r0Var.K(((Long) list.get(i10)).longValue());
            i10++;
        }
    }

    public static int z(int i9, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return r0.V(i9) * size;
    }
}
