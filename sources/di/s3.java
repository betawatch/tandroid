package di;

import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.ds;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class s3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ y9 b;

    public /* synthetic */ s3(y9 y9Var, int i10) {
        this.a = i10;
        this.b = y9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.P();
                break;
            case 1:
                y9 y9Var = this.b;
                y9Var.c0 = true;
                y9Var.n(true);
                break;
            case 2:
                y9 y9Var2 = this.b;
                if (y9Var2.F != null) {
                    n9 n9Var = y9Var2.v;
                    if (n9Var != null) {
                        w.c = true;
                        n9Var.setLayerType(2, null);
                    }
                    y9Var2.F.addListener(new h9(y9Var2, 0));
                    y9Var2.F.setDuration(320L);
                    y9Var2.F.setInterpolator(ds.h);
                    y9Var2.F.start();
                    break;
                }
                break;
            case 3:
                y9 y9Var3 = this.b;
                y9Var3.v0 = null;
                y9Var3.P();
                break;
            case 4:
                this.b.L(true);
                break;
            case 5:
                y9 y9Var4 = this.b;
                y9Var4.Q();
                v9 v9Var = y9Var4.s0;
                ImageReceiver imageReceiver = v9Var.b;
                if (imageReceiver != null) {
                    imageReceiver.setVisible(false, true);
                }
                ImageReceiver imageReceiver2 = v9Var.c;
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
