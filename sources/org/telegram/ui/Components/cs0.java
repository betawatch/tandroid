package org.telegram.ui.Components;

import android.os.Bundle;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class cs0 extends org.telegram.ui.xn {
    public boolean Pc;
    public final /* synthetic */ int Qc;
    public final /* synthetic */ yu0 Rc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cs0(yu0 yu0Var, Bundle bundle, int i10) {
        super(bundle);
        this.Rc = yu0Var;
        this.Qc = i10;
        this.Pc = true;
    }

    @Override // org.telegram.ui.xn, org.telegram.ui.ActionBar.n2
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        yu0 yu0Var = this.Rc;
        ju0 ju0Var = yu0Var.S;
        if (this.Pc) {
            if (this.j0 != null) {
                la("");
                this.j0.H(ju0Var.w, false);
            }
            org.telegram.ui.vk vkVar = this.o1;
            if (vkVar != null) {
                vkVar.e(ju0Var.x, false);
            }
            yu0Var.v1.getMediaDataController().portSavedSearchResults(getClassGuid(), ju0Var.x, ju0Var.w, ju0Var.n, ju0Var.h, this.Qc, ju0Var.v, ju0Var.s);
            this.Pc = false;
        }
        super.onTransitionAnimationStart(z10, z11);
    }
}
