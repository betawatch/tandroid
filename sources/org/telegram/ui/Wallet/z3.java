package org.telegram.ui.Wallet;

import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class z3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d4 b;

    public /* synthetic */ z3(d4 d4Var, int i10) {
        this.a = i10;
        this.b = d4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.Cells.s0 s0Var = this.b.a;
                if (s0Var.getParent() instanceof View) {
                    ((View) s0Var.getParent()).invalidate();
                    break;
                }
                break;
            default:
                this.b.p();
                break;
        }
    }
}
