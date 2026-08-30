package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class jx0 extends lq0 {
    public final /* synthetic */ xx0 Y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jx0(xx0 xx0Var, Context context, String str, String str2, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, null, str, false, str2, false, f6Var);
        this.Y0 = xx0Var;
    }

    @Override // org.telegram.ui.Components.lq0
    public final void R0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z4) {
        if (z4) {
            AndroidUtilities.runOnUIThread(new ey(this, hVar, i10, 18), 100L);
        }
    }

    @Override // org.telegram.ui.Components.lq0, org.telegram.ui.ActionBar.g3
    public final void dismissInternal() {
        super.dismissInternal();
        org.telegram.ui.ActionBar.p2 p2Var = this.Y0.I;
        if (p2Var instanceof org.telegram.ui.xn) {
            AndroidUtilities.requestAdjustResize(p2Var.getParentActivity(), p2Var.getClassGuid());
            if (((org.telegram.ui.xn) p2Var).V.getVisibility() == 0) {
                p2Var.getFragmentView().requestLayout();
            }
        }
    }
}
