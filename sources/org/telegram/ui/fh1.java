package org.telegram.ui;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fh1 implements org.telegram.ui.ActionBar.z1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ oh1 b;

    public /* synthetic */ fh1(oh1 oh1Var, int i10) {
        this.a = i10;
        this.b = oh1Var;
    }

    @Override // org.telegram.ui.ActionBar.z1
    public final void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.a) {
            case 0:
                this.b.finishFragment();
                break;
            case 1:
                oh1 oh1Var = this.b;
                oh1Var.B0();
                oh1Var.finishFragment();
                break;
            case 2:
                oh1 oh1Var2 = this.b;
                oh1Var2.R = "";
                oh1Var2.E0(false);
                break;
            case 3:
                oh1.a0(this.b);
                break;
            default:
                oh1.X(this.b);
                break;
        }
    }
}
