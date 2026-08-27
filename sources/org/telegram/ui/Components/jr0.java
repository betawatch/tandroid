package org.telegram.ui.Components;

import android.os.Bundle;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class jr0 extends org.telegram.ui.rn {
    public boolean Mc;
    public final /* synthetic */ int Nc;
    public final /* synthetic */ hu0 Oc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jr0(hu0 hu0Var, Bundle bundle, int i10) {
        super(bundle);
        this.Oc = hu0Var;
        this.Nc = i10;
        this.Mc = true;
    }

    @Override // org.telegram.ui.rn, org.telegram.ui.ActionBar.n2
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        hu0 hu0Var = this.Oc;
        st0 st0Var = hu0Var.O;
        if (this.Mc) {
            if (this.f0 != null) {
                la("");
                this.f0.H(st0Var.w, false);
            }
            org.telegram.ui.ok okVar = this.k1;
            if (okVar != null) {
                okVar.e(st0Var.x, false);
            }
            hu0Var.r1.getMediaDataController().portSavedSearchResults(getClassGuid(), st0Var.x, st0Var.w, st0Var.n, st0Var.h, this.Nc, st0Var.v, st0Var.s);
            this.Mc = false;
        }
        super.onTransitionAnimationStart(z10, z11);
    }
}
