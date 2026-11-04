package org.telegram.ui;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a91 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b91 b;

    public /* synthetic */ a91(b91 b91Var, int i3) {
        this.a = i3;
        this.b = b91Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                b91 b91Var = this.b;
                b91Var.F = null;
                if (b91Var.G != -1) {
                    b91Var.H.getNotificationCenter().j(b91Var.G);
                    b91Var.G = -1;
                    break;
                }
                break;
            default:
                b91 b91Var2 = this.b;
                b91Var2.F = null;
                if (b91Var2.G != -1) {
                    b91Var2.H.getNotificationCenter().j(b91Var2.G);
                    b91Var2.G = -1;
                    break;
                }
                break;
        }
    }
}
