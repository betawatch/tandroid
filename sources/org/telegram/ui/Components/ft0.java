package org.telegram.ui.Components;

import android.os.Bundle;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class ft0 extends org.telegram.ui.zn {
    public boolean Qc;
    public final /* synthetic */ int Rc;
    public final /* synthetic */ bw0 Sc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ft0(bw0 bw0Var, Bundle bundle, int i10) {
        super(bundle);
        this.Sc = bw0Var;
        this.Rc = i10;
        this.Qc = true;
    }

    @Override // org.telegram.ui.zn, org.telegram.ui.ActionBar.n2
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        bw0 bw0Var = this.Sc;
        mv0 mv0Var = bw0Var.S;
        if (this.Qc) {
            if (this.j0 != null) {
                qa("");
                this.j0.H(mv0Var.w, false);
            }
            org.telegram.ui.zk zkVar = this.o1;
            if (zkVar != null) {
                zkVar.e(mv0Var.x, false);
            }
            bw0Var.v1.getMediaDataController().portSavedSearchResults(getClassGuid(), mv0Var.x, mv0Var.w, mv0Var.n, mv0Var.h, this.Rc, mv0Var.v, mv0Var.s);
            this.Qc = false;
        }
        super.onTransitionAnimationStart(z10, z11);
    }
}
