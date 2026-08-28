package org.telegram.ui.Components;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class pj0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sj0 b;

    public /* synthetic */ pj0(sj0 sj0Var, int i9) {
        this.a = i9;
        this.b = sj0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                if (this.b.a.getImageReceiver().getLottieAnimation() != null && !this.b.a.getImageReceiver().getLottieAnimation().h0 && !this.b.a.getImageReceiver().getLottieAnimation().w()) {
                    this.b.a.getImageReceiver().getLottieAnimation().start();
                }
                this.b.A = false;
                break;
            default:
                sj0 sj0Var = this.b;
                uj0 uj0Var = sj0Var.L;
                try {
                    sj0Var.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                uj0Var.i0 = uj0Var.P.indexOf(sj0Var.e);
                uj0Var.h0 = sj0Var.e;
                uj0Var.invalidate();
                break;
        }
    }
}
