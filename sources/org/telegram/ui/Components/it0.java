package org.telegram.ui.Components;

import android.os.Bundle;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class it0 extends org.telegram.ui.un {
    public boolean kd;
    public final /* synthetic */ int ld;
    public final /* synthetic */ aw0 md;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public it0(aw0 aw0Var, Bundle bundle, int i10) {
        super(bundle);
        this.md = aw0Var;
        this.ld = i10;
        this.kd = true;
    }

    @Override // org.telegram.ui.un, org.telegram.ui.ActionBar.r2
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        aw0 aw0Var = this.md;
        mv0 mv0Var = aw0Var.U;
        if (this.kd) {
            if (this.j0 != null) {
                va("");
                this.j0.P(mv0Var.w, false);
            }
            org.telegram.ui.sk skVar = this.A1;
            if (skVar != null) {
                skVar.e(mv0Var.x, false);
            }
            aw0Var.x1.getMediaDataController().portSavedSearchResults(getClassGuid(), mv0Var.x, mv0Var.w, mv0Var.n, mv0Var.h, this.ld, mv0Var.v, mv0Var.s);
            this.kd = false;
        }
        super.onTransitionAnimationStart(z10, z11);
    }
}
