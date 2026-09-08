package org.telegram.ui;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class pd0 implements org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wg0 b;

    public /* synthetic */ pd0(wg0 wg0Var, int i10) {
        this.a = i10;
        this.b = wg0Var;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 0:
                wg0 wg0Var = this.b;
                wg0Var.b[wg0Var.a].d();
                wg0Var.k1(true, true);
                break;
            default:
                wg0 wg0Var2 = this.b;
                wg0Var2.l0 = true;
                if (wg0Var2.a != 0) {
                    wg0Var2.u1(0, true, null, true);
                    break;
                }
                break;
        }
    }
}
