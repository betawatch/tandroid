package org.telegram.ui;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ha1 implements org.telegram.ui.ActionBar.p1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ra1 b;

    public /* synthetic */ ha1(ra1 ra1Var, int i3) {
        this.a = i3;
        this.b = ra1Var;
    }

    @Override // org.telegram.ui.ActionBar.p1
    public final void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        switch (this.a) {
            case 0:
                this.b.finishFragment();
                break;
            case 1:
                ra1 ra1Var = this.b;
                ra1Var.G0();
                ra1Var.finishFragment();
                break;
            case 2:
                ra1 ra1Var2 = this.b;
                ra1Var2.S = "";
                ra1Var2.J0(false);
                break;
            case 3:
                ra1.f0(this.b);
                break;
            default:
                ra1.c0(this.b);
                break;
        }
    }
}
