package org.telegram.ui.Components;

import android.os.Bundle;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class bs0 extends org.telegram.ui.co {
    public boolean Qc;
    public final /* synthetic */ int Rc;
    public final /* synthetic */ xu0 Sc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bs0(xu0 xu0Var, Bundle bundle, int i10) {
        super(bundle);
        this.Sc = xu0Var;
        this.Rc = i10;
        this.Qc = true;
    }

    @Override // org.telegram.ui.co, org.telegram.ui.ActionBar.n2
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        xu0 xu0Var = this.Sc;
        iu0 iu0Var = xu0Var.S;
        if (this.Qc) {
            if (this.j0 != null) {
                la("");
                this.j0.H(iu0Var.w, false);
            }
            org.telegram.ui.yk ykVar = this.o1;
            if (ykVar != null) {
                ykVar.e(iu0Var.x, false);
            }
            xu0Var.v1.getMediaDataController().portSavedSearchResults(getClassGuid(), iu0Var.x, iu0Var.w, iu0Var.n, iu0Var.h, this.Rc, iu0Var.v, iu0Var.s);
            this.Qc = false;
        }
        super.onTransitionAnimationStart(z10, z11);
    }
}
