package org.telegram.ui.Components;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class xk0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ al0 b;

    public /* synthetic */ xk0(al0 al0Var, int i10) {
        this.a = i10;
        this.b = al0Var;
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
                al0 al0Var = this.b;
                cl0 cl0Var = al0Var.P;
                try {
                    al0Var.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                cl0Var.m0 = cl0Var.T.indexOf(al0Var.e);
                cl0Var.l0 = al0Var.e;
                cl0Var.invalidate();
                break;
        }
    }
}
