package com.google.android.gms.internal.cast;

import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public abstract class f6 {
    public static final Class a;
    public static final h6 b;
    public static final h6 c;

    static {
        Class<?> cls;
        Class<?> cls2;
        h6 h6Var = null;
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
                h6Var = (h6) cls2.getConstructor(null).newInstance(null);
            } catch (Throwable unused3) {
            }
        }
        b = h6Var;
        c = new h6();
    }

    public static void a(int i10, List list, r5 r5Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        v4 v4Var = (v4) r5Var.a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                int intValue = ((Integer) list.get(i11)).intValue();
                v4Var.j(i10 << 3);
                v4Var.j((intValue >> 31) ^ (intValue + intValue));
                i11++;
            }
            return;
        }
        v4Var.i(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            int intValue2 = ((Integer) list.get(i13)).intValue();
            i12 += v4.o((intValue2 >> 31) ^ (intValue2 + intValue2));
        }
        v4Var.j(i12);
        while (i11 < list.size()) {
            int intValue3 = ((Integer) list.get(i11)).intValue();
            v4Var.j((intValue3 >> 31) ^ (intValue3 + intValue3));
            i11++;
        }
    }

    public static void b(int i10, List list, r5 r5Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        v4 v4Var = (v4) r5Var.a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                long longValue = ((Long) list.get(i11)).longValue();
                v4Var.k(i10, (longValue >> 63) ^ (longValue + longValue));
                i11++;
            }
            return;
        }
        v4Var.i(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            long longValue2 = ((Long) list.get(i13)).longValue();
            i12 += v4.p((longValue2 >> 63) ^ (longValue2 + longValue2));
        }
        v4Var.j(i12);
        while (i11 < list.size()) {
            long longValue3 = ((Long) list.get(i11)).longValue();
            v4Var.l((longValue3 >> 63) ^ (longValue3 + longValue3));
            i11++;
        }
    }

    public static void c(int i10, List list, r5 r5Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        v4 v4Var = (v4) r5Var.a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                int intValue = ((Integer) list.get(i11)).intValue();
                v4Var.j(i10 << 3);
                v4Var.j(intValue);
                i11++;
            }
            return;
        }
        v4Var.i(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += v4.o(((Integer) list.get(i13)).intValue());
        }
        v4Var.j(i12);
        while (i11 < list.size()) {
            v4Var.j(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    public static void d(int i10, List list, r5 r5Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        v4 v4Var = (v4) r5Var.a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                v4Var.k(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        v4Var.i(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += v4.p(((Long) list.get(i13)).longValue());
        }
        v4Var.j(i12);
        while (i11 < list.size()) {
            v4Var.l(((Long) list.get(i11)).longValue());
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
        if (!(list instanceof d5)) {
            int i11 = 0;
            while (i10 < size) {
                i11 += v4.m(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return i11;
        }
        d5 d5Var = (d5) list;
        int i12 = 0;
        while (i10 < size) {
            d5Var.m(i10);
            i12 += v4.m(d5Var.b[i10]);
            i10++;
        }
        return i12;
    }

    public static int g(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (v4.o(i10 << 3) + 4) * size;
    }

    public static int h(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (v4.o(i10 << 3) + 8) * size;
    }

    public static int i(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof d5)) {
            int i11 = 0;
            while (i10 < size) {
                i11 += v4.m(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return i11;
        }
        d5 d5Var = (d5) list;
        int i12 = 0;
        while (i10 < size) {
            d5Var.m(i10);
            i12 += v4.m(d5Var.b[i10]);
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
        if (!(list instanceof p5)) {
            int i11 = 0;
            while (i10 < size) {
                i11 += v4.p(((Long) list.get(i10)).longValue());
                i10++;
            }
            return i11;
        }
        p5 p5Var = (p5) list;
        int i12 = 0;
        while (i10 < size) {
            p5Var.m(i10);
            i12 += v4.p(p5Var.b[i10]);
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
        if (!(list instanceof d5)) {
            int i11 = 0;
            while (i10 < size) {
                int intValue = ((Integer) list.get(i10)).intValue();
                i11 += v4.o((intValue >> 31) ^ (intValue + intValue));
                i10++;
            }
            return i11;
        }
        d5 d5Var = (d5) list;
        int i12 = 0;
        while (i10 < size) {
            d5Var.m(i10);
            int i13 = d5Var.b[i10];
            i12 += v4.o((i13 >> 31) ^ (i13 + i13));
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
        if (!(list instanceof p5)) {
            int i11 = 0;
            while (i10 < size) {
                long longValue = ((Long) list.get(i10)).longValue();
                i11 += v4.p((longValue >> 63) ^ (longValue + longValue));
                i10++;
            }
            return i11;
        }
        p5 p5Var = (p5) list;
        int i12 = 0;
        while (i10 < size) {
            p5Var.m(i10);
            long j10 = p5Var.b[i10];
            i12 += v4.p((j10 >> 63) ^ (j10 + j10));
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
        if (!(list instanceof d5)) {
            int i11 = 0;
            while (i10 < size) {
                i11 += v4.o(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return i11;
        }
        d5 d5Var = (d5) list;
        int i12 = 0;
        while (i10 < size) {
            d5Var.m(i10);
            i12 += v4.o(d5Var.b[i10]);
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
        if (!(list instanceof p5)) {
            int i11 = 0;
            while (i10 < size) {
                i11 += v4.p(((Long) list.get(i10)).longValue());
                i10++;
            }
            return i11;
        }
        p5 p5Var = (p5) list;
        int i12 = 0;
        while (i10 < size) {
            p5Var.m(i10);
            i12 += v4.p(p5Var.b[i10]);
            i10++;
        }
        return i12;
    }

    public static void o(h6 h6Var, Object obj, Object obj2) {
        h6Var.getClass();
        c5 c5Var = (c5) obj;
        g6 g6Var = c5Var.zzc;
        g6 g6Var2 = ((c5) obj2).zzc;
        g6 g6Var3 = g6.e;
        if (!g6Var3.equals(g6Var2)) {
            if (g6Var3.equals(g6Var)) {
                g6Var.getClass();
                g6Var2.getClass();
                int[] copyOf = Arrays.copyOf(g6Var.a, 0);
                System.arraycopy(g6Var2.a, 0, copyOf, 0, 0);
                Object[] copyOf2 = Arrays.copyOf(g6Var.b, 0);
                System.arraycopy(g6Var2.b, 0, copyOf2, 0, 0);
                g6Var = new g6(copyOf, copyOf2, true);
            } else {
                g6Var.getClass();
                if (!g6Var2.equals(g6Var3)) {
                    if (!g6Var.d) {
                        throw new UnsupportedOperationException();
                    }
                    int[] iArr = g6Var.a;
                    int length = iArr.length;
                    System.arraycopy(g6Var2.a, 0, iArr, 0, 0);
                    System.arraycopy(g6Var2.b, 0, g6Var.b, 0, 0);
                }
            }
        }
        c5Var.zzc = g6Var;
    }

    public static void p(int i10, List list, r5 r5Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        v4 v4Var = (v4) r5Var.a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                boolean booleanValue = ((Boolean) list.get(i11)).booleanValue();
                v4Var.j(i10 << 3);
                v4Var.a(booleanValue ? (byte) 1 : (byte) 0);
                i11++;
            }
            return;
        }
        v4Var.i(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Boolean) list.get(i13)).getClass();
            i12++;
        }
        v4Var.j(i12);
        while (i11 < list.size()) {
            v4Var.a(((Boolean) list.get(i11)).booleanValue() ? (byte) 1 : (byte) 0);
            i11++;
        }
    }

    public static void q(int i10, List list, r5 r5Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        v4 v4Var = (v4) r5Var.a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                v4Var.f(i10, Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
                i11++;
            }
            return;
        }
        v4Var.i(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Double) list.get(i13)).getClass();
            i12 += 8;
        }
        v4Var.j(i12);
        while (i11 < list.size()) {
            v4Var.g(Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
            i11++;
        }
    }

    public static void r(int i10, List list, r5 r5Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        v4 v4Var = (v4) r5Var.a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                int intValue = ((Integer) list.get(i11)).intValue();
                v4Var.j(i10 << 3);
                if (intValue >= 0) {
                    v4Var.j(intValue);
                } else {
                    v4Var.l(intValue);
                }
                i11++;
            }
            return;
        }
        v4Var.i(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += v4.m(((Integer) list.get(i13)).intValue());
        }
        v4Var.j(i12);
        while (i11 < list.size()) {
            int intValue2 = ((Integer) list.get(i11)).intValue();
            if (intValue2 >= 0) {
                v4Var.j(intValue2);
            } else {
                v4Var.l(intValue2);
            }
            i11++;
        }
    }

    public static void s(int i10, List list, r5 r5Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        v4 v4Var = (v4) r5Var.a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                v4Var.d(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        v4Var.i(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Integer) list.get(i13)).getClass();
            i12 += 4;
        }
        v4Var.j(i12);
        while (i11 < list.size()) {
            v4Var.e(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    public static void t(int i10, List list, r5 r5Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        v4 v4Var = (v4) r5Var.a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                v4Var.f(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        v4Var.i(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Long) list.get(i13)).getClass();
            i12 += 8;
        }
        v4Var.j(i12);
        while (i11 < list.size()) {
            v4Var.g(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    public static void u(int i10, List list, r5 r5Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        v4 v4Var = (v4) r5Var.a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                v4Var.d(i10, Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
                i11++;
            }
            return;
        }
        v4Var.i(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Float) list.get(i13)).getClass();
            i12 += 4;
        }
        v4Var.j(i12);
        while (i11 < list.size()) {
            v4Var.e(Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
            i11++;
        }
    }

    public static void v(int i10, List list, r5 r5Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        v4 v4Var = (v4) r5Var.a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                int intValue = ((Integer) list.get(i11)).intValue();
                v4Var.j(i10 << 3);
                if (intValue >= 0) {
                    v4Var.j(intValue);
                } else {
                    v4Var.l(intValue);
                }
                i11++;
            }
            return;
        }
        v4Var.i(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += v4.m(((Integer) list.get(i13)).intValue());
        }
        v4Var.j(i12);
        while (i11 < list.size()) {
            int intValue2 = ((Integer) list.get(i11)).intValue();
            if (intValue2 >= 0) {
                v4Var.j(intValue2);
            } else {
                v4Var.l(intValue2);
            }
            i11++;
        }
    }

    public static void w(int i10, List list, r5 r5Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        v4 v4Var = (v4) r5Var.a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                v4Var.k(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        v4Var.i(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += v4.p(((Long) list.get(i13)).longValue());
        }
        v4Var.j(i12);
        while (i11 < list.size()) {
            v4Var.l(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    public static void x(int i10, List list, r5 r5Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        v4 v4Var = (v4) r5Var.a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                v4Var.d(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        v4Var.i(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Integer) list.get(i13)).getClass();
            i12 += 4;
        }
        v4Var.j(i12);
        while (i11 < list.size()) {
            v4Var.e(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    public static void y(int i10, List list, r5 r5Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        v4 v4Var = (v4) r5Var.a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                v4Var.f(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        v4Var.i(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Long) list.get(i13)).getClass();
            i12 += 8;
        }
        v4Var.j(i12);
        while (i11 < list.size()) {
            v4Var.g(((Long) list.get(i11)).longValue());
            i11++;
        }
    }
}
