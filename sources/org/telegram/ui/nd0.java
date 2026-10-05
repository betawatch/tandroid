package org.telegram.ui;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
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
