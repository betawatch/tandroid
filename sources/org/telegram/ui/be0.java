package org.telegram.ui;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class be0 implements org.telegram.ui.ActionBar.u1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ le0 b;

    public /* synthetic */ be0(le0 le0Var, int i10) {
        this.a = i10;
        this.b = le0Var;
    }

    @Override // org.telegram.ui.ActionBar.u1
    public final void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.a) {
            case 0:
                le0 le0Var = this.b;
                le0Var.c(true);
                le0Var.u0.D1(0, true, null, true);
                break;
            default:
                this.b.u0.D1(0, true, null, true);
                break;
        }
    }
}
