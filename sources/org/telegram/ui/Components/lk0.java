package org.telegram.ui.Components;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class lk0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ok0 b;

    public /* synthetic */ lk0(ok0 ok0Var, int i10) {
        this.a = i10;
        this.b = ok0Var;
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
                ok0 ok0Var = this.b;
                qk0 qk0Var = ok0Var.P;
                try {
                    ok0Var.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                qk0Var.m0 = qk0Var.T.indexOf(ok0Var.e);
                qk0Var.l0 = ok0Var.e;
                qk0Var.invalidate();
                break;
        }
    }
}
