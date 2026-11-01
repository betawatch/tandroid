package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class j1 {
    public static boolean a(Object obj, a4.g gVar) {
        int g10 = gVar.g();
        int i10 = g10 >>> 3;
        int i11 = g10 & 7;
        if (i11 == 0) {
            ((i1) obj).c(i10 << 3, Long.valueOf(gVar.G()));
            return true;
        }
        if (i11 == 1) {
            ((i1) obj).c((i10 << 3) | 1, Long.valueOf(gVar.x()));
            return true;
        }
        if (i11 == 2) {
            ((i1) obj).c((i10 << 3) | 2, gVar.n());
            return true;
        }
        if (i11 != 3) {
            if (i11 == 4) {
                return false;
            }
            if (i11 != 5) {
                throw b0.b();
            }
            ((i1) obj).c((i10 << 3) | 5, Integer.valueOf(gVar.v()));
            return true;
        }
        i1 b10 = i1.b();
        int i12 = i10 << 3;
        int i13 = i12 | 4;
        while (gVar.e() != Integer.MAX_VALUE && a(b10, gVar)) {
        }
        if (i13 != gVar.g()) {
            throw new b0("Protocol message end-group tag did not match expected tag.");
        }
        b10.e = false;
        ((i1) obj).c(i12 | 3, b10);
        return true;
    }
}
