package org.telegram.ui.Components;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class bk0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ek0 b;

    public /* synthetic */ bk0(ek0 ek0Var, int i10) {
        this.a = i10;
        this.b = ek0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                if (this.b.a.getImageReceiver().getLottieAnimation() != null && !this.b.a.getImageReceiver().getLottieAnimation().k0 && !this.b.a.getImageReceiver().getLottieAnimation().y()) {
                    this.b.a.getImageReceiver().getLottieAnimation().start();
                }
                this.b.E = false;
                break;
            default:
                ek0 ek0Var = this.b;
                gk0 gk0Var = ek0Var.P;
                try {
                    ek0Var.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                gk0Var.m0 = gk0Var.T.indexOf(ek0Var.e);
                gk0Var.l0 = ek0Var.e;
                gk0Var.invalidate();
                break;
        }
    }
}
