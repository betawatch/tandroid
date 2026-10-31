package org.telegram.ui.Components;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class jo0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ op0 b;

    public /* synthetic */ jo0(op0 op0Var, int i10) {
        this.a = i10;
        this.b = op0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                op0 op0Var = this.b;
                op0Var.s2 = true;
                h10 h10Var = op0Var.q2;
                h10Var.r.setText("");
                org.telegram.messenger.i0.J3(h10Var.r);
                break;
            default:
                org.telegram.messenger.rz rzVar = new org.telegram.messenger.rz(24);
                op0 op0Var2 = this.b;
                if (!op0Var2.d) {
                    rzVar.run();
                    break;
                } else {
                    h10 h10Var2 = op0Var2.q2;
                    if (h10Var2 != null) {
                        org.telegram.messenger.i0.v1(h10Var2.r);
                    }
                    org.telegram.messenger.i0.h3(rzVar, 300L);
                    break;
                }
        }
    }
}
