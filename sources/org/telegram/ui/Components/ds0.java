package org.telegram.ui.Components;

import android.os.Bundle;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class ds0 extends org.telegram.ui.bo {
    public boolean Pc;
    public final /* synthetic */ int Qc;
    public final /* synthetic */ zu0 Rc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ds0(zu0 zu0Var, Bundle bundle, int i10) {
        super(bundle);
        this.Rc = zu0Var;
        this.Qc = i10;
        this.Pc = true;
    }

    @Override // org.telegram.ui.bo, org.telegram.ui.ActionBar.o2
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        zu0 zu0Var = this.Rc;
        ku0 ku0Var = zu0Var.S;
        if (this.Pc) {
            if (this.j0 != null) {
                la("");
                this.j0.H(ku0Var.w, false);
            }
            org.telegram.ui.zk zkVar = this.o1;
            if (zkVar != null) {
                zkVar.e(ku0Var.x, false);
            }
            zu0Var.v1.getMediaDataController().portSavedSearchResults(getClassGuid(), ku0Var.x, ku0Var.w, ku0Var.n, ku0Var.h, this.Qc, ku0Var.v, ku0Var.s);
            this.Pc = false;
        }
        super.onTransitionAnimationStart(z10, z11);
    }
}
