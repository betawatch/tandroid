package org.telegram.ui.Components;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class c7 implements r1.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c7(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // r1.d
    public final void a(r1.g gVar, float f10, float f11) {
        switch (this.a) {
            case 0:
                ((y7) this.b).N1.setBufferedProgress(f10 / 1000.0f);
                break;
            case 1:
                xb xbVar = (xb) this.b;
                xbVar.o = (int) f10;
                xbVar.l();
                break;
            case 2:
                if (Math.abs(f10) > ((cb) this.b).getWidth()) {
                    gVar.d();
                    break;
                }
                break;
            case 3:
                ki kiVar = (ki) ((di.y3) this.b).d;
                ci ciVar = kiVar.x2;
                if (ciVar == kiVar.h2 || ciVar == kiVar.i2 || (kiVar.A1 && kiVar.r3 != null)) {
                    kiVar.P1(1);
                }
                kiVar.x2.m(kiVar.j4);
                kiVar.Y0.g();
                kiVar.b.invalidate();
                break;
            case 4:
                qk qkVar = (qk) this.b;
                qkVar.n0 = f10;
                qkVar.m0();
                break;
            default:
                ((ra0) this.b).y();
                break;
        }
    }
}
