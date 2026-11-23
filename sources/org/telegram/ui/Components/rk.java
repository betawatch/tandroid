package org.telegram.ui.Components;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class rk implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xk b;

    public /* synthetic */ rk(xk xkVar, int i7) {
        this.a = i7;
        this.b = xkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.b0();
                break;
            case 1:
                xk xkVar = this.b;
                EditTextBoldCursor editTextBoldCursor = xkVar.T;
                if (!xkVar.L && !xkVar.O0 && !xkVar.b.J && xkVar.M0 && xkVar.U0 == null && editTextBoldCursor.hasFocus() && xkVar.isShown()) {
                    org.telegram.messenger.g0.I3(editTextBoldCursor);
                    break;
                }
                break;
            case 2:
                xk xkVar2 = this.b;
                if (!xkVar2.L && xkVar2.M0 && xkVar2.isShown()) {
                    xkVar2.e0();
                    break;
                }
                break;
            case 3:
                xk xkVar3 = this.b;
                if (!xkVar3.L) {
                    float f10 = xkVar3.n0;
                    if (f10 < 1.0f && xkVar3.m0 == null) {
                        r1.g gVar = new r1.g(new r1.f(f10));
                        xkVar3.m0 = gVar;
                        r1.h hVar = new r1.h(1.0f);
                        hVar.a(0.55f);
                        hVar.b(65.0f);
                        gVar.m = hVar;
                        xkVar3.m0.f(0.001f);
                        xkVar3.m0.b(new i7(xkVar3, 4));
                        xkVar3.m0.a(new xa(xkVar3, 2));
                        xkVar3.m0.h();
                        break;
                    }
                }
                break;
            case 4:
                xk xkVar4 = this.b;
                if (xkVar4.M0 && !xkVar4.L) {
                    xkVar4.d0();
                    if (xkVar4.N0) {
                        xkVar4.e0();
                        break;
                    }
                }
                break;
            default:
                xk xkVar5 = this.b;
                if (!xkVar5.q0) {
                    xkVar5.p0.setVisibility(4);
                    break;
                }
                break;
        }
    }
}
