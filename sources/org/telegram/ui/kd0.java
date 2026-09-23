package org.telegram.ui;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class kd0 implements org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ rg0 b;

    public /* synthetic */ kd0(rg0 rg0Var, int i10) {
        this.a = i10;
        this.b = rg0Var;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 0:
                rg0 rg0Var = this.b;
                rg0Var.b[rg0Var.a].d();
                rg0Var.k1(true, true);
                break;
            default:
                rg0 rg0Var2 = this.b;
                rg0Var2.l0 = true;
                if (rg0Var2.a != 0) {
                    rg0Var2.u1(0, true, null, true);
                    break;
                }
                break;
        }
    }
}
