package org.telegram.ui.Components;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class nk0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qk0 b;

    public /* synthetic */ nk0(qk0 qk0Var, int i10) {
        this.a = i10;
        this.b = qk0Var;
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
                qk0 qk0Var = this.b;
                sk0 sk0Var = qk0Var.P;
                try {
                    qk0Var.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                sk0Var.m0 = sk0Var.T.indexOf(qk0Var.e);
                sk0Var.l0 = qk0Var.e;
                sk0Var.invalidate();
                break;
        }
    }
}
