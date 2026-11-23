package org.telegram.ui.Wallet;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class r3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ x3 b;

    public /* synthetic */ r3(x3 x3Var, int i7) {
        this.a = i7;
        this.b = x3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                x3 x3Var = this.b;
                if (!x3Var.T && !x3Var.S) {
                    ih.d.c(x3Var.F, x3Var.h);
                    x3Var.G.d();
                    y6 y6Var = x3Var.r;
                    r3 r3Var = new r3(x3Var, 1);
                    t6 t6Var = y6Var.E;
                    if (t6Var == null) {
                        r3Var.run();
                        break;
                    } else if (t6Var.b == null) {
                        t6Var.d = r3Var;
                        break;
                    } else {
                        r3Var.run();
                        break;
                    }
                }
                break;
            default:
                x3 x3Var2 = this.b;
                if (!x3Var2.T && !x3Var2.S) {
                    x3Var2.a(1.0f);
                    break;
                }
                break;
        }
    }
}
