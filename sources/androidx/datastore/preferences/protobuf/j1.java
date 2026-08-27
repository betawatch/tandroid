package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class j1 {
    public static boolean a(Object obj, i iVar) {
        int d = iVar.d();
        int i10 = d >>> 3;
        int i11 = d & 7;
        if (i11 == 0) {
            ((i1) obj).c(i10 << 3, Long.valueOf(iVar.y()));
            return true;
        }
        if (i11 == 1) {
            ((i1) obj).c((i10 << 3) | 1, Long.valueOf(iVar.p()));
            return true;
        }
        if (i11 == 2) {
            ((i1) obj).c((i10 << 3) | 2, iVar.g());
            return true;
        }
        if (i11 != 3) {
            if (i11 == 4) {
                return false;
            }
            if (i11 != 5) {
                throw b0.b();
            }
            ((i1) obj).c((i10 << 3) | 5, Integer.valueOf(iVar.n()));
            return true;
        }
        i1 b10 = i1.b();
        int i12 = i10 << 3;
        int i13 = i12 | 4;
        while (iVar.c() != Integer.MAX_VALUE && a(b10, iVar)) {
        }
        if (i13 != iVar.d()) {
            throw new b0("Protocol message end-group tag did not match expected tag.");
        }
        b10.e = false;
        ((i1) obj).c(i12 | 3, b10);
        return true;
    }
}
