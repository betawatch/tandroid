package com.google.android.gms.internal.cast;

import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
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

    public static void a(int i3, List list, r5 r5Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        w4 w4Var = (w4) r5Var.a;
        int i10 = 0;
        if (!z10) {
            while (i10 < list.size()) {
                int intValue = ((Integer) list.get(i10)).intValue();
                w4Var.j(i3 << 3);
                w4Var.j((intValue >> 31) ^ (intValue + intValue));
                i10++;
            }
            return;
        }
        w4Var.i(i3, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            int intValue2 = ((Integer) list.get(i12)).intValue();
            i11 += w4.o((intValue2 >> 31) ^ (intValue2 + intValue2));
        }
        w4Var.j(i11);
        while (i10 < list.size()) {
            int intValue3 = ((Integer) list.get(i10)).intValue();
            w4Var.j((intValue3 >> 31) ^ (intValue3 + intValue3));
            i10++;
        }
    }

    public static void b(int i3, List list, r5 r5Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        w4 w4Var = (w4) r5Var.a;
        int i10 = 0;
        if (!z10) {
            while (i10 < list.size()) {
                long longValue = ((Long) list.get(i10)).longValue();
                w4Var.k(i3, (longValue >> 63) ^ (longValue + longValue));
                i10++;
            }
            return;
        }
        w4Var.i(i3, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            long longValue2 = ((Long) list.get(i12)).longValue();
            i11 += w4.p((longValue2 >> 63) ^ (longValue2 + longValue2));
        }
        w4Var.j(i11);
        while (i10 < list.size()) {
            long longValue3 = ((Long) list.get(i10)).longValue();
            w4Var.l((longValue3 >> 63) ^ (longValue3 + longValue3));
            i10++;
        }
    }

    public static void c(int i3, List list, r5 r5Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        w4 w4Var = (w4) r5Var.a;
        int i10 = 0;
        if (!z10) {
            while (i10 < list.size()) {
                int intValue = ((Integer) list.get(i10)).intValue();
                w4Var.j(i3 << 3);
                w4Var.j(intValue);
                i10++;
            }
            return;
        }
        w4Var.i(i3, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            i11 += w4.o(((Integer) list.get(i12)).intValue());
        }
        w4Var.j(i11);
        while (i10 < list.size()) {
            w4Var.j(((Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    public static void d(int i3, List list, r5 r5Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        w4 w4Var = (w4) r5Var.a;
        int i10 = 0;
        if (!z10) {
            while (i10 < list.size()) {
                w4Var.k(i3, ((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        w4Var.i(i3, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            i11 += w4.p(((Long) list.get(i12)).longValue());
        }
        w4Var.j(i11);
        while (i10 < list.size()) {
            w4Var.l(((Long) list.get(i10)).longValue());
            i10++;
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
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof d5)) {
            int i10 = 0;
            while (i3 < size) {
                i10 += w4.m(((Integer) list.get(i3)).intValue());
                i3++;
            }
            return i10;
        }
        d5 d5Var = (d5) list;
        int i11 = 0;
        while (i3 < size) {
            d5Var.i(i3);
            i11 += w4.m(d5Var.b[i3]);
            i3++;
        }
        return i11;
    }

    public static int g(int i3, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (w4.o(i3 << 3) + 4) * size;
    }

    public static int h(int i3, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (w4.o(i3 << 3) + 8) * size;
    }

    public static int i(List list) {
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof d5)) {
            int i10 = 0;
            while (i3 < size) {
                i10 += w4.m(((Integer) list.get(i3)).intValue());
                i3++;
            }
            return i10;
        }
        d5 d5Var = (d5) list;
        int i11 = 0;
        while (i3 < size) {
            d5Var.i(i3);
            i11 += w4.m(d5Var.b[i3]);
            i3++;
        }
        return i11;
    }

    public static int j(List list) {
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof p5)) {
            int i10 = 0;
            while (i3 < size) {
                i10 += w4.p(((Long) list.get(i3)).longValue());
                i3++;
            }
            return i10;
        }
        p5 p5Var = (p5) list;
        int i11 = 0;
        while (i3 < size) {
            p5Var.i(i3);
            i11 += w4.p(p5Var.b[i3]);
            i3++;
        }
        return i11;
    }

    public static int k(List list) {
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof d5)) {
            int i10 = 0;
            while (i3 < size) {
                int intValue = ((Integer) list.get(i3)).intValue();
                i10 += w4.o((intValue >> 31) ^ (intValue + intValue));
                i3++;
            }
            return i10;
        }
        d5 d5Var = (d5) list;
        int i11 = 0;
        while (i3 < size) {
            d5Var.i(i3);
            int i12 = d5Var.b[i3];
            i11 += w4.o((i12 >> 31) ^ (i12 + i12));
            i3++;
        }
        return i11;
    }

    public static int l(List list) {
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof p5)) {
            int i10 = 0;
            while (i3 < size) {
                long longValue = ((Long) list.get(i3)).longValue();
                i10 += w4.p((longValue >> 63) ^ (longValue + longValue));
                i3++;
            }
            return i10;
        }
        p5 p5Var = (p5) list;
        int i11 = 0;
        while (i3 < size) {
            p5Var.i(i3);
            long j10 = p5Var.b[i3];
            i11 += w4.p((j10 >> 63) ^ (j10 + j10));
            i3++;
        }
        return i11;
    }

    public static int m(List list) {
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof d5)) {
            int i10 = 0;
            while (i3 < size) {
                i10 += w4.o(((Integer) list.get(i3)).intValue());
                i3++;
            }
            return i10;
        }
        d5 d5Var = (d5) list;
        int i11 = 0;
        while (i3 < size) {
            d5Var.i(i3);
            i11 += w4.o(d5Var.b[i3]);
            i3++;
        }
        return i11;
    }

    public static int n(List list) {
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof p5)) {
            int i10 = 0;
            while (i3 < size) {
                i10 += w4.p(((Long) list.get(i3)).longValue());
                i3++;
            }
            return i10;
        }
        p5 p5Var = (p5) list;
        int i11 = 0;
        while (i3 < size) {
            p5Var.i(i3);
            i11 += w4.p(p5Var.b[i3]);
            i3++;
        }
        return i11;
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

    public static void p(int i3, List list, r5 r5Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        w4 w4Var = (w4) r5Var.a;
        int i10 = 0;
        if (!z10) {
            while (i10 < list.size()) {
                boolean booleanValue = ((Boolean) list.get(i10)).booleanValue();
                w4Var.j(i3 << 3);
                w4Var.a(booleanValue ? (byte) 1 : (byte) 0);
                i10++;
            }
            return;
        }
        w4Var.i(i3, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Boolean) list.get(i12)).getClass();
            i11++;
        }
        w4Var.j(i11);
        while (i10 < list.size()) {
            w4Var.a(((Boolean) list.get(i10)).booleanValue() ? (byte) 1 : (byte) 0);
            i10++;
        }
    }

    public static void q(int i3, List list, r5 r5Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        w4 w4Var = (w4) r5Var.a;
        int i10 = 0;
        if (!z10) {
            while (i10 < list.size()) {
                w4Var.f(i3, Double.doubleToRawLongBits(((Double) list.get(i10)).doubleValue()));
                i10++;
            }
            return;
        }
        w4Var.i(i3, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Double) list.get(i12)).getClass();
            i11 += 8;
        }
        w4Var.j(i11);
        while (i10 < list.size()) {
            w4Var.g(Double.doubleToRawLongBits(((Double) list.get(i10)).doubleValue()));
            i10++;
        }
    }

    public static void r(int i3, List list, r5 r5Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        w4 w4Var = (w4) r5Var.a;
        int i10 = 0;
        if (!z10) {
            while (i10 < list.size()) {
                int intValue = ((Integer) list.get(i10)).intValue();
                w4Var.j(i3 << 3);
                if (intValue >= 0) {
                    w4Var.j(intValue);
                } else {
                    w4Var.l(intValue);
                }
                i10++;
            }
            return;
        }
        w4Var.i(i3, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            i11 += w4.m(((Integer) list.get(i12)).intValue());
        }
        w4Var.j(i11);
        while (i10 < list.size()) {
            int intValue2 = ((Integer) list.get(i10)).intValue();
            if (intValue2 >= 0) {
                w4Var.j(intValue2);
            } else {
                w4Var.l(intValue2);
            }
            i10++;
        }
    }

    public static void s(int i3, List list, r5 r5Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        w4 w4Var = (w4) r5Var.a;
        int i10 = 0;
        if (!z10) {
            while (i10 < list.size()) {
                w4Var.d(i3, ((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        w4Var.i(i3, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Integer) list.get(i12)).getClass();
            i11 += 4;
        }
        w4Var.j(i11);
        while (i10 < list.size()) {
            w4Var.e(((Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    public static void t(int i3, List list, r5 r5Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        w4 w4Var = (w4) r5Var.a;
        int i10 = 0;
        if (!z10) {
            while (i10 < list.size()) {
                w4Var.f(i3, ((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        w4Var.i(i3, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Long) list.get(i12)).getClass();
            i11 += 8;
        }
        w4Var.j(i11);
        while (i10 < list.size()) {
            w4Var.g(((Long) list.get(i10)).longValue());
            i10++;
        }
    }

    public static void u(int i3, List list, r5 r5Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        w4 w4Var = (w4) r5Var.a;
        int i10 = 0;
        if (!z10) {
            while (i10 < list.size()) {
                w4Var.d(i3, Float.floatToRawIntBits(((Float) list.get(i10)).floatValue()));
                i10++;
            }
            return;
        }
        w4Var.i(i3, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Float) list.get(i12)).getClass();
            i11 += 4;
        }
        w4Var.j(i11);
        while (i10 < list.size()) {
            w4Var.e(Float.floatToRawIntBits(((Float) list.get(i10)).floatValue()));
            i10++;
        }
    }

    public static void v(int i3, List list, r5 r5Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        w4 w4Var = (w4) r5Var.a;
        int i10 = 0;
        if (!z10) {
            while (i10 < list.size()) {
                int intValue = ((Integer) list.get(i10)).intValue();
                w4Var.j(i3 << 3);
                if (intValue >= 0) {
                    w4Var.j(intValue);
                } else {
                    w4Var.l(intValue);
                }
                i10++;
            }
            return;
        }
        w4Var.i(i3, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            i11 += w4.m(((Integer) list.get(i12)).intValue());
        }
        w4Var.j(i11);
        while (i10 < list.size()) {
            int intValue2 = ((Integer) list.get(i10)).intValue();
            if (intValue2 >= 0) {
                w4Var.j(intValue2);
            } else {
                w4Var.l(intValue2);
            }
            i10++;
        }
    }

    public static void w(int i3, List list, r5 r5Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        w4 w4Var = (w4) r5Var.a;
        int i10 = 0;
        if (!z10) {
            while (i10 < list.size()) {
                w4Var.k(i3, ((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        w4Var.i(i3, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            i11 += w4.p(((Long) list.get(i12)).longValue());
        }
        w4Var.j(i11);
        while (i10 < list.size()) {
            w4Var.l(((Long) list.get(i10)).longValue());
            i10++;
        }
    }

    public static void x(int i3, List list, r5 r5Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        w4 w4Var = (w4) r5Var.a;
        int i10 = 0;
        if (!z10) {
            while (i10 < list.size()) {
                w4Var.d(i3, ((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        w4Var.i(i3, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Integer) list.get(i12)).getClass();
            i11 += 4;
        }
        w4Var.j(i11);
        while (i10 < list.size()) {
            w4Var.e(((Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    public static void y(int i3, List list, r5 r5Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        w4 w4Var = (w4) r5Var.a;
        int i10 = 0;
        if (!z10) {
            while (i10 < list.size()) {
                w4Var.f(i3, ((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        w4Var.i(i3, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Long) list.get(i12)).getClass();
            i11 += 8;
        }
        w4Var.j(i11);
        while (i10 < list.size()) {
            w4Var.g(((Long) list.get(i10)).longValue());
            i10++;
        }
    }
}
