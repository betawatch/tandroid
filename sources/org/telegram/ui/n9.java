package org.telegram.ui;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n9 implements o1.g {
    public final /* synthetic */ int a;
    public final /* synthetic */ v9 b;

    public /* synthetic */ n9(v9 v9Var, int i10) {
        this.a = i10;
        this.b = v9Var;
    }

    @Override // o1.g
    public final void a(o1.h hVar, float f10, float f11) {
        switch (this.a) {
            case 0:
                v9 v9Var = this.b;
                v9Var.y = f10 / 500.0f;
                v9Var.fragmentView.invalidate();
                break;
            default:
                v9 v9Var2 = this.b;
                v9Var2.X = v9Var2.J ? f10 / 500.0f : 1.0f - (f10 / 500.0f);
                v9Var2.fragmentView.invalidate();
                break;
        }
    }
}
