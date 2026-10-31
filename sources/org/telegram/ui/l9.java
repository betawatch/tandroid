package org.telegram.ui;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class l9 implements o1.g {
    public final /* synthetic */ int a;
    public final /* synthetic */ u9 b;

    public /* synthetic */ l9(u9 u9Var, int i10) {
        this.a = i10;
        this.b = u9Var;
    }

    @Override // o1.g
    public final void a(o1.j jVar, float f7, float f10) {
        switch (this.a) {
            case 0:
                u9 u9Var = this.b;
                u9Var.E = f7 / 500.0f;
                u9Var.fragmentView.invalidate();
                break;
            default:
                u9 u9Var2 = this.b;
                u9Var2.b0 = u9Var2.N ? f7 / 500.0f : 1.0f - (f7 / 500.0f);
                u9Var2.fragmentView.invalidate();
                break;
        }
    }
}
