package org.telegram.ui;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p9 implements o1.g {
    public final /* synthetic */ int a;
    public final /* synthetic */ z9 b;

    public /* synthetic */ p9(z9 z9Var, int i10) {
        this.a = i10;
        this.b = z9Var;
    }

    @Override // o1.g
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.a) {
            case 0:
                z9 z9Var = this.b;
                z9Var.E = f7 / 500.0f;
                z9Var.fragmentView.invalidate();
                break;
            default:
                z9 z9Var2 = this.b;
                z9Var2.c0 = z9Var2.N ? f7 / 500.0f : 1.0f - (f7 / 500.0f);
                z9Var2.fragmentView.invalidate();
                break;
        }
    }
}
