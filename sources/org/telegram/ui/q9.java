package org.telegram.ui;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
