package org.telegram.ui.Components;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
                if (this.b.a.getImageReceiver().getLottieAnimation() != null && !this.b.a.getImageReceiver().getLottieAnimation().i0 && !this.b.a.getImageReceiver().getLottieAnimation().w()) {
                    this.b.a.getImageReceiver().getLottieAnimation().start();
                }
                this.b.B = false;
                break;
            default:
                nk0 nk0Var = this.b;
                pk0 pk0Var = nk0Var.M;
                try {
                    nk0Var.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                pk0Var.j0 = pk0Var.Q.indexOf(nk0Var.e);
                pk0Var.i0 = nk0Var.e;
                pk0Var.invalidate();
                break;
        }
    }
}
