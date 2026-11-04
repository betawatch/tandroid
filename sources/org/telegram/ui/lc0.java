package org.telegram.ui;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lc0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ mc0 b;

    public /* synthetic */ lc0(mc0 mc0Var, int i3) {
        this.a = i3;
        this.b = mc0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                mc0 mc0Var = this.b;
                nc0 nc0Var = mc0Var.d;
                if (mc0Var.b) {
                    boolean z10 = nc0Var.L;
                    org.telegram.ui.Components.ch0 ch0Var = nc0Var.K;
                    xc xcVar = nc0Var.n;
                    if (z10 && System.currentTimeMillis() - mc0Var.a >= 10000) {
                        xcVar.setAnimation(ch0Var);
                        ch0Var.N(0, false, false);
                        ch0Var.u0 = new lc0(mc0Var, 1);
                        xcVar.d();
                        mc0Var.a = System.currentTimeMillis();
                    }
                    xcVar.postDelayed(mc0Var.c, 1000L);
                    break;
                }
                break;
            case 1:
                org.telegram.messenger.g0.h3(new lc0(this.b, 2));
                break;
            default:
                nc0 nc0Var2 = this.b.d;
                org.telegram.ui.Components.ch0 ch0Var2 = nc0Var2.J;
                ch0Var2.N(0, false, false);
                nc0Var2.n.setAnimation(ch0Var2);
                break;
        }
    }
}
