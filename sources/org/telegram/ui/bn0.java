package org.telegram.ui;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bn0 implements org.telegram.ui.ActionBar.b2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ gn0 b;

    public /* synthetic */ bn0(gn0 gn0Var, int i10) {
        this.a = i10;
        this.b = gn0Var;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public final void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
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
