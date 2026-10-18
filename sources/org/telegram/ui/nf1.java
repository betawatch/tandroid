package org.telegram.ui;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nf1 implements org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xf1 b;

    public /* synthetic */ nf1(xf1 xf1Var, int i10) {
        this.a = i10;
        this.b = xf1Var;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 0:
                this.b.finishFragment();
                break;
            case 1:
                xf1 xf1Var = this.b;
                xf1Var.B0();
                xf1Var.finishFragment();
                break;
            case 2:
                xf1 xf1Var2 = this.b;
                xf1Var2.R = "";
                xf1Var2.E0(false);
                break;
            case 3:
                xf1.a0(this.b);
                break;
            default:
                xf1.X(this.b);
                break;
        }
    }
}
