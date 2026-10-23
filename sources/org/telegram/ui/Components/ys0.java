package org.telegram.ui.Components;

import android.os.Bundle;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class ys0 extends org.telegram.ui.qn {
    public boolean Rc;
    public final /* synthetic */ int Sc;
    public final /* synthetic */ uv0 Tc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ys0(uv0 uv0Var, Bundle bundle, int i10) {
        super(bundle);
        this.Tc = uv0Var;
        this.Sc = i10;
        this.Rc = true;
    }

    @Override // org.telegram.ui.qn, org.telegram.ui.ActionBar.n2
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        uv0 uv0Var = this.Tc;
        fv0 fv0Var = uv0Var.S;
        if (this.Rc) {
            if (this.j0 != null) {
                qa("");
                this.j0.H(fv0Var.w, false);
            }
            org.telegram.ui.qk qkVar = this.o1;
            if (qkVar != null) {
                qkVar.e(fv0Var.x, false);
            }
            uv0Var.v1.getMediaDataController().portSavedSearchResults(getClassGuid(), fv0Var.x, fv0Var.w, fv0Var.n, fv0Var.h, this.Sc, fv0Var.v, fv0Var.s);
            this.Rc = false;
        }
        super.onTransitionAnimationStart(z10, z11);
    }
}
