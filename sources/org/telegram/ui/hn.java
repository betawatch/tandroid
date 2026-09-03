package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class hn extends ze.c {
    public final /* synthetic */ org.telegram.ui.Cells.s1 d;
    public final /* synthetic */ ln e;

    public hn(ln lnVar, org.telegram.ui.Cells.s1 s1Var) {
        this.e = lnVar;
        this.d = s1Var;
    }

    @Override // ze.c
    public final void c(boolean z4) {
        if (z4) {
            return;
        }
        AndroidUtilities.runOnUIThread(new yj(this.e.a, 8), 250L);
    }

    @Override // ze.c
    public final void d() {
        ln lnVar = this.e;
        zn znVar = lnVar.a;
        org.telegram.ui.Cells.s1 s1Var = this.d;
        znVar.tb = s1Var.getMessageObject().getId();
        zn znVar2 = lnVar.a;
        znVar2.ub = 2;
        znVar2.vb = null;
        s1Var.invalidate();
    }
}
