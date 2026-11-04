package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class n0 {
    public final m0 a;

    public n0(v1 v1Var, v1 v1Var2, o1.h hVar) {
        this.a = new m0(v1Var, v1Var2, hVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int a(m0 m0Var, Object obj, Object obj2) {
        int k10;
        int size;
        int j10;
        v1 v1Var;
        int size2;
        int j11;
        v1 v1Var2 = m0Var.a;
        int i3 = s.c;
        int i10 = 1;
        int i11 = m.i(1);
        s1 s1Var = v1.d;
        if (v1Var2 == s1Var) {
            i11 *= 2;
        }
        switch (v1Var2.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                k10 = 8;
                int i12 = k10 + i11;
                v1Var = m0Var.b;
                int i13 = m.i(2);
                if (v1Var == s1Var) {
                    i13 *= 2;
                }
                switch (v1Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        i10 = 8;
                        return i10 + i13 + i12;
                    case 1:
                        ((Float) obj2).getClass();
                        i10 = 4;
                        return i10 + i13 + i12;
                    case 2:
                        i10 = m.k(((Long) obj2).longValue());
                        return i10 + i13 + i12;
                    case 3:
                        i10 = m.k(((Long) obj2).longValue());
                        return i10 + i13 + i12;
                    case 4:
                        i10 = m.k(((Integer) obj2).intValue());
                        return i10 + i13 + i12;
                    case 5:
                        ((Long) obj2).getClass();
                        i10 = 8;
                        return i10 + i13 + i12;
                    case 6:
                        ((Integer) obj2).getClass();
                        i10 = 4;
                        return i10 + i13 + i12;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return i10 + i13 + i12;
                    case 8:
                        if (!(obj2 instanceof h)) {
                            i10 = m.h((String) obj2);
                            return i10 + i13 + i12;
                        }
                        size2 = ((h) obj2).size();
                        j11 = m.j(size2);
                        i10 = j11 + size2;
                        return i10 + i13 + i12;
                    case 9:
                        i10 = ((z) ((a) obj2)).a(null);
                        return i10 + i13 + i12;
                    case 10:
                        size2 = ((z) ((a) obj2)).a(null);
                        j11 = m.j(size2);
                        i10 = j11 + size2;
                        return i10 + i13 + i12;
                    case 11:
                        if (obj2 instanceof h) {
                            size2 = ((h) obj2).size();
                            j11 = m.j(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            j11 = m.j(size2);
                        }
                        i10 = j11 + size2;
                        return i10 + i13 + i12;
                    case 12:
                        i10 = m.j(((Integer) obj2).intValue());
                        return i10 + i13 + i12;
                    case 13:
                        i10 = m.k(((Integer) obj2).intValue());
                        return i10 + i13 + i12;
                    case 14:
                        ((Integer) obj2).getClass();
                        i10 = 4;
                        return i10 + i13 + i12;
                    case 15:
                        ((Long) obj2).getClass();
                        i10 = 8;
                        return i10 + i13 + i12;
                    case 16:
                        int intValue = ((Integer) obj2).intValue();
                        i10 = m.j((intValue >> 31) ^ (intValue << 1));
                        return i10 + i13 + i12;
                    case 17:
                        long longValue = ((Long) obj2).longValue();
                        i10 = m.k((longValue >> 63) ^ (longValue << 1));
                        return i10 + i13 + i12;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 1:
                ((Float) obj).getClass();
                k10 = 4;
                int i122 = k10 + i11;
                v1Var = m0Var.b;
                int i132 = m.i(2);
                if (v1Var == s1Var) {
                }
                switch (v1Var.ordinal()) {
                }
            case 2:
                k10 = m.k(((Long) obj).longValue());
                int i1222 = k10 + i11;
                v1Var = m0Var.b;
                int i1322 = m.i(2);
                if (v1Var == s1Var) {
                }
                switch (v1Var.ordinal()) {
                }
            case 3:
                k10 = m.k(((Long) obj).longValue());
                int i12222 = k10 + i11;
                v1Var = m0Var.b;
                int i13222 = m.i(2);
                if (v1Var == s1Var) {
                }
                switch (v1Var.ordinal()) {
                }
            case 4:
                k10 = m.k(((Integer) obj).intValue());
                int i122222 = k10 + i11;
                v1Var = m0Var.b;
                int i132222 = m.i(2);
                if (v1Var == s1Var) {
                }
                switch (v1Var.ordinal()) {
                }
            case 5:
                ((Long) obj).getClass();
                k10 = 8;
                int i1222222 = k10 + i11;
                v1Var = m0Var.b;
                int i1322222 = m.i(2);
                if (v1Var == s1Var) {
                }
                switch (v1Var.ordinal()) {
                }
            case 6:
                ((Integer) obj).getClass();
                k10 = 4;
                int i12222222 = k10 + i11;
                v1Var = m0Var.b;
                int i13222222 = m.i(2);
                if (v1Var == s1Var) {
                }
                switch (v1Var.ordinal()) {
                }
            case 7:
                ((Boolean) obj).getClass();
                k10 = 1;
                int i122222222 = k10 + i11;
                v1Var = m0Var.b;
                int i132222222 = m.i(2);
                if (v1Var == s1Var) {
                }
                switch (v1Var.ordinal()) {
                }
            case 8:
                if (obj instanceof h) {
                    size = ((h) obj).size();
                    j10 = m.j(size);
                    k10 = size + j10;
                    int i1222222222 = k10 + i11;
                    v1Var = m0Var.b;
                    int i1322222222 = m.i(2);
                    if (v1Var == s1Var) {
                    }
                    switch (v1Var.ordinal()) {
                    }
                } else {
                    k10 = m.h((String) obj);
                    int i12222222222 = k10 + i11;
                    v1Var = m0Var.b;
                    int i13222222222 = m.i(2);
                    if (v1Var == s1Var) {
                    }
                    switch (v1Var.ordinal()) {
                    }
                }
            case 9:
                k10 = ((z) ((a) obj)).a(null);
                int i122222222222 = k10 + i11;
                v1Var = m0Var.b;
                int i132222222222 = m.i(2);
                if (v1Var == s1Var) {
                }
                switch (v1Var.ordinal()) {
                }
            case 10:
                size = ((z) ((a) obj)).a(null);
                j10 = m.j(size);
                k10 = size + j10;
                int i1222222222222 = k10 + i11;
                v1Var = m0Var.b;
                int i1322222222222 = m.i(2);
                if (v1Var == s1Var) {
                }
                switch (v1Var.ordinal()) {
                }
            case 11:
                if (obj instanceof h) {
                    size = ((h) obj).size();
                    j10 = m.j(size);
                } else {
                    size = ((byte[]) obj).length;
                    j10 = m.j(size);
                }
                k10 = size + j10;
                int i12222222222222 = k10 + i11;
                v1Var = m0Var.b;
                int i13222222222222 = m.i(2);
                if (v1Var == s1Var) {
                }
                switch (v1Var.ordinal()) {
                }
            case 12:
                k10 = m.j(((Integer) obj).intValue());
                int i122222222222222 = k10 + i11;
                v1Var = m0Var.b;
                int i132222222222222 = m.i(2);
                if (v1Var == s1Var) {
                }
                switch (v1Var.ordinal()) {
                }
            case 13:
                k10 = m.k(((Integer) obj).intValue());
                int i1222222222222222 = k10 + i11;
                v1Var = m0Var.b;
                int i1322222222222222 = m.i(2);
                if (v1Var == s1Var) {
                }
                switch (v1Var.ordinal()) {
                }
            case 14:
                ((Integer) obj).getClass();
                k10 = 4;
                int i12222222222222222 = k10 + i11;
                v1Var = m0Var.b;
                int i13222222222222222 = m.i(2);
                if (v1Var == s1Var) {
                }
                switch (v1Var.ordinal()) {
                }
            case 15:
                ((Long) obj).getClass();
                k10 = 8;
                int i122222222222222222 = k10 + i11;
                v1Var = m0Var.b;
                int i132222222222222222 = m.i(2);
                if (v1Var == s1Var) {
                }
                switch (v1Var.ordinal()) {
                }
            case 16:
                int intValue2 = ((Integer) obj).intValue();
                k10 = m.j((intValue2 >> 31) ^ (intValue2 << 1));
                int i1222222222222222222 = k10 + i11;
                v1Var = m0Var.b;
                int i1322222222222222222 = m.i(2);
                if (v1Var == s1Var) {
                }
                switch (v1Var.ordinal()) {
                }
            case 17:
                long longValue2 = ((Long) obj).longValue();
                k10 = m.k((longValue2 >> 63) ^ (longValue2 << 1));
                int i12222222222222222222 = k10 + i11;
                v1Var = m0Var.b;
                int i13222222222222222222 = m.i(2);
                if (v1Var == s1Var) {
                }
                switch (v1Var.ordinal()) {
                }
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }
}
