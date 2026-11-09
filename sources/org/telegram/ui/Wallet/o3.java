package org.telegram.ui.Wallet;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes4.dex */
public final /* synthetic */ class o3 implements r1.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o3(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // r1.d
    public final void a(r1.g gVar, float f10, float f11) {
        switch (this.a) {
            case 0:
                u3 u3Var = (u3) this.b;
                u3Var.G = f10;
                u3Var.c();
                break;
            case 1:
                n8 n8Var = (n8) this.b;
                n8Var.e = f10;
                n8Var.setScaleX(f10);
                n8Var.setScaleY(f10);
                break;
            case 2:
                l9 l9Var = (l9) this.b;
                l9Var.b0 = f10;
                l9Var.G0();
                break;
            default:
                ((k9) this.b).d.setConversionWobble(f10);
                break;
        }
    }
}
