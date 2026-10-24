package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class j1 {
    public static boolean a(Object obj, e2.f fVar) {
        int e = fVar.e();
        int i10 = e >>> 3;
        int i11 = e & 7;
        if (i11 == 0) {
            ((i1) obj).c(i10 << 3, Long.valueOf(fVar.z()));
            return true;
        }
        if (i11 == 1) {
            ((i1) obj).c((i10 << 3) | 1, Long.valueOf(fVar.q()));
            return true;
        }
        if (i11 == 2) {
            ((i1) obj).c((i10 << 3) | 2, fVar.h());
            return true;
        }
        if (i11 != 3) {
            if (i11 == 4) {
                return false;
            }
            if (i11 != 5) {
                throw b0.b();
            }
            ((i1) obj).c((i10 << 3) | 5, Integer.valueOf(fVar.o()));
            return true;
        }
        i1 b10 = i1.b();
        int i12 = i10 << 3;
        int i13 = i12 | 4;
        while (fVar.d() != Integer.MAX_VALUE && a(b10, fVar)) {
        }
        if (i13 != fVar.e()) {
            throw new b0("Protocol message end-group tag did not match expected tag.");
        }
        b10.e = false;
        ((i1) obj).c(i12 | 3, b10);
        return true;
    }
}
