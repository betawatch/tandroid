package org.telegram.ui;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class o20 extends g.o {
    public final /* synthetic */ q50 c;

    public o20(q50 q50Var) {
        this.c = q50Var;
    }

    @Override // g.o
    public final int i(int i10) {
        k50 k50Var;
        int i11;
        int i12;
        int i13 = q50.F3 ? 6 : 2;
        if (q50.G3 || i10 < (i11 = (k50Var = this.c.P).G) || i10 >= (i12 = k50Var.H)) {
            return i13;
        }
        int i14 = i12 - i11;
        int i15 = (i10 != i12 - 1 || (!q50.F3 && i14 % 2 == 0)) ? 1 : 2;
        if (!q50.F3) {
            return i15;
        }
        if (i14 == 1) {
            return 6;
        }
        return i14 == 2 ? 3 : 2;
    }
}
