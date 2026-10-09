package org.telegram.ui;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class en0 implements org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ jn0 b;

    public /* synthetic */ en0(jn0 jn0Var, int i10) {
        this.a = i10;
        this.b = jn0Var;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 0:
                jn0 jn0Var = this.b;
                jn0Var.c(true);
                jn0Var.Q.finishFragment();
                break;
            default:
                jn0 jn0Var2 = this.b;
                jn0Var2.c(true);
                jn0Var2.Q.J1(null, 0, true);
                break;
        }
    }
}
