package org.telegram.ui;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ad0 implements org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ig0 b;

    public /* synthetic */ ad0(ig0 ig0Var, int i10) {
        this.a = i10;
        this.b = ig0Var;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 0:
                ig0 ig0Var = this.b;
                ig0Var.b[ig0Var.a].d();
                ig0Var.k1(true, true);
                break;
            default:
                ig0 ig0Var2 = this.b;
                ig0Var2.h0 = true;
                if (ig0Var2.a != 0) {
                    ig0Var2.u1(0, true, null, true);
                    break;
                }
                break;
        }
    }
}
