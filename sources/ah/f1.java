package ah;

import java.util.Comparator;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class f1 implements Comparator {
    public long a;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i10;
        int i11;
        int i12;
        int i13;
        h1 h1Var = (h1) obj;
        h1 h1Var2 = (h1) obj2;
        if (this.a >= 0) {
            boolean z10 = h1Var.m;
            if (z10 != h1Var2.m) {
                return z10 ? -1 : 1;
            }
            boolean z11 = h1Var.Q;
            if (z11 != h1Var2.Q) {
                return z11 ? -1 : 1;
            }
            if (z11 && (i12 = h1Var.k) != (i13 = h1Var2.k)) {
                return i12 - i13;
            }
            i10 = h1Var.a.lastDrawnPosition;
            i11 = h1Var2.a.lastDrawnPosition;
        } else {
            boolean z12 = h1Var.m;
            if (z12 != h1Var2.m) {
                return z12 ? -1 : 1;
            }
            int i14 = h1Var.j;
            int i15 = h1Var2.j;
            if (i14 != i15) {
                return i15 - i14;
            }
            i10 = h1Var.a.lastDrawnPosition;
            i11 = h1Var2.a.lastDrawnPosition;
        }
        return i10 - i11;
    }
}
