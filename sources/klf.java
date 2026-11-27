// default package

import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public abstract class klf {
    public static final Class a;
    public static final tlf b;
    public static final tlf c;

    static {
        Class<?> cls;
        Class<?> cls2;
        tlf tlfVar = null;
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
                tlfVar = (tlf) cls2.getConstructor(null).newInstance(null);
            } catch (Throwable unused3) {
            }
        }
        b = tlfVar;
        c = new tlf();
    }

    public static void a(int i, List list, oqd oqdVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        xif xifVar = (xif) oqdVar.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                int intValue = ((Integer) list.get(i2)).intValue();
                xifVar.j(i << 3);
                xifVar.j((intValue << 1) ^ (intValue >> 31));
                i2++;
            }
            return;
        }
        xifVar.i(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            int intValue2 = ((Integer) list.get(i4)).intValue();
            i3 += xif.o((intValue2 << 1) ^ (intValue2 >> 31));
        }
        xifVar.j(i3);
        while (i2 < list.size()) {
            int intValue3 = ((Integer) list.get(i2)).intValue();
            xifVar.j((intValue3 << 1) ^ (intValue3 >> 31));
            i2++;
        }
    }

    public static void b(int i, List list, oqd oqdVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        xif xifVar = (xif) oqdVar.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                long longValue = ((Long) list.get(i2)).longValue();
                xifVar.k(i, (longValue << 1) ^ (longValue >> 63));
                i2++;
            }
            return;
        }
        xifVar.i(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            long longValue2 = ((Long) list.get(i4)).longValue();
            i3 += xif.p((longValue2 << 1) ^ (longValue2 >> 63));
        }
        xifVar.j(i3);
        while (i2 < list.size()) {
            long longValue3 = ((Long) list.get(i2)).longValue();
            xifVar.l((longValue3 << 1) ^ (longValue3 >> 63));
            i2++;
        }
    }

    public static void c(int i, List list, oqd oqdVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        xif xifVar = (xif) oqdVar.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                int intValue = ((Integer) list.get(i2)).intValue();
                xifVar.j(i << 3);
                xifVar.j(intValue);
                i2++;
            }
            return;
        }
        xifVar.i(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += xif.o(((Integer) list.get(i4)).intValue());
        }
        xifVar.j(i3);
        while (i2 < list.size()) {
            xifVar.j(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void d(int i, List list, oqd oqdVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        xif xifVar = (xif) oqdVar.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                xifVar.k(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        xifVar.i(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += xif.p(((Long) list.get(i4)).longValue());
        }
        xifVar.j(i3);
        while (i2 < list.size()) {
            xifVar.l(((Long) list.get(i2)).longValue());
            i2++;
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
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof mjf)) {
            int i2 = 0;
            while (i < size) {
                i2 += xif.m(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        mjf mjfVar = (mjf) list;
        int i3 = 0;
        while (i < size) {
            mjfVar.i(i);
            i3 += xif.m(mjfVar.b[i]);
            i++;
        }
        return i3;
    }

    public static int g(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (xif.o(i << 3) + 4) * size;
    }

    public static int h(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (xif.o(i << 3) + 8) * size;
    }

    public static int i(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof mjf)) {
            int i2 = 0;
            while (i < size) {
                i2 += xif.m(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        mjf mjfVar = (mjf) list;
        int i3 = 0;
        while (i < size) {
            mjfVar.i(i);
            i3 += xif.m(mjfVar.b[i]);
            i++;
        }
        return i3;
    }

    public static int j(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof pkf)) {
            int i2 = 0;
            while (i < size) {
                i2 += xif.p(((Long) list.get(i)).longValue());
                i++;
            }
            return i2;
        }
        pkf pkfVar = (pkf) list;
        int i3 = 0;
        while (i < size) {
            pkfVar.i(i);
            i3 += xif.p(pkfVar.b[i]);
            i++;
        }
        return i3;
    }

    public static int k(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof mjf)) {
            int i2 = 0;
            while (i < size) {
                int intValue = ((Integer) list.get(i)).intValue();
                i2 += xif.o((intValue << 1) ^ (intValue >> 31));
                i++;
            }
            return i2;
        }
        mjf mjfVar = (mjf) list;
        int i3 = 0;
        while (i < size) {
            mjfVar.i(i);
            int i4 = mjfVar.b[i];
            i3 += xif.o((i4 << 1) ^ (i4 >> 31));
            i++;
        }
        return i3;
    }

    public static int l(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof pkf)) {
            int i2 = 0;
            while (i < size) {
                long longValue = ((Long) list.get(i)).longValue();
                i2 += xif.p((longValue << 1) ^ (longValue >> 63));
                i++;
            }
            return i2;
        }
        pkf pkfVar = (pkf) list;
        int i3 = 0;
        while (i < size) {
            pkfVar.i(i);
            long j = pkfVar.b[i];
            i3 += xif.p((j << 1) ^ (j >> 63));
            i++;
        }
        return i3;
    }

    public static int m(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof mjf)) {
            int i2 = 0;
            while (i < size) {
                i2 += xif.o(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        mjf mjfVar = (mjf) list;
        int i3 = 0;
        while (i < size) {
            mjfVar.i(i);
            i3 += xif.o(mjfVar.b[i]);
            i++;
        }
        return i3;
    }

    public static int n(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof pkf)) {
            int i2 = 0;
            while (i < size) {
                i2 += xif.p(((Long) list.get(i)).longValue());
                i++;
            }
            return i2;
        }
        pkf pkfVar = (pkf) list;
        int i3 = 0;
        while (i < size) {
            pkfVar.i(i);
            i3 += xif.p(pkfVar.b[i]);
            i++;
        }
        return i3;
    }

    public static void o(tlf tlfVar, Object obj, Object obj2) {
        tlfVar.getClass();
        ljf ljfVar = (ljf) obj;
        slf slfVar = ljfVar.zzc;
        slf slfVar2 = ((ljf) obj2).zzc;
        slf slfVar3 = slf.e;
        if (!slfVar3.equals(slfVar2)) {
            if (slfVar3.equals(slfVar)) {
                slfVar.getClass();
                slfVar2.getClass();
                int[] copyOf = Arrays.copyOf(slfVar.a, 0);
                System.arraycopy(slfVar2.a, 0, copyOf, 0, 0);
                Object[] copyOf2 = Arrays.copyOf(slfVar.b, 0);
                System.arraycopy(slfVar2.b, 0, copyOf2, 0, 0);
                slfVar = new slf(copyOf, copyOf2, true);
            } else {
                slfVar.getClass();
                if (!slfVar2.equals(slfVar3)) {
                    if (!slfVar.d) {
                        p3d.a();
                        return;
                    } else {
                        System.arraycopy(slfVar2.a, 0, slfVar.a, 0, 0);
                        System.arraycopy(slfVar2.b, 0, slfVar.b, 0, 0);
                    }
                }
            }
        }
        ljfVar.zzc = slfVar;
    }

    public static void p(int i, List list, oqd oqdVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        xif xifVar = (xif) oqdVar.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                boolean booleanValue = ((Boolean) list.get(i2)).booleanValue();
                xifVar.j(i << 3);
                xifVar.a(booleanValue ? (byte) 1 : (byte) 0);
                i2++;
            }
            return;
        }
        xifVar.i(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).getClass();
            i3++;
        }
        xifVar.j(i3);
        while (i2 < list.size()) {
            xifVar.a(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public static void q(int i, List list, oqd oqdVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        xif xifVar = (xif) oqdVar.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                xifVar.f(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        xifVar.i(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            i3 += 8;
        }
        xifVar.j(i3);
        while (i2 < list.size()) {
            xifVar.g(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    public static void r(int i, List list, oqd oqdVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        xif xifVar = (xif) oqdVar.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                int intValue = ((Integer) list.get(i2)).intValue();
                xifVar.j(i << 3);
                if (intValue >= 0) {
                    xifVar.j(intValue);
                } else {
                    xifVar.l(intValue);
                }
                i2++;
            }
            return;
        }
        xifVar.i(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += xif.m(((Integer) list.get(i4)).intValue());
        }
        xifVar.j(i3);
        while (i2 < list.size()) {
            int intValue2 = ((Integer) list.get(i2)).intValue();
            if (intValue2 >= 0) {
                xifVar.j(intValue2);
            } else {
                xifVar.l(intValue2);
            }
            i2++;
        }
    }

    public static void s(int i, List list, oqd oqdVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        xif xifVar = (xif) oqdVar.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                xifVar.d(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        xifVar.i(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            i3 += 4;
        }
        xifVar.j(i3);
        while (i2 < list.size()) {
            xifVar.e(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void t(int i, List list, oqd oqdVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        xif xifVar = (xif) oqdVar.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                xifVar.f(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        xifVar.i(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            i3 += 8;
        }
        xifVar.j(i3);
        while (i2 < list.size()) {
            xifVar.g(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void u(int i, List list, oqd oqdVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        xif xifVar = (xif) oqdVar.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                xifVar.d(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        xifVar.i(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).getClass();
            i3 += 4;
        }
        xifVar.j(i3);
        while (i2 < list.size()) {
            xifVar.e(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    public static void v(int i, List list, oqd oqdVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        xif xifVar = (xif) oqdVar.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                int intValue = ((Integer) list.get(i2)).intValue();
                xifVar.j(i << 3);
                if (intValue >= 0) {
                    xifVar.j(intValue);
                } else {
                    xifVar.l(intValue);
                }
                i2++;
            }
            return;
        }
        xifVar.i(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += xif.m(((Integer) list.get(i4)).intValue());
        }
        xifVar.j(i3);
        while (i2 < list.size()) {
            int intValue2 = ((Integer) list.get(i2)).intValue();
            if (intValue2 >= 0) {
                xifVar.j(intValue2);
            } else {
                xifVar.l(intValue2);
            }
            i2++;
        }
    }

    public static void w(int i, List list, oqd oqdVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        xif xifVar = (xif) oqdVar.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                xifVar.k(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        xifVar.i(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += xif.p(((Long) list.get(i4)).longValue());
        }
        xifVar.j(i3);
        while (i2 < list.size()) {
            xifVar.l(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void x(int i, List list, oqd oqdVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        xif xifVar = (xif) oqdVar.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                xifVar.d(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        xifVar.i(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            i3 += 4;
        }
        xifVar.j(i3);
        while (i2 < list.size()) {
            xifVar.e(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void y(int i, List list, oqd oqdVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        xif xifVar = (xif) oqdVar.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                xifVar.f(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        xifVar.i(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            i3 += 8;
        }
        xifVar.j(i3);
        while (i2 < list.size()) {
            xifVar.g(((Long) list.get(i2)).longValue());
            i2++;
        }
    }
}
