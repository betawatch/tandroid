package org.telegram.ui;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
                    org.telegram.ui.Components.mh0 mh0Var = oc0Var.L;
                    xc xcVar = oc0Var.n;
                    if (z10 && System.currentTimeMillis() - nc0Var.a >= 10000) {
                        xcVar.setAnimation(mh0Var);
                        mh0Var.N(0, false, false);
                        mh0Var.u0 = new mc0(nc0Var, 1);
                        xcVar.d();
                        nc0Var.a = System.currentTimeMillis();
                    }
                    xcVar.postDelayed(nc0Var.c, 1000L);
                    break;
                }
                break;
            case 1:
                org.telegram.messenger.g0.g3(new mc0(this.b, 2));
                break;
            default:
                oc0 oc0Var2 = this.b.d;
                org.telegram.ui.Components.mh0 mh0Var2 = oc0Var2.K;
                mh0Var2.N(0, false, false);
                oc0Var2.n.setAnimation(mh0Var2);
                break;
        }
    }
}
