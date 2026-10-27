package org.telegram.ui;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q9 implements o1.g {
    public final /* synthetic */ int a;
    public final /* synthetic */ y9 b;

    public /* synthetic */ q9(y9 y9Var, int i10) {
        this.a = i10;
        this.b = y9Var;
    }

    @Override // o1.g
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.a) {
            case 0:
                y9 y9Var = this.b;
                y9Var.E = f7 / 500.0f;
                y9Var.fragmentView.invalidate();
                break;
            default:
                y9 y9Var2 = this.b;
                y9Var2.b0 = y9Var2.N ? f7 / 500.0f : 1.0f - (f7 / 500.0f);
                y9Var2.fragmentView.invalidate();
                break;
        }
    }
}
