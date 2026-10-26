package org.telegram.ui.Components;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class al0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ dl0 b;

    public /* synthetic */ al0(dl0 dl0Var, int i10) {
        this.a = i10;
        this.b = dl0Var;
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
                dl0 dl0Var = this.b;
                fl0 fl0Var = dl0Var.P;
                try {
                    dl0Var.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                fl0Var.m0 = fl0Var.T.indexOf(dl0Var.e);
                fl0Var.l0 = dl0Var.e;
                fl0Var.invalidate();
                break;
        }
    }
}
