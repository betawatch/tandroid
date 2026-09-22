package org.telegram.ui;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fn0 implements org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ kn0 b;

    public /* synthetic */ fn0(kn0 kn0Var, int i10) {
        this.a = i10;
        this.b = kn0Var;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
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
