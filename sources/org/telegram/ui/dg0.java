package org.telegram.ui;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dg0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ng0 b;

    public /* synthetic */ dg0(ng0 ng0Var, int i10) {
        this.a = i10;
        this.b = ng0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ng0 ng0Var = this.b;
                rj0 rj0Var = ng0Var.a;
                og0 og0Var = ng0Var.S;
                kg0 kg0Var = ng0Var.b;
                if (kg0Var != null) {
                    if (og0Var.Z) {
                        rj0Var.clearFocus();
                        kg0Var.clearFocus();
                    } else if (rj0Var.length() != 0) {
                        kg0Var.requestFocus();
                        if (!ng0Var.O) {
                            kg0Var.setSelection(kg0Var.length());
                        }
                        og0.T0(og0Var, kg0Var);
                    } else {
                        rj0Var.requestFocus();
                        og0.T0(og0Var, rj0Var);
                    }
                }
                if (og0Var.C == 0) {
                    ng0Var.t(false);
                    break;
                }
                break;
            case 1:
                ng0 ng0Var2 = this.b;
                ng0Var2.postDelayed(new dg0(ng0Var2, 2), 200L);
                break;
            case 2:
                this.b.h(null);
                break;
            case 3:
                this.b.t(true);
                break;
            default:
                ng0 ng0Var3 = this.b;
                og0.T0(ng0Var3.S, ng0Var3.b);
                break;
        }
    }
}
