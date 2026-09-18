package org.telegram.ui.Components;

import android.os.Bundle;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class os0 extends org.telegram.ui.zn {
    public boolean Pc;
    public final /* synthetic */ int Qc;
    public final /* synthetic */ kv0 Rc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public os0(kv0 kv0Var, Bundle bundle, int i10) {
        super(bundle);
        this.Rc = kv0Var;
        this.Qc = i10;
        this.Pc = true;
    }

    @Override // org.telegram.ui.zn, org.telegram.ui.ActionBar.n2
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        kv0 kv0Var = this.Rc;
        vu0 vu0Var = kv0Var.S;
        if (this.Pc) {
            if (this.j0 != null) {
                la("");
                this.j0.H(vu0Var.w, false);
            }
            org.telegram.ui.xk xkVar = this.o1;
            if (xkVar != null) {
                xkVar.e(vu0Var.x, false);
            }
            kv0Var.v1.getMediaDataController().portSavedSearchResults(getClassGuid(), vu0Var.x, vu0Var.w, vu0Var.n, vu0Var.h, this.Qc, vu0Var.v, vu0Var.s);
            this.Pc = false;
        }
        super.onTransitionAnimationStart(z10, z11);
    }
}
