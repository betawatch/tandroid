package org.telegram.ui;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class lc1 implements org.telegram.ui.ActionBar.u1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ tc1 b;

    public /* synthetic */ lc1(tc1 tc1Var, int i10) {
        this.a = i10;
        this.b = tc1Var;
    }

    @Override // org.telegram.ui.ActionBar.u1
    public final void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.a) {
            case 0:
                this.b.finishFragment();
                break;
            case 1:
                tc1 tc1Var = this.b;
                tc1Var.F0();
                tc1Var.finishFragment();
                break;
            case 2:
                tc1 tc1Var2 = this.b;
                tc1Var2.R = "";
                tc1Var2.I0(false);
                break;
            case 3:
                tc1.e0(this.b);
                break;
            default:
                tc1.b0(this.b);
                break;
        }
    }
}
