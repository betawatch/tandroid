package org.telegram.ui;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mf0 implements org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xf0 b;

    public /* synthetic */ mf0(xf0 xf0Var, int i10) {
        this.a = i10;
        this.b = xf0Var;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 0:
                xf0 xf0Var = this.b;
                xf0Var.c(true);
                xf0Var.s0.u1(0, true, null, true);
                break;
            default:
                this.b.s0.u1(0, true, null, true);
                break;
        }
    }
}
