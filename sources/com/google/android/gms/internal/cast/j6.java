package com.google.android.gms.internal.cast;

import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes.dex */
public abstract class j6 {
    public static final Class a;
    public static final l6 b;
    public static final l6 c;

    static {
        Class<?> cls;
        Class<?> cls2;
        l6 l6Var = null;
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
                l6Var = (l6) cls2.getConstructor(null).newInstance(null);
            } catch (Throwable unused3) {
            }
        }
        b = l6Var;
        c = new l6();
    }

    public static void a(int i10, List list, u5 u5Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        y4 y4Var = (y4) u5Var.a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                int intValue = ((Integer) list.get(i11)).intValue();
                y4Var.j(i10 << 3);
                y4Var.j((intValue >> 31) ^ (intValue + intValue));
                i11++;
            }
            return;
        }
        y4Var.i(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            int intValue2 = ((Integer) list.get(i13)).intValue();
            i12 += y4.o((intValue2 >> 31) ^ (intValue2 + intValue2));
        }
        y4Var.j(i12);
        while (i11 < list.size()) {
            int intValue3 = ((Integer) list.get(i11)).intValue();
            y4Var.j((intValue3 >> 31) ^ (intValue3 + intValue3));
            i11++;
        }
    }

    public static void b(int i10, List list, u5 u5Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        y4 y4Var = (y4) u5Var.a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                long longValue = ((Long) list.get(i11)).longValue();
                y4Var.k(i10, (longValue >> 63) ^ (longValue + longValue));
                i11++;
            }
            return;
        }
        y4Var.i(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            long longValue2 = ((Long) list.get(i13)).longValue();
            i12 += y4.p((longValue2 >> 63) ^ (longValue2 + longValue2));
        }
        y4Var.j(i12);
        while (i11 < list.size()) {
            long longValue3 = ((Long) list.get(i11)).longValue();
            y4Var.l((longValue3 >> 63) ^ (longValue3 + longValue3));
            i11++;
        }
    }

    public static void c(int i10, List list, u5 u5Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        y4 y4Var = (y4) u5Var.a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                int intValue = ((Integer) list.get(i11)).intValue();
                y4Var.j(i10 << 3);
                y4Var.j(intValue);
                i11++;
            }
            return;
        }
        y4Var.i(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += y4.o(((Integer) list.get(i13)).intValue());
        }
        y4Var.j(i12);
        while (i11 < list.size()) {
            y4Var.j(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    public static void d(int i10, List list, u5 u5Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        y4 y4Var = (y4) u5Var.a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                y4Var.k(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        y4Var.i(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += y4.p(((Long) list.get(i13)).longValue());
        }
        y4Var.j(i12);
        while (i11 < list.size()) {
            y4Var.l(((Long) list.get(i11)).longValue());
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
        if (!(list instanceof g5)) {
            int i11 = 0;
            while (i10 < size) {
                i11 += y4.m(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return i11;
        }
        g5 g5Var = (g5) list;
        int i12 = 0;
        while (i10 < size) {
            g5Var.m(i10);
            i12 += y4.m(g5Var.b[i10]);
            i10++;
        }
        return i12;
    }

    public static int g(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (y4.o(i10 << 3) + 4) * size;
    }

    public static int h(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (y4.o(i10 << 3) + 8) * size;
    }

    public static int i(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof g5)) {
            int i11 = 0;
            while (i10 < size) {
                i11 += y4.m(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return i11;
        }
        g5 g5Var = (g5) list;
        int i12 = 0;
        while (i10 < size) {
            g5Var.m(i10);
            i12 += y4.m(g5Var.b[i10]);
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
        if (!(list instanceof s5)) {
            int i11 = 0;
            while (i10 < size) {
                i11 += y4.p(((Long) list.get(i10)).longValue());
                i10++;
            }
            return i11;
        }
        s5 s5Var = (s5) list;
        int i12 = 0;
        while (i10 < size) {
            s5Var.m(i10);
            i12 += y4.p(s5Var.b[i10]);
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
        if (!(list instanceof g5)) {
            int i11 = 0;
            while (i10 < size) {
                int intValue = ((Integer) list.get(i10)).intValue();
                i11 += y4.o((intValue >> 31) ^ (intValue + intValue));
                i10++;
            }
            return i11;
        }
        g5 g5Var = (g5) list;
        int i12 = 0;
        while (i10 < size) {
            g5Var.m(i10);
            int i13 = g5Var.b[i10];
            i12 += y4.o((i13 >> 31) ^ (i13 + i13));
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
        if (!(list instanceof s5)) {
            int i11 = 0;
            while (i10 < size) {
                long longValue = ((Long) list.get(i10)).longValue();
                i11 += y4.p((longValue >> 63) ^ (longValue + longValue));
                i10++;
            }
            return i11;
        }
        s5 s5Var = (s5) list;
        int i12 = 0;
        while (i10 < size) {
            s5Var.m(i10);
            long j10 = s5Var.b[i10];
            i12 += y4.p((j10 >> 63) ^ (j10 + j10));
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
        if (!(list instanceof g5)) {
            int i11 = 0;
            while (i10 < size) {
                i11 += y4.o(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return i11;
        }
        g5 g5Var = (g5) list;
        int i12 = 0;
        while (i10 < size) {
            g5Var.m(i10);
            i12 += y4.o(g5Var.b[i10]);
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
        if (!(list instanceof s5)) {
            int i11 = 0;
            while (i10 < size) {
                i11 += y4.p(((Long) list.get(i10)).longValue());
                i10++;
            }
            return i11;
        }
        s5 s5Var = (s5) list;
        int i12 = 0;
        while (i10 < size) {
            s5Var.m(i10);
            i12 += y4.p(s5Var.b[i10]);
            i10++;
        }
        return i12;
    }

    public static void o(l6 l6Var, Object obj, Object obj2) {
        l6Var.getClass();
        f5 f5Var = (f5) obj;
        k6 k6Var = f5Var.zzc;
        k6 k6Var2 = ((f5) obj2).zzc;
        k6 k6Var3 = k6.e;
        if (!k6Var3.equals(k6Var2)) {
            if (k6Var3.equals(k6Var)) {
                k6Var.getClass();
                k6Var2.getClass();
                int[] copyOf = Arrays.copyOf(k6Var.a, 0);
                System.arraycopy(k6Var2.a, 0, copyOf, 0, 0);
                Object[] copyOf2 = Arrays.copyOf(k6Var.b, 0);
                System.arraycopy(k6Var2.b, 0, copyOf2, 0, 0);
                k6Var = new k6(copyOf, copyOf2, true);
            } else {
                k6Var.getClass();
                if (!k6Var2.equals(k6Var3)) {
                    if (!k6Var.d) {
                        throw new UnsupportedOperationException();
                    }
                    int[] iArr = k6Var.a;
                    int length = iArr.length;
                    System.arraycopy(k6Var2.a, 0, iArr, 0, 0);
                    System.arraycopy(k6Var2.b, 0, k6Var.b, 0, 0);
                }
            }
        }
        f5Var.zzc = k6Var;
    }

    public static void p(int i10, List list, u5 u5Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        y4 y4Var = (y4) u5Var.a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                boolean booleanValue = ((Boolean) list.get(i11)).booleanValue();
                y4Var.j(i10 << 3);
                y4Var.a(booleanValue ? (byte) 1 : (byte) 0);
                i11++;
            }
            return;
        }
        y4Var.i(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Boolean) list.get(i13)).getClass();
            i12++;
        }
        y4Var.j(i12);
        while (i11 < list.size()) {
            y4Var.a(((Boolean) list.get(i11)).booleanValue() ? (byte) 1 : (byte) 0);
            i11++;
        }
    }

    public static void q(int i10, List list, u5 u5Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        y4 y4Var = (y4) u5Var.a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                y4Var.f(i10, Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
                i11++;
            }
            return;
        }
        y4Var.i(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Double) list.get(i13)).getClass();
            i12 += 8;
        }
        y4Var.j(i12);
        while (i11 < list.size()) {
            y4Var.g(Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
            i11++;
        }
    }

    public static void r(int i10, List list, u5 u5Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        y4 y4Var = (y4) u5Var.a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                int intValue = ((Integer) list.get(i11)).intValue();
                y4Var.j(i10 << 3);
                if (intValue >= 0) {
                    y4Var.j(intValue);
                } else {
                    y4Var.l(intValue);
                }
                i11++;
            }
            return;
        }
        y4Var.i(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += y4.m(((Integer) list.get(i13)).intValue());
        }
        y4Var.j(i12);
        while (i11 < list.size()) {
            int intValue2 = ((Integer) list.get(i11)).intValue();
            if (intValue2 >= 0) {
                y4Var.j(intValue2);
            } else {
                y4Var.l(intValue2);
            }
            i11++;
        }
    }

    public static void s(int i10, List list, u5 u5Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        y4 y4Var = (y4) u5Var.a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                y4Var.d(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        y4Var.i(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Integer) list.get(i13)).getClass();
            i12 += 4;
        }
        y4Var.j(i12);
        while (i11 < list.size()) {
            y4Var.e(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    public static void t(int i10, List list, u5 u5Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        y4 y4Var = (y4) u5Var.a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                y4Var.f(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        y4Var.i(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Long) list.get(i13)).getClass();
            i12 += 8;
        }
        y4Var.j(i12);
        while (i11 < list.size()) {
            y4Var.g(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    public static void u(int i10, List list, u5 u5Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        y4 y4Var = (y4) u5Var.a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                y4Var.d(i10, Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
                i11++;
            }
            return;
        }
        y4Var.i(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Float) list.get(i13)).getClass();
            i12 += 4;
        }
        y4Var.j(i12);
        while (i11 < list.size()) {
            y4Var.e(Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
            i11++;
        }
    }

    public static void v(int i10, List list, u5 u5Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        y4 y4Var = (y4) u5Var.a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                int intValue = ((Integer) list.get(i11)).intValue();
                y4Var.j(i10 << 3);
                if (intValue >= 0) {
                    y4Var.j(intValue);
                } else {
                    y4Var.l(intValue);
                }
                i11++;
            }
            return;
        }
        y4Var.i(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += y4.m(((Integer) list.get(i13)).intValue());
        }
        y4Var.j(i12);
        while (i11 < list.size()) {
            int intValue2 = ((Integer) list.get(i11)).intValue();
            if (intValue2 >= 0) {
                y4Var.j(intValue2);
            } else {
                y4Var.l(intValue2);
            }
            i11++;
        }
    }

    public static void w(int i10, List list, u5 u5Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        y4 y4Var = (y4) u5Var.a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                y4Var.k(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        y4Var.i(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += y4.p(((Long) list.get(i13)).longValue());
        }
        y4Var.j(i12);
        while (i11 < list.size()) {
            y4Var.l(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    public static void x(int i10, List list, u5 u5Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        y4 y4Var = (y4) u5Var.a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                y4Var.d(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        y4Var.i(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Integer) list.get(i13)).getClass();
            i12 += 4;
        }
        y4Var.j(i12);
        while (i11 < list.size()) {
            y4Var.e(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    public static void y(int i10, List list, u5 u5Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        y4 y4Var = (y4) u5Var.a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                y4Var.f(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        y4Var.i(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Long) list.get(i13)).getClass();
            i12 += 8;
        }
        y4Var.j(i12);
        while (i11 < list.size()) {
            y4Var.g(((Long) list.get(i11)).longValue());
            i11++;
        }
    }
}
