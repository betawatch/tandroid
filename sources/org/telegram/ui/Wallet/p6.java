package org.telegram.ui.Wallet;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes4.dex */
public final /* synthetic */ class p6 implements r1.c {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ p6(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // r1.c
    public final void a(r1.g gVar, boolean z9, float f10, float f11) {
        switch (this.a) {
            case 0:
                u6.b((u6) this.b, z9, f10);
                break;
            default:
                l9 l9Var = (l9) this.b;
                l9Var.a0 = null;
                l9Var.b0 = 1.0f;
                l9Var.G0();
                break;
        }
    }
}
