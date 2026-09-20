package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class hn extends nf.e {
    public final /* synthetic */ org.telegram.ui.Cells.u1 d;
    public final /* synthetic */ ln e;

    public hn(ln lnVar, org.telegram.ui.Cells.u1 u1Var) {
        this.e = lnVar;
        this.d = u1Var;
    }

    @Override // nf.e
    public final void c(boolean z10) {
        if (z10) {
            return;
        }
        AndroidUtilities.runOnUIThread(new zj(this.e.a, 8), 250L);
    }

    @Override // nf.e
    public final void d() {
        ln lnVar = this.e;
        zn znVar = lnVar.a;
        org.telegram.ui.Cells.u1 u1Var = this.d;
        znVar.vb = u1Var.getMessageObject().getId();
        zn znVar2 = lnVar.a;
        znVar2.wb = 2;
        znVar2.xb = null;
        u1Var.invalidate();
    }
}
