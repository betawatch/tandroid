package org.telegram.ui.Components;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class bl0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ el0 b;

    public /* synthetic */ bl0(el0 el0Var, int i10) {
        this.a = i10;
        this.b = el0Var;
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
                el0 el0Var = this.b;
                gl0 gl0Var = el0Var.P;
                try {
                    el0Var.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                gl0Var.m0 = gl0Var.T.indexOf(el0Var.e);
                gl0Var.l0 = el0Var.e;
                gl0Var.invalidate();
                break;
        }
    }
}
