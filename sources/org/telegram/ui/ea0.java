package org.telegram.ui;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ea0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ la0 b;

    public /* synthetic */ ea0(la0 la0Var, int i10) {
        this.a = i10;
        this.b = la0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        la0 la0Var = this.b;
        switch (i10) {
            case 0:
                gf.f.r(la0Var.getParentActivity(), org.telegram.messenger.dd.L0(2131746173, null));
                break;
            case 1:
                la0Var.r.d.requestFocus();
                org.telegram.messenger.i0.J3(la0Var.r.d);
                break;
            default:
                la0Var.r.d.clearFocus();
                org.telegram.messenger.i0.v1(la0Var.r.d);
                break;
        }
    }
}
