package org.telegram.ui.Components;

import android.os.Bundle;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class tr0 extends org.telegram.ui.tn {
    public boolean Mc;
    public final /* synthetic */ int Nc;
    public final /* synthetic */ qu0 Oc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tr0(qu0 qu0Var, Bundle bundle, int i10) {
        super(bundle);
        this.Oc = qu0Var;
        this.Nc = i10;
        this.Mc = true;
    }

    @Override // org.telegram.ui.tn, org.telegram.ui.ActionBar.o2
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        qu0 qu0Var = this.Oc;
        bu0 bu0Var = qu0Var.O;
        if (this.Mc) {
            if (this.f0 != null) {
                la("");
                this.f0.H(bu0Var.w, false);
            }
            org.telegram.ui.pk pkVar = this.k1;
            if (pkVar != null) {
                pkVar.e(bu0Var.x, false);
            }
            qu0Var.r1.getMediaDataController().portSavedSearchResults(getClassGuid(), bu0Var.x, bu0Var.w, bu0Var.n, bu0Var.h, this.Nc, bu0Var.v, bu0Var.s);
            this.Mc = false;
        }
        super.onTransitionAnimationStart(z10, z11);
    }
}
