package com.google.android.gms.internal.play_billing;

import com.google.android.gms.internal.cast.z4;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class t2 {
    public static final s1 a;

    static {
        p2 p2Var = p2.c;
        a = new s1(7);
    }

    public static void a(int i10, List list, h2 h2Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l1 l1Var = (l1) h2Var.a;
        int i11 = 0;
        if (!(list instanceof v1)) {
            if (!z10) {
                while (i11 < list.size()) {
                    int intValue = ((Integer) list.get(i11)).intValue();
                    l1Var.n(i10, (intValue >> 31) ^ (intValue + intValue));
                    i11++;
                }
                return;
            }
            l1Var.m(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                int intValue2 = ((Integer) list.get(i13)).intValue();
                i12 += l1.b((intValue2 >> 31) ^ (intValue2 + intValue2));
            }
            l1Var.o(i12);
            while (i11 < list.size()) {
                int intValue3 = ((Integer) list.get(i11)).intValue();
                l1Var.o((intValue3 >> 31) ^ (intValue3 + intValue3));
                i11++;
            }
            return;
        }
        v1 v1Var = (v1) list;
        if (!z10) {
            while (i11 < v1Var.c) {
                int n10 = v1Var.n(i11);
                l1Var.n(i10, (n10 >> 31) ^ (n10 + n10));
                i11++;
            }
            return;
        }
        l1Var.m(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < v1Var.c; i15++) {
            int n11 = v1Var.n(i15);
            i14 += l1.b((n11 >> 31) ^ (n11 + n11));
        }
        l1Var.o(i14);
        while (i11 < v1Var.c) {
            int n12 = v1Var.n(i11);
            l1Var.o((n12 >> 31) ^ (n12 + n12));
            i11++;
        }
    }

    public static void b(int i10, List list, h2 h2Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l1 l1Var = (l1) h2Var.a;
        if (list instanceof g2) {
            throw new ClassCastException();
        }
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                long longValue = ((Long) list.get(i11)).longValue();
                l1Var.p(i10, (longValue >> 63) ^ (longValue + longValue));
                i11++;
            }
            return;
        }
        l1Var.m(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            long longValue2 = ((Long) list.get(i13)).longValue();
            i12 += l1.c((longValue2 >> 63) ^ (longValue2 + longValue2));
        }
        l1Var.o(i12);
        while (i11 < list.size()) {
            long longValue3 = ((Long) list.get(i11)).longValue();
            l1Var.q((longValue3 >> 63) ^ (longValue3 + longValue3));
            i11++;
        }
    }

    public static void c(int i10, List list, h2 h2Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l1 l1Var = (l1) h2Var.a;
        int i11 = 0;
        if (!(list instanceof v1)) {
            if (!z10) {
                while (i11 < list.size()) {
                    l1Var.n(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            l1Var.m(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += l1.b(((Integer) list.get(i13)).intValue());
            }
            l1Var.o(i12);
            while (i11 < list.size()) {
                l1Var.o(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        v1 v1Var = (v1) list;
        if (!z10) {
            while (i11 < v1Var.c) {
                l1Var.n(i10, v1Var.n(i11));
                i11++;
            }
            return;
        }
        l1Var.m(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < v1Var.c; i15++) {
            i14 += l1.b(v1Var.n(i15));
        }
        l1Var.o(i14);
        while (i11 < v1Var.c) {
            l1Var.o(v1Var.n(i11));
            i11++;
        }
    }

    public static void d(int i10, List list, h2 h2Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l1 l1Var = (l1) h2Var.a;
        if (list instanceof g2) {
            throw new ClassCastException();
        }
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                l1Var.p(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        l1Var.m(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += l1.c(((Long) list.get(i13)).longValue());
        }
        l1Var.o(i12);
        while (i11 < list.size()) {
            l1Var.q(((Long) list.get(i11)).longValue());
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
        if (!(list instanceof v1)) {
            int i11 = 0;
            while (i10 < size) {
                i11 += l1.c(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return i11;
        }
        v1 v1Var = (v1) list;
        int i12 = 0;
        while (i10 < size) {
            i12 += l1.c(v1Var.n(i10));
            i10++;
        }
        return i12;
    }

    public static int g(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (l1.b(i10 << 3) + 4) * size;
    }

    public static int h(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (l1.b(i10 << 3) + 8) * size;
    }

    public static int i(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof v1)) {
            int i11 = 0;
            while (i10 < size) {
                i11 += l1.c(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return i11;
        }
        v1 v1Var = (v1) list;
        int i12 = 0;
        while (i10 < size) {
            i12 += l1.c(v1Var.n(i10));
            i10++;
        }
        return i12;
    }

    public static int j(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof g2) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            i10 += l1.c(((Long) list.get(i11)).longValue());
        }
        return i10;
    }

    public static int k(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof v1)) {
            int i11 = 0;
            while (i10 < size) {
                int intValue = ((Integer) list.get(i10)).intValue();
                i11 += l1.b((intValue >> 31) ^ (intValue + intValue));
                i10++;
            }
            return i11;
        }
        v1 v1Var = (v1) list;
        int i12 = 0;
        while (i10 < size) {
            int n10 = v1Var.n(i10);
            i12 += l1.b((n10 >> 31) ^ (n10 + n10));
            i10++;
        }
        return i12;
    }

    public static int l(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof g2) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            long longValue = ((Long) list.get(i11)).longValue();
            i10 += l1.c((longValue >> 63) ^ (longValue + longValue));
        }
        return i10;
    }

    public static int m(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof v1)) {
            int i11 = 0;
            while (i10 < size) {
                i11 += l1.b(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return i11;
        }
        v1 v1Var = (v1) list;
        int i12 = 0;
        while (i10 < size) {
            i12 += l1.b(v1Var.n(i10));
            i10++;
        }
        return i12;
    }

    public static int n(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof g2) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            i10 += l1.c(((Long) list.get(i11)).longValue());
        }
        return i10;
    }

    public static Object o(Object obj, int i10, int i11, Object obj2, s1 s1Var) {
        Object obj3 = obj2;
        if (obj2 == null) {
            s1Var.getClass();
            u1 u1Var = (u1) obj;
            w2 w2Var = u1Var.zzc;
            obj3 = w2Var;
            if (w2Var == w2.f) {
                w2 b10 = w2.b();
                u1Var.zzc = b10;
                obj3 = b10;
            }
        }
        ((w2) obj3).c(i10 << 3, Long.valueOf(i11));
        return obj3;
    }

    public static void p(Object obj, Object obj2) {
        u1 u1Var = (u1) obj;
        w2 w2Var = u1Var.zzc;
        w2 w2Var2 = ((u1) obj2).zzc;
        w2 w2Var3 = w2.f;
        if (!w2Var3.equals(w2Var2)) {
            if (w2Var3.equals(w2Var)) {
                int i10 = w2Var.a + w2Var2.a;
                int[] copyOf = Arrays.copyOf(w2Var.b, i10);
                System.arraycopy(w2Var2.b, 0, copyOf, w2Var.a, w2Var2.a);
                Object[] copyOf2 = Arrays.copyOf(w2Var.c, i10);
                System.arraycopy(w2Var2.c, 0, copyOf2, w2Var.a, w2Var2.a);
                w2Var = new w2(i10, copyOf, copyOf2, true);
            } else {
                w2Var.getClass();
                if (!w2Var2.equals(w2Var3)) {
                    if (!w2Var.e) {
                        throw new UnsupportedOperationException();
                    }
                    int i11 = w2Var.a + w2Var2.a;
                    w2Var.e(i11);
                    System.arraycopy(w2Var2.b, 0, w2Var.b, w2Var.a, w2Var2.a);
                    System.arraycopy(w2Var2.c, 0, w2Var.c, w2Var.a, w2Var2.a);
                    w2Var.a = i11;
                }
            }
        }
        u1Var.zzc = w2Var;
    }

    public static void q(int i10, List list, h2 h2Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l1 l1Var = (l1) h2Var.a;
        if (list instanceof h1) {
            throw new ClassCastException();
        }
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                byte booleanValue = ((Boolean) list.get(i11)).booleanValue();
                l1Var.o(i10 << 3);
                int i12 = l1Var.d;
                try {
                    int i13 = i12 + 1;
                    try {
                        l1Var.b[i12] = booleanValue;
                        l1Var.d = i13;
                        i11++;
                    } catch (IndexOutOfBoundsException e10) {
                        e = e10;
                        i12 = i13;
                        throw new z4(i12, l1Var.c, 1, e);
                    }
                } catch (IndexOutOfBoundsException e11) {
                    e = e11;
                }
            }
            return;
        }
        l1Var.m(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < list.size(); i15++) {
            ((Boolean) list.get(i15)).getClass();
            i14++;
        }
        l1Var.o(i14);
        while (i11 < list.size()) {
            byte booleanValue2 = ((Boolean) list.get(i11)).booleanValue();
            int i16 = l1Var.d;
            try {
                int i17 = i16 + 1;
                try {
                    l1Var.b[i16] = booleanValue2;
                    l1Var.d = i17;
                    i11++;
                } catch (IndexOutOfBoundsException e12) {
                    e = e12;
                    i16 = i17;
                    throw new z4(i16, l1Var.c, 1, e);
                }
            } catch (IndexOutOfBoundsException e13) {
                e = e13;
            }
        }
    }

    public static void r(int i10, List list, h2 h2Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l1 l1Var = (l1) h2Var.a;
        if (list instanceof m1) {
            throw new ClassCastException();
        }
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                l1Var.h(i10, Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
                i11++;
            }
            return;
        }
        l1Var.m(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Double) list.get(i13)).getClass();
            i12 += 8;
        }
        l1Var.o(i12);
        while (i11 < list.size()) {
            l1Var.i(Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
            i11++;
        }
    }

    public static void s(int i10, List list, h2 h2Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l1 l1Var = (l1) h2Var.a;
        int i11 = 0;
        if (!(list instanceof v1)) {
            if (!z10) {
                while (i11 < list.size()) {
                    l1Var.j(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            l1Var.m(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += l1.c(((Integer) list.get(i13)).intValue());
            }
            l1Var.o(i12);
            while (i11 < list.size()) {
                l1Var.k(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        v1 v1Var = (v1) list;
        if (!z10) {
            while (i11 < v1Var.c) {
                l1Var.j(i10, v1Var.n(i11));
                i11++;
            }
            return;
        }
        l1Var.m(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < v1Var.c; i15++) {
            i14 += l1.c(v1Var.n(i15));
        }
        l1Var.o(i14);
        while (i11 < v1Var.c) {
            l1Var.k(v1Var.n(i11));
            i11++;
        }
    }

    public static void t(int i10, List list, h2 h2Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l1 l1Var = (l1) h2Var.a;
        int i11 = 0;
        if (!(list instanceof v1)) {
            if (!z10) {
                while (i11 < list.size()) {
                    l1Var.f(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            l1Var.m(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Integer) list.get(i13)).getClass();
                i12 += 4;
            }
            l1Var.o(i12);
            while (i11 < list.size()) {
                l1Var.g(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        v1 v1Var = (v1) list;
        if (!z10) {
            while (i11 < v1Var.c) {
                l1Var.f(i10, v1Var.n(i11));
                i11++;
            }
            return;
        }
        l1Var.m(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < v1Var.c; i15++) {
            v1Var.n(i15);
            i14 += 4;
        }
        l1Var.o(i14);
        while (i11 < v1Var.c) {
            l1Var.g(v1Var.n(i11));
            i11++;
        }
    }

    public static void u(int i10, List list, h2 h2Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l1 l1Var = (l1) h2Var.a;
        if (list instanceof g2) {
            throw new ClassCastException();
        }
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                l1Var.h(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        l1Var.m(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Long) list.get(i13)).getClass();
            i12 += 8;
        }
        l1Var.o(i12);
        while (i11 < list.size()) {
            l1Var.i(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    public static void v(int i10, List list, h2 h2Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l1 l1Var = (l1) h2Var.a;
        if (list instanceof q1) {
            throw new ClassCastException();
        }
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                l1Var.f(i10, Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
                i11++;
            }
            return;
        }
        l1Var.m(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Float) list.get(i13)).getClass();
            i12 += 4;
        }
        l1Var.o(i12);
        while (i11 < list.size()) {
            l1Var.g(Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
            i11++;
        }
    }

    public static void w(int i10, List list, h2 h2Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l1 l1Var = (l1) h2Var.a;
        int i11 = 0;
        if (!(list instanceof v1)) {
            if (!z10) {
                while (i11 < list.size()) {
                    l1Var.j(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            l1Var.m(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += l1.c(((Integer) list.get(i13)).intValue());
            }
            l1Var.o(i12);
            while (i11 < list.size()) {
                l1Var.k(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        v1 v1Var = (v1) list;
        if (!z10) {
            while (i11 < v1Var.c) {
                l1Var.j(i10, v1Var.n(i11));
                i11++;
            }
            return;
        }
        l1Var.m(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < v1Var.c; i15++) {
            i14 += l1.c(v1Var.n(i15));
        }
        l1Var.o(i14);
        while (i11 < v1Var.c) {
            l1Var.k(v1Var.n(i11));
            i11++;
        }
    }

    public static void x(int i10, List list, h2 h2Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l1 l1Var = (l1) h2Var.a;
        if (list instanceof g2) {
            throw new ClassCastException();
        }
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                l1Var.p(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        l1Var.m(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += l1.c(((Long) list.get(i13)).longValue());
        }
        l1Var.o(i12);
        while (i11 < list.size()) {
            l1Var.q(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    public static void y(int i10, List list, h2 h2Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l1 l1Var = (l1) h2Var.a;
        int i11 = 0;
        if (!(list instanceof v1)) {
            if (!z10) {
                while (i11 < list.size()) {
                    l1Var.f(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            l1Var.m(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Integer) list.get(i13)).getClass();
                i12 += 4;
            }
            l1Var.o(i12);
            while (i11 < list.size()) {
                l1Var.g(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        v1 v1Var = (v1) list;
        if (!z10) {
            while (i11 < v1Var.c) {
                l1Var.f(i10, v1Var.n(i11));
                i11++;
            }
            return;
        }
        l1Var.m(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < v1Var.c; i15++) {
            v1Var.n(i15);
            i14 += 4;
        }
        l1Var.o(i14);
        while (i11 < v1Var.c) {
            l1Var.g(v1Var.n(i11));
            i11++;
        }
    }

    public static void z(int i10, List list, h2 h2Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l1 l1Var = (l1) h2Var.a;
        if (list instanceof g2) {
            throw new ClassCastException();
        }
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                l1Var.h(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        l1Var.m(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Long) list.get(i13)).getClass();
            i12 += 8;
        }
        l1Var.o(i12);
        while (i11 < list.size()) {
            l1Var.i(((Long) list.get(i11)).longValue());
            i11++;
        }
    }
}
