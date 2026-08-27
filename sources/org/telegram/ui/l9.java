package org.telegram.ui;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l9 implements o1.g {
    public final /* synthetic */ int a;
    public final /* synthetic */ t9 b;

    public /* synthetic */ l9(t9 t9Var, int i10) {
        this.a = i10;
        this.b = t9Var;
    }

    @Override // o1.g
    public final void a(o1.h hVar, float f10, float f11) {
        switch (this.a) {
            case 0:
                t9 t9Var = this.b;
                t9Var.y = f10 / 500.0f;
                t9Var.fragmentView.invalidate();
                break;
            default:
                t9 t9Var2 = this.b;
                t9Var2.W = t9Var2.I ? f10 / 500.0f : 1.0f - (f10 / 500.0f);
                t9Var2.fragmentView.invalidate();
                break;
        }
    }
}
