package org.telegram.ui;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
                bk0 bk0Var = vg0Var.a;
                wg0 wg0Var = vg0Var.V;
                sg0 sg0Var = vg0Var.b;
                if (sg0Var != null) {
                    if (wg0Var.c0) {
                        bk0Var.clearFocus();
                        sg0Var.clearFocus();
                    } else if (bk0Var.length() != 0) {
                        sg0Var.requestFocus();
                        if (!vg0Var.R) {
                            sg0Var.setSelection(sg0Var.length());
                        }
                        wg0.T0(wg0Var, sg0Var);
                    } else {
                        bk0Var.requestFocus();
                        wg0.T0(wg0Var, bk0Var);
                    }
                }
                if (wg0Var.F == 0) {
                    vg0Var.s(false);
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
                this.b.s(true);
                break;
            default:
                vg0 vg0Var3 = this.b;
                wg0.T0(vg0Var3.V, vg0Var3.b);
                break;
        }
    }
}
