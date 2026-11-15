package fi;

import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.er;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class g3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i9 b;

    public /* synthetic */ g3(i9 i9Var, int i7) {
        this.a = i7;
        this.b = i9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.V();
                break;
            case 1:
                i9 i9Var = this.b;
                i9Var.d0 = true;
                i9Var.o(true);
                break;
            case 2:
                i9 i9Var2 = this.b;
                if (i9Var2.G != null) {
                    x8 x8Var = i9Var2.w;
                    if (x8Var != null) {
                        v.c = true;
                        x8Var.setLayerType(2, null);
                    }
                    i9Var2.G.addListener(new r8(i9Var2, 0));
                    i9Var2.G.setDuration(320L);
                    i9Var2.G.setInterpolator(er.h);
                    i9Var2.G.start();
                    break;
                }
                break;
            case 3:
                i9 i9Var3 = this.b;
                i9Var3.w0 = null;
                i9Var3.V();
                break;
            case 4:
                this.b.R(true);
                break;
            case 5:
                i9 i9Var4 = this.b;
                i9Var4.W();
                f9 f9Var = i9Var4.t0;
                ImageReceiver imageReceiver = f9Var.b;
                if (imageReceiver != null) {
                    imageReceiver.O0(false, true);
                }
                ImageReceiver imageReceiver2 = f9Var.c;
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
