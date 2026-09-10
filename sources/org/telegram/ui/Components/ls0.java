package org.telegram.ui.Components;

import android.os.Bundle;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class ls0 extends org.telegram.ui.eo {
    public boolean Qc;
    public final /* synthetic */ int Rc;
    public final /* synthetic */ iv0 Sc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ls0(iv0 iv0Var, Bundle bundle, int i10) {
        super(bundle);
        this.Sc = iv0Var;
        this.Rc = i10;
        this.Qc = true;
    }

    @Override // org.telegram.ui.eo, org.telegram.ui.ActionBar.p2
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        iv0 iv0Var = this.Sc;
        tu0 tu0Var = iv0Var.S;
        if (this.Qc) {
            if (this.j0 != null) {
                la("");
                this.j0.H(tu0Var.w, false);
            }
            org.telegram.ui.al alVar = this.o1;
            if (alVar != null) {
                alVar.e(tu0Var.x, false);
            }
            iv0Var.v1.getMediaDataController().portSavedSearchResults(getClassGuid(), tu0Var.x, tu0Var.w, tu0Var.n, tu0Var.h, this.Rc, tu0Var.v, tu0Var.s);
            this.Qc = false;
        }
        super.onTransitionAnimationStart(z10, z11);
    }
}
