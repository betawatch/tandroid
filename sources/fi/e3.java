package fi;

import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.lr;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class e3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f9 b;

    public /* synthetic */ e3(f9 f9Var, int i7) {
        this.a = i7;
        this.b = f9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.V();
                break;
            case 1:
                f9 f9Var = this.b;
                f9Var.d0 = true;
                f9Var.o(true);
                break;
            case 2:
                f9 f9Var2 = this.b;
                if (f9Var2.G != null) {
                    u8 u8Var = f9Var2.w;
                    if (u8Var != null) {
                        v.c = true;
                        u8Var.setLayerType(2, null);
                    }
                    f9Var2.G.addListener(new o8(f9Var2, 0));
                    f9Var2.G.setDuration(320L);
                    f9Var2.G.setInterpolator(lr.h);
                    f9Var2.G.start();
                    break;
                }
                break;
            case 3:
                f9 f9Var3 = this.b;
                f9Var3.w0 = null;
                f9Var3.V();
                break;
            case 4:
                this.b.R(true);
                break;
            case 5:
                f9 f9Var4 = this.b;
                f9Var4.W();
                c9 c9Var = f9Var4.t0;
                ImageReceiver imageReceiver = c9Var.b;
                if (imageReceiver != null) {
                    imageReceiver.O0(false, true);
                }
                ImageReceiver imageReceiver2 = c9Var.c;
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
