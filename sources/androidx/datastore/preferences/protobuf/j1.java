package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class j1 {
    public static boolean a(Object obj, a0.h hVar) {
        int e = hVar.e();
        int i10 = e >>> 3;
        int i11 = e & 7;
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
