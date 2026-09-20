package org.telegram.ui.Components;

import android.os.Bundle;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class ns0 extends org.telegram.ui.zn {
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

    @Override // org.telegram.ui.zn, org.telegram.ui.ActionBar.n2
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        jv0 jv0Var = this.Rc;
        uu0 uu0Var = jv0Var.S;
        if (this.Pc) {
            if (this.j0 != null) {
                la("");
                this.j0.H(uu0Var.w, false);
            }
            org.telegram.ui.xk xkVar = this.o1;
            if (xkVar != null) {
                xkVar.e(uu0Var.x, false);
            }
            jv0Var.v1.getMediaDataController().portSavedSearchResults(getClassGuid(), uu0Var.x, uu0Var.w, uu0Var.n, uu0Var.h, this.Qc, uu0Var.v, uu0Var.s);
            this.Pc = false;
        }
        super.onTransitionAnimationStart(z10, z11);
    }
}
