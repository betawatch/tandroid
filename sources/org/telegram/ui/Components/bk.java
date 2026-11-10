package org.telegram.ui.Components;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bk implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hk b;

    public /* synthetic */ bk(hk hkVar, int i7) {
        this.a = i7;
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
                EditTextBoldCursor editTextBoldCursor = hkVar.S;
                if (!hkVar.K && !hkVar.N0 && !hkVar.b.I && hkVar.L0 && hkVar.T0 == null && editTextBoldCursor.hasFocus() && hkVar.isShown()) {
                    org.telegram.messenger.g0.K3(editTextBoldCursor);
                    break;
                }
                break;
            case 2:
                hk hkVar2 = this.b;
                if (!hkVar2.K && hkVar2.L0 && hkVar2.isShown()) {
                    hkVar2.e0();
                    break;
                }
                break;
            case 3:
                hk hkVar3 = this.b;
                if (!hkVar3.K) {
                    float f10 = hkVar3.m0;
                    if (f10 < 1.0f && hkVar3.l0 == null) {
                        r1.g gVar = new r1.g(new r1.f(f10));
                        hkVar3.l0 = gVar;
                        r1.h hVar = new r1.h(1.0f);
                        hVar.a(0.55f);
                        hVar.b(65.0f);
                        gVar.m = hVar;
                        hkVar3.l0.f(0.001f);
                        hkVar3.l0.b(new d7(hkVar3, 4));
                        hkVar3.l0.a(new sa(hkVar3, 2));
                        hkVar3.l0.h();
                        break;
                    }
                }
                break;
            case 4:
                hk hkVar4 = this.b;
                if (hkVar4.L0 && !hkVar4.K) {
                    hkVar4.d0();
                    if (hkVar4.M0) {
                        hkVar4.e0();
                        break;
                    }
                }
                break;
            default:
                hk hkVar5 = this.b;
                if (!hkVar5.p0) {
                    hkVar5.o0.setVisibility(4);
                    break;
                }
                break;
        }
    }
}
