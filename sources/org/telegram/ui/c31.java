package org.telegram.ui;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class c31 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n31 b;

    public /* synthetic */ c31(n31 n31Var, int i7) {
        this.a = i7;
        this.b = n31Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        n31 n31Var = this.b;
        switch (i7) {
            case 0:
                org.telegram.messenger.qp.s1(n31Var.currentAccount).l0(null);
                break;
            case 1:
                vf.c.t(n31Var.getParentActivity(), org.telegram.messenger.id.M0(2131752154, null));
                break;
            default:
                n31Var.c.f3.O(true);
                break;
        }
    }
}
