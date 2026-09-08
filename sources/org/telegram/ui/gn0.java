package org.telegram.ui;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class gn0 implements org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ln0 b;

    public /* synthetic */ gn0(ln0 ln0Var, int i10) {
        this.a = i10;
        this.b = ln0Var;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
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
