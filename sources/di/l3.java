package di;

import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class l3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q9 b;

    public /* synthetic */ l3(q9 q9Var, int i7) {
        this.a = i7;
        this.b = q9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.V();
                break;
            case 1:
                q9 q9Var = this.b;
                q9Var.c0 = true;
                q9Var.o(true);
                break;
            case 2:
                q9 q9Var2 = this.b;
                if (q9Var2.F != null) {
                    f9 f9Var = q9Var2.w;
                    if (f9Var != null) {
                        v.c = true;
                        f9Var.setLayerType(2, null);
                    }
                    q9Var2.F.addListener(new z8(q9Var2, 0));
                    q9Var2.F.setDuration(320L);
                    q9Var2.F.setInterpolator(xq.h);
                    q9Var2.F.start();
                    break;
                }
                break;
            case 3:
                q9 q9Var3 = this.b;
                q9Var3.v0 = null;
                q9Var3.V();
                break;
            case 4:
                this.b.R(true);
                break;
            case 5:
                q9 q9Var4 = this.b;
                q9Var4.W();
                n9 n9Var = q9Var4.s0;
                ImageReceiver imageReceiver = n9Var.b;
                if (imageReceiver != null) {
                    imageReceiver.O0(false, true);
                }
                ImageReceiver imageReceiver2 = n9Var.c;
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
