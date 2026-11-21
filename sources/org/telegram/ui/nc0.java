package org.telegram.ui;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
                    org.telegram.ui.Components.oh0 oh0Var = pc0Var.L;
                    xc xcVar = pc0Var.n;
                    if (z10 && System.currentTimeMillis() - oc0Var.a >= 10000) {
                        xcVar.setAnimation(oh0Var);
                        oh0Var.N(0, false, false);
                        oh0Var.u0 = new nc0(oc0Var, 1);
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
                org.telegram.ui.Components.oh0 oh0Var2 = pc0Var2.K;
                oh0Var2.N(0, false, false);
                pc0Var2.n.setAnimation(oh0Var2);
                break;
        }
    }
}
