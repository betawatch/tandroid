package org.telegram.ui.Components;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class rj0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ uj0 b;

    public /* synthetic */ rj0(uj0 uj0Var, int i10) {
        this.a = i10;
        this.b = uj0Var;
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
                uj0 uj0Var = this.b;
                wj0 wj0Var = uj0Var.L;
                try {
                    uj0Var.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                wj0Var.i0 = wj0Var.P.indexOf(uj0Var.e);
                wj0Var.h0 = uj0Var.e;
                wj0Var.invalidate();
                break;
        }
    }
}
