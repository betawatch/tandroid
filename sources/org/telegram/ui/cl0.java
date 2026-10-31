package org.telegram.ui;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class cl0 implements org.telegram.ui.ActionBar.u1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ hl0 b;

    public /* synthetic */ cl0(hl0 hl0Var, int i10) {
        this.a = i10;
        this.b = hl0Var;
    }

    @Override // org.telegram.ui.ActionBar.u1
    public final void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.a) {
            case 0:
                hl0 hl0Var = this.b;
                hl0Var.c(true);
                hl0Var.Q.finishFragment();
                break;
            default:
                hl0 hl0Var2 = this.b;
                hl0Var2.c(true);
                hl0Var2.Q.N1(null, 0, true);
                break;
        }
    }
}
