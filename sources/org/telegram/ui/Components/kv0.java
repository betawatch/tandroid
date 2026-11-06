package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class kv0 extends mo0 {
    public final /* synthetic */ yv0 R2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kv0(yv0 yv0Var, Context context, String str, String str2, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, null, str, false, str2, false, f6Var);
        this.R2 = yv0Var;
    }

    @Override // org.telegram.ui.Components.mo0, org.telegram.ui.ActionBar.v2
    public final void K() {
        super.K();
        org.telegram.ui.ActionBar.f2 f2Var = this.R2.C1;
        if (f2Var instanceof org.telegram.ui.an) {
            org.telegram.messenger.g0.a3(f2Var.getParentActivity(), f2Var.getClassGuid());
            if (((org.telegram.ui.an) f2Var).Z.getVisibility() == 0) {
                f2Var.getFragmentView().requestLayout();
            }
        }
    }

    @Override // org.telegram.ui.Components.mo0
    public final void R0(a0.h hVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z9) {
        if (z9) {
            org.telegram.messenger.g0.i3(new org.telegram.ui.q8(this, hVar, i7, 23), 100L);
        }
    }
}
