package org.telegram.ui.Components;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class e7 implements r1.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e7(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // r1.d
    public final void a(r1.g gVar, float f10, float f11) {
        switch (this.a) {
            case 0:
                ((b8) this.b).J1.setBufferedProgress(f10 / 1000.0f);
                break;
            case 1:
                cc ccVar = (cc) this.b;
                ccVar.o = (int) f10;
                ccVar.l();
                break;
            case 2:
                if (Math.abs(f10) > ((gb) this.b).getWidth()) {
                    gVar.d();
                    break;
                }
                break;
            case 3:
                di diVar = (di) ((bi.y4) this.b).d;
                vh vhVar = diVar.t2;
                if (vhVar == diVar.d2 || vhVar == diVar.e2 || (diVar.w1 && diVar.n3 != null)) {
                    diVar.P1(1);
                }
                diVar.t2.m(diVar.f4);
                diVar.X0.g();
                diVar.b.invalidate();
                break;
            case 4:
                ik ikVar = (ik) this.b;
                ikVar.m0 = f10;
                ikVar.m0();
                break;
            default:
                ((ra0) this.b).y();
                break;
        }
    }
}
