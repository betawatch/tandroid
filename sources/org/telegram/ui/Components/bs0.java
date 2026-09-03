package org.telegram.ui.Components;

import android.os.Bundle;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class bs0 extends org.telegram.ui.xn {
    public boolean Nc;
    public final /* synthetic */ int Oc;
    public final /* synthetic */ yu0 Pc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bs0(yu0 yu0Var, Bundle bundle, int i10) {
        super(bundle);
        this.Pc = yu0Var;
        this.Oc = i10;
        this.Nc = true;
    }

    @Override // org.telegram.ui.xn, org.telegram.ui.ActionBar.p2
    public final void onTransitionAnimationStart(boolean z4, boolean z10) {
        yu0 yu0Var = this.Pc;
        ju0 ju0Var = yu0Var.P;
        if (this.Nc) {
            if (this.g0 != null) {
                la("");
                this.g0.H(ju0Var.w, false);
            }
            org.telegram.ui.vk vkVar = this.l1;
            if (vkVar != null) {
                vkVar.e(ju0Var.x, false);
            }
            yu0Var.s1.getMediaDataController().portSavedSearchResults(getClassGuid(), ju0Var.x, ju0Var.w, ju0Var.n, ju0Var.h, this.Oc, ju0Var.v, ju0Var.s);
            this.Nc = false;
        }
        super.onTransitionAnimationStart(z4, z10);
    }
}
