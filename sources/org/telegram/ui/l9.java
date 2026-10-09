package org.telegram.ui;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l9 implements o1.g {
    public final /* synthetic */ int a;
    public final /* synthetic */ v9 b;

    public /* synthetic */ l9(v9 v9Var, int i10) {
        this.a = i10;
        this.b = v9Var;
    }

    @Override // o1.g
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.a) {
            case 0:
                v9 v9Var = this.b;
                v9Var.E = f7 / 500.0f;
                v9Var.fragmentView.invalidate();
                break;
            default:
                v9 v9Var2 = this.b;
                v9Var2.c0 = v9Var2.N ? f7 / 500.0f : 1.0f - (f7 / 500.0f);
                v9Var2.fragmentView.invalidate();
                break;
        }
    }
}
