package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class xk implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ dl b;

    public /* synthetic */ xk(dl dlVar, int i10) {
        this.a = i10;
        this.b = dlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.Z();
                break;
            case 1:
                dl dlVar = this.b;
                EditTextBoldCursor editTextBoldCursor = dlVar.P;
                if (!dlVar.H && !dlVar.K0 && !dlVar.b.isDismissed() && dlVar.I0 && dlVar.Q0 == null && editTextBoldCursor.hasFocus() && dlVar.isShown()) {
                    AndroidUtilities.showKeyboard(editTextBoldCursor);
                    break;
                }
                break;
            case 2:
                dl dlVar2 = this.b;
                if (!dlVar2.H && dlVar2.I0 && dlVar2.isShown()) {
                    dlVar2.c0();
                    break;
                }
                break;
            case 3:
                dl dlVar3 = this.b;
                if (!dlVar3.H) {
                    float f7 = dlVar3.j0;
                    if (f7 < 1.0f && dlVar3.i0 == null) {
                        o1.k kVar = new o1.k(new o1.j(f7));
                        dlVar3.i0 = kVar;
                        o1.l lVar = new o1.l(1.0f);
                        lVar.a(0.55f);
                        lVar.b(65.0f);
                        kVar.u = lVar;
                        dlVar3.i0.e(0.001f);
                        dlVar3.i0.b(new n7(dlVar3, 4));
                        dlVar3.i0.a(new jb(dlVar3, 2));
                        dlVar3.i0.h();
                        break;
                    }
                }
                break;
            case 4:
                dl dlVar4 = this.b;
                if (dlVar4.I0 && !dlVar4.H) {
                    dlVar4.b0();
                    if (dlVar4.J0) {
                        dlVar4.c0();
                        break;
                    }
                }
                break;
            default:
                dl dlVar5 = this.b;
                if (!dlVar5.m0) {
                    dlVar5.l0.setVisibility(4);
                    break;
                }
                break;
        }
    }
}
