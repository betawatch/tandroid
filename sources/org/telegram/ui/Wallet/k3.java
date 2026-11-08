package org.telegram.ui.Wallet;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class k3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ o3 b;

    public /* synthetic */ k3(o3 o3Var, int i7) {
        this.a = i7;
        this.b = o3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                o3 o3Var = this.b;
                if (!o3Var.S && !o3Var.R) {
                    o3Var.a(1.0f);
                    break;
                }
                break;
            default:
                o3 o3Var2 = this.b;
                if (!o3Var2.S && !o3Var2.R) {
                    ih.d.c(o3Var2.E, o3Var2.h);
                    o3Var2.F.d();
                    g6 g6Var = o3Var2.r;
                    k3 k3Var = new k3(o3Var2, 0);
                    b6 b6Var = g6Var.D;
                    if (b6Var == null) {
                        k3Var.run();
                        break;
                    } else if (b6Var.b == null) {
                        b6Var.d = k3Var;
                        break;
                    } else {
                        k3Var.run();
                        break;
                    }
                }
                break;
        }
    }
}
