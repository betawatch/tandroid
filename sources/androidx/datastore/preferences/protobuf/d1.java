package androidx.datastore.preferences.protobuf;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class d1 {
    public static final Class a;
    public static final k1 b;
    public static final k1 c;
    public static final k1 d;

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
        d = new k1();
    }

    public static void A(int i9, List list, l0 l0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        k kVar = (k) l0Var.a;
        int i10 = 0;
        if (!z10) {
            while (i10 < list.size()) {
                double doubleValue = ((Double) list.get(i10)).doubleValue();
                kVar.getClass();
                kVar.K(i9, Double.doubleToRawLongBits(doubleValue));
                i10++;
            }
            return;
        }
        kVar.R(i9, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Double) list.get(i12)).getClass();
            Logger logger = k.h;
            i11 += 8;
        }
        kVar.T(i11);
        while (i10 < list.size()) {
            kVar.L(Double.doubleToRawLongBits(((Double) list.get(i10)).doubleValue()));
            i10++;
        }
    }

    public static void B(int i9, List list, l0 l0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        k kVar = (k) l0Var.a;
        int i10 = 0;
        if (!z10) {
            while (i10 < list.size()) {
                kVar.M(i9, ((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        kVar.R(i9, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            i11 += k.w(((Integer) list.get(i12)).intValue());
        }
        kVar.T(i11);
        while (i10 < list.size()) {
            kVar.N(((Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    public static void C(int i9, List list, l0 l0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        k kVar = (k) l0Var.a;
        int i10 = 0;
        if (!z10) {
            while (i10 < list.size()) {
                kVar.I(i9, ((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        kVar.R(i9, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Integer) list.get(i12)).getClass();
            Logger logger = k.h;
            i11 += 4;
        }
        kVar.T(i11);
        while (i10 < list.size()) {
            kVar.J(((Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    public static void D(int i9, List list, l0 l0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        k kVar = (k) l0Var.a;
        int i10 = 0;
        if (!z10) {
            while (i10 < list.size()) {
                kVar.K(i9, ((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        kVar.R(i9, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Long) list.get(i12)).getClass();
            Logger logger = k.h;
            i11 += 8;
        }
        kVar.T(i11);
        while (i10 < list.size()) {
            kVar.L(((Long) list.get(i10)).longValue());
            i10++;
        }
    }

    public static void E(int i9, List list, l0 l0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        k kVar = (k) l0Var.a;
        int i10 = 0;
        if (!z10) {
            while (i10 < list.size()) {
                float floatValue = ((Float) list.get(i10)).floatValue();
                kVar.getClass();
                kVar.I(i9, Float.floatToRawIntBits(floatValue));
                i10++;
            }
            return;
        }
        kVar.R(i9, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Float) list.get(i12)).getClass();
            Logger logger = k.h;
            i11 += 4;
        }
        kVar.T(i11);
        while (i10 < list.size()) {
            kVar.J(Float.floatToRawIntBits(((Float) list.get(i10)).floatValue()));
            i10++;
        }
    }

    public static void F(int i9, List list, l0 l0Var, c1 c1Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l0Var.getClass();
        for (int i10 = 0; i10 < list.size(); i10++) {
            l0Var.b(i9, list.get(i10), c1Var);
        }
    }

    public static void G(int i9, List list, l0 l0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        k kVar = (k) l0Var.a;
        int i10 = 0;
        if (!z10) {
            while (i10 < list.size()) {
                kVar.M(i9, ((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        kVar.R(i9, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            i11 += k.w(((Integer) list.get(i12)).intValue());
        }
        kVar.T(i11);
        while (i10 < list.size()) {
            kVar.N(((Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    public static void H(int i9, List list, l0 l0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        k kVar = (k) l0Var.a;
        int i10 = 0;
        if (!z10) {
            while (i10 < list.size()) {
                kVar.U(i9, ((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        kVar.R(i9, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            i11 += k.A(((Long) list.get(i12)).longValue());
        }
        kVar.T(i11);
        while (i10 < list.size()) {
            kVar.V(((Long) list.get(i10)).longValue());
            i10++;
        }
    }

    public static void I(int i9, List list, l0 l0Var, c1 c1Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l0Var.getClass();
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((k) l0Var.a).O(i9, (a) list.get(i10), c1Var);
        }
    }

    public static void J(int i9, List list, l0 l0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        k kVar = (k) l0Var.a;
        int i10 = 0;
        if (!z10) {
            while (i10 < list.size()) {
                kVar.I(i9, ((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        kVar.R(i9, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Integer) list.get(i12)).getClass();
            Logger logger = k.h;
            i11 += 4;
        }
        kVar.T(i11);
        while (i10 < list.size()) {
            kVar.J(((Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    public static void K(int i9, List list, l0 l0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        k kVar = (k) l0Var.a;
        int i10 = 0;
        if (!z10) {
            while (i10 < list.size()) {
                kVar.K(i9, ((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        kVar.R(i9, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Long) list.get(i12)).getClass();
            Logger logger = k.h;
            i11 += 8;
        }
        kVar.T(i11);
        while (i10 < list.size()) {
            kVar.L(((Long) list.get(i10)).longValue());
            i10++;
        }
    }

    public static void L(int i9, List list, l0 l0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        k kVar = (k) l0Var.a;
        int i10 = 0;
        if (!z10) {
            while (i10 < list.size()) {
                int intValue = ((Integer) list.get(i10)).intValue();
                kVar.S(i9, (intValue >> 31) ^ (intValue << 1));
                i10++;
            }
            return;
        }
        kVar.R(i9, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            int intValue2 = ((Integer) list.get(i12)).intValue();
            i11 += k.z((intValue2 >> 31) ^ (intValue2 << 1));
        }
        kVar.T(i11);
        while (i10 < list.size()) {
            int intValue3 = ((Integer) list.get(i10)).intValue();
            kVar.T((intValue3 >> 31) ^ (intValue3 << 1));
            i10++;
        }
    }

    public static void M(int i9, List list, l0 l0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        k kVar = (k) l0Var.a;
        int i10 = 0;
        if (!z10) {
            while (i10 < list.size()) {
                long longValue = ((Long) list.get(i10)).longValue();
                kVar.U(i9, (longValue >> 63) ^ (longValue << 1));
                i10++;
            }
            return;
        }
        kVar.R(i9, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            long longValue2 = ((Long) list.get(i12)).longValue();
            i11 += k.A((longValue2 >> 63) ^ (longValue2 << 1));
        }
        kVar.T(i11);
        while (i10 < list.size()) {
            long longValue3 = ((Long) list.get(i10)).longValue();
            kVar.V((longValue3 >> 63) ^ (longValue3 << 1));
            i10++;
        }
    }

    public static void N(int i9, List list, l0 l0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        k kVar = (k) l0Var.a;
        int i10 = 0;
        if (!(list instanceof f0)) {
            while (i10 < list.size()) {
                kVar.P(i9, (String) list.get(i10));
                i10++;
            }
            return;
        }
        f0 f0Var = (f0) list;
        while (i10 < list.size()) {
            Object l10 = f0Var.l(i10);
            if (l10 instanceof String) {
                kVar.P(i9, (String) l10);
            } else {
                kVar.G(i9, (g) l10);
            }
            i10++;
        }
    }

    public static void O(int i9, List list, l0 l0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        k kVar = (k) l0Var.a;
        int i10 = 0;
        if (!z10) {
            while (i10 < list.size()) {
                kVar.S(i9, ((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        kVar.R(i9, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            i11 += k.z(((Integer) list.get(i12)).intValue());
        }
        kVar.T(i11);
        while (i10 < list.size()) {
            kVar.T(((Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    public static void P(int i9, List list, l0 l0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        k kVar = (k) l0Var.a;
        int i10 = 0;
        if (!z10) {
            while (i10 < list.size()) {
                kVar.U(i9, ((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        kVar.R(i9, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            i11 += k.A(((Long) list.get(i12)).longValue());
        }
        kVar.T(i11);
        while (i10 < list.size()) {
            kVar.V(((Long) list.get(i10)).longValue());
            i10++;
        }
    }

    public static int a(int i9, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int y10 = k.y(i9) * size;
        for (int i10 = 0; i10 < list.size(); i10++) {
            y10 += k.s((g) list.get(i10));
        }
        return y10;
    }

    public static int b(int i9, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (k.y(i9) * size) + c(list);
    }

    public static int c(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof y) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i9 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            i9 += k.w(((Integer) list.get(i10)).intValue());
        }
        return i9;
    }

    public static int d(int i9, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return k.t(i9) * size;
    }

    public static int e(List list) {
        return list.size() * 4;
    }

    public static int f(int i9, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return k.u(i9) * size;
    }

    public static int g(List list) {
        return list.size() * 8;
    }

    public static int h(int i9, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (k.y(i9) * size) + i(list);
    }

    public static int i(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof y) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i9 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            i9 += k.w(((Integer) list.get(i10)).intValue());
        }
        return i9;
    }

    public static int j(int i9, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (k.y(i9) * list.size()) + k(list);
    }

    public static int k(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof j0) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i9 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            i9 += k.A(((Long) list.get(i10)).longValue());
        }
        return i9;
    }

    public static int l(int i9, List list, c1 c1Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int y10 = k.y(i9) * size;
        for (int i10 = 0; i10 < size; i10++) {
            int b10 = ((a) list.get(i10)).b(c1Var);
            y10 += k.z(b10) + b10;
        }
        return y10;
    }

    public static int m(int i9, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (k.y(i9) * size) + n(list);
    }

    public static int n(List list) {
        int size = list.size();
        if (size != 0) {
            if (!(list instanceof y)) {
                int i9 = 0;
                for (int i10 = 0; i10 < size; i10++) {
                    int intValue = ((Integer) list.get(i10)).intValue();
                    i9 += k.z((intValue >> 31) ^ (intValue << 1));
                }
                return i9;
            }
            if (size > 0) {
                throw null;
            }
        }
        return 0;
    }

    public static int o(int i9, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (k.y(i9) * size) + p(list);
    }

    public static int p(List list) {
        int size = list.size();
        if (size != 0) {
            if (!(list instanceof j0)) {
                int i9 = 0;
                for (int i10 = 0; i10 < size; i10++) {
                    long longValue = ((Long) list.get(i10)).longValue();
                    i9 += k.A((longValue >> 63) ^ (longValue << 1));
                }
                return i9;
            }
            if (size > 0) {
                throw null;
            }
        }
        return 0;
    }

    public static int q(int i9, List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        int y10 = k.y(i9) * size;
        if (!(list instanceof f0)) {
            while (i10 < size) {
                Object obj = list.get(i10);
                if (obj instanceof g) {
                    int size2 = ((g) obj).size();
                    y10 = k.z(size2) + size2 + y10;
                } else {
                    y10 = k.x((String) obj) + y10;
                }
                i10++;
            }
            return y10;
        }
        f0 f0Var = (f0) list;
        while (i10 < size) {
            Object l10 = f0Var.l(i10);
            if (l10 instanceof g) {
                int size3 = ((g) l10).size();
                y10 = k.z(size3) + size3 + y10;
            } else {
                y10 = k.x((String) l10) + y10;
            }
            i10++;
        }
        return y10;
    }

    public static int r(int i9, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (k.y(i9) * size) + s(list);
    }

    public static int s(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof y) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i9 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            i9 += k.z(((Integer) list.get(i10)).intValue());
        }
        return i9;
    }

    public static int t(int i9, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (k.y(i9) * size) + u(list);
    }

    public static int u(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof j0) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i9 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            i9 += k.A(((Long) list.get(i10)).longValue());
        }
        return i9;
    }

    public static k1 v(boolean z10) {
        Class<?> cls;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls != null) {
            try {
                return (k1) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z10));
            } catch (Throwable unused2) {
            }
        }
        return null;
    }

    public static void w(k1 k1Var, Object obj, Object obj2) {
        k1Var.getClass();
        x xVar = (x) obj;
        j1 j1Var = xVar.unknownFields;
        j1 j1Var2 = ((x) obj2).unknownFields;
        if (!j1Var2.equals(j1.f)) {
            int i9 = j1Var.a + j1Var2.a;
            int[] copyOf = Arrays.copyOf(j1Var.b, i9);
            System.arraycopy(j1Var2.b, 0, copyOf, j1Var.a, j1Var2.a);
            Object[] copyOf2 = Arrays.copyOf(j1Var.c, i9);
            System.arraycopy(j1Var2.c, 0, copyOf2, j1Var.a, j1Var2.a);
            j1Var = new j1(i9, copyOf, copyOf2, true);
        }
        xVar.unknownFields = j1Var;
    }

    public static boolean x(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void y(int i9, List list, l0 l0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        k kVar = (k) l0Var.a;
        int i10 = 0;
        if (!z10) {
            while (i10 < list.size()) {
                kVar.F(i9, ((Boolean) list.get(i10)).booleanValue());
                i10++;
            }
            return;
        }
        kVar.R(i9, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Boolean) list.get(i12)).getClass();
            Logger logger = k.h;
            i11++;
        }
        kVar.T(i11);
        while (i10 < list.size()) {
            kVar.D(((Boolean) list.get(i10)).booleanValue() ? (byte) 1 : (byte) 0);
            i10++;
        }
    }

    public static void z(int i9, List list, l0 l0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l0Var.getClass();
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((k) l0Var.a).G(i9, (g) list.get(i10));
        }
    }
}
