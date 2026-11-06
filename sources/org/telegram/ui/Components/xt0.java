package org.telegram.ui.Components;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xt0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zt0 b;

    public /* synthetic */ xt0(zt0 zt0Var, int i7) {
        this.a = i7;
        this.b = zt0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                zt0 zt0Var = this.b;
                zt0Var.V0 = false;
                if (!zt0Var.Y0 && zt0Var.W0) {
                    zt0Var.C(true);
                    break;
                }
                break;
            case 1:
                this.b.V0 = false;
                break;
            case 2:
                zt0 zt0Var2 = this.b;
                zt0Var2.Y0 = false;
                if (!zt0Var2.V0 && zt0Var2.W0) {
                    zt0Var2.C(true);
                    break;
                }
                break;
            default:
                this.b.Y0 = false;
                break;
        }
    }
}
