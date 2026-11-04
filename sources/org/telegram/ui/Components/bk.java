package org.telegram.ui.Components;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bk implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hk b;

    public /* synthetic */ bk(hk hkVar, int i3) {
        this.a = i3;
        this.b = hkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.b0();
                break;
            case 1:
                hk hkVar = this.b;
                EditTextBoldCursor editTextBoldCursor = hkVar.T;
                if (!hkVar.L && !hkVar.O0 && !hkVar.b.J && hkVar.M0 && hkVar.U0 == null && editTextBoldCursor.hasFocus() && hkVar.isShown()) {
                    org.telegram.messenger.g0.K3(editTextBoldCursor);
                    break;
                }
                break;
            case 2:
                hk hkVar2 = this.b;
                if (!hkVar2.L && hkVar2.M0 && hkVar2.isShown()) {
                    hkVar2.e0();
                    break;
                }
                break;
            case 3:
                hk hkVar3 = this.b;
                if (!hkVar3.L) {
                    float f10 = hkVar3.n0;
                    if (f10 < 1.0f && hkVar3.m0 == null) {
                        q1.g gVar = new q1.g(new q1.f(f10));
                        hkVar3.m0 = gVar;
                        q1.h hVar = new q1.h(1.0f);
                        hVar.a(0.55f);
                        hVar.b(65.0f);
                        gVar.m = hVar;
                        hkVar3.m0.f(0.001f);
                        hkVar3.m0.b(new c7(hkVar3, 4));
                        hkVar3.m0.a(new sa(hkVar3, 2));
                        hkVar3.m0.h();
                        break;
                    }
                }
                break;
            case 4:
                hk hkVar4 = this.b;
                if (hkVar4.M0 && !hkVar4.L) {
                    hkVar4.d0();
                    if (hkVar4.N0) {
                        hkVar4.e0();
                        break;
                    }
                }
                break;
            default:
                hk hkVar5 = this.b;
                if (!hkVar5.q0) {
                    hkVar5.p0.setVisibility(4);
                    break;
                }
                break;
        }
    }
}
