package org.telegram.ui;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class cc0 implements org.telegram.ui.ActionBar.u1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ hf0 b;

    public /* synthetic */ cc0(hf0 hf0Var, int i10) {
        this.a = i10;
        this.b = hf0Var;
    }

    @Override // org.telegram.ui.ActionBar.u1
    public final void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.a) {
            case 0:
                hf0 hf0Var = this.b;
                hf0Var.b[hf0Var.a].d();
                hf0Var.s1(true, true);
                break;
            default:
                hf0 hf0Var2 = this.b;
                hf0Var2.l0 = true;
                if (hf0Var2.a != 0) {
                    hf0Var2.C1(0, true, null, true);
                    break;
                }
                break;
        }
    }
}
