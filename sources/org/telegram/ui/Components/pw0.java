package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class pw0 extends rp0 {
    public final /* synthetic */ cx0 X0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pw0(cx0 cx0Var, Context context, String str, String str2, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, null, str, false, str2, false, b6Var);
        this.X0 = cx0Var;
    }

    @Override // org.telegram.ui.Components.rp0
    public final void R0(a0.h hVar, int i9, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (z10) {
            AndroidUtilities.runOnUIThread(new org.telegram.ui.rl(this, hVar, i9, 21), 100L);
        }
    }

    @Override // org.telegram.ui.Components.rp0, org.telegram.ui.ActionBar.f3
    public final void dismissInternal() {
        super.dismissInternal();
        org.telegram.ui.ActionBar.o2 o2Var = this.X0.H;
        if (o2Var instanceof org.telegram.ui.qn) {
            AndroidUtilities.requestAdjustResize(o2Var.getParentActivity(), o2Var.getClassGuid());
            if (((org.telegram.ui.qn) o2Var).U.getVisibility() == 0) {
                o2Var.getFragmentView().requestLayout();
            }
        }
    }
}
