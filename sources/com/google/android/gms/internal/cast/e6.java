package com.google.android.gms.internal.cast;

import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public abstract class e6 {
    public static final Class a;
    public static final g6 b;
    public static final g6 c;

    static {
        Class<?> cls;
        Class<?> cls2;
        g6 g6Var = null;
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
                g6Var = (g6) cls2.getConstructor(null).newInstance(null);
            } catch (Throwable unused3) {
            }
        }
        b = g6Var;
        c = new g6();
    }

    public static void a(int i7, List list, q5 q5Var, boolean z9) {
        if (list == null || list.isEmpty()) {
            return;
        }
        v4 v4Var = (v4) q5Var.a;
        int i10 = 0;
        if (!z9) {
            while (i10 < list.size()) {
                int intValue = ((Integer) list.get(i10)).intValue();
                v4Var.j(i7 << 3);
                v4Var.j((intValue >> 31) ^ (intValue + intValue));
                i10++;
            }
            return;
        }
        v4Var.i(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            int intValue2 = ((Integer) list.get(i12)).intValue();
            i11 += v4.o((intValue2 >> 31) ^ (intValue2 + intValue2));
        }
        v4Var.j(i11);
        while (i10 < list.size()) {
            int intValue3 = ((Integer) list.get(i10)).intValue();
            v4Var.j((intValue3 >> 31) ^ (intValue3 + intValue3));
            i10++;
        }
    }

    public static void b(int i7, List list, q5 q5Var, boolean z9) {
        if (list == null || list.isEmpty()) {
            return;
        }
        v4 v4Var = (v4) q5Var.a;
        int i10 = 0;
        if (!z9) {
            while (i10 < list.size()) {
                long longValue = ((Long) list.get(i10)).longValue();
                v4Var.k(i7, (longValue >> 63) ^ (longValue + longValue));
                i10++;
            }
            return;
        }
        v4Var.i(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            long longValue2 = ((Long) list.get(i12)).longValue();
            i11 += v4.p((longValue2 >> 63) ^ (longValue2 + longValue2));
        }
        v4Var.j(i11);
        while (i10 < list.size()) {
            long longValue3 = ((Long) list.get(i10)).longValue();
            v4Var.l((longValue3 >> 63) ^ (longValue3 + longValue3));
            i10++;
        }
    }

    public static void c(int i7, List list, q5 q5Var, boolean z9) {
        if (list == null || list.isEmpty()) {
            return;
        }
        v4 v4Var = (v4) q5Var.a;
        int i10 = 0;
        if (!z9) {
            while (i10 < list.size()) {
                int intValue = ((Integer) list.get(i10)).intValue();
                v4Var.j(i7 << 3);
                v4Var.j(intValue);
                i10++;
            }
            return;
        }
        v4Var.i(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            i11 += v4.o(((Integer) list.get(i12)).intValue());
        }
        v4Var.j(i11);
        while (i10 < list.size()) {
            v4Var.j(((Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    public static void d(int i7, List list, q5 q5Var, boolean z9) {
        if (list == null || list.isEmpty()) {
            return;
        }
        v4 v4Var = (v4) q5Var.a;
        int i10 = 0;
        if (!z9) {
            while (i10 < list.size()) {
                v4Var.k(i7, ((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        v4Var.i(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            i11 += v4.p(((Long) list.get(i12)).longValue());
        }
        v4Var.j(i11);
        while (i10 < list.size()) {
            v4Var.l(((Long) list.get(i10)).longValue());
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
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof c5)) {
            int i10 = 0;
            while (i7 < size) {
                i10 += v4.m(((Integer) list.get(i7)).intValue());
                i7++;
            }
            return i10;
        }
        c5 c5Var = (c5) list;
        int i11 = 0;
        while (i7 < size) {
            c5Var.i(i7);
            i11 += v4.m(c5Var.b[i7]);
            i7++;
        }
        return i11;
    }

    public static int g(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (v4.o(i7 << 3) + 4) * size;
    }

    public static int h(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (v4.o(i7 << 3) + 8) * size;
    }

    public static int i(List list) {
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof c5)) {
            int i10 = 0;
            while (i7 < size) {
                i10 += v4.m(((Integer) list.get(i7)).intValue());
                i7++;
            }
            return i10;
        }
        c5 c5Var = (c5) list;
        int i11 = 0;
        while (i7 < size) {
            c5Var.i(i7);
            i11 += v4.m(c5Var.b[i7]);
            i7++;
        }
        return i11;
    }

    public static int j(List list) {
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof o5)) {
            int i10 = 0;
            while (i7 < size) {
                i10 += v4.p(((Long) list.get(i7)).longValue());
                i7++;
            }
            return i10;
        }
        o5 o5Var = (o5) list;
        int i11 = 0;
        while (i7 < size) {
            o5Var.i(i7);
            i11 += v4.p(o5Var.b[i7]);
            i7++;
        }
        return i11;
    }

    public static int k(List list) {
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof c5)) {
            int i10 = 0;
            while (i7 < size) {
                int intValue = ((Integer) list.get(i7)).intValue();
                i10 += v4.o((intValue >> 31) ^ (intValue + intValue));
                i7++;
            }
            return i10;
        }
        c5 c5Var = (c5) list;
        int i11 = 0;
        while (i7 < size) {
            c5Var.i(i7);
            int i12 = c5Var.b[i7];
            i11 += v4.o((i12 >> 31) ^ (i12 + i12));
            i7++;
        }
        return i11;
    }

    public static int l(List list) {
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof o5)) {
            int i10 = 0;
            while (i7 < size) {
                long longValue = ((Long) list.get(i7)).longValue();
                i10 += v4.p((longValue >> 63) ^ (longValue + longValue));
                i7++;
            }
            return i10;
        }
        o5 o5Var = (o5) list;
        int i11 = 0;
        while (i7 < size) {
            o5Var.i(i7);
            long j3 = o5Var.b[i7];
            i11 += v4.p((j3 >> 63) ^ (j3 + j3));
            i7++;
        }
        return i11;
    }

    public static int m(List list) {
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof c5)) {
            int i10 = 0;
            while (i7 < size) {
                i10 += v4.o(((Integer) list.get(i7)).intValue());
                i7++;
            }
            return i10;
        }
        c5 c5Var = (c5) list;
        int i11 = 0;
        while (i7 < size) {
            c5Var.i(i7);
            i11 += v4.o(c5Var.b[i7]);
            i7++;
        }
        return i11;
    }

    public static int n(List list) {
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof o5)) {
            int i10 = 0;
            while (i7 < size) {
                i10 += v4.p(((Long) list.get(i7)).longValue());
                i7++;
            }
            return i10;
        }
        o5 o5Var = (o5) list;
        int i11 = 0;
        while (i7 < size) {
            o5Var.i(i7);
            i11 += v4.p(o5Var.b[i7]);
            i7++;
        }
        return i11;
    }

    public static void o(g6 g6Var, Object obj, Object obj2) {
        g6Var.getClass();
        b5 b5Var = (b5) obj;
        f6 f6Var = b5Var.zzc;
        f6 f6Var2 = ((b5) obj2).zzc;
        f6 f6Var3 = f6.e;
        if (!f6Var3.equals(f6Var2)) {
            if (f6Var3.equals(f6Var)) {
                f6Var.getClass();
                f6Var2.getClass();
                int[] copyOf = Arrays.copyOf(f6Var.a, 0);
                System.arraycopy(f6Var2.a, 0, copyOf, 0, 0);
                Object[] copyOf2 = Arrays.copyOf(f6Var.b, 0);
                System.arraycopy(f6Var2.b, 0, copyOf2, 0, 0);
                f6Var = new f6(copyOf, copyOf2, true);
            } else {
                f6Var.getClass();
                if (!f6Var2.equals(f6Var3)) {
                    if (!f6Var.d) {
                        throw new UnsupportedOperationException();
                    }
                    int[] iArr = f6Var.a;
                    int length = iArr.length;
                    System.arraycopy(f6Var2.a, 0, iArr, 0, 0);
                    System.arraycopy(f6Var2.b, 0, f6Var.b, 0, 0);
                }
            }
        }
        b5Var.zzc = f6Var;
    }

    public static void p(int i7, List list, q5 q5Var, boolean z9) {
        if (list == null || list.isEmpty()) {
            return;
        }
        v4 v4Var = (v4) q5Var.a;
        int i10 = 0;
        if (!z9) {
            while (i10 < list.size()) {
                boolean booleanValue = ((Boolean) list.get(i10)).booleanValue();
                v4Var.j(i7 << 3);
                v4Var.a(booleanValue ? (byte) 1 : (byte) 0);
                i10++;
            }
            return;
        }
        v4Var.i(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Boolean) list.get(i12)).getClass();
            i11++;
        }
        v4Var.j(i11);
        while (i10 < list.size()) {
            v4Var.a(((Boolean) list.get(i10)).booleanValue() ? (byte) 1 : (byte) 0);
            i10++;
        }
    }

    public static void q(int i7, List list, q5 q5Var, boolean z9) {
        if (list == null || list.isEmpty()) {
            return;
        }
        v4 v4Var = (v4) q5Var.a;
        int i10 = 0;
        if (!z9) {
            while (i10 < list.size()) {
                v4Var.f(i7, Double.doubleToRawLongBits(((Double) list.get(i10)).doubleValue()));
                i10++;
            }
            return;
        }
        v4Var.i(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Double) list.get(i12)).getClass();
            i11 += 8;
        }
        v4Var.j(i11);
        while (i10 < list.size()) {
            v4Var.g(Double.doubleToRawLongBits(((Double) list.get(i10)).doubleValue()));
            i10++;
        }
    }

    public static void r(int i7, List list, q5 q5Var, boolean z9) {
        if (list == null || list.isEmpty()) {
            return;
        }
        v4 v4Var = (v4) q5Var.a;
        int i10 = 0;
        if (!z9) {
            while (i10 < list.size()) {
                int intValue = ((Integer) list.get(i10)).intValue();
                v4Var.j(i7 << 3);
                if (intValue >= 0) {
                    v4Var.j(intValue);
                } else {
                    v4Var.l(intValue);
                }
                i10++;
            }
            return;
        }
        v4Var.i(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            i11 += v4.m(((Integer) list.get(i12)).intValue());
        }
        v4Var.j(i11);
        while (i10 < list.size()) {
            int intValue2 = ((Integer) list.get(i10)).intValue();
            if (intValue2 >= 0) {
                v4Var.j(intValue2);
            } else {
                v4Var.l(intValue2);
            }
            i10++;
        }
    }

    public static void s(int i7, List list, q5 q5Var, boolean z9) {
        if (list == null || list.isEmpty()) {
            return;
        }
        v4 v4Var = (v4) q5Var.a;
        int i10 = 0;
        if (!z9) {
            while (i10 < list.size()) {
                v4Var.d(i7, ((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        v4Var.i(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Integer) list.get(i12)).getClass();
            i11 += 4;
        }
        v4Var.j(i11);
        while (i10 < list.size()) {
            v4Var.e(((Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    public static void t(int i7, List list, q5 q5Var, boolean z9) {
        if (list == null || list.isEmpty()) {
            return;
        }
        v4 v4Var = (v4) q5Var.a;
        int i10 = 0;
        if (!z9) {
            while (i10 < list.size()) {
                v4Var.f(i7, ((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        v4Var.i(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Long) list.get(i12)).getClass();
            i11 += 8;
        }
        v4Var.j(i11);
        while (i10 < list.size()) {
            v4Var.g(((Long) list.get(i10)).longValue());
            i10++;
        }
    }

    public static void u(int i7, List list, q5 q5Var, boolean z9) {
        if (list == null || list.isEmpty()) {
            return;
        }
        v4 v4Var = (v4) q5Var.a;
        int i10 = 0;
        if (!z9) {
            while (i10 < list.size()) {
                v4Var.d(i7, Float.floatToRawIntBits(((Float) list.get(i10)).floatValue()));
                i10++;
            }
            return;
        }
        v4Var.i(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Float) list.get(i12)).getClass();
            i11 += 4;
        }
        v4Var.j(i11);
        while (i10 < list.size()) {
            v4Var.e(Float.floatToRawIntBits(((Float) list.get(i10)).floatValue()));
            i10++;
        }
    }

    public static void v(int i7, List list, q5 q5Var, boolean z9) {
        if (list == null || list.isEmpty()) {
            return;
        }
        v4 v4Var = (v4) q5Var.a;
        int i10 = 0;
        if (!z9) {
            while (i10 < list.size()) {
                int intValue = ((Integer) list.get(i10)).intValue();
                v4Var.j(i7 << 3);
                if (intValue >= 0) {
                    v4Var.j(intValue);
                } else {
                    v4Var.l(intValue);
                }
                i10++;
            }
            return;
        }
        v4Var.i(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            i11 += v4.m(((Integer) list.get(i12)).intValue());
        }
        v4Var.j(i11);
        while (i10 < list.size()) {
            int intValue2 = ((Integer) list.get(i10)).intValue();
            if (intValue2 >= 0) {
                v4Var.j(intValue2);
            } else {
                v4Var.l(intValue2);
            }
            i10++;
        }
    }

    public static void w(int i7, List list, q5 q5Var, boolean z9) {
        if (list == null || list.isEmpty()) {
            return;
        }
        v4 v4Var = (v4) q5Var.a;
        int i10 = 0;
        if (!z9) {
            while (i10 < list.size()) {
                v4Var.k(i7, ((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        v4Var.i(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            i11 += v4.p(((Long) list.get(i12)).longValue());
        }
        v4Var.j(i11);
        while (i10 < list.size()) {
            v4Var.l(((Long) list.get(i10)).longValue());
            i10++;
        }
    }

    public static void x(int i7, List list, q5 q5Var, boolean z9) {
        if (list == null || list.isEmpty()) {
            return;
        }
        v4 v4Var = (v4) q5Var.a;
        int i10 = 0;
        if (!z9) {
            while (i10 < list.size()) {
                v4Var.d(i7, ((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        v4Var.i(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Integer) list.get(i12)).getClass();
            i11 += 4;
        }
        v4Var.j(i11);
        while (i10 < list.size()) {
            v4Var.e(((Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    public static void y(int i7, List list, q5 q5Var, boolean z9) {
        if (list == null || list.isEmpty()) {
            return;
        }
        v4 v4Var = (v4) q5Var.a;
        int i10 = 0;
        if (!z9) {
            while (i10 < list.size()) {
                v4Var.f(i7, ((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        v4Var.i(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Long) list.get(i12)).getClass();
            i11 += 8;
        }
        v4Var.j(i11);
        while (i10 < list.size()) {
            v4Var.g(((Long) list.get(i10)).longValue());
            i10++;
        }
    }
}
