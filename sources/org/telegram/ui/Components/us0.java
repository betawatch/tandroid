package org.telegram.ui.Components;

import android.os.Bundle;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
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
