package org.telegram.ui.Components;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class yk0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bl0 b;

    public /* synthetic */ yk0(bl0 bl0Var, int i10) {
        this.a = i10;
        this.b = bl0Var;
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
                bl0 bl0Var = this.b;
                dl0 dl0Var = bl0Var.P;
                try {
                    bl0Var.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                dl0Var.m0 = dl0Var.T.indexOf(bl0Var.e);
                dl0Var.l0 = bl0Var.e;
                dl0Var.invalidate();
                break;
        }
    }
}
