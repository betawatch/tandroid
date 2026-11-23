package org.telegram.ui;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class b31 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n31 b;

    public /* synthetic */ b31(n31 n31Var, int i7) {
        this.a = i7;
        this.b = n31Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        n31 n31Var = this.b;
        switch (i7) {
            case 0:
                org.telegram.messenger.mp.u1(n31Var.currentAccount).l0(null);
                break;
            case 1:
                vf.c.t(n31Var.getParentActivity(), org.telegram.messenger.gd.N0(2131752142, null));
                break;
            default:
                n31Var.c.g3.O(true);
                break;
        }
    }
}
