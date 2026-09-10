package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class ux0 extends sq0 {
    public final /* synthetic */ hy0 b1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ux0(hy0 hy0Var, Context context, String str, String str2, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, null, str, false, str2, false, f6Var);
        this.b1 = hy0Var;
    }

    @Override // org.telegram.ui.Components.sq0
    public final void R0(a0.i iVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (z10) {
            AndroidUtilities.runOnUIThread(new my(this, iVar, i10, 18), 100L);
        }
    }

    @Override // org.telegram.ui.Components.sq0, org.telegram.ui.ActionBar.h3
    public final void dismissInternal() {
        super.dismissInternal();
        org.telegram.ui.ActionBar.p2 p2Var = this.b1.L;
        if (p2Var instanceof org.telegram.ui.eo) {
            AndroidUtilities.requestAdjustResize(p2Var.getParentActivity(), p2Var.getClassGuid());
            if (((org.telegram.ui.eo) p2Var).Y.getVisibility() == 0) {
                p2Var.getFragmentView().requestLayout();
            }
        }
    }
}
