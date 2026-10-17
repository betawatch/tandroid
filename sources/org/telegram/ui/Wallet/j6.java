package org.telegram.ui.Wallet;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final /* synthetic */ class j6 implements o1.g {
    public final /* synthetic */ int a;
    public final /* synthetic */ p6 b;

    public /* synthetic */ j6(p6 p6Var, int i10) {
        this.a = i10;
        this.b = p6Var;
    }

    @Override // o1.g
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.a) {
            case 0:
                p6 p6Var = this.b;
                p6Var.c.setScaleX(f7);
                p6Var.c.setScaleY(f7);
                break;
            default:
                this.b.P = f10;
                break;
        }
    }
}
