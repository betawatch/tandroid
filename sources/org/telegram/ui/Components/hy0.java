package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class hy0 extends ir0 {
    public final /* synthetic */ uy0 b1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hy0(uy0 uy0Var, Context context, String str, String str2, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, null, str, false, str2, false, c6Var);
        this.b1 = uy0Var;
    }

    @Override // org.telegram.ui.Components.ir0
    public final void S0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (z10) {
            AndroidUtilities.runOnUIThread(new org.telegram.ui.gm(this, hVar, i10, 22), 100L);
        }
    }

    @Override // org.telegram.ui.Components.ir0, org.telegram.ui.ActionBar.e3
    public final void dismissInternal() {
        super.dismissInternal();
        org.telegram.ui.ActionBar.m2 m2Var = this.b1.L;
        if (m2Var instanceof org.telegram.ui.fo) {
            AndroidUtilities.requestAdjustResize(m2Var.getParentActivity(), m2Var.getClassGuid());
            if (((org.telegram.ui.fo) m2Var).Y.getVisibility() == 0) {
                m2Var.getFragmentView().requestLayout();
            }
        }
    }
}
