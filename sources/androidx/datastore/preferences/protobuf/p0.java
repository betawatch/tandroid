package androidx.datastore.preferences.protobuf;

import java.util.Map;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class p0 {
    /* JADX WARN: Removed duplicated region for block: B:16:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0139 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int a(int i9, Object obj, Object obj2) {
        int A;
        int size;
        int z10;
        a2 a2Var;
        int size2;
        int z11;
        o0 o0Var = (o0) obj;
        n0 n0Var = (n0) obj2;
        int i10 = 0;
        if (o0Var.isEmpty()) {
            return 0;
        }
        for (Map.Entry entry : o0Var.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            n0Var.getClass();
            int y10 = k.y(i9);
            m0 m0Var = n0Var.a;
            a2 a2Var2 = m0Var.a;
            int i11 = q.c;
            int i12 = 1;
            int y11 = k.y(1);
            x1 x1Var = a2.d;
            if (a2Var2 == x1Var) {
                y11 *= 2;
            }
            switch (a2Var2.ordinal()) {
                case 0:
                    ((Double) key).getClass();
                    A = 8;
                    int i13 = A + y11;
                    a2Var = m0Var.b;
                    int y12 = k.y(2);
                    if (a2Var == x1Var) {
                        y12 *= 2;
                    }
                    switch (a2Var.ordinal()) {
                        case 0:
                            ((Double) value).getClass();
                            i12 = 8;
                            int i14 = i12 + y12 + i13;
                            i10 = aa.d.f(i14, i14, y10, i10);
                        case 1:
                            ((Float) value).getClass();
                            i12 = 4;
                            int i142 = i12 + y12 + i13;
                            i10 = aa.d.f(i142, i142, y10, i10);
                        case 2:
                            i12 = k.A(((Long) value).longValue());
                            int i1422 = i12 + y12 + i13;
                            i10 = aa.d.f(i1422, i1422, y10, i10);
                        case 3:
                            i12 = k.A(((Long) value).longValue());
                            int i14222 = i12 + y12 + i13;
                            i10 = aa.d.f(i14222, i14222, y10, i10);
                        case 4:
                            i12 = k.w(((Integer) value).intValue());
                            int i142222 = i12 + y12 + i13;
                            i10 = aa.d.f(i142222, i142222, y10, i10);
                        case 5:
                            ((Long) value).getClass();
                            i12 = 8;
                            int i1422222 = i12 + y12 + i13;
                            i10 = aa.d.f(i1422222, i1422222, y10, i10);
                        case 6:
                            ((Integer) value).getClass();
                            i12 = 4;
                            int i14222222 = i12 + y12 + i13;
                            i10 = aa.d.f(i14222222, i14222222, y10, i10);
                        case 7:
                            ((Boolean) value).getClass();
                            int i142222222 = i12 + y12 + i13;
                            i10 = aa.d.f(i142222222, i142222222, y10, i10);
                        case 8:
                            if (value instanceof g) {
                                size2 = ((g) value).size();
                                z11 = k.z(size2);
                                i12 = z11 + size2;
                                int i1422222222 = i12 + y12 + i13;
                                i10 = aa.d.f(i1422222222, i1422222222, y10, i10);
                            } else {
                                i12 = k.x((String) value);
                                int i14222222222 = i12 + y12 + i13;
                                i10 = aa.d.f(i14222222222, i14222222222, y10, i10);
                            }
                        case 9:
                            i12 = ((a) value).a();
                            int i142222222222 = i12 + y12 + i13;
                            i10 = aa.d.f(i142222222222, i142222222222, y10, i10);
                        case 10:
                            size2 = ((a) value).a();
                            z11 = k.z(size2);
                            i12 = z11 + size2;
                            int i1422222222222 = i12 + y12 + i13;
                            i10 = aa.d.f(i1422222222222, i1422222222222, y10, i10);
                        case 11:
                            if (value instanceof g) {
                                size2 = ((g) value).size();
                                z11 = k.z(size2);
                            } else {
                                size2 = ((byte[]) value).length;
                                z11 = k.z(size2);
                            }
                            i12 = z11 + size2;
                            int i14222222222222 = i12 + y12 + i13;
                            i10 = aa.d.f(i14222222222222, i14222222222222, y10, i10);
                        case 12:
                            i12 = k.z(((Integer) value).intValue());
                            int i142222222222222 = i12 + y12 + i13;
                            i10 = aa.d.f(i142222222222222, i142222222222222, y10, i10);
                        case 13:
                            i12 = k.w(((Integer) value).intValue());
                            int i1422222222222222 = i12 + y12 + i13;
                            i10 = aa.d.f(i1422222222222222, i1422222222222222, y10, i10);
                        case 14:
                            ((Integer) value).getClass();
                            i12 = 4;
                            int i14222222222222222 = i12 + y12 + i13;
                            i10 = aa.d.f(i14222222222222222, i14222222222222222, y10, i10);
                        case 15:
                            ((Long) value).getClass();
                            i12 = 8;
                            int i142222222222222222 = i12 + y12 + i13;
                            i10 = aa.d.f(i142222222222222222, i142222222222222222, y10, i10);
                        case 16:
                            int intValue = ((Integer) value).intValue();
                            i12 = k.z((intValue >> 31) ^ (intValue << 1));
                            int i1422222222222222222 = i12 + y12 + i13;
                            i10 = aa.d.f(i1422222222222222222, i1422222222222222222, y10, i10);
                        case 17:
                            long longValue = ((Long) value).longValue();
                            i12 = k.A((longValue >> 63) ^ (longValue << 1));
                            int i14222222222222222222 = i12 + y12 + i13;
                            i10 = aa.d.f(i14222222222222222222, i14222222222222222222, y10, i10);
                        default:
                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                    }
                case 1:
                    ((Float) key).getClass();
                    A = 4;
                    int i132 = A + y11;
                    a2Var = m0Var.b;
                    int y122 = k.y(2);
                    if (a2Var == x1Var) {
                    }
                    switch (a2Var.ordinal()) {
                    }
                case 2:
                    A = k.A(((Long) key).longValue());
                    int i1322 = A + y11;
                    a2Var = m0Var.b;
                    int y1222 = k.y(2);
                    if (a2Var == x1Var) {
                    }
                    switch (a2Var.ordinal()) {
                    }
                case 3:
                    A = k.A(((Long) key).longValue());
                    int i13222 = A + y11;
                    a2Var = m0Var.b;
                    int y12222 = k.y(2);
                    if (a2Var == x1Var) {
                    }
                    switch (a2Var.ordinal()) {
                    }
                case 4:
                    A = k.w(((Integer) key).intValue());
                    int i132222 = A + y11;
                    a2Var = m0Var.b;
                    int y122222 = k.y(2);
                    if (a2Var == x1Var) {
                    }
                    switch (a2Var.ordinal()) {
                    }
                case 5:
                    ((Long) key).getClass();
                    A = 8;
                    int i1322222 = A + y11;
                    a2Var = m0Var.b;
                    int y1222222 = k.y(2);
                    if (a2Var == x1Var) {
                    }
                    switch (a2Var.ordinal()) {
                    }
                case 6:
                    ((Integer) key).getClass();
                    A = 4;
                    int i13222222 = A + y11;
                    a2Var = m0Var.b;
                    int y12222222 = k.y(2);
                    if (a2Var == x1Var) {
                    }
                    switch (a2Var.ordinal()) {
                    }
                case 7:
                    ((Boolean) key).getClass();
                    A = 1;
                    int i132222222 = A + y11;
                    a2Var = m0Var.b;
                    int y122222222 = k.y(2);
                    if (a2Var == x1Var) {
                    }
                    switch (a2Var.ordinal()) {
                    }
                case 8:
                    if (key instanceof g) {
                        size = ((g) key).size();
                        z10 = k.z(size);
                        A = size + z10;
                        int i1322222222 = A + y11;
                        a2Var = m0Var.b;
                        int y1222222222 = k.y(2);
                        if (a2Var == x1Var) {
                        }
                        switch (a2Var.ordinal()) {
                        }
                    } else {
                        A = k.x((String) key);
                        int i13222222222 = A + y11;
                        a2Var = m0Var.b;
                        int y12222222222 = k.y(2);
                        if (a2Var == x1Var) {
                        }
                        switch (a2Var.ordinal()) {
                        }
                    }
                case 9:
                    A = ((a) key).a();
                    int i132222222222 = A + y11;
                    a2Var = m0Var.b;
                    int y122222222222 = k.y(2);
                    if (a2Var == x1Var) {
                    }
                    switch (a2Var.ordinal()) {
                    }
                case 10:
                    size = ((a) key).a();
                    z10 = k.z(size);
                    A = size + z10;
                    int i1322222222222 = A + y11;
                    a2Var = m0Var.b;
                    int y1222222222222 = k.y(2);
                    if (a2Var == x1Var) {
                    }
                    switch (a2Var.ordinal()) {
                    }
                case 11:
                    if (key instanceof g) {
                        size = ((g) key).size();
                        z10 = k.z(size);
                    } else {
                        size = ((byte[]) key).length;
                        z10 = k.z(size);
                    }
                    A = size + z10;
                    int i13222222222222 = A + y11;
                    a2Var = m0Var.b;
                    int y12222222222222 = k.y(2);
                    if (a2Var == x1Var) {
                    }
                    switch (a2Var.ordinal()) {
                    }
                case 12:
                    A = k.z(((Integer) key).intValue());
                    int i132222222222222 = A + y11;
                    a2Var = m0Var.b;
                    int y122222222222222 = k.y(2);
                    if (a2Var == x1Var) {
                    }
                    switch (a2Var.ordinal()) {
                    }
                case 13:
                    A = k.w(((Integer) key).intValue());
                    int i1322222222222222 = A + y11;
                    a2Var = m0Var.b;
                    int y1222222222222222 = k.y(2);
                    if (a2Var == x1Var) {
                    }
                    switch (a2Var.ordinal()) {
                    }
                case 14:
                    ((Integer) key).getClass();
                    A = 4;
                    int i13222222222222222 = A + y11;
                    a2Var = m0Var.b;
                    int y12222222222222222 = k.y(2);
                    if (a2Var == x1Var) {
                    }
                    switch (a2Var.ordinal()) {
                    }
                case 15:
                    ((Long) key).getClass();
                    A = 8;
                    int i132222222222222222 = A + y11;
                    a2Var = m0Var.b;
                    int y122222222222222222 = k.y(2);
                    if (a2Var == x1Var) {
                    }
                    switch (a2Var.ordinal()) {
                    }
                case 16:
                    int intValue2 = ((Integer) key).intValue();
                    A = k.z((intValue2 >> 31) ^ (intValue2 << 1));
                    int i1322222222222222222 = A + y11;
                    a2Var = m0Var.b;
                    int y1222222222222222222 = k.y(2);
                    if (a2Var == x1Var) {
                    }
                    switch (a2Var.ordinal()) {
                    }
                case 17:
                    long longValue2 = ((Long) key).longValue();
                    A = k.A((longValue2 << 1) ^ (longValue2 >> 63));
                    int i13222222222222222222 = A + y11;
                    a2Var = m0Var.b;
                    int y12222222222222222222 = k.y(2);
                    if (a2Var == x1Var) {
                    }
                    switch (a2Var.ordinal()) {
                    }
                default:
                    throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
            }
        }
        return i10;
    }

    public static o0 b(Object obj, Object obj2) {
        o0 o0Var = (o0) obj;
        o0 o0Var2 = (o0) obj2;
        if (!o0Var2.isEmpty()) {
            if (!o0Var.a) {
                o0Var = o0Var.b();
            }
            o0Var.a();
            if (!o0Var2.isEmpty()) {
                o0Var.putAll(o0Var2);
            }
        }
        return o0Var;
    }
}
