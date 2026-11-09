package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final class i1 {
    public static h1 a(Object obj) {
        z zVar = (z) obj;
        h1 h1Var = zVar.unknownFields;
        if (h1Var != h1.f) {
            return h1Var;
        }
        h1 h1Var2 = new h1(0, new int[8], new Object[8], true);
        zVar.unknownFields = h1Var2;
        return h1Var2;
    }

    public static boolean b(int i7, d4.f fVar, Object obj) {
        k kVar = (k) fVar.b;
        int i10 = fVar.c;
        int i11 = i10 >>> 3;
        int i12 = i10 & 7;
        if (i12 == 0) {
            fVar.G(0);
            ((h1) obj).c(i11 << 3, Long.valueOf(kVar.n()));
            return true;
        }
        if (i12 == 1) {
            fVar.G(1);
            ((h1) obj).c((i11 << 3) | 1, Long.valueOf(kVar.k()));
            return true;
        }
        if (i12 == 2) {
            ((h1) obj).c((i11 << 3) | 2, fVar.n());
            return true;
        }
        if (i12 != 3) {
            if (i12 == 4) {
                return false;
            }
            if (i12 != 5) {
                throw e0.b();
            }
            fVar.G(5);
            ((h1) obj).c(5 | (i11 << 3), Integer.valueOf(kVar.j()));
            return true;
        }
        h1 h1Var = new h1(0, new int[8], new Object[8], true);
        int i13 = i11 << 3;
        int i14 = i13 | 4;
        int i15 = i7 + 1;
        if (i15 >= 100) {
            throw new e0("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (fVar.e() != Integer.MAX_VALUE && b(i15, fVar, h1Var)) {
        }
        if (i14 != fVar.c) {
            throw new e0("Protocol message end-group tag did not match expected tag.");
        }
        if (h1Var.e) {
            h1Var.e = false;
        }
        ((h1) obj).c(i13 | 3, h1Var);
        return true;
    }
}
