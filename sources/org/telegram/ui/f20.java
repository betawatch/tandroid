package org.telegram.ui;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class f20 extends g.o {
    public final /* synthetic */ b50 c;

    public f20(b50 b50Var) {
        this.c = b50Var;
    }

    @Override // g.o
    public final int i(int i10) {
        v40 v40Var;
        int i11;
        int i12;
        int i13 = b50.w5 ? 6 : 2;
        if (b50.x5 || i10 < (i11 = (v40Var = this.c.G1).G) || i10 >= (i12 = v40Var.H)) {
            return i13;
        }
        int i14 = i12 - i11;
        int i15 = (i10 != i12 - 1 || (!b50.w5 && i14 % 2 == 0)) ? 1 : 2;
        if (!b50.w5) {
            return i15;
        }
        if (i14 == 1) {
            return 6;
        }
        return i14 == 2 ? 3 : 2;
    }
}
