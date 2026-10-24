package org.telegram.ui;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class bf0 implements org.telegram.ui.ActionBar.z1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ mf0 b;

    public /* synthetic */ bf0(mf0 mf0Var, int i10) {
        this.a = i10;
        this.b = mf0Var;
    }

    @Override // org.telegram.ui.ActionBar.z1
    public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.a) {
            case 0:
                mf0 mf0Var = this.b;
                mf0Var.c(true);
                mf0Var.u0.y1(0, true, null, true);
                break;
            default:
                this.b.u0.y1(0, true, null, true);
                break;
        }
    }
}
