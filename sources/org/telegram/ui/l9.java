package org.telegram.ui;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l9 implements r1.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ t9 b;

    public /* synthetic */ l9(t9 t9Var, int i7) {
        this.a = i7;
        this.b = t9Var;
    }

    @Override // r1.d
    public final void a(r1.g gVar, float f10, float f11) {
        switch (this.a) {
            case 0:
                t9 t9Var = this.b;
                t9Var.F = f10 / 500.0f;
                t9Var.fragmentView.invalidate();
                break;
            default:
                t9 t9Var2 = this.b;
                t9Var2.c0 = t9Var2.O ? f10 / 500.0f : 1.0f - (f10 / 500.0f);
                t9Var2.fragmentView.invalidate();
                break;
        }
    }
}
