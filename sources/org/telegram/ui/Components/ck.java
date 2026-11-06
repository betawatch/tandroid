package org.telegram.ui.Components;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ck implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ik b;

    public /* synthetic */ ck(ik ikVar, int i7) {
        this.a = i7;
        this.b = ikVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.b0();
                break;
            case 1:
                ik ikVar = this.b;
                EditTextBoldCursor editTextBoldCursor = ikVar.S;
                if (!ikVar.K && !ikVar.N0 && !ikVar.b.I && ikVar.L0 && ikVar.T0 == null && editTextBoldCursor.hasFocus() && ikVar.isShown()) {
                    org.telegram.messenger.g0.K3(editTextBoldCursor);
                    break;
                }
                break;
            case 2:
                ik ikVar2 = this.b;
                if (!ikVar2.K && ikVar2.L0 && ikVar2.isShown()) {
                    ikVar2.e0();
                    break;
                }
                break;
            case 3:
                ik ikVar3 = this.b;
                if (!ikVar3.K) {
                    float f10 = ikVar3.m0;
                    if (f10 < 1.0f && ikVar3.l0 == null) {
                        r1.g gVar = new r1.g(new r1.f(f10));
                        ikVar3.l0 = gVar;
                        r1.h hVar = new r1.h(1.0f);
                        hVar.a(0.55f);
                        hVar.b(65.0f);
                        gVar.m = hVar;
                        ikVar3.l0.f(0.001f);
                        ikVar3.l0.b(new e7(ikVar3, 4));
                        ikVar3.l0.a(new ta(ikVar3, 2));
                        ikVar3.l0.h();
                        break;
                    }
                }
                break;
            case 4:
                ik ikVar4 = this.b;
                if (ikVar4.L0 && !ikVar4.K) {
                    ikVar4.d0();
                    if (ikVar4.M0) {
                        ikVar4.e0();
                        break;
                    }
                }
                break;
            default:
                ik ikVar5 = this.b;
                if (!ikVar5.p0) {
                    ikVar5.o0.setVisibility(4);
                    break;
                }
                break;
        }
    }
}
