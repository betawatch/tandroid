package org.telegram.ui;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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
