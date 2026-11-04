package dh;

import java.util.Comparator;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class k0 implements Comparator {
    public long a;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i3;
        int i10;
        int i11;
        int i12;
        l0 l0Var = (l0) obj;
        l0 l0Var2 = (l0) obj2;
        if (this.a >= 0) {
            boolean z10 = l0Var.l;
            if (z10 != l0Var2.l) {
                return z10 ? -1 : 1;
            }
            boolean z11 = l0Var.P;
            if (z11 != l0Var2.P) {
                return z11 ? -1 : 1;
            }
            if (z11 && (i11 = l0Var.j) != (i12 = l0Var2.j)) {
                return i11 - i12;
            }
            i3 = l0Var.a.lastDrawnPosition;
            i10 = l0Var2.a.lastDrawnPosition;
        } else {
            boolean z12 = l0Var.l;
            if (z12 != l0Var2.l) {
                return z12 ? -1 : 1;
            }
            int i13 = l0Var.i;
            int i14 = l0Var2.i;
            if (i13 != i14) {
                return i14 - i13;
            }
            i3 = l0Var.a.lastDrawnPosition;
            i10 = l0Var2.a.lastDrawnPosition;
        }
        return i3 - i10;
    }
}
