package org.telegram.ui;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pa0 implements org.telegram.ui.ActionBar.p1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xd0 b;

    public /* synthetic */ pa0(xd0 xd0Var, int i3) {
        this.a = i3;
        this.b = xd0Var;
    }

    @Override // org.telegram.ui.ActionBar.p1
    public final void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        switch (this.a) {
            case 0:
                xd0 xd0Var = this.b;
                xd0Var.b[xd0Var.a].d();
                xd0Var.t1(true, true);
                break;
            default:
                xd0 xd0Var2 = this.b;
                xd0Var2.m0 = true;
                if (xd0Var2.a != 0) {
                    xd0Var2.D1(0, true, null, true);
                    break;
                }
                break;
        }
    }
}
