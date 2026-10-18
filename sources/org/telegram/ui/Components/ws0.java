package org.telegram.ui.Components;

import android.os.Bundle;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class ws0 extends org.telegram.ui.sn {
    public boolean Rc;
    public final /* synthetic */ int Sc;
    public final /* synthetic */ sv0 Tc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ws0(sv0 sv0Var, Bundle bundle, int i10) {
        super(bundle);
        this.Tc = sv0Var;
        this.Sc = i10;
        this.Rc = true;
    }

    @Override // org.telegram.ui.sn, org.telegram.ui.ActionBar.n2
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        sv0 sv0Var = this.Tc;
        dv0 dv0Var = sv0Var.S;
        if (this.Rc) {
            if (this.j0 != null) {
                qa("");
                this.j0.H(dv0Var.w, false);
            }
            org.telegram.ui.sk skVar = this.o1;
            if (skVar != null) {
                skVar.e(dv0Var.x, false);
            }
            sv0Var.v1.getMediaDataController().portSavedSearchResults(getClassGuid(), dv0Var.x, dv0Var.w, dv0Var.n, dv0Var.h, this.Sc, dv0Var.v, dv0Var.s);
            this.Rc = false;
        }
        super.onTransitionAnimationStart(z10, z11);
    }
}
