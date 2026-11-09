package org.telegram.ui;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class k9 implements r1.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ s9 b;

    public /* synthetic */ k9(s9 s9Var, int i7) {
        this.a = i7;
        this.b = s9Var;
    }

    @Override // r1.d
    public final void a(r1.g gVar, float f10, float f11) {
        switch (this.a) {
            case 0:
                s9 s9Var = this.b;
                s9Var.E = f10 / 500.0f;
                s9Var.fragmentView.invalidate();
                break;
            default:
                s9 s9Var2 = this.b;
                s9Var2.b0 = s9Var2.N ? f10 / 500.0f : 1.0f - (f10 / 500.0f);
                s9Var2.fragmentView.invalidate();
                break;
        }
    }
}
