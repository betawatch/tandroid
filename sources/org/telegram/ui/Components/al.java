package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class al implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ gl b;

    public /* synthetic */ al(gl glVar, int i10) {
        this.a = i10;
        this.b = glVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.Z();
                break;
            case 1:
                gl glVar = this.b;
                EditTextBoldCursor editTextBoldCursor = glVar.P;
                if (!glVar.H && !glVar.K0 && !glVar.b.isDismissed() && glVar.I0 && glVar.Q0 == null && editTextBoldCursor.hasFocus() && glVar.isShown()) {
                    AndroidUtilities.showKeyboard(editTextBoldCursor);
                    break;
                }
                break;
            case 2:
                gl glVar2 = this.b;
                if (!glVar2.H && glVar2.I0 && glVar2.isShown()) {
                    glVar2.c0();
                    break;
                }
                break;
            case 3:
                gl glVar3 = this.b;
                if (!glVar3.H) {
                    float f7 = glVar3.j0;
                    if (f7 < 1.0f && glVar3.i0 == null) {
                        o1.k kVar = new o1.k(new o1.j(f7));
                        glVar3.i0 = kVar;
                        o1.l lVar = new o1.l(1.0f);
                        lVar.a(0.55f);
                        lVar.b(65.0f);
                        kVar.u = lVar;
                        glVar3.i0.e(0.001f);
                        glVar3.i0.b(new m7(glVar3, 4));
                        glVar3.i0.a(new kb(glVar3, 2));
                        glVar3.i0.h();
                        break;
                    }
                }
                break;
            case 4:
                gl glVar4 = this.b;
                if (glVar4.I0 && !glVar4.H) {
                    glVar4.b0();
                    if (glVar4.J0) {
                        glVar4.c0();
                        break;
                    }
                }
                break;
            default:
                gl glVar5 = this.b;
                if (!glVar5.m0) {
                    glVar5.l0.setVisibility(4);
                    break;
                }
                break;
        }
    }
}
