package org.telegram.ui;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o9 implements o1.g {
    public final /* synthetic */ int a;
    public final /* synthetic */ w9 b;

    public /* synthetic */ o9(w9 w9Var, int i10) {
        this.a = i10;
        this.b = w9Var;
    }

    @Override // o1.g
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.a) {
            case 0:
                w9 w9Var = this.b;
                w9Var.y = f7 / 500.0f;
                w9Var.fragmentView.invalidate();
                break;
            default:
                w9 w9Var2 = this.b;
                w9Var2.a0 = w9Var2.M ? f7 / 500.0f : 1.0f - (f7 / 500.0f);
                w9Var2.fragmentView.invalidate();
                break;
        }
    }
}
