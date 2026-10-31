package org.telegram.ui.Components;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class av0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ cv0 b;

    public /* synthetic */ av0(cv0 cv0Var, int i10) {
        this.a = i10;
        this.b = cv0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                cv0 cv0Var = this.b;
                cv0Var.V0 = false;
                if (!cv0Var.Y0 && cv0Var.W0) {
                    cv0Var.C(true);
                    break;
                }
                break;
            case 1:
                this.b.V0 = false;
                break;
            case 2:
                cv0 cv0Var2 = this.b;
                cv0Var2.Y0 = false;
                if (!cv0Var2.V0 && cv0Var2.W0) {
                    cv0Var2.C(true);
                    break;
                }
                break;
            default:
                this.b.Y0 = false;
                break;
        }
    }
}
