// default package

import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public abstract class iu9 {
    public static final Class a;
    public static final t9c b;
    public static final t9c c;

    static {
        Class<?> cls;
        Class<?> cls2;
        ow8 ow8Var = ow8.c;
        t9c t9cVar = null;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        a = cls;
        try {
            ow8 ow8Var2 = ow8.c;
            try {
                cls2 = Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
            } catch (Throwable unused2) {
                cls2 = null;
            }
            if (cls2 != null) {
                t9cVar = (t9c) cls2.getConstructor(null).newInstance(null);
            }
        } catch (Throwable unused3) {
        }
        b = t9cVar;
        c = new t9c();
    }

    public static int a(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof fr5) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += xk2.i(((Integer) list.get(i2)).intValue());
        }
        return i;
    }

    public static int b(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (xk2.g(i) + 4) * size;
    }

    public static int c(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (xk2.g(i) + 8) * size;
    }

    public static int d(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof fr5) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += xk2.i(((Integer) list.get(i2)).intValue());
        }
        return i;
    }

    public static int e(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof uh6) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += xk2.i(((Long) list.get(i2)).longValue());
        }
        return i;
    }

    public static int f(List list) {
        int size = list.size();
        if (size != 0) {
            if (!(list instanceof fr5)) {
                int i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    int intValue = ((Integer) list.get(i2)).intValue();
                    i += xk2.h((intValue << 1) ^ (intValue >> 31));
                }
                return i;
            }
            bs2.u(list);
            if (size > 0) {
                throw null;
            }
        }
        return 0;
    }

    public static int g(List list) {
        int size = list.size();
        if (size != 0) {
            if (!(list instanceof uh6)) {
                int i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    long longValue = ((Long) list.get(i2)).longValue();
                    i += xk2.i((longValue << 1) ^ (longValue >> 63));
                }
                return i;
            }
            bs2.u(list);
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
        if (list instanceof fr5) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += xk2.h(((Integer) list.get(i2)).intValue());
        }
        return i;
    }

    public static int i(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof uh6) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += xk2.i(((Long) list.get(i2)).longValue());
        }
        return i;
    }

    public static void k(t9c t9cVar, Object obj, Object obj2) {
        t9cVar.getClass();
        ju4 ju4Var = (ju4) obj;
        s9c s9cVar = ju4Var.unknownFields;
        s9c s9cVar2 = ((ju4) obj2).unknownFields;
        s9c s9cVar3 = s9c.f;
        if (!s9cVar3.equals(s9cVar2)) {
            if (s9cVar3.equals(s9cVar)) {
                int i = s9cVar.a + s9cVar2.a;
                int[] copyOf = Arrays.copyOf(s9cVar.b, i);
                System.arraycopy(s9cVar2.b, 0, copyOf, s9cVar.a, s9cVar2.a);
                Object[] copyOf2 = Arrays.copyOf(s9cVar.c, i);
                System.arraycopy(s9cVar2.c, 0, copyOf2, s9cVar.a, s9cVar2.a);
                s9cVar = new s9c(i, copyOf, copyOf2, true);
            } else {
                s9cVar.getClass();
                if (!s9cVar2.equals(s9cVar3)) {
                    if (!s9cVar.e) {
                        p3d.a();
                        return;
                    }
                    int i2 = s9cVar.a + s9cVar2.a;
                    s9cVar.a(i2);
                    System.arraycopy(s9cVar2.b, 0, s9cVar.b, s9cVar.a, s9cVar2.a);
                    System.arraycopy(s9cVar2.c, 0, s9cVar.c, s9cVar.a, s9cVar2.a);
                    s9cVar.a = i2;
                }
            }
        }
        ju4Var.unknownFields = s9cVar;
    }

    public static boolean l(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void m(int i, List list, z8d z8dVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        xk2 xk2Var = (xk2) z8dVar.b;
        if (list instanceof gm0) {
            grb.o();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                xk2Var.n(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        xk2Var.A(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).getClass();
            i3++;
        }
        xk2Var.C(i3);
        while (i2 < list.size()) {
            xk2Var.l(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public static void n(int i, List list, z8d z8dVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        xk2 xk2Var = (xk2) z8dVar.b;
        if (list instanceof op3) {
            grb.o();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                xk2Var.s(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        xk2Var.A(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            i3 += 8;
        }
        xk2Var.C(i3);
        while (i2 < list.size()) {
            xk2Var.t(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    public static void o(int i, List list, z8d z8dVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        xk2 xk2Var = (xk2) z8dVar.b;
        if (list instanceof fr5) {
            grb.o();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                xk2Var.u(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        xk2Var.A(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += xk2.i(((Integer) list.get(i4)).intValue());
        }
        xk2Var.C(i3);
        while (i2 < list.size()) {
            xk2Var.v(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void p(int i, List list, z8d z8dVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        xk2 xk2Var = (xk2) z8dVar.b;
        if (list instanceof fr5) {
            grb.o();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                xk2Var.q(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        xk2Var.A(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            i3 += 4;
        }
        xk2Var.C(i3);
        while (i2 < list.size()) {
            xk2Var.r(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void q(int i, List list, z8d z8dVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        xk2 xk2Var = (xk2) z8dVar.b;
        if (list instanceof uh6) {
            grb.o();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                xk2Var.s(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        xk2Var.A(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            i3 += 8;
        }
        xk2Var.C(i3);
        while (i2 < list.size()) {
            xk2Var.t(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void r(int i, List list, z8d z8dVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        xk2 xk2Var = (xk2) z8dVar.b;
        if (list instanceof uk4) {
            grb.o();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                xk2Var.q(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        xk2Var.A(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).getClass();
            i3 += 4;
        }
        xk2Var.C(i3);
        while (i2 < list.size()) {
            xk2Var.r(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    public static void s(int i, List list, z8d z8dVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        xk2 xk2Var = (xk2) z8dVar.b;
        if (list instanceof fr5) {
            grb.o();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                xk2Var.u(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        xk2Var.A(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += xk2.i(((Integer) list.get(i4)).intValue());
        }
        xk2Var.C(i3);
        while (i2 < list.size()) {
            xk2Var.v(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void t(int i, List list, z8d z8dVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        xk2 xk2Var = (xk2) z8dVar.b;
        if (list instanceof uh6) {
            grb.o();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                xk2Var.D(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        xk2Var.A(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += xk2.i(((Long) list.get(i4)).longValue());
        }
        xk2Var.C(i3);
        while (i2 < list.size()) {
            xk2Var.E(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void u(int i, List list, z8d z8dVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        xk2 xk2Var = (xk2) z8dVar.b;
        if (list instanceof fr5) {
            grb.o();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                xk2Var.q(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        xk2Var.A(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            i3 += 4;
        }
        xk2Var.C(i3);
        while (i2 < list.size()) {
            xk2Var.r(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void v(int i, List list, z8d z8dVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        xk2 xk2Var = (xk2) z8dVar.b;
        if (list instanceof uh6) {
            grb.o();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                xk2Var.s(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        xk2Var.A(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            i3 += 8;
        }
        xk2Var.C(i3);
        while (i2 < list.size()) {
            xk2Var.t(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void w(int i, List list, z8d z8dVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        xk2 xk2Var = (xk2) z8dVar.b;
        if (list instanceof fr5) {
            grb.o();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                int intValue = ((Integer) list.get(i2)).intValue();
                xk2Var.B(i, (intValue << 1) ^ (intValue >> 31));
                i2++;
            }
            return;
        }
        xk2Var.A(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            int intValue2 = ((Integer) list.get(i4)).intValue();
            i3 += xk2.h((intValue2 << 1) ^ (intValue2 >> 31));
        }
        xk2Var.C(i3);
        while (i2 < list.size()) {
            int intValue3 = ((Integer) list.get(i2)).intValue();
            xk2Var.C((intValue3 << 1) ^ (intValue3 >> 31));
            i2++;
        }
    }

    public static void x(int i, List list, z8d z8dVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        xk2 xk2Var = (xk2) z8dVar.b;
        if (list instanceof uh6) {
            grb.o();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                long longValue = ((Long) list.get(i2)).longValue();
                xk2Var.D(i, (longValue << 1) ^ (longValue >> 63));
                i2++;
            }
            return;
        }
        xk2Var.A(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            long longValue2 = ((Long) list.get(i4)).longValue();
            i3 += xk2.i((longValue2 << 1) ^ (longValue2 >> 63));
        }
        xk2Var.C(i3);
        while (i2 < list.size()) {
            long longValue3 = ((Long) list.get(i2)).longValue();
            xk2Var.E((longValue3 << 1) ^ (longValue3 >> 63));
            i2++;
        }
    }

    public static void y(int i, List list, z8d z8dVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        xk2 xk2Var = (xk2) z8dVar.b;
        if (list instanceof fr5) {
            grb.o();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                xk2Var.B(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        xk2Var.A(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += xk2.h(((Integer) list.get(i4)).intValue());
        }
        xk2Var.C(i3);
        while (i2 < list.size()) {
            xk2Var.C(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void z(int i, List list, z8d z8dVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        xk2 xk2Var = (xk2) z8dVar.b;
        if (list instanceof uh6) {
            grb.o();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                xk2Var.D(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        xk2Var.A(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += xk2.i(((Long) list.get(i4)).longValue());
        }
        xk2Var.C(i3);
        while (i2 < list.size()) {
            xk2Var.E(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static Object j(Object obj, int i, or5 or5Var, Object obj2, t9c t9cVar) {
        return obj2;
    }
}
