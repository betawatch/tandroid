package org.telegram.ui.Wallet;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class z3 implements r1.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ z3(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // r1.d
    public final void a(r1.g gVar, float f10, float f11) {
        switch (this.a) {
            case 0:
                g4 g4Var = (g4) this.b;
                g4Var.H = f10;
                g4Var.d();
                break;
            case 1:
                f9 f9Var = (f9) this.b;
                f9Var.e = f10;
                f9Var.setScaleX(f10);
                f9Var.setScaleY(f10);
                break;
            case 2:
                ea eaVar = (ea) this.b;
                eaVar.c0 = f10;
                eaVar.G0();
                break;
            default:
                ((da) this.b).d.setConversionWobble(f10);
                break;
        }
    }
}
