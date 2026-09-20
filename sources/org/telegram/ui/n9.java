package org.telegram.ui;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final /* synthetic */ class n9 implements o1.g {
    public final /* synthetic */ int a;
    public final /* synthetic */ v9 b;

    public /* synthetic */ n9(v9 v9Var, int i10) {
        this.a = i10;
        this.b = v9Var;
    }

    @Override // o1.g
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.a) {
            case 0:
                v9 v9Var = this.b;
                v9Var.y = f7 / 500.0f;
                v9Var.fragmentView.invalidate();
                break;
            default:
                v9 v9Var2 = this.b;
                v9Var2.a0 = v9Var2.M ? f7 / 500.0f : 1.0f - (f7 / 500.0f);
                v9Var2.fragmentView.invalidate();
                break;
        }
    }
}
