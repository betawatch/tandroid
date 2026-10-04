package org.telegram.ui;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class nd0 implements org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ug0 b;

    public /* synthetic */ nd0(ug0 ug0Var, int i10) {
        this.a = i10;
        this.b = ug0Var;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 0:
                ug0 ug0Var = this.b;
                ug0Var.b[ug0Var.a].d();
                ug0Var.k1(true, true);
                break;
            default:
                ug0 ug0Var2 = this.b;
                ug0Var2.l0 = true;
                if (ug0Var2.a != 0) {
                    ug0Var2.u1(0, true, null, true);
                    break;
                }
                break;
        }
    }
}
