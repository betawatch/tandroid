package com.google.android.gms.internal.cast;

import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public abstract class g6 {
    public static final Class a;
    public static final i6 b;
    public static final i6 c;

    static {
        Class<?> cls;
        Class<?> cls2;
        i6 i6Var = null;
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
                i6Var = (i6) cls2.getConstructor(null).newInstance(null);
            } catch (Throwable unused3) {
            }
        }
        b = i6Var;
        c = new i6();
    }

    public static void a(int i10, List list, s5 s5Var, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        x4 x4Var = (x4) s5Var.a;
        int i11 = 0;
        if (!z4) {
            while (i11 < list.size()) {
                int intValue = ((Integer) list.get(i11)).intValue();
                x4Var.j(i10 << 3);
                x4Var.j((intValue >> 31) ^ (intValue + intValue));
                i11++;
            }
            return;
        }
        x4Var.i(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            int intValue2 = ((Integer) list.get(i13)).intValue();
            i12 += x4.o((intValue2 >> 31) ^ (intValue2 + intValue2));
        }
        x4Var.j(i12);
        while (i11 < list.size()) {
            int intValue3 = ((Integer) list.get(i11)).intValue();
            x4Var.j((intValue3 >> 31) ^ (intValue3 + intValue3));
            i11++;
        }
    }

    public static void b(int i10, List list, s5 s5Var, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        x4 x4Var = (x4) s5Var.a;
        int i11 = 0;
        if (!z4) {
            while (i11 < list.size()) {
                long longValue = ((Long) list.get(i11)).longValue();
                x4Var.k(i10, (longValue >> 63) ^ (longValue + longValue));
                i11++;
            }
            return;
        }
        x4Var.i(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            long longValue2 = ((Long) list.get(i13)).longValue();
            i12 += x4.p((longValue2 >> 63) ^ (longValue2 + longValue2));
        }
        x4Var.j(i12);
        while (i11 < list.size()) {
            long longValue3 = ((Long) list.get(i11)).longValue();
            x4Var.l((longValue3 >> 63) ^ (longValue3 + longValue3));
            i11++;
        }
    }

    public static void c(int i10, List list, s5 s5Var, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        x4 x4Var = (x4) s5Var.a;
        int i11 = 0;
        if (!z4) {
            while (i11 < list.size()) {
                int intValue = ((Integer) list.get(i11)).intValue();
                x4Var.j(i10 << 3);
                x4Var.j(intValue);
                i11++;
            }
            return;
        }
        x4Var.i(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += x4.o(((Integer) list.get(i13)).intValue());
        }
        x4Var.j(i12);
        while (i11 < list.size()) {
            x4Var.j(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    public static void d(int i10, List list, s5 s5Var, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        x4 x4Var = (x4) s5Var.a;
        int i11 = 0;
        if (!z4) {
            while (i11 < list.size()) {
                x4Var.k(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        x4Var.i(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += x4.p(((Long) list.get(i13)).longValue());
        }
        x4Var.j(i12);
        while (i11 < list.size()) {
            x4Var.l(((Long) list.get(i11)).longValue());
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
        if (!(list instanceof e5)) {
            int i11 = 0;
            while (i10 < size) {
                i11 += x4.m(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return i11;
        }
        e5 e5Var = (e5) list;
        int i12 = 0;
        while (i10 < size) {
            e5Var.n(i10);
            i12 += x4.m(e5Var.b[i10]);
            i10++;
        }
        return i12;
    }

    public static int g(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (x4.o(i10 << 3) + 4) * size;
    }

    public static int h(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (x4.o(i10 << 3) + 8) * size;
    }

    public static int i(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof e5)) {
            int i11 = 0;
            while (i10 < size) {
                i11 += x4.m(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return i11;
        }
        e5 e5Var = (e5) list;
        int i12 = 0;
        while (i10 < size) {
            e5Var.n(i10);
            i12 += x4.m(e5Var.b[i10]);
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
        if (!(list instanceof q5)) {
            int i11 = 0;
            while (i10 < size) {
                i11 += x4.p(((Long) list.get(i10)).longValue());
                i10++;
            }
            return i11;
        }
        q5 q5Var = (q5) list;
        int i12 = 0;
        while (i10 < size) {
            q5Var.n(i10);
            i12 += x4.p(q5Var.b[i10]);
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
        if (!(list instanceof e5)) {
            int i11 = 0;
            while (i10 < size) {
                int intValue = ((Integer) list.get(i10)).intValue();
                i11 += x4.o((intValue >> 31) ^ (intValue + intValue));
                i10++;
            }
            return i11;
        }
        e5 e5Var = (e5) list;
        int i12 = 0;
        while (i10 < size) {
            e5Var.n(i10);
            int i13 = e5Var.b[i10];
            i12 += x4.o((i13 >> 31) ^ (i13 + i13));
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
        if (!(list instanceof q5)) {
            int i11 = 0;
            while (i10 < size) {
                long longValue = ((Long) list.get(i10)).longValue();
                i11 += x4.p((longValue >> 63) ^ (longValue + longValue));
                i10++;
            }
            return i11;
        }
        q5 q5Var = (q5) list;
        int i12 = 0;
        while (i10 < size) {
            q5Var.n(i10);
            long j10 = q5Var.b[i10];
            i12 += x4.p((j10 >> 63) ^ (j10 + j10));
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
        if (!(list instanceof e5)) {
            int i11 = 0;
            while (i10 < size) {
                i11 += x4.o(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return i11;
        }
        e5 e5Var = (e5) list;
        int i12 = 0;
        while (i10 < size) {
            e5Var.n(i10);
            i12 += x4.o(e5Var.b[i10]);
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
        if (!(list instanceof q5)) {
            int i11 = 0;
            while (i10 < size) {
                i11 += x4.p(((Long) list.get(i10)).longValue());
                i10++;
            }
            return i11;
        }
        q5 q5Var = (q5) list;
        int i12 = 0;
        while (i10 < size) {
            q5Var.n(i10);
            i12 += x4.p(q5Var.b[i10]);
            i10++;
        }
        return i12;
    }

    public static void o(i6 i6Var, Object obj, Object obj2) {
        i6Var.getClass();
        d5 d5Var = (d5) obj;
        h6 h6Var = d5Var.zzc;
        h6 h6Var2 = ((d5) obj2).zzc;
        h6 h6Var3 = h6.e;
        if (!h6Var3.equals(h6Var2)) {
            if (h6Var3.equals(h6Var)) {
                h6Var.getClass();
                h6Var2.getClass();
                int[] copyOf = Arrays.copyOf(h6Var.a, 0);
                System.arraycopy(h6Var2.a, 0, copyOf, 0, 0);
                Object[] copyOf2 = Arrays.copyOf(h6Var.b, 0);
                System.arraycopy(h6Var2.b, 0, copyOf2, 0, 0);
                h6Var = new h6(copyOf, copyOf2, true);
            } else {
                h6Var.getClass();
                if (!h6Var2.equals(h6Var3)) {
                    if (!h6Var.d) {
                        throw new UnsupportedOperationException();
                    }
                    int[] iArr = h6Var.a;
                    int length = iArr.length;
                    System.arraycopy(h6Var2.a, 0, iArr, 0, 0);
                    System.arraycopy(h6Var2.b, 0, h6Var.b, 0, 0);
                }
            }
        }
        d5Var.zzc = h6Var;
    }

    public static void p(int i10, List list, s5 s5Var, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        x4 x4Var = (x4) s5Var.a;
        int i11 = 0;
        if (!z4) {
            while (i11 < list.size()) {
                boolean booleanValue = ((Boolean) list.get(i11)).booleanValue();
                x4Var.j(i10 << 3);
                x4Var.a(booleanValue ? (byte) 1 : (byte) 0);
                i11++;
            }
            return;
        }
        x4Var.i(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Boolean) list.get(i13)).getClass();
            i12++;
        }
        x4Var.j(i12);
        while (i11 < list.size()) {
            x4Var.a(((Boolean) list.get(i11)).booleanValue() ? (byte) 1 : (byte) 0);
            i11++;
        }
    }

    public static void q(int i10, List list, s5 s5Var, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        x4 x4Var = (x4) s5Var.a;
        int i11 = 0;
        if (!z4) {
            while (i11 < list.size()) {
                x4Var.f(i10, Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
                i11++;
            }
            return;
        }
        x4Var.i(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Double) list.get(i13)).getClass();
            i12 += 8;
        }
        x4Var.j(i12);
        while (i11 < list.size()) {
            x4Var.g(Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
            i11++;
        }
    }

    public static void r(int i10, List list, s5 s5Var, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        x4 x4Var = (x4) s5Var.a;
        int i11 = 0;
        if (!z4) {
            while (i11 < list.size()) {
                int intValue = ((Integer) list.get(i11)).intValue();
                x4Var.j(i10 << 3);
                if (intValue >= 0) {
                    x4Var.j(intValue);
                } else {
                    x4Var.l(intValue);
                }
                i11++;
            }
            return;
        }
        x4Var.i(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += x4.m(((Integer) list.get(i13)).intValue());
        }
        x4Var.j(i12);
        while (i11 < list.size()) {
            int intValue2 = ((Integer) list.get(i11)).intValue();
            if (intValue2 >= 0) {
                x4Var.j(intValue2);
            } else {
                x4Var.l(intValue2);
            }
            i11++;
        }
    }

    public static void s(int i10, List list, s5 s5Var, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        x4 x4Var = (x4) s5Var.a;
        int i11 = 0;
        if (!z4) {
            while (i11 < list.size()) {
                x4Var.d(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        x4Var.i(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Integer) list.get(i13)).getClass();
            i12 += 4;
        }
        x4Var.j(i12);
        while (i11 < list.size()) {
            x4Var.e(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    public static void t(int i10, List list, s5 s5Var, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        x4 x4Var = (x4) s5Var.a;
        int i11 = 0;
        if (!z4) {
            while (i11 < list.size()) {
                x4Var.f(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        x4Var.i(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Long) list.get(i13)).getClass();
            i12 += 8;
        }
        x4Var.j(i12);
        while (i11 < list.size()) {
            x4Var.g(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    public static void u(int i10, List list, s5 s5Var, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        x4 x4Var = (x4) s5Var.a;
        int i11 = 0;
        if (!z4) {
            while (i11 < list.size()) {
                x4Var.d(i10, Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
                i11++;
            }
            return;
        }
        x4Var.i(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Float) list.get(i13)).getClass();
            i12 += 4;
        }
        x4Var.j(i12);
        while (i11 < list.size()) {
            x4Var.e(Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
            i11++;
        }
    }

    public static void v(int i10, List list, s5 s5Var, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        x4 x4Var = (x4) s5Var.a;
        int i11 = 0;
        if (!z4) {
            while (i11 < list.size()) {
                int intValue = ((Integer) list.get(i11)).intValue();
                x4Var.j(i10 << 3);
                if (intValue >= 0) {
                    x4Var.j(intValue);
                } else {
                    x4Var.l(intValue);
                }
                i11++;
            }
            return;
        }
        x4Var.i(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += x4.m(((Integer) list.get(i13)).intValue());
        }
        x4Var.j(i12);
        while (i11 < list.size()) {
            int intValue2 = ((Integer) list.get(i11)).intValue();
            if (intValue2 >= 0) {
                x4Var.j(intValue2);
            } else {
                x4Var.l(intValue2);
            }
            i11++;
        }
    }

    public static void w(int i10, List list, s5 s5Var, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        x4 x4Var = (x4) s5Var.a;
        int i11 = 0;
        if (!z4) {
            while (i11 < list.size()) {
                x4Var.k(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        x4Var.i(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += x4.p(((Long) list.get(i13)).longValue());
        }
        x4Var.j(i12);
        while (i11 < list.size()) {
            x4Var.l(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    public static void x(int i10, List list, s5 s5Var, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        x4 x4Var = (x4) s5Var.a;
        int i11 = 0;
        if (!z4) {
            while (i11 < list.size()) {
                x4Var.d(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        x4Var.i(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Integer) list.get(i13)).getClass();
            i12 += 4;
        }
        x4Var.j(i12);
        while (i11 < list.size()) {
            x4Var.e(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    public static void y(int i10, List list, s5 s5Var, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        x4 x4Var = (x4) s5Var.a;
        int i11 = 0;
        if (!z4) {
            while (i11 < list.size()) {
                x4Var.f(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        x4Var.i(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Long) list.get(i13)).getClass();
            i12 += 8;
        }
        x4Var.j(i12);
        while (i11 < list.size()) {
            x4Var.g(((Long) list.get(i11)).longValue());
            i11++;
        }
    }
}
