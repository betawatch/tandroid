package ci;

import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.bs;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes4.dex */
public final /* synthetic */ class s3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ z9 b;

    public /* synthetic */ s3(z9 z9Var, int i10) {
        this.a = i10;
        this.b = z9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.P();
                break;
            case 1:
                z9 z9Var = this.b;
                z9Var.c0 = true;
                z9Var.n(true);
                break;
            case 2:
                z9 z9Var2 = this.b;
                if (z9Var2.F != null) {
                    o9 o9Var = z9Var2.v;
                    if (o9Var != null) {
                        w.c = true;
                        o9Var.setLayerType(2, null);
                    }
                    z9Var2.F.addListener(new i9(z9Var2, 0));
                    z9Var2.F.setDuration(320L);
                    z9Var2.F.setInterpolator(bs.h);
                    z9Var2.F.start();
                    break;
                }
                break;
            case 3:
                z9 z9Var3 = this.b;
                z9Var3.v0 = null;
                z9Var3.P();
                break;
            case 4:
                this.b.L(true);
                break;
            case 5:
                z9 z9Var4 = this.b;
                z9Var4.Q();
                w9 w9Var = z9Var4.s0;
                ImageReceiver imageReceiver = w9Var.b;
                if (imageReceiver != null) {
                    imageReceiver.setVisible(false, true);
                }
                ImageReceiver imageReceiver2 = w9Var.c;
                if (imageReceiver2 != null) {
                    imageReceiver2.setVisible(false, true);
                    break;
                }
                break;
            default:
                this.b.m();
                break;
        }
    }
}
