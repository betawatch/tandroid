package org.telegram.ui.Wallet;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g6 implements o1.g {
    public final /* synthetic */ int a;
    public final /* synthetic */ m6 b;

    public /* synthetic */ g6(m6 m6Var, int i10) {
        this.a = i10;
        this.b = m6Var;
    }

    @Override // o1.g
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.a) {
            case 0:
                m6 m6Var = this.b;
                m6Var.c.setScaleX(f7);
                m6Var.c.setScaleY(f7);
                break;
            default:
                this.b.P = f10;
                break;
        }
    }
}
