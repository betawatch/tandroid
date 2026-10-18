package ah;

import java.util.Comparator;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class e1 implements Comparator {
    public long a;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i10;
        int i11;
        int i12;
        int i13;
        g1 g1Var = (g1) obj;
        g1 g1Var2 = (g1) obj2;
        if (this.a >= 0) {
            boolean z10 = g1Var.m;
            if (z10 != g1Var2.m) {
                return z10 ? -1 : 1;
            }
            boolean z11 = g1Var.Q;
            if (z11 != g1Var2.Q) {
                return z11 ? -1 : 1;
            }
            if (z11 && (i12 = g1Var.k) != (i13 = g1Var2.k)) {
                return i12 - i13;
            }
            i10 = g1Var.a.lastDrawnPosition;
            i11 = g1Var2.a.lastDrawnPosition;
        } else {
            boolean z12 = g1Var.m;
            if (z12 != g1Var2.m) {
                return z12 ? -1 : 1;
            }
            int i14 = g1Var.j;
            int i15 = g1Var2.j;
            if (i14 != i15) {
                return i15 - i14;
            }
            i10 = g1Var.a.lastDrawnPosition;
            i11 = g1Var2.a.lastDrawnPosition;
        }
        return i10 - i11;
    }
}
