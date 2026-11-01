package org.telegram.ui.Components;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class ij0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ lj0 b;

    public /* synthetic */ ij0(lj0 lj0Var, int i10) {
        this.a = i10;
        this.b = lj0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                if (this.b.a.getImageReceiver().B() != null && !this.b.a.getImageReceiver().B().k0 && !this.b.a.getImageReceiver().B().y()) {
                    this.b.a.getImageReceiver().B().start();
                }
                this.b.E = false;
                break;
            default:
                lj0 lj0Var = this.b;
                nj0 nj0Var = lj0Var.P;
                try {
                    lj0Var.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                nj0Var.m0 = nj0Var.T.indexOf(lj0Var.e);
                nj0Var.l0 = lj0Var.e;
                nj0Var.invalidate();
                break;
        }
    }
}
