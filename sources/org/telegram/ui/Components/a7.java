package org.telegram.ui.Components;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class a7 implements o1.g {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a7(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // o1.g
    public final void a(o1.j jVar, float f7, float f10) {
        switch (this.a) {
            case 0:
                ((w7) this.b).J1.setBufferedProgress(f7 / 1000.0f);
                break;
            case 1:
                wb wbVar = (wb) this.b;
                wbVar.o = (int) f7;
                wbVar.l();
                break;
            case 2:
                if (Math.abs(f7) > ((bb) this.b).getWidth()) {
                    jVar.d();
                    break;
                }
                break;
            case 3:
                bi biVar = (bi) ((jh) this.b).d;
                uh uhVar = biVar.t2;
                if (uhVar == biVar.d2 || uhVar == biVar.e2 || (biVar.w1 && biVar.n3 != null)) {
                    biVar.O1(1);
                }
                biVar.t2.l(biVar.f4);
                biVar.X0.g();
                biVar.b.invalidate();
                break;
            case 4:
                kk kkVar = (kk) this.b;
                kkVar.m0 = f7;
                kkVar.k0();
                break;
            default:
                ((jb0) this.b).y();
                break;
        }
    }
}
