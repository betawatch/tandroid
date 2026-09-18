package org.telegram.ui;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ng0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xg0 b;

    public /* synthetic */ ng0(xg0 xg0Var, int i10) {
        this.a = i10;
        this.b = xg0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                xg0 xg0Var = this.b;
                ck0 ck0Var = xg0Var.a;
                yg0 yg0Var = xg0Var.V;
                ug0 ug0Var = xg0Var.b;
                if (ug0Var != null) {
                    if (yg0Var.c0) {
                        ck0Var.clearFocus();
                        ug0Var.clearFocus();
                    } else if (ck0Var.length() != 0) {
                        ug0Var.requestFocus();
                        if (!xg0Var.R) {
                            ug0Var.setSelection(ug0Var.length());
                        }
                        yg0.T0(yg0Var, ug0Var);
                    } else {
                        ck0Var.requestFocus();
                        yg0.T0(yg0Var, ck0Var);
                    }
                }
                if (yg0Var.F == 0) {
                    xg0Var.u(false);
                    break;
                }
                break;
            case 1:
                xg0 xg0Var2 = this.b;
                xg0Var2.postDelayed(new ng0(xg0Var2, 2), 200L);
                break;
            case 2:
                this.b.h(null);
                break;
            case 3:
                this.b.u(true);
                break;
            default:
                xg0 xg0Var3 = this.b;
                yg0.T0(xg0Var3.V, xg0Var3.b);
                break;
        }
    }
}
