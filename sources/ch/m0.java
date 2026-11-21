package ch;

import java.util.Comparator;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class m0 implements Comparator {
    public long a;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i7;
        int i10;
        int i11;
        int i12;
        n0 n0Var = (n0) obj;
        n0 n0Var2 = (n0) obj2;
        if (this.a >= 0) {
            boolean z10 = n0Var.l;
            if (z10 != n0Var2.l) {
                return z10 ? -1 : 1;
            }
            boolean z11 = n0Var.P;
            if (z11 != n0Var2.P) {
                return z11 ? -1 : 1;
            }
            if (z11 && (i11 = n0Var.j) != (i12 = n0Var2.j)) {
                return i11 - i12;
            }
            i7 = n0Var.a.lastDrawnPosition;
            i10 = n0Var2.a.lastDrawnPosition;
        } else {
            boolean z12 = n0Var.l;
            if (z12 != n0Var2.l) {
                return z12 ? -1 : 1;
            }
            int i13 = n0Var.i;
            int i14 = n0Var2.i;
            if (i13 != i14) {
                return i14 - i13;
            }
            i7 = n0Var.a.lastDrawnPosition;
            i10 = n0Var2.a.lastDrawnPosition;
        }
        return i7 - i10;
    }
}
