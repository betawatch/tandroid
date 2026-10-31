package org.telegram.ui.Components;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class po0 extends g.o {
    public final /* synthetic */ int c;
    public final /* synthetic */ op0 d;

    public /* synthetic */ po0(op0 op0Var, int i10) {
        this.c = i10;
        this.d = op0Var;
    }

    @Override // g.o
    public final int i(int i10) {
        switch (this.c) {
            case 0:
                if (i10 == 0) {
                    return this.d.z1.J;
                }
                return 1;
            case 1:
                lp0 lp0Var = this.d.E1;
                return (i10 == lp0Var.x || i10 == lp0Var.y || i10 == lp0Var.D || i10 == lp0Var.F || lp0Var.d(i10) == 0) ? 4 : 1;
            default:
                if (i10 == 0) {
                    return this.d.A1.J;
                }
                return 1;
        }
    }
}
