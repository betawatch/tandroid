package org.telegram.ui.Components;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c7 implements q1.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c7(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // q1.d
    public final void a(q1.g gVar, float f10, float f11) {
        switch (this.a) {
            case 0:
                ((z7) this.b).K1.setBufferedProgress(f10 / 1000.0f);
                break;
            case 1:
                ac acVar = (ac) this.b;
                acVar.o = (int) f10;
                acVar.l();
                break;
            case 2:
                if (Math.abs(f10) > ((fb) this.b).getWidth()) {
                    gVar.d();
                    break;
                }
                break;
            case 3:
                bi biVar = (bi) ((ci.h4) this.b).d;
                th thVar = biVar.u2;
                if (thVar == biVar.e2 || thVar == biVar.f2 || (biVar.x1 && biVar.o3 != null)) {
                    biVar.P1(1);
                }
                biVar.u2.m(biVar.g4);
                biVar.Y0.g();
                biVar.b.invalidate();
                break;
            case 4:
                hk hkVar = (hk) this.b;
                hkVar.n0 = f10;
                hkVar.m0();
                break;
            default:
                ((la0) this.b).y();
                break;
        }
    }
}
