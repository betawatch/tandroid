package org.telegram.ui;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mm0 implements org.telegram.ui.ActionBar.b2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ rm0 b;

    public /* synthetic */ mm0(rm0 rm0Var, int i10) {
        this.a = i10;
        this.b = rm0Var;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.a) {
            case 0:
                rm0 rm0Var = this.b;
                rm0Var.c(true);
                rm0Var.M.finishFragment();
                break;
            default:
                rm0 rm0Var2 = this.b;
                rm0Var2.c(true);
                rm0Var2.M.K1(null, 0, true);
                break;
        }
    }
}
