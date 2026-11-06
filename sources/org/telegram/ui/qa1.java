package org.telegram.ui;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qa1 implements org.telegram.ui.ActionBar.r1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ya1 b;

    public /* synthetic */ qa1(ya1 ya1Var, int i7) {
        this.a = i7;
        this.b = ya1Var;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public final void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.a) {
            case 0:
                this.b.finishFragment();
                break;
            case 1:
                ya1 ya1Var = this.b;
                ya1Var.G0();
                ya1Var.finishFragment();
                break;
            case 2:
                ya1 ya1Var2 = this.b;
                ya1Var2.R = "";
                ya1Var2.J0(false);
                break;
            case 3:
                ya1.f0(this.b);
                break;
            default:
                ya1.c0(this.b);
                break;
        }
    }
}
