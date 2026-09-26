package org.telegram.ui;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fg0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pg0 b;

    public /* synthetic */ fg0(pg0 pg0Var, int i10) {
        this.a = i10;
        this.b = pg0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                pg0 pg0Var = this.b;
                uj0 uj0Var = pg0Var.a;
                qg0 qg0Var = pg0Var.V;
                mg0 mg0Var = pg0Var.b;
                if (mg0Var != null) {
                    if (qg0Var.c0) {
                        uj0Var.clearFocus();
                        mg0Var.clearFocus();
                    } else if (uj0Var.length() != 0) {
                        mg0Var.requestFocus();
                        if (!pg0Var.R) {
                            mg0Var.setSelection(mg0Var.length());
                        }
                        qg0.T0(qg0Var, mg0Var);
                    } else {
                        uj0Var.requestFocus();
                        qg0.T0(qg0Var, uj0Var);
                    }
                }
                if (qg0Var.F == 0) {
                    pg0Var.u(false);
                    break;
                }
                break;
            case 1:
                pg0 pg0Var2 = this.b;
                pg0Var2.postDelayed(new fg0(pg0Var2, 2), 200L);
                break;
            case 2:
                this.b.h(null);
                break;
            case 3:
                this.b.u(true);
                break;
            default:
                pg0 pg0Var3 = this.b;
                qg0.T0(pg0Var3.V, pg0Var3.b);
                break;
        }
    }
}
