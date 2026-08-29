package kg;

import java.util.Comparator;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class n0 implements Comparator {
    public long a;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i10;
        int i11;
        int i12;
        int i13;
        o0 o0Var = (o0) obj;
        o0 o0Var2 = (o0) obj2;
        if (this.a >= 0) {
            boolean z10 = o0Var.m;
            if (z10 != o0Var2.m) {
                return z10 ? -1 : 1;
            }
            boolean z11 = o0Var.Q;
            if (z11 != o0Var2.Q) {
                return z11 ? -1 : 1;
            }
            if (z11 && (i12 = o0Var.k) != (i13 = o0Var2.k)) {
                return i12 - i13;
            }
            i10 = o0Var.a.lastDrawnPosition;
            i11 = o0Var2.a.lastDrawnPosition;
        } else {
            boolean z12 = o0Var.m;
            if (z12 != o0Var2.m) {
                return z12 ? -1 : 1;
            }
            int i14 = o0Var.j;
            int i15 = o0Var2.j;
            if (i14 != i15) {
                return i15 - i14;
            }
            i10 = o0Var.a.lastDrawnPosition;
            i11 = o0Var2.a.lastDrawnPosition;
        }
        return i10 - i11;
    }
}
