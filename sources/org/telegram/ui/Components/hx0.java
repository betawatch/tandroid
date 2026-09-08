package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class hx0 extends hq0 {
    public final /* synthetic */ ux0 b1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hx0(ux0 ux0Var, Context context, String str, String str2, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, null, str, false, str2, false, f6Var);
        this.b1 = ux0Var;
    }

    @Override // org.telegram.ui.Components.hq0
    public final void R0(a0.i iVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (z10) {
            AndroidUtilities.runOnUIThread(new org.telegram.ui.dm(this, iVar, i10, 21), 100L);
        }
    }

    @Override // org.telegram.ui.Components.hq0, org.telegram.ui.ActionBar.f3
    public final void dismissInternal() {
        super.dismissInternal();
        org.telegram.ui.ActionBar.n2 n2Var = this.b1.L;
        if (n2Var instanceof org.telegram.ui.co) {
            AndroidUtilities.requestAdjustResize(n2Var.getParentActivity(), n2Var.getClassGuid());
            if (((org.telegram.ui.co) n2Var).Y.getVisibility() == 0) {
                n2Var.getFragmentView().requestLayout();
            }
        }
    }
}
