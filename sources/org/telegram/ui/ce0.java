package org.telegram.ui;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class ce0 implements org.telegram.ui.ActionBar.u1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ me0 b;

    public /* synthetic */ ce0(me0 me0Var, int i10) {
        this.a = i10;
        this.b = me0Var;
    }

    @Override // org.telegram.ui.ActionBar.u1
    public final void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.a) {
            case 0:
                me0 me0Var = this.b;
                me0Var.c(true);
                me0Var.u0.C1(0, true, null, true);
                break;
            default:
                this.b.u0.C1(0, true, null, true);
                break;
        }
    }
}
