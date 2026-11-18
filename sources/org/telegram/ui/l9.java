package org.telegram.ui;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
