package org.telegram.ui;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class c31 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ o31 b;

    public /* synthetic */ c31(o31 o31Var, int i7) {
        this.a = i7;
        this.b = o31Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        o31 o31Var = this.b;
        switch (i7) {
            case 0:
                org.telegram.messenger.mp.u1(o31Var.currentAccount).l0(null);
                break;
            case 1:
                vf.c.t(o31Var.getParentActivity(), org.telegram.messenger.gd.M0(2131752143, null));
                break;
            default:
                o31Var.c.g3.O(true);
                break;
        }
    }
}
