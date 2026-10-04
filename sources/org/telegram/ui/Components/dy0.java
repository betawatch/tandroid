package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class dy0 extends zq0 {
    public final /* synthetic */ qy0 X0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dy0(qy0 qy0Var, Context context, String str, String str2, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, null, str, false, str2, false, d6Var);
        this.X0 = qy0Var;
    }

    @Override // org.telegram.ui.Components.zq0
    public final void O0(a0.i iVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (z10) {
            AndroidUtilities.runOnUIThread(new zm(this, iVar, i10, 20), 100L);
        }
    }

    @Override // org.telegram.ui.Components.zq0, org.telegram.ui.ActionBar.f3
    public final void dismissInternal() {
        super.dismissInternal();
        org.telegram.ui.ActionBar.n2 n2Var = this.X0.L;
        if (n2Var instanceof org.telegram.ui.yn) {
            AndroidUtilities.requestAdjustResize(n2Var.getParentActivity(), n2Var.getClassGuid());
            if (((org.telegram.ui.yn) n2Var).W.getVisibility() == 0) {
                n2Var.getFragmentView().requestLayout();
            }
        }
    }
}
