package androidx.datastore.preferences.protobuf;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public abstract class c1 {
    public static final Class a;
    public static final i1 b;
    public static final i1 c;

    static {
        Class<?> cls;
        Class<?> cls2;
        y0 y0Var = y0.c;
        i1 i1Var = null;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        a = cls;
        try {
            y0 y0Var2 = y0.c;
            try {
                cls2 = Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
            } catch (Throwable unused2) {
                cls2 = null;
            }
            if (cls2 != null) {
                i1Var = (i1) cls2.getConstructor(null).newInstance(null);
            }
        } catch (Throwable unused3) {
        }
        b = i1Var;
        c = new i1();
    }

    public static int a(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof a0) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i7 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            i7 += m.k(((Integer) list.get(i10)).intValue());
        }
        return i7;
    }

    public static int b(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (m.i(i7) + 4) * size;
    }

    public static int c(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (m.i(i7) + 8) * size;
    }

    public static int d(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof a0) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i7 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            i7 += m.k(((Integer) list.get(i10)).intValue());
        }
        return i7;
    }

    public static int e(List list) {
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
        int i7 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            i7 += m.k(((Long) list.get(i10)).longValue());
        }
        return i7;
    }

    public static int f(List list) {
        int size = list.size();
        if (size != 0) {
            if (!(list instanceof a0)) {
                int i7 = 0;
                for (int i10 = 0; i10 < size; i10++) {
                    int intValue = ((Integer) list.get(i10)).intValue();
                    i7 += m.j((intValue >> 31) ^ (intValue << 1));
                }
                return i7;
            }
            if (size > 0) {
                throw null;
            }
        }
        return 0;
    }

    public static int g(List list) {
        int size = list.size();
        if (size != 0) {
            if (!(list instanceof j0)) {
                int i7 = 0;
                for (int i10 = 0; i10 < size; i10++) {
                    long longValue = ((Long) list.get(i10)).longValue();
                    i7 += m.k((longValue >> 63) ^ (longValue << 1));
                }
                return i7;
            }
            if (size > 0) {
                throw null;
            }
        }
        return 0;
    }

    public static int h(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof a0) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i7 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            i7 += m.j(((Integer) list.get(i10)).intValue());
        }
        return i7;
    }

    public static int i(List list) {
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
        int i7 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            i7 += m.k(((Long) list.get(i10)).longValue());
        }
        return i7;
    }

    public static void k(i1 i1Var, Object obj, Object obj2) {
        i1Var.getClass();
        z zVar = (z) obj;
        h1 h1Var = zVar.unknownFields;
        h1 h1Var2 = ((z) obj2).unknownFields;
        h1 h1Var3 = h1.f;
        if (!h1Var3.equals(h1Var2)) {
            if (h1Var3.equals(h1Var)) {
                int i7 = h1Var.a + h1Var2.a;
                int[] copyOf = Arrays.copyOf(h1Var.b, i7);
                System.arraycopy(h1Var2.b, 0, copyOf, h1Var.a, h1Var2.a);
                Object[] copyOf2 = Arrays.copyOf(h1Var.c, i7);
                System.arraycopy(h1Var2.c, 0, copyOf2, h1Var.a, h1Var2.a);
                h1Var = new h1(i7, copyOf, copyOf2, true);
            } else {
                h1Var.getClass();
                if (!h1Var2.equals(h1Var3)) {
                    if (!h1Var.e) {
                        throw new UnsupportedOperationException();
                    }
                    int i10 = h1Var.a + h1Var2.a;
                    h1Var.a(i10);
                    System.arraycopy(h1Var2.b, 0, h1Var.b, h1Var.a, h1Var2.a);
                    System.arraycopy(h1Var2.c, 0, h1Var.c, h1Var.a, h1Var2.a);
                    h1Var.a = i10;
                }
            }
        }
        zVar.unknownFields = h1Var;
    }

    public static boolean l(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void m(int i7, List list, l0 l0Var, boolean z9) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m mVar = (m) l0Var.a;
        if (list instanceof d) {
            throw new ClassCastException();
        }
        int i10 = 0;
        if (!z9) {
            while (i10 < list.size()) {
                mVar.p(i7, ((Boolean) list.get(i10)).booleanValue());
                i10++;
            }
            return;
        }
        mVar.B(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Boolean) list.get(i12)).getClass();
            Logger logger = m.f;
            i11++;
        }
        mVar.D(i11);
        while (i10 < list.size()) {
            mVar.n(((Boolean) list.get(i10)).booleanValue() ? (byte) 1 : (byte) 0);
            i10++;
        }
    }

    public static void n(int i7, List list, l0 l0Var, boolean z9) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m mVar = (m) l0Var.a;
        if (list instanceof n) {
            throw new ClassCastException();
        }
        int i10 = 0;
        if (!z9) {
            while (i10 < list.size()) {
                double doubleValue = ((Double) list.get(i10)).doubleValue();
                mVar.getClass();
                mVar.u(i7, Double.doubleToRawLongBits(doubleValue));
                i10++;
            }
            return;
        }
        mVar.B(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Double) list.get(i12)).getClass();
            Logger logger = m.f;
            i11 += 8;
        }
        mVar.D(i11);
        while (i10 < list.size()) {
            mVar.v(Double.doubleToRawLongBits(((Double) list.get(i10)).doubleValue()));
            i10++;
        }
    }

    public static void o(int i7, List list, l0 l0Var, boolean z9) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m mVar = (m) l0Var.a;
        if (list instanceof a0) {
            throw new ClassCastException();
        }
        int i10 = 0;
        if (!z9) {
            while (i10 < list.size()) {
                mVar.w(i7, ((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        mVar.B(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            i11 += m.k(((Integer) list.get(i12)).intValue());
        }
        mVar.D(i11);
        while (i10 < list.size()) {
            mVar.x(((Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    public static void p(int i7, List list, l0 l0Var, boolean z9) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m mVar = (m) l0Var.a;
        if (list instanceof a0) {
            throw new ClassCastException();
        }
        int i10 = 0;
        if (!z9) {
            while (i10 < list.size()) {
                mVar.s(i7, ((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        mVar.B(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Integer) list.get(i12)).getClass();
            Logger logger = m.f;
            i11 += 4;
        }
        mVar.D(i11);
        while (i10 < list.size()) {
            mVar.t(((Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    public static void q(int i7, List list, l0 l0Var, boolean z9) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m mVar = (m) l0Var.a;
        if (list instanceof j0) {
            throw new ClassCastException();
        }
        int i10 = 0;
        if (!z9) {
            while (i10 < list.size()) {
                mVar.u(i7, ((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        mVar.B(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Long) list.get(i12)).getClass();
            Logger logger = m.f;
            i11 += 8;
        }
        mVar.D(i11);
        while (i10 < list.size()) {
            mVar.v(((Long) list.get(i10)).longValue());
            i10++;
        }
    }

    public static void r(int i7, List list, l0 l0Var, boolean z9) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m mVar = (m) l0Var.a;
        if (list instanceof v) {
            throw new ClassCastException();
        }
        int i10 = 0;
        if (!z9) {
            while (i10 < list.size()) {
                float floatValue = ((Float) list.get(i10)).floatValue();
                mVar.getClass();
                mVar.s(i7, Float.floatToRawIntBits(floatValue));
                i10++;
            }
            return;
        }
        mVar.B(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Float) list.get(i12)).getClass();
            Logger logger = m.f;
            i11 += 4;
        }
        mVar.D(i11);
        while (i10 < list.size()) {
            mVar.t(Float.floatToRawIntBits(((Float) list.get(i10)).floatValue()));
            i10++;
        }
    }

    public static void s(int i7, List list, l0 l0Var, boolean z9) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m mVar = (m) l0Var.a;
        if (list instanceof a0) {
            throw new ClassCastException();
        }
        int i10 = 0;
        if (!z9) {
            while (i10 < list.size()) {
                mVar.w(i7, ((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        mVar.B(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            i11 += m.k(((Integer) list.get(i12)).intValue());
        }
        mVar.D(i11);
        while (i10 < list.size()) {
            mVar.x(((Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    public static void t(int i7, List list, l0 l0Var, boolean z9) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m mVar = (m) l0Var.a;
        if (list instanceof j0) {
            throw new ClassCastException();
        }
        int i10 = 0;
        if (!z9) {
            while (i10 < list.size()) {
                mVar.E(i7, ((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        mVar.B(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            i11 += m.k(((Long) list.get(i12)).longValue());
        }
        mVar.D(i11);
        while (i10 < list.size()) {
            mVar.F(((Long) list.get(i10)).longValue());
            i10++;
        }
    }

    public static void u(int i7, List list, l0 l0Var, boolean z9) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m mVar = (m) l0Var.a;
        if (list instanceof a0) {
            throw new ClassCastException();
        }
        int i10 = 0;
        if (!z9) {
            while (i10 < list.size()) {
                mVar.s(i7, ((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        mVar.B(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Integer) list.get(i12)).getClass();
            Logger logger = m.f;
            i11 += 4;
        }
        mVar.D(i11);
        while (i10 < list.size()) {
            mVar.t(((Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    public static void v(int i7, List list, l0 l0Var, boolean z9) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m mVar = (m) l0Var.a;
        if (list instanceof j0) {
            throw new ClassCastException();
        }
        int i10 = 0;
        if (!z9) {
            while (i10 < list.size()) {
                mVar.u(i7, ((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        mVar.B(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Long) list.get(i12)).getClass();
            Logger logger = m.f;
            i11 += 8;
        }
        mVar.D(i11);
        while (i10 < list.size()) {
            mVar.v(((Long) list.get(i10)).longValue());
            i10++;
        }
    }

    public static void w(int i7, List list, l0 l0Var, boolean z9) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m mVar = (m) l0Var.a;
        if (list instanceof a0) {
            throw new ClassCastException();
        }
        int i10 = 0;
        if (!z9) {
            while (i10 < list.size()) {
                int intValue = ((Integer) list.get(i10)).intValue();
                mVar.C(i7, (intValue >> 31) ^ (intValue << 1));
                i10++;
            }
            return;
        }
        mVar.B(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            int intValue2 = ((Integer) list.get(i12)).intValue();
            i11 += m.j((intValue2 >> 31) ^ (intValue2 << 1));
        }
        mVar.D(i11);
        while (i10 < list.size()) {
            int intValue3 = ((Integer) list.get(i10)).intValue();
            mVar.D((intValue3 >> 31) ^ (intValue3 << 1));
            i10++;
        }
    }

    public static void x(int i7, List list, l0 l0Var, boolean z9) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m mVar = (m) l0Var.a;
        if (list instanceof j0) {
            throw new ClassCastException();
        }
        int i10 = 0;
        if (!z9) {
            while (i10 < list.size()) {
                long longValue = ((Long) list.get(i10)).longValue();
                mVar.E(i7, (longValue >> 63) ^ (longValue << 1));
                i10++;
            }
            return;
        }
        mVar.B(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            long longValue2 = ((Long) list.get(i12)).longValue();
            i11 += m.k((longValue2 >> 63) ^ (longValue2 << 1));
        }
        mVar.D(i11);
        while (i10 < list.size()) {
            long longValue3 = ((Long) list.get(i10)).longValue();
            mVar.F((longValue3 >> 63) ^ (longValue3 << 1));
            i10++;
        }
    }

    public static void y(int i7, List list, l0 l0Var, boolean z9) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m mVar = (m) l0Var.a;
        if (list instanceof a0) {
            throw new ClassCastException();
        }
        int i10 = 0;
        if (!z9) {
            while (i10 < list.size()) {
                mVar.C(i7, ((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        mVar.B(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            i11 += m.j(((Integer) list.get(i12)).intValue());
        }
        mVar.D(i11);
        while (i10 < list.size()) {
            mVar.D(((Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    public static void z(int i7, List list, l0 l0Var, boolean z9) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m mVar = (m) l0Var.a;
        if (list instanceof j0) {
            throw new ClassCastException();
        }
        int i10 = 0;
        if (!z9) {
            while (i10 < list.size()) {
                mVar.E(i7, ((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        mVar.B(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            i11 += m.k(((Long) list.get(i12)).longValue());
        }
        mVar.D(i11);
        while (i10 < list.size()) {
            mVar.F(((Long) list.get(i10)).longValue());
            i10++;
        }
    }

    public static Object j(Object obj, int i7, b0 b0Var, Object obj2, i1 i1Var) {
        return obj2;
    }
}
