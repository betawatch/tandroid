package org.telegram.ui;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gg1 implements org.telegram.ui.ActionBar.c2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ qg1 b;

    public /* synthetic */ gg1(qg1 qg1Var, int i10) {
        this.a = i10;
        this.b = qg1Var;
    }

    @Override // org.telegram.ui.ActionBar.c2
    public final void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.a) {
            case 0:
                this.b.finishFragment();
                break;
            case 1:
                qg1 qg1Var = this.b;
                qg1Var.B0();
                qg1Var.finishFragment();
                break;
            case 2:
                qg1 qg1Var2 = this.b;
                qg1Var2.O = "";
                qg1Var2.E0(false);
                break;
            case 3:
                qg1.a0(this.b);
                break;
            default:
                qg1.X(this.b);
                break;
        }
    }
}
