package org.telegram.ui;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d31 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ o31 b;

    public /* synthetic */ d31(o31 o31Var, int i7) {
        this.a = i7;
        this.b = o31Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        o31 o31Var = this.b;
        switch (i7) {
            case 0:
                org.telegram.messenger.qp.s1(o31Var.currentAccount).l0(null);
                break;
            case 1:
                vf.c.t(o31Var.getParentActivity(), org.telegram.messenger.id.M0(2131752154, null));
                break;
            default:
                o31Var.c.f3.O(true);
                break;
        }
    }
}
