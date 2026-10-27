package org.telegram.ui.Components;

import android.os.Bundle;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class jt0 extends org.telegram.ui.wn {
    public boolean od;
    public final /* synthetic */ int pd;
    public final /* synthetic */ bw0 qd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jt0(bw0 bw0Var, Bundle bundle, int i10) {
        super(bundle);
        this.qd = bw0Var;
        this.pd = i10;
        this.od = true;
    }

    @Override // org.telegram.ui.wn, org.telegram.ui.ActionBar.r2
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        bw0 bw0Var = this.qd;
        nv0 nv0Var = bw0Var.U;
        if (this.od) {
            if (this.j0 != null) {
                ya("");
                this.j0.P(nv0Var.w, false);
            }
            org.telegram.ui.uk ukVar = this.A1;
            if (ukVar != null) {
                ukVar.e(nv0Var.x, false);
            }
            bw0Var.x1.getMediaDataController().portSavedSearchResults(getClassGuid(), nv0Var.x, nv0Var.w, nv0Var.n, nv0Var.h, this.pd, nv0Var.v, nv0Var.s);
            this.od = false;
        }
        super.onTransitionAnimationStart(z10, z11);
    }
}
