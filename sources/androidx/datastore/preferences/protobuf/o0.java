package androidx.datastore.preferences.protobuf;

import java.util.Map;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class o0 {
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
    public static int a(int i10, Object obj, Object obj2) {
        int A;
        int size;
        int z10;
        z1 z1Var;
        int size2;
        int z11;
        n0 n0Var = (n0) obj;
        m0 m0Var = (m0) obj2;
        int i11 = 0;
        if (n0Var.isEmpty()) {
            return 0;
        }
        for (Map.Entry entry : n0Var.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            m0Var.getClass();
            int y10 = k.y(i10);
            l0 l0Var = m0Var.a;
            z1 z1Var2 = l0Var.a;
            int i12 = q.c;
            int i13 = 1;
            int y11 = k.y(1);
            w1 w1Var = z1.d;
            if (z1Var2 == w1Var) {
                y11 *= 2;
            }
            switch (z1Var2.ordinal()) {
                case 0:
                    ((Double) key).getClass();
                    A = 8;
                    int i14 = A + y11;
                    z1Var = l0Var.b;
                    int y12 = k.y(2);
                    if (z1Var == w1Var) {
                        y12 *= 2;
                    }
                    switch (z1Var.ordinal()) {
                        case 0:
                            ((Double) value).getClass();
                            i13 = 8;
                            int i15 = i13 + y12 + i14;
                            i11 = a9.p.f(i15, i15, y10, i11);
                        case 1:
                            ((Float) value).getClass();
                            i13 = 4;
                            int i152 = i13 + y12 + i14;
                            i11 = a9.p.f(i152, i152, y10, i11);
                        case 2:
                            i13 = k.A(((Long) value).longValue());
                            int i1522 = i13 + y12 + i14;
                            i11 = a9.p.f(i1522, i1522, y10, i11);
                        case 3:
                            i13 = k.A(((Long) value).longValue());
                            int i15222 = i13 + y12 + i14;
                            i11 = a9.p.f(i15222, i15222, y10, i11);
                        case 4:
                            i13 = k.w(((Integer) value).intValue());
                            int i152222 = i13 + y12 + i14;
                            i11 = a9.p.f(i152222, i152222, y10, i11);
                        case 5:
                            ((Long) value).getClass();
                            i13 = 8;
                            int i1522222 = i13 + y12 + i14;
                            i11 = a9.p.f(i1522222, i1522222, y10, i11);
                        case 6:
                            ((Integer) value).getClass();
                            i13 = 4;
                            int i15222222 = i13 + y12 + i14;
                            i11 = a9.p.f(i15222222, i15222222, y10, i11);
                        case 7:
                            ((Boolean) value).getClass();
                            int i152222222 = i13 + y12 + i14;
                            i11 = a9.p.f(i152222222, i152222222, y10, i11);
                        case 8:
                            if (value instanceof g) {
                                size2 = ((g) value).size();
                                z11 = k.z(size2);
                                i13 = z11 + size2;
                                int i1522222222 = i13 + y12 + i14;
                                i11 = a9.p.f(i1522222222, i1522222222, y10, i11);
                            } else {
                                i13 = k.x((String) value);
                                int i15222222222 = i13 + y12 + i14;
                                i11 = a9.p.f(i15222222222, i15222222222, y10, i11);
                            }
                        case 9:
                            i13 = ((a) value).a();
                            int i152222222222 = i13 + y12 + i14;
                            i11 = a9.p.f(i152222222222, i152222222222, y10, i11);
                        case 10:
                            size2 = ((a) value).a();
                            z11 = k.z(size2);
                            i13 = z11 + size2;
                            int i1522222222222 = i13 + y12 + i14;
                            i11 = a9.p.f(i1522222222222, i1522222222222, y10, i11);
                        case 11:
                            if (value instanceof g) {
                                size2 = ((g) value).size();
                                z11 = k.z(size2);
                            } else {
                                size2 = ((byte[]) value).length;
                                z11 = k.z(size2);
                            }
                            i13 = z11 + size2;
                            int i15222222222222 = i13 + y12 + i14;
                            i11 = a9.p.f(i15222222222222, i15222222222222, y10, i11);
                        case 12:
                            i13 = k.z(((Integer) value).intValue());
                            int i152222222222222 = i13 + y12 + i14;
                            i11 = a9.p.f(i152222222222222, i152222222222222, y10, i11);
                        case 13:
                            i13 = k.w(((Integer) value).intValue());
                            int i1522222222222222 = i13 + y12 + i14;
                            i11 = a9.p.f(i1522222222222222, i1522222222222222, y10, i11);
                        case 14:
                            ((Integer) value).getClass();
                            i13 = 4;
                            int i15222222222222222 = i13 + y12 + i14;
                            i11 = a9.p.f(i15222222222222222, i15222222222222222, y10, i11);
                        case 15:
                            ((Long) value).getClass();
                            i13 = 8;
                            int i152222222222222222 = i13 + y12 + i14;
                            i11 = a9.p.f(i152222222222222222, i152222222222222222, y10, i11);
                        case 16:
                            int intValue = ((Integer) value).intValue();
                            i13 = k.z((intValue >> 31) ^ (intValue << 1));
                            int i1522222222222222222 = i13 + y12 + i14;
                            i11 = a9.p.f(i1522222222222222222, i1522222222222222222, y10, i11);
                        case 17:
                            long longValue = ((Long) value).longValue();
                            i13 = k.A((longValue >> 63) ^ (longValue << 1));
                            int i15222222222222222222 = i13 + y12 + i14;
                            i11 = a9.p.f(i15222222222222222222, i15222222222222222222, y10, i11);
                        default:
                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                    }
                case 1:
                    ((Float) key).getClass();
                    A = 4;
                    int i142 = A + y11;
                    z1Var = l0Var.b;
                    int y122 = k.y(2);
                    if (z1Var == w1Var) {
                    }
                    switch (z1Var.ordinal()) {
                    }
                case 2:
                    A = k.A(((Long) key).longValue());
                    int i1422 = A + y11;
                    z1Var = l0Var.b;
                    int y1222 = k.y(2);
                    if (z1Var == w1Var) {
                    }
                    switch (z1Var.ordinal()) {
                    }
                case 3:
                    A = k.A(((Long) key).longValue());
                    int i14222 = A + y11;
                    z1Var = l0Var.b;
                    int y12222 = k.y(2);
                    if (z1Var == w1Var) {
                    }
                    switch (z1Var.ordinal()) {
                    }
                case 4:
                    A = k.w(((Integer) key).intValue());
                    int i142222 = A + y11;
                    z1Var = l0Var.b;
                    int y122222 = k.y(2);
                    if (z1Var == w1Var) {
                    }
                    switch (z1Var.ordinal()) {
                    }
                case 5:
                    ((Long) key).getClass();
                    A = 8;
                    int i1422222 = A + y11;
                    z1Var = l0Var.b;
                    int y1222222 = k.y(2);
                    if (z1Var == w1Var) {
                    }
                    switch (z1Var.ordinal()) {
                    }
                case 6:
                    ((Integer) key).getClass();
                    A = 4;
                    int i14222222 = A + y11;
                    z1Var = l0Var.b;
                    int y12222222 = k.y(2);
                    if (z1Var == w1Var) {
                    }
                    switch (z1Var.ordinal()) {
                    }
                case 7:
                    ((Boolean) key).getClass();
                    A = 1;
                    int i142222222 = A + y11;
                    z1Var = l0Var.b;
                    int y122222222 = k.y(2);
                    if (z1Var == w1Var) {
                    }
                    switch (z1Var.ordinal()) {
                    }
                case 8:
                    if (key instanceof g) {
                        size = ((g) key).size();
                        z10 = k.z(size);
                        A = size + z10;
                        int i1422222222 = A + y11;
                        z1Var = l0Var.b;
                        int y1222222222 = k.y(2);
                        if (z1Var == w1Var) {
                        }
                        switch (z1Var.ordinal()) {
                        }
                    } else {
                        A = k.x((String) key);
                        int i14222222222 = A + y11;
                        z1Var = l0Var.b;
                        int y12222222222 = k.y(2);
                        if (z1Var == w1Var) {
                        }
                        switch (z1Var.ordinal()) {
                        }
                    }
                case 9:
                    A = ((a) key).a();
                    int i142222222222 = A + y11;
                    z1Var = l0Var.b;
                    int y122222222222 = k.y(2);
                    if (z1Var == w1Var) {
                    }
                    switch (z1Var.ordinal()) {
                    }
                case 10:
                    size = ((a) key).a();
                    z10 = k.z(size);
                    A = size + z10;
                    int i1422222222222 = A + y11;
                    z1Var = l0Var.b;
                    int y1222222222222 = k.y(2);
                    if (z1Var == w1Var) {
                    }
                    switch (z1Var.ordinal()) {
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
                    int i14222222222222 = A + y11;
                    z1Var = l0Var.b;
                    int y12222222222222 = k.y(2);
                    if (z1Var == w1Var) {
                    }
                    switch (z1Var.ordinal()) {
                    }
                case 12:
                    A = k.z(((Integer) key).intValue());
                    int i142222222222222 = A + y11;
                    z1Var = l0Var.b;
                    int y122222222222222 = k.y(2);
                    if (z1Var == w1Var) {
                    }
                    switch (z1Var.ordinal()) {
                    }
                case 13:
                    A = k.w(((Integer) key).intValue());
                    int i1422222222222222 = A + y11;
                    z1Var = l0Var.b;
                    int y1222222222222222 = k.y(2);
                    if (z1Var == w1Var) {
                    }
                    switch (z1Var.ordinal()) {
                    }
                case 14:
                    ((Integer) key).getClass();
                    A = 4;
                    int i14222222222222222 = A + y11;
                    z1Var = l0Var.b;
                    int y12222222222222222 = k.y(2);
                    if (z1Var == w1Var) {
                    }
                    switch (z1Var.ordinal()) {
                    }
                case 15:
                    ((Long) key).getClass();
                    A = 8;
                    int i142222222222222222 = A + y11;
                    z1Var = l0Var.b;
                    int y122222222222222222 = k.y(2);
                    if (z1Var == w1Var) {
                    }
                    switch (z1Var.ordinal()) {
                    }
                case 16:
                    int intValue2 = ((Integer) key).intValue();
                    A = k.z((intValue2 >> 31) ^ (intValue2 << 1));
                    int i1422222222222222222 = A + y11;
                    z1Var = l0Var.b;
                    int y1222222222222222222 = k.y(2);
                    if (z1Var == w1Var) {
                    }
                    switch (z1Var.ordinal()) {
                    }
                case 17:
                    long longValue2 = ((Long) key).longValue();
                    A = k.A((longValue2 << 1) ^ (longValue2 >> 63));
                    int i14222222222222222222 = A + y11;
                    z1Var = l0Var.b;
                    int y12222222222222222222 = k.y(2);
                    if (z1Var == w1Var) {
                    }
                    switch (z1Var.ordinal()) {
                    }
                default:
                    throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
            }
        }
        return i11;
    }

    public static n0 b(Object obj, Object obj2) {
        n0 n0Var = (n0) obj;
        n0 n0Var2 = (n0) obj2;
        if (!n0Var2.isEmpty()) {
            if (!n0Var.a) {
                n0Var = n0Var.b();
            }
            n0Var.a();
            if (!n0Var2.isEmpty()) {
                n0Var.putAll(n0Var2);
            }
        }
        return n0Var;
    }
}
