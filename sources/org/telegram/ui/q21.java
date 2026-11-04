package org.telegram.ui;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q21 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c31 b;

    public /* synthetic */ q21(c31 c31Var, int i3) {
        this.a = i3;
        this.b = c31Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = this.a;
        c31 c31Var = this.b;
        switch (i3) {
            case 0:
                org.telegram.messenger.hp.s1(c31Var.currentAccount).l0(null);
                break;
            case 1:
                sf.c.t(c31Var.getParentActivity(), org.telegram.messenger.bd.M0(2131752154, null));
                break;
            default:
                c31Var.c.g3.O(true);
                break;
        }
    }
}
