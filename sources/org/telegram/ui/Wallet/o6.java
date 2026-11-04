package org.telegram.ui.Wallet;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class o6 implements q1.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ u6 b;

    public /* synthetic */ o6(u6 u6Var, int i3) {
        this.a = i3;
        this.b = u6Var;
    }

    @Override // q1.d
    public final void a(q1.g gVar, float f10, float f11) {
        switch (this.a) {
            case 0:
                u6 u6Var = this.b;
                u6Var.c.setScaleX(f10);
                u6Var.c.setScaleY(f10);
                break;
            default:
                this.b.Q = f11;
                break;
        }
    }
}
