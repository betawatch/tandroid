package ei;

import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r9 b;

    public /* synthetic */ o3(r9 r9Var, int i3) {
        this.a = i3;
        this.b = r9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.d0();
                break;
            case 1:
                r9 r9Var = this.b;
                r9Var.d0 = true;
                r9Var.A(true);
                break;
            case 2:
                r9 r9Var2 = this.b;
                if (r9Var2.G != null) {
                    f9 f9Var = r9Var2.w;
                    if (f9Var != null) {
                        w.c = true;
                        f9Var.setLayerType(2, null);
                    }
                    r9Var2.G.addListener(new z8(r9Var2, 0));
                    r9Var2.G.setDuration(320L);
                    r9Var2.G.setInterpolator(xq.h);
                    r9Var2.G.start();
                    break;
                }
                break;
            case 3:
                r9 r9Var3 = this.b;
                r9Var3.w0 = null;
                r9Var3.d0();
                break;
            case 4:
                this.b.Z(true);
                break;
            case 5:
                r9 r9Var4 = this.b;
                r9Var4.e0();
                o9 o9Var = r9Var4.t0;
                ImageReceiver imageReceiver = o9Var.b;
                if (imageReceiver != null) {
                    imageReceiver.O0(false, true);
                }
                ImageReceiver imageReceiver2 = o9Var.c;
                if (imageReceiver2 != null) {
                    imageReceiver2.O0(false, true);
                    break;
                }
                break;
            default:
                this.b.z();
                break;
        }
    }
}
