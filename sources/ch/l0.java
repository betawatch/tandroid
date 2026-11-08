package ch;

import java.util.Comparator;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class l0 implements Comparator {
    public long a;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i7;
        int i10;
        int i11;
        int i12;
        m0 m0Var = (m0) obj;
        m0 m0Var2 = (m0) obj2;
        if (this.a >= 0) {
            boolean z9 = m0Var.l;
            if (z9 != m0Var2.l) {
                return z9 ? -1 : 1;
            }
            boolean z10 = m0Var.P;
            if (z10 != m0Var2.P) {
                return z10 ? -1 : 1;
            }
            if (z10 && (i11 = m0Var.j) != (i12 = m0Var2.j)) {
                return i11 - i12;
            }
            i7 = m0Var.a.lastDrawnPosition;
            i10 = m0Var2.a.lastDrawnPosition;
        } else {
            boolean z11 = m0Var.l;
            if (z11 != m0Var2.l) {
                return z11 ? -1 : 1;
            }
            int i13 = m0Var.i;
            int i14 = m0Var2.i;
            if (i13 != i14) {
                return i14 - i13;
            }
            i7 = m0Var.a.lastDrawnPosition;
            i10 = m0Var2.a.lastDrawnPosition;
        }
        return i7 - i10;
    }
}
