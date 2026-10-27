package org.telegram.ui;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class af0 implements org.telegram.ui.ActionBar.b2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ lf0 b;

    public /* synthetic */ af0(lf0 lf0Var, int i10) {
        this.a = i10;
        this.b = lf0Var;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public final void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.a) {
            case 0:
                lf0 lf0Var = this.b;
                lf0Var.c(true);
                lf0Var.u0.z1(0, true, null, true);
                break;
            default:
                this.b.u0.z1(0, true, null, true);
                break;
        }
    }
}
