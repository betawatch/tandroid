package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class rw0 extends sp0 {
    public final /* synthetic */ ex0 X0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rw0(ex0 ex0Var, Context context, String str, String str2, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, null, str, false, str2, false, c6Var);
        this.X0 = ex0Var;
    }

    @Override // org.telegram.ui.Components.sp0
    public final void R0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (z10) {
            AndroidUtilities.runOnUIThread(new km(this, hVar, i10, 20), 100L);
        }
    }

    @Override // org.telegram.ui.Components.sp0, org.telegram.ui.ActionBar.e3
    public final void dismissInternal() {
        super.dismissInternal();
        org.telegram.ui.ActionBar.n2 n2Var = this.X0.H;
        if (n2Var instanceof org.telegram.ui.rn) {
            AndroidUtilities.requestAdjustResize(n2Var.getParentActivity(), n2Var.getClassGuid());
            if (((org.telegram.ui.rn) n2Var).U.getVisibility() == 0) {
                n2Var.getFragmentView().requestLayout();
            }
        }
    }
}
