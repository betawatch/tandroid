package org.telegram.ui.Components;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ko0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pp0 b;

    public /* synthetic */ ko0(pp0 pp0Var, int i10) {
        this.a = i10;
        this.b = pp0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                pp0 pp0Var = this.b;
                pp0Var.s2 = true;
                h10 h10Var = pp0Var.q2;
                h10Var.r.setText("");
                org.telegram.messenger.i0.J3(h10Var.r);
                break;
            default:
                org.telegram.messenger.sz szVar = new org.telegram.messenger.sz(24);
                pp0 pp0Var2 = this.b;
                if (!pp0Var2.d) {
                    szVar.run();
                    break;
                } else {
                    h10 h10Var2 = pp0Var2.q2;
                    if (h10Var2 != null) {
                        org.telegram.messenger.i0.v1(h10Var2.r);
                    }
                    org.telegram.messenger.i0.h3(szVar, 300L);
                    break;
                }
        }
    }
}
