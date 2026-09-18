package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class jx0 extends iq0 {
    public final /* synthetic */ wx0 b1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jx0(wx0 wx0Var, Context context, String str, String str2, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, null, str, false, str2, false, f6Var);
        this.b1 = wx0Var;
    }

    @Override // org.telegram.ui.Components.iq0
    public final void R0(a0.i iVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (z10) {
            AndroidUtilities.runOnUIThread(new wm(this, iVar, i10, 20), 100L);
        }
    }

    @Override // org.telegram.ui.Components.iq0, org.telegram.ui.ActionBar.g3
    public final void dismissInternal() {
        super.dismissInternal();
        org.telegram.ui.ActionBar.o2 o2Var = this.b1.L;
        if (o2Var instanceof org.telegram.ui.bo) {
            AndroidUtilities.requestAdjustResize(o2Var.getParentActivity(), o2Var.getClassGuid());
            if (((org.telegram.ui.bo) o2Var).Y.getVisibility() == 0) {
                o2Var.getFragmentView().requestLayout();
            }
        }
    }
}
