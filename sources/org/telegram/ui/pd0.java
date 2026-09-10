package org.telegram.ui;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class pd0 implements org.telegram.ui.ActionBar.c2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xg0 b;

    public /* synthetic */ pd0(xg0 xg0Var, int i10) {
        this.a = i10;
        this.b = xg0Var;
    }

    @Override // org.telegram.ui.ActionBar.c2
    public final void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.a) {
            case 0:
                xg0 xg0Var = this.b;
                xg0Var.b[xg0Var.a].d();
                xg0Var.k1(true, true);
                break;
            default:
                xg0 xg0Var2 = this.b;
                xg0Var2.l0 = true;
                if (xg0Var2.a != 0) {
                    xg0Var2.u1(0, true, null, true);
                    break;
                }
                break;
        }
    }
}
