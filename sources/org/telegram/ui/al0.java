package org.telegram.ui;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class al0 implements org.telegram.ui.ActionBar.u1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fl0 b;

    public /* synthetic */ al0(fl0 fl0Var, int i10) {
        this.a = i10;
        this.b = fl0Var;
    }

    @Override // org.telegram.ui.ActionBar.u1
    public final void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.a) {
            case 0:
                fl0 fl0Var = this.b;
                fl0Var.c(true);
                fl0Var.Q.finishFragment();
                break;
            default:
                fl0 fl0Var2 = this.b;
                fl0Var2.c(true);
                fl0Var2.Q.O1(null, 0, true);
                break;
        }
    }
}
