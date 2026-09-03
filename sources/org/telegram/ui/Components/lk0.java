package org.telegram.ui.Components;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class lk0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ok0 b;

    public /* synthetic */ lk0(ok0 ok0Var, int i10) {
        this.a = i10;
        this.b = ok0Var;
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
                ok0 ok0Var = this.b;
                qk0 qk0Var = ok0Var.M;
                try {
                    ok0Var.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                qk0Var.j0 = qk0Var.Q.indexOf(ok0Var.e);
                qk0Var.i0 = ok0Var.e;
                qk0Var.invalidate();
                break;
        }
    }
}
