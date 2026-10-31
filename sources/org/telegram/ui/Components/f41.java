package org.telegram.ui.Components;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class f41 implements tu0 {
    public int a;
    public boolean b;
    public final /* synthetic */ g41 c;

    public f41(g41 g41Var) {
        this.c = g41Var;
    }

    @Override // org.telegram.ui.Components.tu0
    public final void K(int i10, boolean z10) {
        if (this.a == i10 && this.b == z10) {
            return;
        }
        this.a = i10;
        this.b = z10;
        if (i10 > org.telegram.messenger.i0.L(20.0f)) {
            g41 g41Var = this.c;
            if (g41Var.g0) {
                return;
            }
            g41Var.n0.q0 = false;
            g41Var.g0 = true;
        }
    }
}
