package org.telegram.ui.Components;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j7 implements r1.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j7(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // r1.d
    public final void a(r1.g gVar, float f10, float f11) {
        switch (this.a) {
            case 0:
                ((f8) this.b).N1.setBufferedProgress(f10 / 1000.0f);
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
                ui uiVar = (ui) ((di.a4) this.b).d;
                mi miVar = uiVar.x2;
                if (miVar == uiVar.h2 || miVar == uiVar.i2 || (uiVar.A1 && uiVar.r3 != null)) {
                    uiVar.Q1(1);
                }
                uiVar.x2.m(uiVar.j4);
                uiVar.Y0.g();
                uiVar.b.invalidate();
                break;
            case 4:
                zk zkVar = (zk) this.b;
                zkVar.n0 = f10;
                zkVar.m0();
                break;
            default:
                ((cb0) this.b).y();
                break;
        }
    }
}
