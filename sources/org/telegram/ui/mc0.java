package org.telegram.ui;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class mc0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ nc0 b;

    public /* synthetic */ mc0(nc0 nc0Var, int i7) {
        this.a = i7;
        this.b = nc0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                nc0 nc0Var = this.b;
                oc0 oc0Var = nc0Var.d;
                if (nc0Var.b) {
                    boolean z10 = oc0Var.M;
                    org.telegram.ui.Components.ch0 ch0Var = oc0Var.L;
                    xc xcVar = oc0Var.n;
                    if (z10 && System.currentTimeMillis() - nc0Var.a >= 10000) {
                        xcVar.setAnimation(ch0Var);
                        ch0Var.N(0, false, false);
                        ch0Var.u0 = new mc0(nc0Var, 1);
                        xcVar.d();
                        nc0Var.a = System.currentTimeMillis();
                    }
                    xcVar.postDelayed(nc0Var.c, 1000L);
                    break;
                }
                break;
            case 1:
                org.telegram.messenger.g0.h3(new mc0(this.b, 2));
                break;
            default:
                oc0 oc0Var2 = this.b.d;
                org.telegram.ui.Components.ch0 ch0Var2 = oc0Var2.K;
                ch0Var2.N(0, false, false);
                oc0Var2.n.setAnimation(ch0Var2);
                break;
        }
    }
}
