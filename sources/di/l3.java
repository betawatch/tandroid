package di;

import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ p9 b;

    public /* synthetic */ l3(p9 p9Var, int i7) {
        this.a = i7;
        this.b = p9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.V();
                break;
            case 1:
                p9 p9Var = this.b;
                p9Var.c0 = true;
                p9Var.o(true);
                break;
            case 2:
                p9 p9Var2 = this.b;
                if (p9Var2.F != null) {
                    e9 e9Var = p9Var2.w;
                    if (e9Var != null) {
                        v.c = true;
                        e9Var.setLayerType(2, null);
                    }
                    p9Var2.F.addListener(new y8(p9Var2, 0));
                    p9Var2.F.setDuration(320L);
                    p9Var2.F.setInterpolator(xq.h);
                    p9Var2.F.start();
                    break;
                }
                break;
            case 3:
                p9 p9Var3 = this.b;
                p9Var3.v0 = null;
                p9Var3.V();
                break;
            case 4:
                this.b.R(true);
                break;
            case 5:
                p9 p9Var4 = this.b;
                p9Var4.W();
                m9 m9Var = p9Var4.s0;
                ImageReceiver imageReceiver = m9Var.b;
                if (imageReceiver != null) {
                    imageReceiver.O0(false, true);
                }
                ImageReceiver imageReceiver2 = m9Var.c;
                if (imageReceiver2 != null) {
                    imageReceiver2.O0(false, true);
                    break;
                }
                break;
            default:
                this.b.m();
                break;
        }
    }
}
