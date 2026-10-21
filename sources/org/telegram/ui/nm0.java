package org.telegram.ui;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nm0 implements org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ rm0 b;

    public /* synthetic */ nm0(rm0 rm0Var, int i10) {
        this.a = i10;
        this.b = rm0Var;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 0:
                rm0 rm0Var = this.b;
                rm0Var.c(true);
                rm0Var.Q.finishFragment();
                break;
            default:
                rm0 rm0Var2 = this.b;
                rm0Var2.c(true);
                rm0Var2.Q.J1(null, 0, true);
                break;
        }
    }
}
