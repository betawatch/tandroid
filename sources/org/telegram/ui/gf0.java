package org.telegram.ui;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gf0 implements org.telegram.ui.ActionBar.c2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ rf0 b;

    public /* synthetic */ gf0(rf0 rf0Var, int i10) {
        this.a = i10;
        this.b = rf0Var;
    }

    @Override // org.telegram.ui.ActionBar.c2
    public final void i(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.a) {
            case 0:
                rf0 rf0Var = this.b;
                rf0Var.c(true);
                rf0Var.p0.u1(0, true, null, true);
                break;
            default:
                this.b.p0.u1(0, true, null, true);
                break;
        }
    }
}
