package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class k1 {
    public static boolean a(Object obj, i iVar) {
        int d = iVar.d();
        int i9 = d >>> 3;
        int i10 = d & 7;
        if (i10 == 0) {
            ((j1) obj).c(i9 << 3, Long.valueOf(iVar.y()));
            return true;
        }
        if (i10 == 1) {
            ((j1) obj).c((i9 << 3) | 1, Long.valueOf(iVar.p()));
            return true;
        }
        if (i10 == 2) {
            ((j1) obj).c((i9 << 3) | 2, iVar.g());
            return true;
        }
        if (i10 != 3) {
            if (i10 == 4) {
                return false;
            }
            if (i10 != 5) {
                throw c0.b();
            }
            ((j1) obj).c((i9 << 3) | 5, Integer.valueOf(iVar.n()));
            return true;
        }
        j1 b10 = j1.b();
        int i11 = i9 << 3;
        int i12 = i11 | 4;
        while (iVar.c() != Integer.MAX_VALUE && a(b10, iVar)) {
        }
        if (i12 != iVar.d()) {
            throw new c0("Protocol message end-group tag did not match expected tag.");
        }
        b10.e = false;
        ((j1) obj).c(i11 | 3, b10);
        return true;
    }
}
