package org.telegram.ui;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
