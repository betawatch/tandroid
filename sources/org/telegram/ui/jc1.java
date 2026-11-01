package org.telegram.ui;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jc1 implements org.telegram.ui.ActionBar.u1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ rc1 b;

    public /* synthetic */ jc1(rc1 rc1Var, int i10) {
        this.a = i10;
        this.b = rc1Var;
    }

    @Override // org.telegram.ui.ActionBar.u1
    public final void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.a) {
            case 0:
                this.b.finishFragment();
                break;
            case 1:
                rc1 rc1Var = this.b;
                rc1Var.G0();
                rc1Var.finishFragment();
                break;
            case 2:
                rc1 rc1Var2 = this.b;
                rc1Var2.R = "";
                rc1Var2.J0(false);
                break;
            case 3:
                rc1.f0(this.b);
                break;
            default:
                rc1.c0(this.b);
                break;
        }
    }
}
