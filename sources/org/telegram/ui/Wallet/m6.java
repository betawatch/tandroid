package org.telegram.ui.Wallet;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final /* synthetic */ class m6 implements o1.g {
    public final /* synthetic */ int a;
    public final /* synthetic */ s6 b;

    public /* synthetic */ m6(s6 s6Var, int i10) {
        this.a = i10;
        this.b = s6Var;
    }

    @Override // o1.g
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.a) {
            case 0:
                s6 s6Var = this.b;
                s6Var.c.setScaleX(f7);
                s6Var.c.setScaleY(f7);
                break;
            default:
                this.b.P = f10;
                break;
        }
    }
}
