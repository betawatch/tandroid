package org.telegram.ui;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class gg0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qg0 b;

    public /* synthetic */ gg0(qg0 qg0Var, int i10) {
        this.a = i10;
        this.b = qg0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                qg0 qg0Var = this.b;
                uj0 uj0Var = qg0Var.a;
                rg0 rg0Var = qg0Var.V;
                ng0 ng0Var = qg0Var.b;
                if (ng0Var != null) {
                    if (rg0Var.c0) {
                        uj0Var.clearFocus();
                        ng0Var.clearFocus();
                    } else if (uj0Var.length() != 0) {
                        ng0Var.requestFocus();
                        if (!qg0Var.R) {
                            ng0Var.setSelection(ng0Var.length());
                        }
                        rg0.T0(rg0Var, ng0Var);
                    } else {
                        uj0Var.requestFocus();
                        rg0.T0(rg0Var, uj0Var);
                    }
                }
                if (rg0Var.F == 0) {
                    qg0Var.u(false);
                    break;
                }
                break;
            case 1:
                qg0 qg0Var2 = this.b;
                qg0Var2.postDelayed(new gg0(qg0Var2, 2), 200L);
                break;
            case 2:
                this.b.h(null);
                break;
            case 3:
                this.b.u(true);
                break;
            default:
                qg0 qg0Var3 = this.b;
                rg0.T0(qg0Var3.V, qg0Var3.b);
                break;
        }
    }
}
