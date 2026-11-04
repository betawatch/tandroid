package org.telegram.ui.Wallet;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class o3 implements q1.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o3(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // q1.d
    public final void a(q1.g gVar, float f10, float f11) {
        switch (this.a) {
            case 0:
                u3 u3Var = (u3) this.b;
                u3Var.H = f10;
                u3Var.c();
                break;
            case 1:
                o8 o8Var = (o8) this.b;
                o8Var.e = f10;
                o8Var.setScaleX(f10);
                o8Var.setScaleY(f10);
                break;
            case 2:
                m9 m9Var = (m9) this.b;
                m9Var.c0 = f10;
                m9Var.G0();
                break;
            default:
                ((l9) this.b).d.setConversionWobble(f10);
                break;
        }
    }
}
