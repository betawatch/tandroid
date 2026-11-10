package org.telegram.ui.Wallet;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final /* synthetic */ class j3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ p3 b;

    public /* synthetic */ j3(p3 p3Var, int i7) {
        this.a = i7;
        this.b = p3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                p3 p3Var = this.b;
                if (!p3Var.S && !p3Var.R) {
                    ih.d.c(p3Var.E, p3Var.h);
                    p3Var.F.d();
                    i6 i6Var = p3Var.r;
                    j3 j3Var = new j3(p3Var, 1);
                    d6 d6Var = i6Var.D;
                    if (d6Var == null) {
                        j3Var.run();
                        break;
                    } else if (d6Var.b == null) {
                        d6Var.d = j3Var;
                        break;
                    } else {
                        j3Var.run();
                        break;
                    }
                }
                break;
            default:
                p3 p3Var2 = this.b;
                if (!p3Var2.S && !p3Var2.R) {
                    p3Var2.a(1.0f);
                    break;
                }
                break;
        }
    }
}
