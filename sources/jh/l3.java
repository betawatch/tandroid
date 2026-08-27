package jh;

import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.er;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final /* synthetic */ class l3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i9 b;

    public /* synthetic */ l3(i9 i9Var, int i10) {
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
                    i9Var2.B.setInterpolator(er.h);
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
