package org.telegram.ui.Components;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nv0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pv0 b;

    public /* synthetic */ nv0(pv0 pv0Var, int i10) {
        this.a = i10;
        this.b = pv0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                pv0 pv0Var = this.b;
                pv0Var.R0 = false;
                if (!pv0Var.U0 && pv0Var.S0) {
                    pv0Var.A(true);
                    break;
                }
                break;
            case 1:
                this.b.R0 = false;
                break;
            case 2:
                pv0 pv0Var2 = this.b;
                pv0Var2.U0 = false;
                if (!pv0Var2.R0 && pv0Var2.S0) {
                    pv0Var2.A(true);
                    break;
                }
                break;
            default:
                this.b.U0 = false;
                break;
        }
    }
}
