package org.telegram.ui;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final /* synthetic */ class gn0 implements org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ln0 b;

    public /* synthetic */ gn0(ln0 ln0Var, int i10) {
        this.a = i10;
        this.b = ln0Var;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 0:
                ln0 ln0Var = this.b;
                ln0Var.c(true);
                ln0Var.Q.finishFragment();
                break;
            default:
                ln0 ln0Var2 = this.b;
                ln0Var2.c(true);
                ln0Var2.Q.K1(null, 0, true);
                break;
        }
    }
}
