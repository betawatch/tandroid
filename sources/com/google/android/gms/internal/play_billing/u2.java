package com.google.android.gms.internal.play_billing;

import com.google.android.gms.internal.cast.z4;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class u2 {
    public static final t1 a;

    static {
        q2 q2Var = q2.c;
        a = new t1(7);
    }

    public static void a(int i9, List list, i2 i2Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m1 m1Var = (m1) i2Var.a;
        int i10 = 0;
        if (!(list instanceof w1)) {
            if (!z10) {
                while (i10 < list.size()) {
                    int intValue = ((Integer) list.get(i10)).intValue();
                    m1Var.n(i9, (intValue >> 31) ^ (intValue + intValue));
                    i10++;
                }
                return;
            }
            m1Var.m(i9, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                int intValue2 = ((Integer) list.get(i12)).intValue();
                i11 += m1.b((intValue2 >> 31) ^ (intValue2 + intValue2));
            }
            m1Var.o(i11);
            while (i10 < list.size()) {
                int intValue3 = ((Integer) list.get(i10)).intValue();
                m1Var.o((intValue3 >> 31) ^ (intValue3 + intValue3));
                i10++;
            }
            return;
        }
        w1 w1Var = (w1) list;
        if (!z10) {
            while (i10 < w1Var.c) {
                int n10 = w1Var.n(i10);
                m1Var.n(i9, (n10 >> 31) ^ (n10 + n10));
                i10++;
            }
            return;
        }
        m1Var.m(i9, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < w1Var.c; i14++) {
            int n11 = w1Var.n(i14);
            i13 += m1.b((n11 >> 31) ^ (n11 + n11));
        }
        m1Var.o(i13);
        while (i10 < w1Var.c) {
            int n12 = w1Var.n(i10);
            m1Var.o((n12 >> 31) ^ (n12 + n12));
            i10++;
        }
    }

    public static void b(int i9, List list, i2 i2Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m1 m1Var = (m1) i2Var.a;
        if (list instanceof h2) {
            throw new ClassCastException();
        }
        int i10 = 0;
        if (!z10) {
            while (i10 < list.size()) {
                long longValue = ((Long) list.get(i10)).longValue();
                m1Var.p(i9, (longValue >> 63) ^ (longValue + longValue));
                i10++;
            }
            return;
        }
        m1Var.m(i9, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            long longValue2 = ((Long) list.get(i12)).longValue();
            i11 += m1.c((longValue2 >> 63) ^ (longValue2 + longValue2));
        }
        m1Var.o(i11);
        while (i10 < list.size()) {
            long longValue3 = ((Long) list.get(i10)).longValue();
            m1Var.q((longValue3 >> 63) ^ (longValue3 + longValue3));
            i10++;
        }
    }

    public static void c(int i9, List list, i2 i2Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m1 m1Var = (m1) i2Var.a;
        int i10 = 0;
        if (!(list instanceof w1)) {
            if (!z10) {
                while (i10 < list.size()) {
                    m1Var.n(i9, ((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            m1Var.m(i9, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                i11 += m1.b(((Integer) list.get(i12)).intValue());
            }
            m1Var.o(i11);
            while (i10 < list.size()) {
                m1Var.o(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        w1 w1Var = (w1) list;
        if (!z10) {
            while (i10 < w1Var.c) {
                m1Var.n(i9, w1Var.n(i10));
                i10++;
            }
            return;
        }
        m1Var.m(i9, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < w1Var.c; i14++) {
            i13 += m1.b(w1Var.n(i14));
        }
        m1Var.o(i13);
        while (i10 < w1Var.c) {
            m1Var.o(w1Var.n(i10));
            i10++;
        }
    }

    public static void d(int i9, List list, i2 i2Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m1 m1Var = (m1) i2Var.a;
        if (list instanceof h2) {
            throw new ClassCastException();
        }
        int i10 = 0;
        if (!z10) {
            while (i10 < list.size()) {
                m1Var.p(i9, ((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        m1Var.m(i9, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            i11 += m1.c(((Long) list.get(i12)).longValue());
        }
        m1Var.o(i11);
        while (i10 < list.size()) {
            m1Var.q(((Long) list.get(i10)).longValue());
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
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof w1)) {
            int i10 = 0;
            while (i9 < size) {
                i10 += m1.c(((Integer) list.get(i9)).intValue());
                i9++;
            }
            return i10;
        }
        w1 w1Var = (w1) list;
        int i11 = 0;
        while (i9 < size) {
            i11 += m1.c(w1Var.n(i9));
            i9++;
        }
        return i11;
    }

    public static int g(int i9, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (m1.b(i9 << 3) + 4) * size;
    }

    public static int h(int i9, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (m1.b(i9 << 3) + 8) * size;
    }

    public static int i(List list) {
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof w1)) {
            int i10 = 0;
            while (i9 < size) {
                i10 += m1.c(((Integer) list.get(i9)).intValue());
                i9++;
            }
            return i10;
        }
        w1 w1Var = (w1) list;
        int i11 = 0;
        while (i9 < size) {
            i11 += m1.c(w1Var.n(i9));
            i9++;
        }
        return i11;
    }

    public static int j(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof h2) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i9 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            i9 += m1.c(((Long) list.get(i10)).longValue());
        }
        return i9;
    }

    public static int k(List list) {
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof w1)) {
            int i10 = 0;
            while (i9 < size) {
                int intValue = ((Integer) list.get(i9)).intValue();
                i10 += m1.b((intValue >> 31) ^ (intValue + intValue));
                i9++;
            }
            return i10;
        }
        w1 w1Var = (w1) list;
        int i11 = 0;
        while (i9 < size) {
            int n10 = w1Var.n(i9);
            i11 += m1.b((n10 >> 31) ^ (n10 + n10));
            i9++;
        }
        return i11;
    }

    public static int l(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof h2) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i9 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            long longValue = ((Long) list.get(i10)).longValue();
            i9 += m1.c((longValue >> 63) ^ (longValue + longValue));
        }
        return i9;
    }

    public static int m(List list) {
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof w1)) {
            int i10 = 0;
            while (i9 < size) {
                i10 += m1.b(((Integer) list.get(i9)).intValue());
                i9++;
            }
            return i10;
        }
        w1 w1Var = (w1) list;
        int i11 = 0;
        while (i9 < size) {
            i11 += m1.b(w1Var.n(i9));
            i9++;
        }
        return i11;
    }

    public static int n(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof h2) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i9 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            i9 += m1.c(((Long) list.get(i10)).longValue());
        }
        return i9;
    }

    public static Object o(Object obj, int i9, int i10, Object obj2, t1 t1Var) {
        Object obj3 = obj2;
        if (obj2 == null) {
            t1Var.getClass();
            v1 v1Var = (v1) obj;
            x2 x2Var = v1Var.zzc;
            obj3 = x2Var;
            if (x2Var == x2.f) {
                x2 b10 = x2.b();
                v1Var.zzc = b10;
                obj3 = b10;
            }
        }
        ((x2) obj3).c(i9 << 3, Long.valueOf(i10));
        return obj3;
    }

    public static void p(Object obj, Object obj2) {
        v1 v1Var = (v1) obj;
        x2 x2Var = v1Var.zzc;
        x2 x2Var2 = ((v1) obj2).zzc;
        x2 x2Var3 = x2.f;
        if (!x2Var3.equals(x2Var2)) {
            if (x2Var3.equals(x2Var)) {
                int i9 = x2Var.a + x2Var2.a;
                int[] copyOf = Arrays.copyOf(x2Var.b, i9);
                System.arraycopy(x2Var2.b, 0, copyOf, x2Var.a, x2Var2.a);
                Object[] copyOf2 = Arrays.copyOf(x2Var.c, i9);
                System.arraycopy(x2Var2.c, 0, copyOf2, x2Var.a, x2Var2.a);
                x2Var = new x2(i9, copyOf, copyOf2, true);
            } else {
                x2Var.getClass();
                if (!x2Var2.equals(x2Var3)) {
                    if (!x2Var.e) {
                        throw new UnsupportedOperationException();
                    }
                    int i10 = x2Var.a + x2Var2.a;
                    x2Var.e(i10);
                    System.arraycopy(x2Var2.b, 0, x2Var.b, x2Var.a, x2Var2.a);
                    System.arraycopy(x2Var2.c, 0, x2Var.c, x2Var.a, x2Var2.a);
                    x2Var.a = i10;
                }
            }
        }
        v1Var.zzc = x2Var;
    }

    public static void q(int i9, List list, i2 i2Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m1 m1Var = (m1) i2Var.a;
        if (list instanceof i1) {
            throw new ClassCastException();
        }
        int i10 = 0;
        if (!z10) {
            while (i10 < list.size()) {
                byte booleanValue = ((Boolean) list.get(i10)).booleanValue();
                m1Var.o(i9 << 3);
                int i11 = m1Var.d;
                try {
                    int i12 = i11 + 1;
                    try {
                        m1Var.b[i11] = booleanValue;
                        m1Var.d = i12;
                        i10++;
                    } catch (IndexOutOfBoundsException e10) {
                        e = e10;
                        i11 = i12;
                        throw new z4(i11, m1Var.c, 1, e);
                    }
                } catch (IndexOutOfBoundsException e11) {
                    e = e11;
                }
            }
            return;
        }
        m1Var.m(i9, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < list.size(); i14++) {
            ((Boolean) list.get(i14)).getClass();
            i13++;
        }
        m1Var.o(i13);
        while (i10 < list.size()) {
            byte booleanValue2 = ((Boolean) list.get(i10)).booleanValue();
            int i15 = m1Var.d;
            try {
                int i16 = i15 + 1;
                try {
                    m1Var.b[i15] = booleanValue2;
                    m1Var.d = i16;
                    i10++;
                } catch (IndexOutOfBoundsException e12) {
                    e = e12;
                    i15 = i16;
                    throw new z4(i15, m1Var.c, 1, e);
                }
            } catch (IndexOutOfBoundsException e13) {
                e = e13;
            }
        }
    }

    public static void r(int i9, List list, i2 i2Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m1 m1Var = (m1) i2Var.a;
        if (list instanceof n1) {
            throw new ClassCastException();
        }
        int i10 = 0;
        if (!z10) {
            while (i10 < list.size()) {
                m1Var.h(i9, Double.doubleToRawLongBits(((Double) list.get(i10)).doubleValue()));
                i10++;
            }
            return;
        }
        m1Var.m(i9, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Double) list.get(i12)).getClass();
            i11 += 8;
        }
        m1Var.o(i11);
        while (i10 < list.size()) {
            m1Var.i(Double.doubleToRawLongBits(((Double) list.get(i10)).doubleValue()));
            i10++;
        }
    }

    public static void s(int i9, List list, i2 i2Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m1 m1Var = (m1) i2Var.a;
        int i10 = 0;
        if (!(list instanceof w1)) {
            if (!z10) {
                while (i10 < list.size()) {
                    m1Var.j(i9, ((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            m1Var.m(i9, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                i11 += m1.c(((Integer) list.get(i12)).intValue());
            }
            m1Var.o(i11);
            while (i10 < list.size()) {
                m1Var.k(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        w1 w1Var = (w1) list;
        if (!z10) {
            while (i10 < w1Var.c) {
                m1Var.j(i9, w1Var.n(i10));
                i10++;
            }
            return;
        }
        m1Var.m(i9, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < w1Var.c; i14++) {
            i13 += m1.c(w1Var.n(i14));
        }
        m1Var.o(i13);
        while (i10 < w1Var.c) {
            m1Var.k(w1Var.n(i10));
            i10++;
        }
    }

    public static void t(int i9, List list, i2 i2Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m1 m1Var = (m1) i2Var.a;
        int i10 = 0;
        if (!(list instanceof w1)) {
            if (!z10) {
                while (i10 < list.size()) {
                    m1Var.f(i9, ((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            m1Var.m(i9, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Integer) list.get(i12)).getClass();
                i11 += 4;
            }
            m1Var.o(i11);
            while (i10 < list.size()) {
                m1Var.g(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        w1 w1Var = (w1) list;
        if (!z10) {
            while (i10 < w1Var.c) {
                m1Var.f(i9, w1Var.n(i10));
                i10++;
            }
            return;
        }
        m1Var.m(i9, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < w1Var.c; i14++) {
            w1Var.n(i14);
            i13 += 4;
        }
        m1Var.o(i13);
        while (i10 < w1Var.c) {
            m1Var.g(w1Var.n(i10));
            i10++;
        }
    }

    public static void u(int i9, List list, i2 i2Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m1 m1Var = (m1) i2Var.a;
        if (list instanceof h2) {
            throw new ClassCastException();
        }
        int i10 = 0;
        if (!z10) {
            while (i10 < list.size()) {
                m1Var.h(i9, ((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        m1Var.m(i9, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Long) list.get(i12)).getClass();
            i11 += 8;
        }
        m1Var.o(i11);
        while (i10 < list.size()) {
            m1Var.i(((Long) list.get(i10)).longValue());
            i10++;
        }
    }

    public static void v(int i9, List list, i2 i2Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m1 m1Var = (m1) i2Var.a;
        if (list instanceof r1) {
            throw new ClassCastException();
        }
        int i10 = 0;
        if (!z10) {
            while (i10 < list.size()) {
                m1Var.f(i9, Float.floatToRawIntBits(((Float) list.get(i10)).floatValue()));
                i10++;
            }
            return;
        }
        m1Var.m(i9, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Float) list.get(i12)).getClass();
            i11 += 4;
        }
        m1Var.o(i11);
        while (i10 < list.size()) {
            m1Var.g(Float.floatToRawIntBits(((Float) list.get(i10)).floatValue()));
            i10++;
        }
    }

    public static void w(int i9, List list, i2 i2Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m1 m1Var = (m1) i2Var.a;
        int i10 = 0;
        if (!(list instanceof w1)) {
            if (!z10) {
                while (i10 < list.size()) {
                    m1Var.j(i9, ((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            m1Var.m(i9, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                i11 += m1.c(((Integer) list.get(i12)).intValue());
            }
            m1Var.o(i11);
            while (i10 < list.size()) {
                m1Var.k(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        w1 w1Var = (w1) list;
        if (!z10) {
            while (i10 < w1Var.c) {
                m1Var.j(i9, w1Var.n(i10));
                i10++;
            }
            return;
        }
        m1Var.m(i9, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < w1Var.c; i14++) {
            i13 += m1.c(w1Var.n(i14));
        }
        m1Var.o(i13);
        while (i10 < w1Var.c) {
            m1Var.k(w1Var.n(i10));
            i10++;
        }
    }

    public static void x(int i9, List list, i2 i2Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m1 m1Var = (m1) i2Var.a;
        if (list instanceof h2) {
            throw new ClassCastException();
        }
        int i10 = 0;
        if (!z10) {
            while (i10 < list.size()) {
                m1Var.p(i9, ((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        m1Var.m(i9, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            i11 += m1.c(((Long) list.get(i12)).longValue());
        }
        m1Var.o(i11);
        while (i10 < list.size()) {
            m1Var.q(((Long) list.get(i10)).longValue());
            i10++;
        }
    }

    public static void y(int i9, List list, i2 i2Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m1 m1Var = (m1) i2Var.a;
        int i10 = 0;
        if (!(list instanceof w1)) {
            if (!z10) {
                while (i10 < list.size()) {
                    m1Var.f(i9, ((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            m1Var.m(i9, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Integer) list.get(i12)).getClass();
                i11 += 4;
            }
            m1Var.o(i11);
            while (i10 < list.size()) {
                m1Var.g(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        w1 w1Var = (w1) list;
        if (!z10) {
            while (i10 < w1Var.c) {
                m1Var.f(i9, w1Var.n(i10));
                i10++;
            }
            return;
        }
        m1Var.m(i9, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < w1Var.c; i14++) {
            w1Var.n(i14);
            i13 += 4;
        }
        m1Var.o(i13);
        while (i10 < w1Var.c) {
            m1Var.g(w1Var.n(i10));
            i10++;
        }
    }

    public static void z(int i9, List list, i2 i2Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m1 m1Var = (m1) i2Var.a;
        if (list instanceof h2) {
            throw new ClassCastException();
        }
        int i10 = 0;
        if (!z10) {
            while (i10 < list.size()) {
                m1Var.h(i9, ((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        m1Var.m(i9, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Long) list.get(i12)).getClass();
            i11 += 8;
        }
        m1Var.o(i11);
        while (i10 < list.size()) {
            m1Var.i(((Long) list.get(i10)).longValue());
            i10++;
        }
    }
}
