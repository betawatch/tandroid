package org.telegram.ui.Components;

import android.os.Bundle;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class ws0 extends org.telegram.ui.sn {
    public boolean Qc;
    public final /* synthetic */ int Rc;
    public final /* synthetic */ sv0 Sc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ws0(sv0 sv0Var, Bundle bundle, int i10) {
        super(bundle);
        this.Sc = sv0Var;
        this.Rc = i10;
        this.Qc = true;
    }

    @Override // org.telegram.ui.sn, org.telegram.ui.ActionBar.n2
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        sv0 sv0Var = this.Sc;
        dv0 dv0Var = sv0Var.S;
        if (this.Qc) {
            if (this.j0 != null) {
                qa("");
                this.j0.H(dv0Var.w, false);
            }
            org.telegram.ui.sk skVar = this.o1;
            if (skVar != null) {
                skVar.e(dv0Var.x, false);
            }
            sv0Var.v1.getMediaDataController().portSavedSearchResults(getClassGuid(), dv0Var.x, dv0Var.w, dv0Var.n, dv0Var.h, this.Rc, dv0Var.v, dv0Var.s);
            this.Qc = false;
        }
        super.onTransitionAnimationStart(z10, z11);
    }
}
