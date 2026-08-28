package org.telegram.ui;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class om0 implements org.telegram.ui.ActionBar.b2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ sm0 b;

    public /* synthetic */ om0(sm0 sm0Var, int i9) {
        this.a = i9;
        this.b = sm0Var;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        switch (this.a) {
            case 0:
                sm0 sm0Var = this.b;
                sm0Var.c(true);
                sm0Var.M.finishFragment();
                break;
            default:
                sm0 sm0Var2 = this.b;
                sm0Var2.c(true);
                sm0Var2.M.K1(0, true, null);
                break;
        }
    }
}
