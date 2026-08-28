package org.telegram.ui.Components;

import android.os.Bundle;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ir0 extends org.telegram.ui.qn {
    public boolean Mc;
    public final /* synthetic */ int Nc;
    public final /* synthetic */ eu0 Oc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ir0(eu0 eu0Var, Bundle bundle, int i9) {
        super(bundle);
        this.Oc = eu0Var;
        this.Nc = i9;
        this.Mc = true;
    }

    @Override // org.telegram.ui.qn, org.telegram.ui.ActionBar.o2
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        eu0 eu0Var = this.Oc;
        pt0 pt0Var = eu0Var.O;
        if (this.Mc) {
            if (this.f0 != null) {
                la("");
                this.f0.H(pt0Var.w, false);
            }
            org.telegram.ui.mk mkVar = this.k1;
            if (mkVar != null) {
                mkVar.e(pt0Var.x, false);
            }
            eu0Var.r1.getMediaDataController().portSavedSearchResults(getClassGuid(), pt0Var.x, pt0Var.w, pt0Var.n, pt0Var.h, this.Nc, pt0Var.v, pt0Var.s);
            this.Mc = false;
        }
        super.onTransitionAnimationStart(z10, z11);
    }
}
