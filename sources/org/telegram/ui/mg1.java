package org.telegram.ui;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mg1 implements org.telegram.ui.ActionBar.c2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wg1 b;

    public /* synthetic */ mg1(wg1 wg1Var, int i10) {
        this.a = i10;
        this.b = wg1Var;
    }

    @Override // org.telegram.ui.ActionBar.c2
    public final void l(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.a) {
            case 0:
                this.b.finishFragment();
                break;
            case 1:
                wg1 wg1Var = this.b;
                wg1Var.B0();
                wg1Var.finishFragment();
                break;
            case 2:
                wg1 wg1Var2 = this.b;
                wg1Var2.O = "";
                wg1Var2.E0(false);
                break;
            case 3:
                wg1.a0(this.b);
                break;
            default:
                wg1.X(this.b);
                break;
        }
    }
}
