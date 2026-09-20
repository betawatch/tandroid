package org.telegram.ui.Components;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class kk0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ nk0 b;

    public /* synthetic */ kk0(nk0 nk0Var, int i10) {
        this.a = i10;
        this.b = nk0Var;
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
                nk0 nk0Var = this.b;
                pk0 pk0Var = nk0Var.P;
                try {
                    nk0Var.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                pk0Var.m0 = pk0Var.T.indexOf(nk0Var.e);
                pk0Var.l0 = nk0Var.e;
                pk0Var.invalidate();
                break;
        }
    }
}
