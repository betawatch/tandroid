package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class uk implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ al b;

    public /* synthetic */ uk(al alVar, int i10) {
        this.a = i10;
        this.b = alVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.Z();
                break;
            case 1:
                al alVar = this.b;
                EditTextBoldCursor editTextBoldCursor = alVar.S;
                if (!alVar.K && !alVar.N0 && !alVar.b.isDismissed() && alVar.L0 && alVar.T0 == null && editTextBoldCursor.hasFocus() && alVar.isShown()) {
                    AndroidUtilities.showKeyboard(editTextBoldCursor);
                    break;
                }
                break;
            case 2:
                al alVar2 = this.b;
                if (!alVar2.K && alVar2.L0 && alVar2.isShown()) {
                    alVar2.c0();
                    break;
                }
                break;
            case 3:
                al alVar3 = this.b;
                if (!alVar3.K) {
                    float f7 = alVar3.m0;
                    if (f7 < 1.0f && alVar3.l0 == null) {
                        o1.k kVar = new o1.k(new o1.j(f7));
                        alVar3.l0 = kVar;
                        o1.l lVar = new o1.l(1.0f);
                        lVar.a(0.55f);
                        lVar.b(65.0f);
                        kVar.u = lVar;
                        alVar3.l0.e(0.001f);
                        alVar3.l0.b(new l7(alVar3, 4));
                        alVar3.l0.a(new hb(alVar3, 2));
                        alVar3.l0.h();
                        break;
                    }
                }
                break;
            case 4:
                al alVar4 = this.b;
                if (alVar4.L0 && !alVar4.K) {
                    alVar4.b0();
                    if (alVar4.M0) {
                        alVar4.c0();
                        break;
                    }
                }
                break;
            default:
                al alVar5 = this.b;
                if (!alVar5.p0) {
                    alVar5.o0.setVisibility(4);
                    break;
                }
                break;
        }
    }
}
