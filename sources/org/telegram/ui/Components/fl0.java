package org.telegram.ui.Components;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class fl0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ il0 b;

    public /* synthetic */ fl0(il0 il0Var, int i10) {
        this.a = i10;
        this.b = il0Var;
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
                il0 il0Var = this.b;
                kl0 kl0Var = il0Var.P;
                try {
                    il0Var.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                kl0Var.m0 = kl0Var.T.indexOf(il0Var.e);
                kl0Var.l0 = il0Var.e;
                kl0Var.invalidate();
                break;
        }
    }
}
