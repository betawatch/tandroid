package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class py0 extends nr0 {
    public final /* synthetic */ dz0 a1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public py0(dz0 dz0Var, Context context, String str, String str2, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, null, str, false, str2, false, u6Var);
        this.a1 = dz0Var;
    }

    @Override // org.telegram.ui.Components.nr0
    public final void T0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (z10) {
            AndroidUtilities.runOnUIThread(new org.telegram.ui.g4(this, hVar, i10, 24), 100L);
        }
    }

    @Override // org.telegram.ui.Components.nr0, org.telegram.ui.ActionBar.k3
    public final void dismissInternal() {
        super.dismissInternal();
        org.telegram.ui.ActionBar.r2 r2Var = this.a1.L;
        if (r2Var instanceof org.telegram.ui.wn) {
            AndroidUtilities.requestAdjustResize(r2Var.getParentActivity(), r2Var.getClassGuid());
            if (((org.telegram.ui.wn) r2Var).Y.getVisibility() == 0) {
                r2Var.getFragmentView().requestLayout();
            }
        }
    }
}
