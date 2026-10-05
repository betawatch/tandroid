package org.telegram.ui;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jg0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ tg0 b;

    public /* synthetic */ jg0(tg0 tg0Var, int i10) {
        this.a = i10;
        this.b = tg0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                tg0 tg0Var = this.b;
                yj0 yj0Var = tg0Var.a;
                ug0 ug0Var = tg0Var.V;
                qg0 qg0Var = tg0Var.b;
                if (qg0Var != null) {
                    if (ug0Var.c0) {
                        yj0Var.clearFocus();
                        qg0Var.clearFocus();
                    } else if (yj0Var.length() != 0) {
                        qg0Var.requestFocus();
                        if (!tg0Var.R) {
                            qg0Var.setSelection(qg0Var.length());
                        }
                        ug0.T0(ug0Var, qg0Var);
                    } else {
                        yj0Var.requestFocus();
                        ug0.T0(ug0Var, yj0Var);
                    }
                }
                if (ug0Var.F == 0) {
                    tg0Var.u(false);
                    break;
                }
                break;
            case 1:
                tg0 tg0Var2 = this.b;
                tg0Var2.postDelayed(new jg0(tg0Var2, 2), 200L);
                break;
            case 2:
                this.b.h(null);
                break;
            case 3:
                this.b.u(true);
                break;
            default:
                tg0 tg0Var3 = this.b;
                ug0.T0(tg0Var3.V, tg0Var3.b);
                break;
        }
    }
}
