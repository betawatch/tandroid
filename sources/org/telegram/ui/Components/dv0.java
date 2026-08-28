package org.telegram.ui.Components;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dv0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ fv0 b;

    public /* synthetic */ dv0(fv0 fv0Var, int i9) {
        this.a = i9;
        this.b = fv0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                fv0 fv0Var = this.b;
                fv0Var.R0 = false;
                if (!fv0Var.U0 && fv0Var.S0) {
                    fv0Var.A(true);
                    break;
                }
                break;
            case 1:
                this.b.R0 = false;
                break;
            case 2:
                fv0 fv0Var2 = this.b;
                fv0Var2.U0 = false;
                if (!fv0Var2.R0 && fv0Var2.S0) {
                    fv0Var2.A(true);
                    break;
                }
                break;
            default:
                this.b.U0 = false;
                break;
        }
    }
}
