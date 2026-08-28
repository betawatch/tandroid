package hg;

import java.util.Comparator;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class o0 implements Comparator {
    public long a;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i9;
        int i10;
        int i11;
        int i12;
        p0 p0Var = (p0) obj;
        p0 p0Var2 = (p0) obj2;
        if (this.a >= 0) {
            boolean z10 = p0Var.m;
            if (z10 != p0Var2.m) {
                return z10 ? -1 : 1;
            }
            boolean z11 = p0Var.Q;
            if (z11 != p0Var2.Q) {
                return z11 ? -1 : 1;
            }
            if (z11 && (i11 = p0Var.k) != (i12 = p0Var2.k)) {
                return i11 - i12;
            }
            i9 = p0Var.a.lastDrawnPosition;
            i10 = p0Var2.a.lastDrawnPosition;
        } else {
            boolean z12 = p0Var.m;
            if (z12 != p0Var2.m) {
                return z12 ? -1 : 1;
            }
            int i13 = p0Var.j;
            int i14 = p0Var2.j;
            if (i13 != i14) {
                return i14 - i13;
            }
            i9 = p0Var.a.lastDrawnPosition;
            i10 = p0Var2.a.lastDrawnPosition;
        }
        return i9 - i10;
    }
}
