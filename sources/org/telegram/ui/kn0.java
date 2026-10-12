package org.telegram.ui;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class kn0 implements org.telegram.ui.ActionBar.z1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ qn0 b;

    public /* synthetic */ kn0(qn0 qn0Var, int i10) {
        this.a = i10;
        this.b = qn0Var;
    }

    @Override // org.telegram.ui.ActionBar.z1
    public final void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.a) {
            case 0:
                qn0 qn0Var = this.b;
                qn0Var.c(true);
                qn0Var.Q.finishFragment();
                break;
            default:
                qn0 qn0Var2 = this.b;
                qn0Var2.c(true);
                qn0Var2.Q.J1(null, 0, true);
                break;
        }
    }
}
