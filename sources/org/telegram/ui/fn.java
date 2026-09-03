package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class fn extends af.f {
    public final /* synthetic */ org.telegram.ui.Cells.t1 d;
    public final /* synthetic */ jn e;

    public fn(jn jnVar, org.telegram.ui.Cells.t1 t1Var) {
        this.e = jnVar;
        this.d = t1Var;
    }

    @Override // af.f
    public final void c(boolean z4) {
        if (z4) {
            return;
        }
        AndroidUtilities.runOnUIThread(new wj(this.e.a, 8), 250L);
    }

    @Override // af.f
    public final void d() {
        jn jnVar = this.e;
        xn xnVar = jnVar.a;
        org.telegram.ui.Cells.t1 t1Var = this.d;
        xnVar.tb = t1Var.getMessageObject().getId();
        xn xnVar2 = jnVar.a;
        xnVar2.ub = 2;
        xnVar2.vb = null;
        t1Var.invalidate();
    }
}
