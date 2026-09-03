package org.telegram.ui;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jd0 implements org.telegram.ui.ActionBar.c2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ pg0 b;

    public /* synthetic */ jd0(pg0 pg0Var, int i10) {
        this.a = i10;
        this.b = pg0Var;
    }

    @Override // org.telegram.ui.ActionBar.c2
    public final void l(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.a) {
            case 0:
                pg0 pg0Var = this.b;
                pg0Var.b[pg0Var.a].d();
                pg0Var.k1(true, true);
                break;
            default:
                pg0 pg0Var2 = this.b;
                pg0Var2.i0 = true;
                if (pg0Var2.a != 0) {
                    pg0Var2.u1(0, true, null, true);
                    break;
                }
                break;
        }
    }
}
