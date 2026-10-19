package org.telegram.ui.Components;

import android.os.Bundle;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class xs0 extends org.telegram.ui.qn {
    public boolean Rc;
    public final /* synthetic */ int Sc;
    public final /* synthetic */ tv0 Tc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xs0(tv0 tv0Var, Bundle bundle, int i10) {
        super(bundle);
        this.Tc = tv0Var;
        this.Sc = i10;
        this.Rc = true;
    }

    @Override // org.telegram.ui.qn, org.telegram.ui.ActionBar.n2
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        tv0 tv0Var = this.Tc;
        ev0 ev0Var = tv0Var.S;
        if (this.Rc) {
            if (this.j0 != null) {
                qa("");
                this.j0.H(ev0Var.w, false);
            }
            org.telegram.ui.qk qkVar = this.o1;
            if (qkVar != null) {
                qkVar.e(ev0Var.x, false);
            }
            tv0Var.v1.getMediaDataController().portSavedSearchResults(getClassGuid(), ev0Var.x, ev0Var.w, ev0Var.n, ev0Var.h, this.Sc, ev0Var.v, ev0Var.s);
            this.Rc = false;
        }
        super.onTransitionAnimationStart(z10, z11);
    }
}
