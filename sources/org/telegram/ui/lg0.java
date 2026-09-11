package org.telegram.ui;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final /* synthetic */ class lg0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vg0 b;

    public /* synthetic */ lg0(vg0 vg0Var, int i10) {
        this.a = i10;
        this.b = vg0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                vg0 vg0Var = this.b;
                ck0 ck0Var = vg0Var.a;
                wg0 wg0Var = vg0Var.V;
                sg0 sg0Var = vg0Var.b;
                if (sg0Var != null) {
                    if (wg0Var.c0) {
                        ck0Var.clearFocus();
                        sg0Var.clearFocus();
                    } else if (ck0Var.length() != 0) {
                        sg0Var.requestFocus();
                        if (!vg0Var.R) {
                            sg0Var.setSelection(sg0Var.length());
                        }
                        wg0.T0(wg0Var, sg0Var);
                    } else {
                        ck0Var.requestFocus();
                        wg0.T0(wg0Var, ck0Var);
                    }
                }
                if (wg0Var.F == 0) {
                    vg0Var.u(false);
                    break;
                }
                break;
            case 1:
                vg0 vg0Var2 = this.b;
                vg0Var2.postDelayed(new lg0(vg0Var2, 2), 200L);
                break;
            case 2:
                this.b.h(null);
                break;
            case 3:
                this.b.u(true);
                break;
            default:
                vg0 vg0Var3 = this.b;
                wg0.T0(vg0Var3.V, vg0Var3.b);
                break;
        }
    }
}
