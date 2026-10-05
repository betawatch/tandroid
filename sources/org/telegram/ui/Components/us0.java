package org.telegram.ui.Components;

import android.os.Bundle;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class us0 extends org.telegram.ui.yn {
    public boolean Kc;
    public final /* synthetic */ int Lc;
    public final /* synthetic */ qv0 Mc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public us0(qv0 qv0Var, Bundle bundle, int i10) {
        super(bundle);
        this.Mc = qv0Var;
        this.Lc = i10;
        this.Kc = true;
    }

    @Override // org.telegram.ui.yn, org.telegram.ui.ActionBar.n2
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        qv0 qv0Var = this.Mc;
        bv0 bv0Var = qv0Var.S;
        if (this.Kc) {
            if (this.h0 != null) {
                ka("");
                this.h0.H(bv0Var.w, false);
            }
            org.telegram.ui.vk vkVar = this.m1;
            if (vkVar != null) {
                vkVar.e(bv0Var.x, false);
            }
            qv0Var.v1.getMediaDataController().portSavedSearchResults(getClassGuid(), bv0Var.x, bv0Var.w, bv0Var.n, bv0Var.h, this.Lc, bv0Var.v, bv0Var.s);
            this.Kc = false;
        }
        super.onTransitionAnimationStart(z10, z11);
    }
}
