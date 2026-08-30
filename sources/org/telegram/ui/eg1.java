package org.telegram.ui;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class eg1 implements org.telegram.ui.ActionBar.c2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ og1 b;

    public /* synthetic */ eg1(og1 og1Var, int i10) {
        this.a = i10;
        this.b = og1Var;
    }

    @Override // org.telegram.ui.ActionBar.c2
    public final void i(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.a) {
            case 0:
                this.b.finishFragment();
                break;
            case 1:
                og1 og1Var = this.b;
                og1Var.B0();
                og1Var.finishFragment();
                break;
            case 2:
                og1 og1Var2 = this.b;
                og1Var2.O = "";
                og1Var2.E0(false);
                break;
            case 3:
                og1.a0(this.b);
                break;
            default:
                og1.X(this.b);
                break;
        }
    }
}
