package org.telegram.ui.Components;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class ak0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ dk0 b;

    public /* synthetic */ ak0(dk0 dk0Var, int i10) {
        this.a = i10;
        this.b = dk0Var;
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
                dk0 dk0Var = this.b;
                fk0 fk0Var = dk0Var.P;
                try {
                    dk0Var.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                fk0Var.m0 = fk0Var.T.indexOf(dk0Var.e);
                fk0Var.l0 = dk0Var.e;
                fk0Var.invalidate();
                break;
        }
    }
}
