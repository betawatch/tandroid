package org.telegram.ui;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lf1 implements org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ vf1 b;

    public /* synthetic */ lf1(vf1 vf1Var, int i10) {
        this.a = i10;
        this.b = vf1Var;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 0:
                this.b.finishFragment();
                break;
            case 1:
                vf1 vf1Var = this.b;
                vf1Var.B0();
                vf1Var.finishFragment();
                break;
            case 2:
                vf1 vf1Var2 = this.b;
                vf1Var2.R = "";
                vf1Var2.E0(false);
                break;
            case 3:
                vf1.a0(this.b);
                break;
            default:
                vf1.X(this.b);
                break;
        }
    }
}
