package org.telegram.ui.Components;

import android.os.Bundle;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class cs0 extends org.telegram.ui.xn {
    public boolean Nc;
    public final /* synthetic */ int Oc;
    public final /* synthetic */ zu0 Pc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cs0(zu0 zu0Var, Bundle bundle, int i10) {
        super(bundle);
        this.Pc = zu0Var;
        this.Oc = i10;
        this.Nc = true;
    }

    @Override // org.telegram.ui.xn, org.telegram.ui.ActionBar.p2
    public final void onTransitionAnimationStart(boolean z4, boolean z10) {
        zu0 zu0Var = this.Pc;
        ku0 ku0Var = zu0Var.P;
        if (this.Nc) {
            if (this.g0 != null) {
                la("");
                this.g0.H(ku0Var.w, false);
            }
            org.telegram.ui.vk vkVar = this.l1;
            if (vkVar != null) {
                vkVar.e(ku0Var.x, false);
            }
            zu0Var.s1.getMediaDataController().portSavedSearchResults(getClassGuid(), ku0Var.x, ku0Var.w, ku0Var.n, ku0Var.h, this.Oc, ku0Var.v, ku0Var.s);
            this.Nc = false;
        }
        super.onTransitionAnimationStart(z4, z10);
    }
}
