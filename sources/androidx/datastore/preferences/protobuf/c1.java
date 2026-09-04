package androidx.datastore.preferences.protobuf;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public abstract class c1 {
    public static final Class a;
    public static final j1 b;
    public static final j1 c;
    public static final j1 d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        a = cls;
        b = v(false);
        c = v(true);
        d = new j1();
    }

    public static void A(int i10, List list, k0 k0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        j jVar = (j) k0Var.a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                double doubleValue = ((Double) list.get(i11)).doubleValue();
                jVar.getClass();
                jVar.K(i10, Double.doubleToRawLongBits(doubleValue));
                i11++;
            }
            return;
        }
        jVar.R(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Double) list.get(i13)).getClass();
            Logger logger = j.h;
            i12 += 8;
        }
        jVar.T(i12);
        while (i11 < list.size()) {
            jVar.L(Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
            i11++;
        }
    }

    public static void B(int i10, List list, k0 k0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        j jVar = (j) k0Var.a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                jVar.M(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        jVar.R(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += j.w(((Integer) list.get(i13)).intValue());
        }
        jVar.T(i12);
        while (i11 < list.size()) {
            jVar.N(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    public static void C(int i10, List list, k0 k0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        j jVar = (j) k0Var.a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                jVar.I(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        jVar.R(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Integer) list.get(i13)).getClass();
            Logger logger = j.h;
            i12 += 4;
        }
        jVar.T(i12);
        while (i11 < list.size()) {
            jVar.J(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    public static void D(int i10, List list, k0 k0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        j jVar = (j) k0Var.a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                jVar.K(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        jVar.R(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Long) list.get(i13)).getClass();
            Logger logger = j.h;
            i12 += 8;
        }
        jVar.T(i12);
        while (i11 < list.size()) {
            jVar.L(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    public static void E(int i10, List list, k0 k0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        j jVar = (j) k0Var.a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                float floatValue = ((Float) list.get(i11)).floatValue();
                jVar.getClass();
                jVar.I(i10, Float.floatToRawIntBits(floatValue));
                i11++;
            }
            return;
        }
        jVar.R(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Float) list.get(i13)).getClass();
            Logger logger = j.h;
            i12 += 4;
        }
        jVar.T(i12);
        while (i11 < list.size()) {
            jVar.J(Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
            i11++;
        }
    }

    public static void F(int i10, List list, k0 k0Var, b1 b1Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        k0Var.getClass();
        for (int i11 = 0; i11 < list.size(); i11++) {
            k0Var.b(i10, list.get(i11), b1Var);
        }
    }

    public static void G(int i10, List list, k0 k0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        j jVar = (j) k0Var.a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                jVar.M(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        jVar.R(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += j.w(((Integer) list.get(i13)).intValue());
        }
        jVar.T(i12);
        while (i11 < list.size()) {
            jVar.N(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    public static void H(int i10, List list, k0 k0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        j jVar = (j) k0Var.a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                jVar.U(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        jVar.R(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += j.A(((Long) list.get(i13)).longValue());
        }
        jVar.T(i12);
        while (i11 < list.size()) {
            jVar.V(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    public static void I(int i10, List list, k0 k0Var, b1 b1Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        k0Var.getClass();
        for (int i11 = 0; i11 < list.size(); i11++) {
            ((j) k0Var.a).O(i10, (a) list.get(i11), b1Var);
        }
    }

    public static void J(int i10, List list, k0 k0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        j jVar = (j) k0Var.a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                jVar.I(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        jVar.R(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Integer) list.get(i13)).getClass();
            Logger logger = j.h;
            i12 += 4;
        }
        jVar.T(i12);
        while (i11 < list.size()) {
            jVar.J(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    public static void K(int i10, List list, k0 k0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        j jVar = (j) k0Var.a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                jVar.K(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        jVar.R(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Long) list.get(i13)).getClass();
            Logger logger = j.h;
            i12 += 8;
        }
        jVar.T(i12);
        while (i11 < list.size()) {
            jVar.L(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    public static void L(int i10, List list, k0 k0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        j jVar = (j) k0Var.a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                int intValue = ((Integer) list.get(i11)).intValue();
                jVar.S(i10, (intValue >> 31) ^ (intValue << 1));
                i11++;
            }
            return;
        }
        jVar.R(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            int intValue2 = ((Integer) list.get(i13)).intValue();
            i12 += j.z((intValue2 >> 31) ^ (intValue2 << 1));
        }
        jVar.T(i12);
        while (i11 < list.size()) {
            int intValue3 = ((Integer) list.get(i11)).intValue();
            jVar.T((intValue3 >> 31) ^ (intValue3 << 1));
            i11++;
        }
    }

    public static void M(int i10, List list, k0 k0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        j jVar = (j) k0Var.a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                long longValue = ((Long) list.get(i11)).longValue();
                jVar.U(i10, (longValue >> 63) ^ (longValue << 1));
                i11++;
            }
            return;
        }
        jVar.R(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            long longValue2 = ((Long) list.get(i13)).longValue();
            i12 += j.A((longValue2 >> 63) ^ (longValue2 << 1));
        }
        jVar.T(i12);
        while (i11 < list.size()) {
            long longValue3 = ((Long) list.get(i11)).longValue();
            jVar.V((longValue3 >> 63) ^ (longValue3 << 1));
            i11++;
        }
    }

    public static void N(int i10, List list, k0 k0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        j jVar = (j) k0Var.a;
        int i11 = 0;
        if (!(list instanceof e0)) {
            while (i11 < list.size()) {
                jVar.P(i10, (String) list.get(i11));
                i11++;
            }
            return;
        }
        e0 e0Var = (e0) list;
        while (i11 < list.size()) {
            Object l4 = e0Var.l(i11);
            if (l4 instanceof String) {
                jVar.P(i10, (String) l4);
            } else {
                jVar.G(i10, (g) l4);
            }
            i11++;
        }
    }

    public static void O(int i10, List list, k0 k0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        j jVar = (j) k0Var.a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                jVar.S(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        jVar.R(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += j.z(((Integer) list.get(i13)).intValue());
        }
        jVar.T(i12);
        while (i11 < list.size()) {
            jVar.T(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    public static void P(int i10, List list, k0 k0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        j jVar = (j) k0Var.a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                jVar.U(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        jVar.R(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += j.A(((Long) list.get(i13)).longValue());
        }
        jVar.T(i12);
        while (i11 < list.size()) {
            jVar.V(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    public static int a(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int y3 = j.y(i10) * size;
        for (int i11 = 0; i11 < list.size(); i11++) {
            y3 += j.s((g) list.get(i11));
        }
        return y3;
    }

    public static int b(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (j.y(i10) * size) + c(list);
    }

    public static int c(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof x) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            i10 += j.w(((Integer) list.get(i11)).intValue());
        }
        return i10;
    }

    public static int d(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return j.t(i10) * size;
    }

    public static int e(List list) {
        return list.size() * 4;
    }

    public static int f(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return j.u(i10) * size;
    }

    public static int g(List list) {
        return list.size() * 8;
    }

    public static int h(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (j.y(i10) * size) + i(list);
    }

    public static int i(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof x) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            i10 += j.w(((Integer) list.get(i11)).intValue());
        }
        return i10;
    }

    public static int j(int i10, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (j.y(i10) * list.size()) + k(list);
    }

    public static int k(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof i0) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            i10 += j.A(((Long) list.get(i11)).longValue());
        }
        return i10;
    }

    public static int l(int i10, List list, b1 b1Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int y3 = j.y(i10) * size;
        for (int i11 = 0; i11 < size; i11++) {
            int b10 = ((a) list.get(i11)).b(b1Var);
            y3 += j.z(b10) + b10;
        }
        return y3;
    }

    public static int m(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (j.y(i10) * size) + n(list);
    }

    public static int n(List list) {
        int size = list.size();
        if (size != 0) {
            if (!(list instanceof x)) {
                int i10 = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    int intValue = ((Integer) list.get(i11)).intValue();
                    i10 += j.z((intValue >> 31) ^ (intValue << 1));
                }
                return i10;
            }
            if (size > 0) {
                throw null;
            }
        }
        return 0;
    }

    public static int o(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (j.y(i10) * size) + p(list);
    }

    public static int p(List list) {
        int size = list.size();
        if (size != 0) {
            if (!(list instanceof i0)) {
                int i10 = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    long longValue = ((Long) list.get(i11)).longValue();
                    i10 += j.A((longValue >> 63) ^ (longValue << 1));
                }
                return i10;
            }
            if (size > 0) {
                throw null;
            }
        }
        return 0;
    }

    public static int q(int i10, List list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        int y3 = j.y(i10) * size;
        if (!(list instanceof e0)) {
            while (i11 < size) {
                Object obj = list.get(i11);
                if (obj instanceof g) {
                    int size2 = ((g) obj).size();
                    y3 = j.z(size2) + size2 + y3;
                } else {
                    y3 = j.x((String) obj) + y3;
                }
                i11++;
            }
            return y3;
        }
        e0 e0Var = (e0) list;
        while (i11 < size) {
            Object l4 = e0Var.l(i11);
            if (l4 instanceof g) {
                int size3 = ((g) l4).size();
                y3 = j.z(size3) + size3 + y3;
            } else {
                y3 = j.x((String) l4) + y3;
            }
            i11++;
        }
        return y3;
    }

    public static int r(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (j.y(i10) * size) + s(list);
    }

    public static int s(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof x) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            i10 += j.z(((Integer) list.get(i11)).intValue());
        }
        return i10;
    }

    public static int t(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (j.y(i10) * size) + u(list);
    }

    public static int u(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof i0) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            i10 += j.A(((Long) list.get(i11)).longValue());
        }
        return i10;
    }

    public static j1 v(boolean z10) {
        Class<?> cls;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls != null) {
            try {
                return (j1) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z10));
            } catch (Throwable unused2) {
            }
        }
        return null;
    }

    public static void w(j1 j1Var, Object obj, Object obj2) {
        j1Var.getClass();
        w wVar = (w) obj;
        i1 i1Var = wVar.unknownFields;
        i1 i1Var2 = ((w) obj2).unknownFields;
        if (!i1Var2.equals(i1.f)) {
            int i10 = i1Var.a + i1Var2.a;
            int[] copyOf = Arrays.copyOf(i1Var.b, i10);
            System.arraycopy(i1Var2.b, 0, copyOf, i1Var.a, i1Var2.a);
            Object[] copyOf2 = Arrays.copyOf(i1Var.c, i10);
            System.arraycopy(i1Var2.c, 0, copyOf2, i1Var.a, i1Var2.a);
            i1Var = new i1(i10, copyOf, copyOf2, true);
        }
        wVar.unknownFields = i1Var;
    }

    public static boolean x(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void y(int i10, List list, k0 k0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        j jVar = (j) k0Var.a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                jVar.F(i10, ((Boolean) list.get(i11)).booleanValue());
                i11++;
            }
            return;
        }
        jVar.R(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Boolean) list.get(i13)).getClass();
            Logger logger = j.h;
            i12++;
        }
        jVar.T(i12);
        while (i11 < list.size()) {
            jVar.D(((Boolean) list.get(i11)).booleanValue() ? (byte) 1 : (byte) 0);
            i11++;
        }
    }

    public static void z(int i10, List list, k0 k0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        k0Var.getClass();
        for (int i11 = 0; i11 < list.size(); i11++) {
            ((j) k0Var.a).G(i10, (g) list.get(i11));
        }
    }
}
