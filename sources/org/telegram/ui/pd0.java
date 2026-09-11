package org.telegram.ui;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
