package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class j1 {
    public static boolean a(Object obj, a0.h hVar) {
        int e7 = hVar.e();
        int i10 = e7 >>> 3;
        int i11 = e7 & 7;
        if (i11 == 0) {
            ((i1) obj).c(i10 << 3, Long.valueOf(hVar.z()));
            return true;
        }
        if (i11 == 1) {
            ((i1) obj).c((i10 << 3) | 1, Long.valueOf(hVar.q()));
            return true;
        }
        if (i11 == 2) {
            ((i1) obj).c((i10 << 3) | 2, hVar.h());
            return true;
        }
        if (i11 != 3) {
            if (i11 == 4) {
                return false;
            }
            if (i11 != 5) {
                throw b0.b();
            }
            ((i1) obj).c((i10 << 3) | 5, Integer.valueOf(hVar.o()));
            return true;
        }
        i1 b10 = i1.b();
        int i12 = i10 << 3;
        int i13 = i12 | 4;
        while (hVar.d() != Integer.MAX_VALUE && a(b10, hVar)) {
        }
        if (i13 != hVar.e()) {
            throw new b0("Protocol message end-group tag did not match expected tag.");
        }
        b10.e = false;
        ((i1) obj).c(i12 | 3, b10);
        return true;
    }
}
