package org.telegram.ui;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class nc0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ oc0 b;

    public /* synthetic */ nc0(oc0 oc0Var, int i7) {
        this.a = i7;
        this.b = oc0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                oc0 oc0Var = this.b;
                pc0 pc0Var = oc0Var.d;
                if (oc0Var.b) {
                    boolean z10 = pc0Var.M;
                    org.telegram.ui.Components.mh0 mh0Var = pc0Var.L;
                    xc xcVar = pc0Var.n;
                    if (z10 && System.currentTimeMillis() - oc0Var.a >= 10000) {
                        xcVar.setAnimation(mh0Var);
                        mh0Var.N(0, false, false);
                        mh0Var.u0 = new nc0(oc0Var, 1);
                        xcVar.d();
                        oc0Var.a = System.currentTimeMillis();
                    }
                    xcVar.postDelayed(oc0Var.c, 1000L);
                    break;
                }
                break;
            case 1:
                org.telegram.messenger.g0.g3(new nc0(this.b, 2));
                break;
            default:
                pc0 pc0Var2 = this.b.d;
                org.telegram.ui.Components.mh0 mh0Var2 = pc0Var2.K;
                mh0Var2.N(0, false, false);
                pc0Var2.n.setAnimation(mh0Var2);
                break;
        }
    }
}
