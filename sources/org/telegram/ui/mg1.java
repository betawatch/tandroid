package org.telegram.ui;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mg1 implements org.telegram.ui.ActionBar.c2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ vg1 b;

    public /* synthetic */ mg1(vg1 vg1Var, int i10) {
        this.a = i10;
        this.b = vg1Var;
    }

    @Override // org.telegram.ui.ActionBar.c2
    public final void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.a) {
            case 0:
                this.b.finishFragment();
                break;
            case 1:
                vg1 vg1Var = this.b;
                vg1Var.B0();
                vg1Var.finishFragment();
                break;
            case 2:
                vg1 vg1Var2 = this.b;
                vg1Var2.O = "";
                vg1Var2.E0(false);
                break;
            case 3:
                vg1.a0(this.b);
                break;
            default:
                vg1.X(this.b);
                break;
        }
    }
}
