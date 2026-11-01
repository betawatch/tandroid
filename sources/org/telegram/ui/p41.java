package org.telegram.ui;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p41 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c51 b;

    public /* synthetic */ p41(c51 c51Var, int i10) {
        this.a = i10;
        this.b = c51Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        c51 c51Var = this.b;
        switch (i10) {
            case 0:
                org.telegram.messenger.wp.r1(c51Var.currentAccount).l0(null);
                break;
            case 1:
                gf.f.r(c51Var.getParentActivity(), org.telegram.messenger.dd.L0(2131752154, null));
                break;
            default:
                c51Var.c.f3.O(true);
                break;
        }
    }
}
