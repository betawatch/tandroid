package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class oy0 extends mr0 {
    public final /* synthetic */ cz0 a1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oy0(cz0 cz0Var, Context context, String str, String str2, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, null, str, false, str2, false, u6Var);
        this.a1 = cz0Var;
    }

    @Override // org.telegram.ui.Components.mr0
    public final void T0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (z10) {
            AndroidUtilities.runOnUIThread(new org.telegram.ui.g4(this, hVar, i10, 24), 100L);
        }
    }

    @Override // org.telegram.ui.Components.mr0, org.telegram.ui.ActionBar.k3
    public final void dismissInternal() {
        super.dismissInternal();
        org.telegram.ui.ActionBar.r2 r2Var = this.a1.L;
        if (r2Var instanceof org.telegram.ui.un) {
            AndroidUtilities.requestAdjustResize(r2Var.getParentActivity(), r2Var.getClassGuid());
            if (((org.telegram.ui.un) r2Var).Y.getVisibility() == 0) {
                r2Var.getFragmentView().requestLayout();
            }
        }
    }
}
