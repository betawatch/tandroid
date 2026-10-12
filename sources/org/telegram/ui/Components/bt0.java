package org.telegram.ui.Components;

import android.os.Bundle;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class bt0 extends org.telegram.ui.fo {
    public boolean Qc;
    public final /* synthetic */ int Rc;
    public final /* synthetic */ xv0 Sc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bt0(xv0 xv0Var, Bundle bundle, int i10) {
        super(bundle);
        this.Sc = xv0Var;
        this.Rc = i10;
        this.Qc = true;
    }

    @Override // org.telegram.ui.fo, org.telegram.ui.ActionBar.m2
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        xv0 xv0Var = this.Sc;
        iv0 iv0Var = xv0Var.S;
        if (this.Qc) {
            if (this.j0 != null) {
                qa("");
                this.j0.H(iv0Var.w, false);
            }
            org.telegram.ui.dl dlVar = this.o1;
            if (dlVar != null) {
                dlVar.e(iv0Var.x, false);
            }
            xv0Var.v1.getMediaDataController().portSavedSearchResults(getClassGuid(), iv0Var.x, iv0Var.w, iv0Var.n, iv0Var.h, this.Rc, iv0Var.v, iv0Var.s);
            this.Qc = false;
        }
        super.onTransitionAnimationStart(z10, z11);
    }
}
