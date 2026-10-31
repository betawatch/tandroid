package org.telegram.ui.Components;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class ek implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ kk b;

    public /* synthetic */ ek(kk kkVar, int i10) {
        this.a = i10;
        this.b = kkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.Z();
                break;
            case 1:
                kk kkVar = this.b;
                EditTextBoldCursor editTextBoldCursor = kkVar.S;
                if (!kkVar.K && !kkVar.N0 && !kkVar.b.I && kkVar.L0 && kkVar.T0 == null && editTextBoldCursor.hasFocus() && kkVar.isShown()) {
                    org.telegram.messenger.i0.J3(editTextBoldCursor);
                    break;
                }
                break;
            case 2:
                kk kkVar2 = this.b;
                if (!kkVar2.K && kkVar2.L0 && kkVar2.isShown()) {
                    kkVar2.c0();
                    break;
                }
                break;
            case 3:
                kk kkVar3 = this.b;
                if (!kkVar3.K) {
                    float f7 = kkVar3.m0;
                    if (f7 < 1.0f && kkVar3.l0 == null) {
                        o1.j jVar = new o1.j(new o1.i(f7));
                        kkVar3.l0 = jVar;
                        o1.k kVar = new o1.k(1.0f);
                        kVar.a(0.55f);
                        kVar.b(65.0f);
                        jVar.m = kVar;
                        kkVar3.l0.f(0.001f);
                        kkVar3.l0.b(new a7(kkVar3, 4));
                        kkVar3.l0.a(new na(kkVar3, 2));
                        kkVar3.l0.h();
                        break;
                    }
                }
                break;
            case 4:
                kk kkVar4 = this.b;
                if (kkVar4.L0 && !kkVar4.K) {
                    kkVar4.b0();
                    if (kkVar4.M0) {
                        kkVar4.c0();
                        break;
                    }
                }
                break;
            default:
                kk kkVar5 = this.b;
                if (!kkVar5.p0) {
                    kkVar5.o0.setVisibility(4);
                    break;
                }
                break;
        }
    }
}
