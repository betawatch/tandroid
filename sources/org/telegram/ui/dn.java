package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class dn extends qf.c {
    public final /* synthetic */ org.telegram.ui.Cells.s1 d;
    public final /* synthetic */ hn e;

    public dn(hn hnVar, org.telegram.ui.Cells.s1 s1Var) {
        this.e = hnVar;
        this.d = s1Var;
    }

    @Override // qf.c
    public final void c(boolean z10) {
        if (z10) {
            return;
        }
        AndroidUtilities.runOnUIThread(new wh(this.e.a, 11), 250L);
    }

    @Override // qf.c
    public final void d() {
        hn hnVar = this.e;
        wn wnVar = hnVar.a;
        org.telegram.ui.Cells.s1 s1Var = this.d;
        wnVar.Wb = s1Var.getMessageObject().getId();
        wn wnVar2 = hnVar.a;
        wnVar2.Xb = 2;
        wnVar2.Yb = null;
        s1Var.invalidate();
    }
}
