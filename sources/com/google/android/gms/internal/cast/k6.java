package com.google.android.gms.internal.cast;

import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public abstract class k6 {
    public static final Class a;
    public static final m6 b;
    public static final m6 c;

    static {
        Class<?> cls;
        Class<?> cls2;
        m6 m6Var = null;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        a = cls;
        try {
            cls2 = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused2) {
            cls2 = null;
        }
        if (cls2 != null) {
            try {
                m6Var = (m6) cls2.getConstructor(null).newInstance(null);
            } catch (Throwable unused3) {
            }
        }
        b = m6Var;
        c = new m6();
    }

    public static void a(int i10, List list, w5 w5Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        a5 a5Var = (a5) w5Var.a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                int intValue = ((Integer) list.get(i11)).intValue();
                a5Var.j(i10 << 3);
                a5Var.j((intValue >> 31) ^ (intValue + intValue));
                i11++;
            }
            return;
        }
        a5Var.i(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            int intValue2 = ((Integer) list.get(i13)).intValue();
            i12 += a5.o((intValue2 >> 31) ^ (intValue2 + intValue2));
        }
        a5Var.j(i12);
        while (i11 < list.size()) {
            int intValue3 = ((Integer) list.get(i11)).intValue();
            a5Var.j((intValue3 >> 31) ^ (intValue3 + intValue3));
            i11++;
        }
    }

    public static void b(int i10, List list, w5 w5Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        a5 a5Var = (a5) w5Var.a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                long longValue = ((Long) list.get(i11)).longValue();
                a5Var.k(i10, (longValue >> 63) ^ (longValue + longValue));
                i11++;
            }
            return;
        }
        a5Var.i(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            long longValue2 = ((Long) list.get(i13)).longValue();
            i12 += a5.p((longValue2 >> 63) ^ (longValue2 + longValue2));
        }
        a5Var.j(i12);
        while (i11 < list.size()) {
            long longValue3 = ((Long) list.get(i11)).longValue();
            a5Var.l((longValue3 >> 63) ^ (longValue3 + longValue3));
            i11++;
        }
    }

    public static void c(int i10, List list, w5 w5Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        a5 a5Var = (a5) w5Var.a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                int intValue = ((Integer) list.get(i11)).intValue();
                a5Var.j(i10 << 3);
                a5Var.j(intValue);
                i11++;
            }
            return;
        }
        a5Var.i(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += a5.o(((Integer) list.get(i13)).intValue());
        }
        a5Var.j(i12);
        while (i11 < list.size()) {
            a5Var.j(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    public static void d(int i10, List list, w5 w5Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        a5 a5Var = (a5) w5Var.a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                a5Var.k(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        a5Var.i(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += a5.p(((Long) list.get(i13)).longValue());
        }
        a5Var.j(i12);
        while (i11 < list.size()) {
            a5Var.l(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    public static boolean e(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int f(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof i5)) {
            int i11 = 0;
            while (i10 < size) {
                i11 += a5.m(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return i11;
        }
        i5 i5Var = (i5) list;
        int i12 = 0;
        while (i10 < size) {
            i5Var.n(i10);
            i12 += a5.m(i5Var.b[i10]);
            i10++;
        }
        return i12;
    }

    public static int g(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (a5.o(i10 << 3) + 4) * size;
    }

    public static int h(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (a5.o(i10 << 3) + 8) * size;
    }

    public static int i(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof i5)) {
            int i11 = 0;
            while (i10 < size) {
                i11 += a5.m(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return i11;
        }
        i5 i5Var = (i5) list;
        int i12 = 0;
        while (i10 < size) {
            i5Var.n(i10);
            i12 += a5.m(i5Var.b[i10]);
            i10++;
        }
        return i12;
    }

    public static int j(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof u5)) {
            int i11 = 0;
            while (i10 < size) {
                i11 += a5.p(((Long) list.get(i10)).longValue());
                i10++;
            }
            return i11;
        }
        u5 u5Var = (u5) list;
        int i12 = 0;
        while (i10 < size) {
            u5Var.n(i10);
            i12 += a5.p(u5Var.b[i10]);
            i10++;
        }
        return i12;
    }

    public static int k(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof i5)) {
            int i11 = 0;
            while (i10 < size) {
                int intValue = ((Integer) list.get(i10)).intValue();
                i11 += a5.o((intValue >> 31) ^ (intValue + intValue));
                i10++;
            }
            return i11;
        }
        i5 i5Var = (i5) list;
        int i12 = 0;
        while (i10 < size) {
            i5Var.n(i10);
            int i13 = i5Var.b[i10];
            i12 += a5.o((i13 >> 31) ^ (i13 + i13));
            i10++;
        }
        return i12;
    }

    public static int l(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof u5)) {
            int i11 = 0;
            while (i10 < size) {
                long longValue = ((Long) list.get(i10)).longValue();
                i11 += a5.p((longValue >> 63) ^ (longValue + longValue));
                i10++;
            }
            return i11;
        }
        u5 u5Var = (u5) list;
        int i12 = 0;
        while (i10 < size) {
            u5Var.n(i10);
            long j3 = u5Var.b[i10];
            i12 += a5.p((j3 >> 63) ^ (j3 + j3));
            i10++;
        }
        return i12;
    }

    public static int m(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof i5)) {
            int i11 = 0;
            while (i10 < size) {
                i11 += a5.o(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return i11;
        }
        i5 i5Var = (i5) list;
        int i12 = 0;
        while (i10 < size) {
            i5Var.n(i10);
            i12 += a5.o(i5Var.b[i10]);
            i10++;
        }
        return i12;
    }

    public static int n(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof u5)) {
            int i11 = 0;
            while (i10 < size) {
                i11 += a5.p(((Long) list.get(i10)).longValue());
                i10++;
            }
            return i11;
        }
        u5 u5Var = (u5) list;
        int i12 = 0;
        while (i10 < size) {
            u5Var.n(i10);
            i12 += a5.p(u5Var.b[i10]);
            i10++;
        }
        return i12;
    }

    public static void o(m6 m6Var, Object obj, Object obj2) {
        m6Var.getClass();
        h5 h5Var = (h5) obj;
        l6 l6Var = h5Var.zzc;
        l6 l6Var2 = ((h5) obj2).zzc;
        l6 l6Var3 = l6.e;
        if (!l6Var3.equals(l6Var2)) {
            if (l6Var3.equals(l6Var)) {
                l6Var.getClass();
                l6Var2.getClass();
                int[] copyOf = Arrays.copyOf(l6Var.a, 0);
                System.arraycopy(l6Var2.a, 0, copyOf, 0, 0);
                Object[] copyOf2 = Arrays.copyOf(l6Var.b, 0);
                System.arraycopy(l6Var2.b, 0, copyOf2, 0, 0);
                l6Var = new l6(copyOf, copyOf2, true);
            } else {
                l6Var.getClass();
                if (!l6Var2.equals(l6Var3)) {
                    if (!l6Var.d) {
                        throw new UnsupportedOperationException();
                    }
                    int[] iArr = l6Var.a;
                    int length = iArr.length;
                    System.arraycopy(l6Var2.a, 0, iArr, 0, 0);
                    System.arraycopy(l6Var2.b, 0, l6Var.b, 0, 0);
                }
            }
        }
        h5Var.zzc = l6Var;
    }

    public static void p(int i10, List list, w5 w5Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        a5 a5Var = (a5) w5Var.a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                boolean booleanValue = ((Boolean) list.get(i11)).booleanValue();
                a5Var.j(i10 << 3);
                a5Var.a(booleanValue ? (byte) 1 : (byte) 0);
                i11++;
            }
            return;
        }
        a5Var.i(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Boolean) list.get(i13)).getClass();
            i12++;
        }
        a5Var.j(i12);
        while (i11 < list.size()) {
            a5Var.a(((Boolean) list.get(i11)).booleanValue() ? (byte) 1 : (byte) 0);
            i11++;
        }
    }

    public static void q(int i10, List list, w5 w5Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        a5 a5Var = (a5) w5Var.a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                a5Var.f(i10, Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
                i11++;
            }
            return;
        }
        a5Var.i(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Double) list.get(i13)).getClass();
            i12 += 8;
        }
        a5Var.j(i12);
        while (i11 < list.size()) {
            a5Var.g(Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
            i11++;
        }
    }

    public static void r(int i10, List list, w5 w5Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        a5 a5Var = (a5) w5Var.a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                int intValue = ((Integer) list.get(i11)).intValue();
                a5Var.j(i10 << 3);
                if (intValue >= 0) {
                    a5Var.j(intValue);
                } else {
                    a5Var.l(intValue);
                }
                i11++;
            }
            return;
        }
        a5Var.i(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += a5.m(((Integer) list.get(i13)).intValue());
        }
        a5Var.j(i12);
        while (i11 < list.size()) {
            int intValue2 = ((Integer) list.get(i11)).intValue();
            if (intValue2 >= 0) {
                a5Var.j(intValue2);
            } else {
                a5Var.l(intValue2);
            }
            i11++;
        }
    }

    public static void s(int i10, List list, w5 w5Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        a5 a5Var = (a5) w5Var.a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                a5Var.d(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        a5Var.i(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Integer) list.get(i13)).getClass();
            i12 += 4;
        }
        a5Var.j(i12);
        while (i11 < list.size()) {
            a5Var.e(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    public static void t(int i10, List list, w5 w5Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        a5 a5Var = (a5) w5Var.a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                a5Var.f(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        a5Var.i(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Long) list.get(i13)).getClass();
            i12 += 8;
        }
        a5Var.j(i12);
        while (i11 < list.size()) {
            a5Var.g(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    public static void u(int i10, List list, w5 w5Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        a5 a5Var = (a5) w5Var.a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                a5Var.d(i10, Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
                i11++;
            }
            return;
        }
        a5Var.i(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Float) list.get(i13)).getClass();
            i12 += 4;
        }
        a5Var.j(i12);
        while (i11 < list.size()) {
            a5Var.e(Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
            i11++;
        }
    }

    public static void v(int i10, List list, w5 w5Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        a5 a5Var = (a5) w5Var.a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                int intValue = ((Integer) list.get(i11)).intValue();
                a5Var.j(i10 << 3);
                if (intValue >= 0) {
                    a5Var.j(intValue);
                } else {
                    a5Var.l(intValue);
                }
                i11++;
            }
            return;
        }
        a5Var.i(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += a5.m(((Integer) list.get(i13)).intValue());
        }
        a5Var.j(i12);
        while (i11 < list.size()) {
            int intValue2 = ((Integer) list.get(i11)).intValue();
            if (intValue2 >= 0) {
                a5Var.j(intValue2);
            } else {
                a5Var.l(intValue2);
            }
            i11++;
        }
    }

    public static void w(int i10, List list, w5 w5Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        a5 a5Var = (a5) w5Var.a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                a5Var.k(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        a5Var.i(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += a5.p(((Long) list.get(i13)).longValue());
        }
        a5Var.j(i12);
        while (i11 < list.size()) {
            a5Var.l(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    public static void x(int i10, List list, w5 w5Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        a5 a5Var = (a5) w5Var.a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                a5Var.d(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        a5Var.i(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Integer) list.get(i13)).getClass();
            i12 += 4;
        }
        a5Var.j(i12);
        while (i11 < list.size()) {
            a5Var.e(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    public static void y(int i10, List list, w5 w5Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        a5 a5Var = (a5) w5Var.a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                a5Var.f(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        a5Var.i(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Long) list.get(i13)).getClass();
            i12 += 8;
        }
        a5Var.j(i12);
        while (i11 < list.size()) {
            a5Var.g(((Long) list.get(i11)).longValue());
            i11++;
        }
    }
}
