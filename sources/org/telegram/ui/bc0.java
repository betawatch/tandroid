package org.telegram.ui;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bc0 implements org.telegram.ui.ActionBar.u1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ gf0 b;

    public /* synthetic */ bc0(gf0 gf0Var, int i10) {
        this.a = i10;
        this.b = gf0Var;
    }

    @Override // org.telegram.ui.ActionBar.u1
    public final void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.a) {
            case 0:
                gf0 gf0Var = this.b;
                gf0Var.b[gf0Var.a].d();
                gf0Var.t1(true, true);
                break;
            default:
                gf0 gf0Var2 = this.b;
                gf0Var2.l0 = true;
                if (gf0Var2.a != 0) {
                    gf0Var2.D1(0, true, null, true);
                    break;
                }
                break;
        }
    }
}
