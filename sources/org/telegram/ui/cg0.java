package org.telegram.ui;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cg0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ mg0 b;

    public /* synthetic */ cg0(mg0 mg0Var, int i10) {
        this.a = i10;
        this.b = mg0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                mg0 mg0Var = this.b;
                qj0 qj0Var = mg0Var.a;
                ng0 ng0Var = mg0Var.S;
                jg0 jg0Var = mg0Var.b;
                if (jg0Var != null) {
                    if (ng0Var.Z) {
                        qj0Var.clearFocus();
                        jg0Var.clearFocus();
                    } else if (qj0Var.length() != 0) {
                        jg0Var.requestFocus();
                        if (!mg0Var.O) {
                            jg0Var.setSelection(jg0Var.length());
                        }
                        ng0.T0(ng0Var, jg0Var);
                    } else {
                        qj0Var.requestFocus();
                        ng0.T0(ng0Var, qj0Var);
                    }
                }
                if (ng0Var.C == 0) {
                    mg0Var.t(false);
                    break;
                }
                break;
            case 1:
                mg0 mg0Var2 = this.b;
                mg0Var2.postDelayed(new cg0(mg0Var2, 2), 200L);
                break;
            case 2:
                this.b.h(null);
                break;
            case 3:
                this.b.t(true);
                break;
            default:
                mg0 mg0Var3 = this.b;
                ng0.T0(mg0Var3.S, mg0Var3.b);
                break;
        }
    }
}
