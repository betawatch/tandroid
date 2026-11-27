// default package

import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public abstract class fge {
    public static final rad a;

    static {
        zee zeeVar = zee.c;
        a = new rad();
    }

    public static void a(int i, List list, oqd oqdVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0e s0eVar = (s0e) oqdVar.a;
        int i2 = 0;
        if (!(list instanceof x6e)) {
            if (!z) {
                while (i2 < list.size()) {
                    int intValue = ((Integer) list.get(i2)).intValue();
                    s0eVar.n(i, (intValue << 1) ^ (intValue >> 31));
                    i2++;
                }
                return;
            }
            s0eVar.m(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                int intValue2 = ((Integer) list.get(i4)).intValue();
                i3 += s0e.b((intValue2 << 1) ^ (intValue2 >> 31));
            }
            s0eVar.o(i3);
            while (i2 < list.size()) {
                int intValue3 = ((Integer) list.get(i2)).intValue();
                s0eVar.o((intValue3 << 1) ^ (intValue3 >> 31));
                i2++;
            }
            return;
        }
        x6e x6eVar = (x6e) list;
        if (!z) {
            while (i2 < x6eVar.c) {
                int i5 = x6eVar.i(i2);
                s0eVar.n(i, (i5 << 1) ^ (i5 >> 31));
                i2++;
            }
            return;
        }
        s0eVar.m(i, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < x6eVar.c; i7++) {
            int i8 = x6eVar.i(i7);
            i6 += s0e.b((i8 << 1) ^ (i8 >> 31));
        }
        s0eVar.o(i6);
        while (i2 < x6eVar.c) {
            int i9 = x6eVar.i(i2);
            s0eVar.o((i9 << 1) ^ (i9 >> 31));
            i2++;
        }
    }

    public static void b(int i, List list, oqd oqdVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0e s0eVar = (s0e) oqdVar.a;
        if (list instanceof dbe) {
            grb.o();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                long longValue = ((Long) list.get(i2)).longValue();
                s0eVar.p(i, (longValue << 1) ^ (longValue >> 63));
                i2++;
            }
            return;
        }
        s0eVar.m(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            long longValue2 = ((Long) list.get(i4)).longValue();
            i3 += s0e.c((longValue2 << 1) ^ (longValue2 >> 63));
        }
        s0eVar.o(i3);
        while (i2 < list.size()) {
            long longValue3 = ((Long) list.get(i2)).longValue();
            s0eVar.q((longValue3 << 1) ^ (longValue3 >> 63));
            i2++;
        }
    }

    public static void c(int i, List list, oqd oqdVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0e s0eVar = (s0e) oqdVar.a;
        int i2 = 0;
        if (!(list instanceof x6e)) {
            if (!z) {
                while (i2 < list.size()) {
                    s0eVar.n(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            s0eVar.m(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += s0e.b(((Integer) list.get(i4)).intValue());
            }
            s0eVar.o(i3);
            while (i2 < list.size()) {
                s0eVar.o(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        x6e x6eVar = (x6e) list;
        if (!z) {
            while (i2 < x6eVar.c) {
                s0eVar.n(i, x6eVar.i(i2));
                i2++;
            }
            return;
        }
        s0eVar.m(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < x6eVar.c; i6++) {
            i5 += s0e.b(x6eVar.i(i6));
        }
        s0eVar.o(i5);
        while (i2 < x6eVar.c) {
            s0eVar.o(x6eVar.i(i2));
            i2++;
        }
    }

    public static void d(int i, List list, oqd oqdVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0e s0eVar = (s0e) oqdVar.a;
        if (list instanceof dbe) {
            grb.o();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                s0eVar.p(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        s0eVar.m(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += s0e.c(((Long) list.get(i4)).longValue());
        }
        s0eVar.o(i3);
        while (i2 < list.size()) {
            s0eVar.q(((Long) list.get(i2)).longValue());
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
        if (!(list instanceof x6e)) {
            int i2 = 0;
            while (i < size) {
                i2 += s0e.c(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        x6e x6eVar = (x6e) list;
        int i3 = 0;
        while (i < size) {
            i3 += s0e.c(x6eVar.i(i));
            i++;
        }
        return i3;
    }

    public static int g(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (s0e.b(i << 3) + 4) * size;
    }

    public static int h(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (s0e.b(i << 3) + 8) * size;
    }

    public static int i(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof x6e)) {
            int i2 = 0;
            while (i < size) {
                i2 += s0e.c(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        x6e x6eVar = (x6e) list;
        int i3 = 0;
        while (i < size) {
            i3 += s0e.c(x6eVar.i(i));
            i++;
        }
        return i3;
    }

    public static int j(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof dbe) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += s0e.c(((Long) list.get(i2)).longValue());
        }
        return i;
    }

    public static int k(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof x6e)) {
            int i2 = 0;
            while (i < size) {
                int intValue = ((Integer) list.get(i)).intValue();
                i2 += s0e.b((intValue << 1) ^ (intValue >> 31));
                i++;
            }
            return i2;
        }
        x6e x6eVar = (x6e) list;
        int i3 = 0;
        while (i < size) {
            int i4 = x6eVar.i(i);
            i3 += s0e.b((i4 << 1) ^ (i4 >> 31));
            i++;
        }
        return i3;
    }

    public static int l(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof dbe) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            long longValue = ((Long) list.get(i2)).longValue();
            i += s0e.c((longValue << 1) ^ (longValue >> 63));
        }
        return i;
    }

    public static int m(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof x6e)) {
            int i2 = 0;
            while (i < size) {
                i2 += s0e.b(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        x6e x6eVar = (x6e) list;
        int i3 = 0;
        while (i < size) {
            i3 += s0e.b(x6eVar.i(i));
            i++;
        }
        return i3;
    }

    public static int n(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof dbe) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += s0e.c(((Long) list.get(i2)).longValue());
        }
        return i;
    }

    public static void o(Object obj, Object obj2) {
        s6e s6eVar = (s6e) obj;
        zie zieVar = s6eVar.zzc;
        zie zieVar2 = ((s6e) obj2).zzc;
        zie zieVar3 = zie.f;
        if (!zieVar3.equals(zieVar2)) {
            if (zieVar3.equals(zieVar)) {
                int i = zieVar.a + zieVar2.a;
                int[] copyOf = Arrays.copyOf(zieVar.b, i);
                System.arraycopy(zieVar2.b, 0, copyOf, zieVar.a, zieVar2.a);
                Object[] copyOf2 = Arrays.copyOf(zieVar.c, i);
                System.arraycopy(zieVar2.c, 0, copyOf2, zieVar.a, zieVar2.a);
                zieVar = new zie(i, copyOf, copyOf2, true);
            } else {
                zieVar.getClass();
                if (!zieVar2.equals(zieVar3)) {
                    if (!zieVar.e) {
                        p3d.a();
                        return;
                    }
                    int i2 = zieVar.a + zieVar2.a;
                    zieVar.e(i2);
                    System.arraycopy(zieVar2.b, 0, zieVar.b, zieVar.a, zieVar2.a);
                    System.arraycopy(zieVar2.c, 0, zieVar.c, zieVar.a, zieVar2.a);
                    zieVar.a = i2;
                }
            }
        }
        s6eVar.zzc = zieVar;
    }

    public static void p(int i, List list, oqd oqdVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0e s0eVar = (s0e) oqdVar.a;
        int i2 = s0eVar.c;
        byte[] bArr = s0eVar.b;
        if (list instanceof jxd) {
            grb.o();
            return;
        }
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                byte booleanValue = ((Boolean) list.get(i3)).booleanValue();
                s0eVar.o(i << 3);
                int i4 = s0eVar.d;
                int i5 = i4 + 1;
                try {
                    bArr[i4] = booleanValue;
                    s0eVar.d = i5;
                    i3++;
                } catch (IndexOutOfBoundsException e) {
                    throw new wk2(i5, i2, 1, e);
                }
            }
            return;
        }
        s0eVar.m(i, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            ((Boolean) list.get(i7)).getClass();
            i6++;
        }
        s0eVar.o(i6);
        while (i3 < list.size()) {
            byte booleanValue2 = ((Boolean) list.get(i3)).booleanValue();
            int i8 = s0eVar.d;
            int i9 = i8 + 1;
            try {
                bArr[i8] = booleanValue2;
                s0eVar.d = i9;
                i3++;
            } catch (IndexOutOfBoundsException e2) {
                throw new wk2(i9, i2, 1, e2);
            }
        }
    }

    public static void q(int i, List list, oqd oqdVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0e s0eVar = (s0e) oqdVar.a;
        if (list instanceof p1e) {
            grb.o();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                s0eVar.h(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        s0eVar.m(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            i3 += 8;
        }
        s0eVar.o(i3);
        while (i2 < list.size()) {
            s0eVar.i(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    public static void r(int i, List list, oqd oqdVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0e s0eVar = (s0e) oqdVar.a;
        int i2 = 0;
        if (!(list instanceof x6e)) {
            if (!z) {
                while (i2 < list.size()) {
                    s0eVar.j(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            s0eVar.m(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += s0e.c(((Integer) list.get(i4)).intValue());
            }
            s0eVar.o(i3);
            while (i2 < list.size()) {
                s0eVar.k(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        x6e x6eVar = (x6e) list;
        if (!z) {
            while (i2 < x6eVar.c) {
                s0eVar.j(i, x6eVar.i(i2));
                i2++;
            }
            return;
        }
        s0eVar.m(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < x6eVar.c; i6++) {
            i5 += s0e.c(x6eVar.i(i6));
        }
        s0eVar.o(i5);
        while (i2 < x6eVar.c) {
            s0eVar.k(x6eVar.i(i2));
            i2++;
        }
    }

    public static void s(int i, List list, oqd oqdVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0e s0eVar = (s0e) oqdVar.a;
        int i2 = 0;
        if (!(list instanceof x6e)) {
            if (!z) {
                while (i2 < list.size()) {
                    s0eVar.f(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            s0eVar.m(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            s0eVar.o(i3);
            while (i2 < list.size()) {
                s0eVar.g(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        x6e x6eVar = (x6e) list;
        if (!z) {
            while (i2 < x6eVar.c) {
                s0eVar.f(i, x6eVar.i(i2));
                i2++;
            }
            return;
        }
        s0eVar.m(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < x6eVar.c; i6++) {
            x6eVar.i(i6);
            i5 += 4;
        }
        s0eVar.o(i5);
        while (i2 < x6eVar.c) {
            s0eVar.g(x6eVar.i(i2));
            i2++;
        }
    }

    public static void t(int i, List list, oqd oqdVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0e s0eVar = (s0e) oqdVar.a;
        if (list instanceof dbe) {
            grb.o();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                s0eVar.h(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        s0eVar.m(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            i3 += 8;
        }
        s0eVar.o(i3);
        while (i2 < list.size()) {
            s0eVar.i(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void u(int i, List list, oqd oqdVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0e s0eVar = (s0e) oqdVar.a;
        if (list instanceof a4e) {
            grb.o();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                s0eVar.f(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        s0eVar.m(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).getClass();
            i3 += 4;
        }
        s0eVar.o(i3);
        while (i2 < list.size()) {
            s0eVar.g(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    public static void v(int i, List list, oqd oqdVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0e s0eVar = (s0e) oqdVar.a;
        int i2 = 0;
        if (!(list instanceof x6e)) {
            if (!z) {
                while (i2 < list.size()) {
                    s0eVar.j(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            s0eVar.m(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += s0e.c(((Integer) list.get(i4)).intValue());
            }
            s0eVar.o(i3);
            while (i2 < list.size()) {
                s0eVar.k(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        x6e x6eVar = (x6e) list;
        if (!z) {
            while (i2 < x6eVar.c) {
                s0eVar.j(i, x6eVar.i(i2));
                i2++;
            }
            return;
        }
        s0eVar.m(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < x6eVar.c; i6++) {
            i5 += s0e.c(x6eVar.i(i6));
        }
        s0eVar.o(i5);
        while (i2 < x6eVar.c) {
            s0eVar.k(x6eVar.i(i2));
            i2++;
        }
    }

    public static void w(int i, List list, oqd oqdVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0e s0eVar = (s0e) oqdVar.a;
        if (list instanceof dbe) {
            grb.o();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                s0eVar.p(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        s0eVar.m(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += s0e.c(((Long) list.get(i4)).longValue());
        }
        s0eVar.o(i3);
        while (i2 < list.size()) {
            s0eVar.q(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void x(int i, List list, oqd oqdVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0e s0eVar = (s0e) oqdVar.a;
        int i2 = 0;
        if (!(list instanceof x6e)) {
            if (!z) {
                while (i2 < list.size()) {
                    s0eVar.f(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            s0eVar.m(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            s0eVar.o(i3);
            while (i2 < list.size()) {
                s0eVar.g(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        x6e x6eVar = (x6e) list;
        if (!z) {
            while (i2 < x6eVar.c) {
                s0eVar.f(i, x6eVar.i(i2));
                i2++;
            }
            return;
        }
        s0eVar.m(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < x6eVar.c; i6++) {
            x6eVar.i(i6);
            i5 += 4;
        }
        s0eVar.o(i5);
        while (i2 < x6eVar.c) {
            s0eVar.g(x6eVar.i(i2));
            i2++;
        }
    }

    public static void y(int i, List list, oqd oqdVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0e s0eVar = (s0e) oqdVar.a;
        if (list instanceof dbe) {
            grb.o();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                s0eVar.h(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        s0eVar.m(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            i3 += 8;
        }
        s0eVar.o(i3);
        while (i2 < list.size()) {
            s0eVar.i(((Long) list.get(i2)).longValue());
            i2++;
        }
    }
}
