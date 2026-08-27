package org.telegram.ui;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pm0 implements org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ tm0 b;

    public /* synthetic */ pm0(tm0 tm0Var, int i10) {
        this.a = i10;
        this.b = tm0Var;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 0:
                tm0 tm0Var = this.b;
                tm0Var.c(true);
                tm0Var.M.finishFragment();
                break;
            default:
                tm0 tm0Var2 = this.b;
                tm0Var2.c(true);
                tm0Var2.M.K1(0, true, null);
                break;
        }
    }
}
