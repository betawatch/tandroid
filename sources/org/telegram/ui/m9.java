package org.telegram.ui;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final /* synthetic */ class m9 implements o1.g {
    public final /* synthetic */ int a;
    public final /* synthetic */ u9 b;

    public /* synthetic */ m9(u9 u9Var, int i10) {
        this.a = i10;
        this.b = u9Var;
    }

    @Override // o1.g
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.a) {
            case 0:
                u9 u9Var = this.b;
                u9Var.y = f7 / 500.0f;
                u9Var.fragmentView.invalidate();
                break;
            default:
                u9 u9Var2 = this.b;
                u9Var2.a0 = u9Var2.M ? f7 / 500.0f : 1.0f - (f7 / 500.0f);
                u9Var2.fragmentView.invalidate();
                break;
        }
    }
}
