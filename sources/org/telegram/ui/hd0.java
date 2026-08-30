package org.telegram.ui;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hd0 implements org.telegram.ui.ActionBar.c2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ng0 b;

    public /* synthetic */ hd0(ng0 ng0Var, int i10) {
        this.a = i10;
        this.b = ng0Var;
    }

    @Override // org.telegram.ui.ActionBar.c2
    public final void i(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.a) {
            case 0:
                ng0 ng0Var = this.b;
                ng0Var.b[ng0Var.a].d();
                ng0Var.k1(true, true);
                break;
            default:
                ng0 ng0Var2 = this.b;
                ng0Var2.i0 = true;
                if (ng0Var2.a != 0) {
                    ng0Var2.u1(0, true, null, true);
                    break;
                }
                break;
        }
    }
}
