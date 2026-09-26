package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class mt0 extends uq0 {
    public final /* synthetic */ org.telegram.ui.ActionBar.m2 b1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mt0(Context context, String str, String str2, org.telegram.ui.ActionBar.d6 d6Var, org.telegram.ui.ActionBar.m2 m2Var) {
        super(context, null, str, false, str2, false, d6Var);
        this.b1 = m2Var;
    }

    @Override // org.telegram.ui.Components.uq0
    public final void R0(a0.i iVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        AndroidUtilities.runOnUIThread(new xm(this.b1, iVar, i10, 14), 100L);
    }
}
