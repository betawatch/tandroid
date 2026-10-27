package bh;

import java.util.Comparator;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class t0 implements Comparator {
    public long a;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i10;
        int i11;
        int i12;
        int i13;
        v0 v0Var = (v0) obj;
        v0 v0Var2 = (v0) obj2;
        if (this.a >= 0) {
            boolean z10 = v0Var.m;
            if (z10 != v0Var2.m) {
                return z10 ? -1 : 1;
            }
            boolean z11 = v0Var.Q;
            if (z11 != v0Var2.Q) {
                return z11 ? -1 : 1;
            }
            if (z11 && (i12 = v0Var.k) != (i13 = v0Var2.k)) {
                return i12 - i13;
            }
            i10 = v0Var.a.lastDrawnPosition;
            i11 = v0Var2.a.lastDrawnPosition;
        } else {
            boolean z12 = v0Var.m;
            if (z12 != v0Var2.m) {
                return z12 ? -1 : 1;
            }
            int i14 = v0Var.j;
            int i15 = v0Var2.j;
            if (i14 != i15) {
                return i15 - i14;
            }
            i10 = v0Var.a.lastDrawnPosition;
            i11 = v0Var2.a.lastDrawnPosition;
        }
        return i10 - i11;
    }
}
