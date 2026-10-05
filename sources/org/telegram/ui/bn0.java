package org.telegram.ui;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bn0 implements org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ gn0 b;

    public /* synthetic */ bn0(gn0 gn0Var, int i10) {
        this.a = i10;
        this.b = gn0Var;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 0:
                gn0 gn0Var = this.b;
                gn0Var.c(true);
                gn0Var.Q.finishFragment();
                break;
            default:
                gn0 gn0Var2 = this.b;
                gn0Var2.c(true);
                gn0Var2.Q.K1(null, 0, true);
                break;
        }
    }
}
