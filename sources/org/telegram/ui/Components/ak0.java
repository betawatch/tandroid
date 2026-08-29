package org.telegram.ui.Components;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
                if (this.b.a.getImageReceiver().getLottieAnimation() != null && !this.b.a.getImageReceiver().getLottieAnimation().h0 && !this.b.a.getImageReceiver().getLottieAnimation().w()) {
                    this.b.a.getImageReceiver().getLottieAnimation().start();
                }
                this.b.A = false;
                break;
            default:
                dk0 dk0Var = this.b;
                fk0 fk0Var = dk0Var.L;
                try {
                    dk0Var.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                fk0Var.i0 = fk0Var.P.indexOf(dk0Var.e);
                fk0Var.h0 = dk0Var.e;
                fk0Var.invalidate();
                break;
        }
    }
}
