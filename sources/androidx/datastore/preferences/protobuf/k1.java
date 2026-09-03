package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class k1 {
    public static boolean a(Object obj, i iVar) {
        int d = iVar.d();
        int i10 = d >>> 3;
        int i11 = d & 7;
        if (i11 == 0) {
            ((j1) obj).c(i10 << 3, Long.valueOf(iVar.y()));
            return true;
        }
        if (i11 == 1) {
            ((j1) obj).c((i10 << 3) | 1, Long.valueOf(iVar.p()));
            return true;
        }
        if (i11 == 2) {
            ((j1) obj).c((i10 << 3) | 2, iVar.g());
            return true;
        }
        if (i11 != 3) {
            if (i11 == 4) {
                return false;
            }
            if (i11 != 5) {
                throw c0.b();
            }
            ((j1) obj).c((i10 << 3) | 5, Integer.valueOf(iVar.n()));
            return true;
        }
        j1 b10 = j1.b();
        int i12 = i10 << 3;
        int i13 = i12 | 4;
        while (iVar.c() != Integer.MAX_VALUE && a(b10, iVar)) {
        }
        if (i13 != iVar.d()) {
            throw new c0("Protocol message end-group tag did not match expected tag.");
        }
        b10.e = false;
        ((j1) obj).c(i12 | 3, b10);
        return true;
    }
}
