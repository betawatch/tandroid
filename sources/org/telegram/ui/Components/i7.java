package org.telegram.ui.Components;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class i7 implements r1.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i7(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // r1.d
    public final void a(r1.g gVar, float f10, float f11) {
        switch (this.a) {
            case 0:
                ((e8) this.b).N1.setBufferedProgress(f10 / 1000.0f);
                break;
            case 1:
                fc fcVar = (fc) this.b;
                fcVar.o = (int) f10;
                fcVar.l();
                break;
            case 2:
                if (Math.abs(f10) > ((kb) this.b).getWidth()) {
                    gVar.d();
                    break;
                }
                break;
            case 3:
                ti tiVar = (ti) ((di.a4) this.b).d;
                li liVar = tiVar.x2;
                if (liVar == tiVar.h2 || liVar == tiVar.i2 || (tiVar.A1 && tiVar.r3 != null)) {
                    tiVar.Q1(1);
                }
                tiVar.x2.m(tiVar.j4);
                tiVar.Y0.g();
                tiVar.b.invalidate();
                break;
            case 4:
                xk xkVar = (xk) this.b;
                xkVar.n0 = f10;
                xkVar.m0();
                break;
            default:
                ((za0) this.b).y();
                break;
        }
    }
}
