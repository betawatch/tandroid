package org.telegram.ui.Components;

import android.os.Bundle;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class ts0 extends org.telegram.ui.yn {
    public boolean Kc;
    public final /* synthetic */ int Lc;
    public final /* synthetic */ pv0 Mc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ts0(pv0 pv0Var, Bundle bundle, int i10) {
        super(bundle);
        this.Mc = pv0Var;
        this.Lc = i10;
        this.Kc = true;
    }

    @Override // org.telegram.ui.yn, org.telegram.ui.ActionBar.n2
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        pv0 pv0Var = this.Mc;
        av0 av0Var = pv0Var.S;
        if (this.Kc) {
            if (this.h0 != null) {
                ka("");
                this.h0.H(av0Var.w, false);
            }
            org.telegram.ui.vk vkVar = this.m1;
            if (vkVar != null) {
                vkVar.e(av0Var.x, false);
            }
            pv0Var.v1.getMediaDataController().portSavedSearchResults(getClassGuid(), av0Var.x, av0Var.w, av0Var.n, av0Var.h, this.Lc, av0Var.v, av0Var.s);
            this.Kc = false;
        }
        super.onTransitionAnimationStart(z10, z11);
    }
}
