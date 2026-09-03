package org.telegram.ui;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class id0 implements org.telegram.ui.ActionBar.c2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ og0 b;

    public /* synthetic */ id0(og0 og0Var, int i10) {
        this.a = i10;
        this.b = og0Var;
    }

    @Override // org.telegram.ui.ActionBar.c2
    public final void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.a) {
            case 0:
                og0 og0Var = this.b;
                og0Var.b[og0Var.a].d();
                og0Var.k1(true, true);
                break;
            default:
                og0 og0Var2 = this.b;
                og0Var2.i0 = true;
                if (og0Var2.a != 0) {
                    og0Var2.u1(0, true, null, true);
                    break;
                }
                break;
        }
    }
}
