package org.telegram.ui;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qc0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ rc0 b;

    public /* synthetic */ qc0(rc0 rc0Var, int i7) {
        this.a = i7;
        this.b = rc0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                rc0 rc0Var = this.b;
                sc0 sc0Var = rc0Var.d;
                if (rc0Var.b) {
                    boolean z9 = sc0Var.L;
                    org.telegram.ui.Components.zg0 zg0Var = sc0Var.K;
                    yc ycVar = sc0Var.n;
                    if (z9 && System.currentTimeMillis() - rc0Var.a >= 10000) {
                        ycVar.setAnimation(zg0Var);
                        zg0Var.N(0, false, false);
                        zg0Var.t0 = new qc0(rc0Var, 1);
                        ycVar.d();
                        rc0Var.a = System.currentTimeMillis();
                    }
                    ycVar.postDelayed(rc0Var.c, 1000L);
                    break;
                }
                break;
            case 1:
                org.telegram.messenger.g0.h3(new qc0(this.b, 2));
                break;
            default:
                sc0 sc0Var2 = this.b.d;
                org.telegram.ui.Components.zg0 zg0Var2 = sc0Var2.J;
                zg0Var2.N(0, false, false);
                sc0Var2.n.setAnimation(zg0Var2);
                break;
        }
    }
}
