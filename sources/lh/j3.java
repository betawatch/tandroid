package lh;

import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.jr;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class j3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i9 b;

    public /* synthetic */ j3(i9 i9Var, int i10) {
        this.a = i10;
        this.b = i9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.P();
                break;
            case 1:
                i9 i9Var = this.b;
                i9Var.Y = true;
                i9Var.n(true);
                break;
            case 2:
                i9 i9Var2 = this.b;
                if (i9Var2.B != null) {
                    x8 x8Var = i9Var2.v;
                    if (x8Var != null) {
                        t.c = true;
                        x8Var.setLayerType(2, null);
                    }
                    i9Var2.B.addListener(new r8(i9Var2, 0));
                    i9Var2.B.setDuration(320L);
                    i9Var2.B.setInterpolator(jr.h);
                    i9Var2.B.start();
                    break;
                }
                break;
            case 3:
                i9 i9Var3 = this.b;
                i9Var3.r0 = null;
                i9Var3.P();
                break;
            case 4:
                this.b.L(true);
                break;
            case 5:
                i9 i9Var4 = this.b;
                i9Var4.Q();
                f9 f9Var = i9Var4.o0;
                ImageReceiver imageReceiver = f9Var.b;
                if (imageReceiver != null) {
                    imageReceiver.setVisible(false, true);
                }
                ImageReceiver imageReceiver2 = f9Var.c;
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
