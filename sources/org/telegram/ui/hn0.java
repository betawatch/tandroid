package org.telegram.ui;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hn0 implements org.telegram.ui.ActionBar.b2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ mn0 b;

    public /* synthetic */ hn0(mn0 mn0Var, int i10) {
        this.a = i10;
        this.b = mn0Var;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.a) {
            case 0:
                mn0 mn0Var = this.b;
                mn0Var.c(true);
                mn0Var.Q.finishFragment();
                break;
            default:
                mn0 mn0Var2 = this.b;
                mn0Var2.c(true);
                mn0Var2.Q.K1(null, 0, true);
                break;
        }
    }
}
