package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class jv0 extends oo0 {
    public final /* synthetic */ xv0 S2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jv0(xv0 xv0Var, Context context, String str, String str2, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, null, str, false, str2, false, e6Var);
        this.S2 = xv0Var;
    }

    @Override // org.telegram.ui.Components.oo0, org.telegram.ui.ActionBar.t2
    public final void K() {
        super.K();
        org.telegram.ui.ActionBar.d2 d2Var = this.S2.D1;
        if (d2Var instanceof org.telegram.ui.wm) {
            org.telegram.messenger.g0.a3(d2Var.getParentActivity(), d2Var.getClassGuid());
            if (((org.telegram.ui.wm) d2Var).a0.getVisibility() == 0) {
                d2Var.getFragmentView().requestLayout();
            }
        }
    }

    @Override // org.telegram.ui.Components.oo0
    public final void R0(a0.h hVar, int i3, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (z10) {
            org.telegram.messenger.g0.i3(new org.telegram.ui.f4(this, hVar, i3, 24), 100L);
        }
    }
}
