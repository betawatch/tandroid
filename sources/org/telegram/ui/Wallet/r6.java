package org.telegram.ui.Wallet;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final /* synthetic */ class r6 implements r1.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ x6 b;

    public /* synthetic */ r6(x6 x6Var, int i7) {
        this.a = i7;
        this.b = x6Var;
    }

    @Override // r1.d
    public final void a(r1.g gVar, float f10, float f11) {
        switch (this.a) {
            case 0:
                x6 x6Var = this.b;
                x6Var.c.setScaleX(f10);
                x6Var.c.setScaleY(f10);
                break;
            default:
                this.b.P = f11;
                break;
        }
    }
}
