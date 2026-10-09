package org.telegram.ui.Wallet;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final /* synthetic */ class w5 implements o1.g {
    public final /* synthetic */ int a;
    public final /* synthetic */ c6 b;

    public /* synthetic */ w5(c6 c6Var, int i10) {
        this.a = i10;
        this.b = c6Var;
    }

    @Override // o1.g
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.a) {
            case 0:
                c6 c6Var = this.b;
                c6Var.c.setScaleX(f7);
                c6Var.c.setScaleY(f7);
                break;
            default:
                this.b.P = f10;
                break;
        }
    }
}
