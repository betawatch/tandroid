package org.telegram.ui;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j91 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k91 b;

    public /* synthetic */ j91(k91 k91Var, int i7) {
        this.a = i7;
        this.b = k91Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                k91 k91Var = this.b;
                k91Var.F = null;
                if (k91Var.G != -1) {
                    k91Var.H.getNotificationCenter().j(k91Var.G);
                    k91Var.G = -1;
                    break;
                }
                break;
            default:
                k91 k91Var2 = this.b;
                k91Var2.F = null;
                if (k91Var2.G != -1) {
                    k91Var2.H.getNotificationCenter().j(k91Var2.G);
                    k91Var2.G = -1;
                    break;
                }
                break;
        }
    }
}
