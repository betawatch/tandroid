package org.telegram.ui.Components;

import android.os.Bundle;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class ps0 extends org.telegram.ui.zn {
    public boolean Pc;
    public final /* synthetic */ int Qc;
    public final /* synthetic */ lv0 Rc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ps0(lv0 lv0Var, Bundle bundle, int i10) {
        super(bundle);
        this.Rc = lv0Var;
        this.Qc = i10;
        this.Pc = true;
    }

    @Override // org.telegram.ui.zn, org.telegram.ui.ActionBar.n2
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        lv0 lv0Var = this.Rc;
        wu0 wu0Var = lv0Var.S;
        if (this.Pc) {
            if (this.j0 != null) {
                la("");
                this.j0.H(wu0Var.w, false);
            }
            org.telegram.ui.yk ykVar = this.o1;
            if (ykVar != null) {
                ykVar.e(wu0Var.x, false);
            }
            lv0Var.v1.getMediaDataController().portSavedSearchResults(getClassGuid(), wu0Var.x, wu0Var.w, wu0Var.n, wu0Var.h, this.Qc, wu0Var.v, wu0Var.s);
            this.Pc = false;
        }
        super.onTransitionAnimationStart(z10, z11);
    }
}
