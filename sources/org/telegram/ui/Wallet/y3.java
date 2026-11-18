package org.telegram.ui.Wallet;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class y3 implements r1.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ y3(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // r1.d
    public final void a(r1.g gVar, float f10, float f11) {
        switch (this.a) {
            case 0:
                f4 f4Var = (f4) this.b;
                f4Var.H = f10;
                f4Var.d();
                break;
            case 1:
                e9 e9Var = (e9) this.b;
                e9Var.e = f10;
                e9Var.setScaleX(f10);
                e9Var.setScaleY(f10);
                break;
            case 2:
                da daVar = (da) this.b;
                daVar.c0 = f10;
                daVar.G0();
                break;
            default:
                ((ca) this.b).d.setConversionWobble(f10);
                break;
        }
    }
}
