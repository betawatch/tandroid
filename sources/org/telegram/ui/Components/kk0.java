package org.telegram.ui.Components;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
                if (this.b.a.getImageReceiver().getLottieAnimation() != null && !this.b.a.getImageReceiver().getLottieAnimation().l0 && !this.b.a.getImageReceiver().getLottieAnimation().y()) {
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
