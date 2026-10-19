package org.telegram.ui;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
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
                w9Var.E = f7 / 500.0f;
                w9Var.fragmentView.invalidate();
                break;
            default:
                w9 w9Var2 = this.b;
                w9Var2.b0 = w9Var2.N ? f7 / 500.0f : 1.0f - (f7 / 500.0f);
                w9Var2.fragmentView.invalidate();
                break;
        }
    }
}
