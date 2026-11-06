package org.telegram.ui;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
                    boolean z9 = pc0Var.L;
                    org.telegram.ui.Components.zg0 zg0Var = pc0Var.K;
                    yc ycVar = pc0Var.n;
                    if (z9 && System.currentTimeMillis() - oc0Var.a >= 10000) {
                        ycVar.setAnimation(zg0Var);
                        zg0Var.N(0, false, false);
                        zg0Var.t0 = new nc0(oc0Var, 1);
                        ycVar.d();
                        oc0Var.a = System.currentTimeMillis();
                    }
                    ycVar.postDelayed(oc0Var.c, 1000L);
                    break;
                }
                break;
            case 1:
                org.telegram.messenger.g0.h3(new nc0(this.b, 2));
                break;
            default:
                pc0 pc0Var2 = this.b.d;
                org.telegram.ui.Components.zg0 zg0Var2 = pc0Var2.J;
                zg0Var2.N(0, false, false);
                pc0Var2.n.setAnimation(zg0Var2);
                break;
        }
    }
}
