package org.telegram.ui.Components;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d7 implements r1.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d7(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // r1.d
    public final void a(r1.g gVar, float f10, float f11) {
        switch (this.a) {
            case 0:
                ((a8) this.b).M1.setBufferedProgress(f10 / 1000.0f);
                break;
            case 1:
                bc bcVar = (bc) this.b;
                bcVar.o = (int) f10;
                bcVar.l();
                break;
            case 2:
                if (Math.abs(f10) > ((fb) this.b).getWidth()) {
                    gVar.d();
                    break;
                }
                break;
            case 3:
                ci ciVar = (ci) ((bi.y4) this.b).d;
                uh uhVar = ciVar.w2;
                if (uhVar == ciVar.g2 || uhVar == ciVar.h2 || (ciVar.z1 && ciVar.q3 != null)) {
                    ciVar.P1(1);
                }
                ciVar.w2.m(ciVar.i4);
                ciVar.X0.g();
                ciVar.b.invalidate();
                break;
            case 4:
                hk hkVar = (hk) this.b;
                hkVar.m0 = f10;
                hkVar.m0();
                break;
            default:
                ((qa0) this.b).y();
                break;
        }
    }
}
