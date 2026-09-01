package org.telegram.ui.Components;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class mk0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pk0 b;

    public /* synthetic */ mk0(pk0 pk0Var, int i10) {
        this.a = i10;
        this.b = pk0Var;
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
                pk0 pk0Var = this.b;
                rk0 rk0Var = pk0Var.M;
                try {
                    pk0Var.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                rk0Var.j0 = rk0Var.Q.indexOf(pk0Var.e);
                rk0Var.i0 = pk0Var.e;
                rk0Var.invalidate();
                break;
        }
    }
}
