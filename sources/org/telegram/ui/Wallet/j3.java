package org.telegram.ui.Wallet;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class j3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n3 b;

    public /* synthetic */ j3(n3 n3Var, int i3) {
        this.a = i3;
        this.b = n3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                n3 n3Var = this.b;
                if (!n3Var.T && !n3Var.S) {
                    n3Var.a(1.0f);
                    break;
                }
                break;
            default:
                n3 n3Var2 = this.b;
                if (!n3Var2.T && !n3Var2.S) {
                    jh.d.c(n3Var2.F, n3Var2.h);
                    n3Var2.G.d();
                    f6 f6Var = n3Var2.r;
                    j3 j3Var = new j3(n3Var2, 0);
                    a6 a6Var = f6Var.E;
                    if (a6Var == null) {
                        j3Var.run();
                        break;
                    } else if (a6Var.b == null) {
                        a6Var.d = j3Var;
                        break;
                    } else {
                        j3Var.run();
                        break;
                    }
                }
                break;
        }
    }
}
