package org.telegram.ui.Components;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class yt0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ au0 b;

    public /* synthetic */ yt0(au0 au0Var, int i7) {
        this.a = i7;
        this.b = au0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                au0 au0Var = this.b;
                au0Var.W0 = false;
                if (!au0Var.Z0 && au0Var.X0) {
                    au0Var.C(true);
                    break;
                }
                break;
            case 1:
                this.b.W0 = false;
                break;
            case 2:
                au0 au0Var2 = this.b;
                au0Var2.Z0 = false;
                if (!au0Var2.W0 && au0Var2.X0) {
                    au0Var2.C(true);
                    break;
                }
                break;
            default:
                this.b.Z0 = false;
                break;
        }
    }
}
