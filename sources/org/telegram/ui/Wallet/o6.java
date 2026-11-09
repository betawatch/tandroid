package org.telegram.ui.Wallet;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes4.dex */
public final /* synthetic */ class o6 implements r1.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ u6 b;

    public /* synthetic */ o6(u6 u6Var, int i7) {
        this.a = i7;
        this.b = u6Var;
    }

    @Override // r1.d
    public final void a(r1.g gVar, float f10, float f11) {
        switch (this.a) {
            case 0:
                u6 u6Var = this.b;
                u6Var.c.setScaleX(f10);
                u6Var.c.setScaleY(f10);
                break;
            default:
                this.b.P = f11;
                break;
        }
    }
}
