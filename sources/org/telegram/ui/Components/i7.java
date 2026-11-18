package org.telegram.ui.Components;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
                ((g8) this.b).N1.setBufferedProgress(f10 / 1000.0f);
                break;
            case 1:
                gc gcVar = (gc) this.b;
                gcVar.o = (int) f10;
                gcVar.l();
                break;
            case 2:
                if (Math.abs(f10) > ((lb) this.b).getWidth()) {
                    gVar.d();
                    break;
                }
                break;
            case 3:
                si siVar = (si) ((di.a4) this.b).d;
                ki kiVar = siVar.x2;
                if (kiVar == siVar.h2 || kiVar == siVar.i2 || (siVar.A1 && siVar.r3 != null)) {
                    siVar.Q1(1);
                }
                siVar.x2.m(siVar.j4);
                siVar.Y0.g();
                siVar.b.invalidate();
                break;
            case 4:
                xk xkVar = (xk) this.b;
                xkVar.n0 = f10;
                xkVar.m0();
                break;
            default:
                ((bb0) this.b).y();
                break;
        }
    }
}
