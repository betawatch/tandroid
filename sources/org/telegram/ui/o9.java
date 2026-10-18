package org.telegram.ui;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o9 implements o1.g {
    public final /* synthetic */ int a;
    public final /* synthetic */ y9 b;

    public /* synthetic */ o9(y9 y9Var, int i10) {
        this.a = i10;
        this.b = y9Var;
    }

    @Override // o1.g
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.a) {
            case 0:
                y9 y9Var = this.b;
                y9Var.F = f7 / 500.0f;
                y9Var.fragmentView.invalidate();
                break;
            default:
                y9 y9Var2 = this.b;
                y9Var2.d0 = y9Var2.O ? f7 / 500.0f : 1.0f - (f7 / 500.0f);
                y9Var2.fragmentView.invalidate();
                break;
        }
    }
}
