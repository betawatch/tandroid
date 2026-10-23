package org.telegram.ui.Components;

import android.os.Bundle;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class bt0 extends org.telegram.ui.sn {
    public boolean ed;
    public final /* synthetic */ int fd;
    public final /* synthetic */ xv0 gd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bt0(xv0 xv0Var, Bundle bundle, int i10) {
        super(bundle);
        this.gd = xv0Var;
        this.fd = i10;
        this.ed = true;
    }

    @Override // org.telegram.ui.sn, org.telegram.ui.ActionBar.o2
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        xv0 xv0Var = this.gd;
        iv0 iv0Var = xv0Var.S;
        if (this.ed) {
            if (this.j0 != null) {
                qa("");
                this.j0.H(iv0Var.w, false);
            }
            org.telegram.ui.rk rkVar = this.A1;
            if (rkVar != null) {
                rkVar.e(iv0Var.x, false);
            }
            xv0Var.v1.getMediaDataController().portSavedSearchResults(getClassGuid(), iv0Var.x, iv0Var.w, iv0Var.n, iv0Var.h, this.fd, iv0Var.v, iv0Var.s);
            this.ed = false;
        }
        super.onTransitionAnimationStart(z10, z11);
    }
}
