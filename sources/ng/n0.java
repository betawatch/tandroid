package ng;

import java.util.Comparator;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
            boolean z4 = o0Var.m;
            if (z4 != o0Var2.m) {
                return z4 ? -1 : 1;
            }
            boolean z10 = o0Var.Q;
            if (z10 != o0Var2.Q) {
                return z10 ? -1 : 1;
            }
            if (z10 && (i12 = o0Var.k) != (i13 = o0Var2.k)) {
                return i12 - i13;
            }
            i10 = o0Var.a.lastDrawnPosition;
            i11 = o0Var2.a.lastDrawnPosition;
        } else {
            boolean z11 = o0Var.m;
            if (z11 != o0Var2.m) {
                return z11 ? -1 : 1;
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
