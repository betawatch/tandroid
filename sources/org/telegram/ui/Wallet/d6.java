package org.telegram.ui.Wallet;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g6 b;

    public /* synthetic */ d6(g6 g6Var, int i10) {
        this.a = i10;
        this.b = g6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.performClick();
                break;
            default:
                g6 g6Var = this.b;
                g6Var.h.invalidate();
                g6Var.n.invalidate();
                g6Var.e.invalidate();
                break;
        }
    }
}
