package org.telegram.ui;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hf0 implements org.telegram.ui.ActionBar.c2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ sf0 b;

    public /* synthetic */ hf0(sf0 sf0Var, int i10) {
        this.a = i10;
        this.b = sf0Var;
    }

    @Override // org.telegram.ui.ActionBar.c2
    public final void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.a) {
            case 0:
                sf0 sf0Var = this.b;
                sf0Var.c(true);
                sf0Var.p0.u1(0, true, null, true);
                break;
            default:
                this.b.p0.u1(0, true, null, true);
                break;
        }
    }
}
