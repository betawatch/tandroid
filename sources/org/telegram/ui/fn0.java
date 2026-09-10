package org.telegram.ui;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class fn0 implements org.telegram.ui.ActionBar.c2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ kn0 b;

    public /* synthetic */ fn0(kn0 kn0Var, int i10) {
        this.a = i10;
        this.b = kn0Var;
    }

    @Override // org.telegram.ui.ActionBar.c2
    public final void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.a) {
            case 0:
                kn0 kn0Var = this.b;
                kn0Var.c(true);
                kn0Var.Q.finishFragment();
                break;
            default:
                kn0 kn0Var2 = this.b;
                kn0Var2.c(true);
                kn0Var2.Q.K1(null, 0, true);
                break;
        }
    }
}
