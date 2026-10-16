package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wk implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ cl b;

    public /* synthetic */ wk(cl clVar, int i10) {
        this.a = i10;
        this.b = clVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.Z();
                break;
            case 1:
                cl clVar = this.b;
                EditTextBoldCursor editTextBoldCursor = clVar.P;
                if (!clVar.H && !clVar.K0 && !clVar.b.isDismissed() && clVar.I0 && clVar.Q0 == null && editTextBoldCursor.hasFocus() && clVar.isShown()) {
                    AndroidUtilities.showKeyboard(editTextBoldCursor);
                    break;
                }
                break;
            case 2:
                cl clVar2 = this.b;
                if (!clVar2.H && clVar2.I0 && clVar2.isShown()) {
                    clVar2.c0();
                    break;
                }
                break;
            case 3:
                cl clVar3 = this.b;
                if (!clVar3.H) {
                    float f7 = clVar3.j0;
                    if (f7 < 1.0f && clVar3.i0 == null) {
                        o1.k kVar = new o1.k(new o1.j(f7));
                        clVar3.i0 = kVar;
                        o1.l lVar = new o1.l(1.0f);
                        lVar.a(0.55f);
                        lVar.b(65.0f);
                        kVar.u = lVar;
                        clVar3.i0.e(0.001f);
                        clVar3.i0.b(new n7(clVar3, 4));
                        clVar3.i0.a(new jb(clVar3, 2));
                        clVar3.i0.h();
                        break;
                    }
                }
                break;
            case 4:
                cl clVar4 = this.b;
                if (clVar4.I0 && !clVar4.H) {
                    clVar4.b0();
                    if (clVar4.J0) {
                        clVar4.c0();
                        break;
                    }
                }
                break;
            default:
                cl clVar5 = this.b;
                if (!clVar5.m0) {
                    clVar5.l0.setVisibility(4);
                    break;
                }
                break;
        }
    }
}
