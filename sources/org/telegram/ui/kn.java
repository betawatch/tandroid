package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class kn extends of.e {
    public final /* synthetic */ org.telegram.ui.Cells.t1 d;
    public final /* synthetic */ on e;

    public kn(on onVar, org.telegram.ui.Cells.t1 t1Var) {
        this.e = onVar;
        this.d = t1Var;
    }

    @Override // of.e
    public final void c(boolean z10) {
        if (z10) {
            return;
        }
        AndroidUtilities.runOnUIThread(new ak(this.e.a, 8), 250L);
    }

    @Override // of.e
    public final void d() {
        on onVar = this.e;
        co coVar = onVar.a;
        org.telegram.ui.Cells.t1 t1Var = this.d;
        coVar.wb = t1Var.getMessageObject().getId();
        co coVar2 = onVar.a;
        coVar2.xb = 2;
        coVar2.yb = null;
        t1Var.invalidate();
    }
}
