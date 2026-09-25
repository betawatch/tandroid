package org.telegram.ui.Components;

import android.os.Bundle;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class ns0 extends org.telegram.ui.wn {
    public boolean Pc;
    public final /* synthetic */ int Qc;
    public final /* synthetic */ jv0 Rc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ns0(jv0 jv0Var, Bundle bundle, int i10) {
        super(bundle);
        this.Rc = jv0Var;
        this.Qc = i10;
        this.Pc = true;
    }

    @Override // org.telegram.ui.wn, org.telegram.ui.ActionBar.m2
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        jv0 jv0Var = this.Rc;
        uu0 uu0Var = jv0Var.S;
        if (this.Pc) {
            if (this.j0 != null) {
                la("");
                this.j0.H(uu0Var.w, false);
            }
            org.telegram.ui.vk vkVar = this.o1;
            if (vkVar != null) {
                vkVar.e(uu0Var.x, false);
            }
            jv0Var.v1.getMediaDataController().portSavedSearchResults(getClassGuid(), uu0Var.x, uu0Var.w, uu0Var.n, uu0Var.h, this.Qc, uu0Var.v, uu0Var.s);
            this.Pc = false;
        }
        super.onTransitionAnimationStart(z10, z11);
    }
}
