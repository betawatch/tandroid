package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class bt0 extends hq0 {
    public final /* synthetic */ org.telegram.ui.ActionBar.n2 b1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bt0(Context context, String str, String str2, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.ActionBar.n2 n2Var) {
        super(context, null, str, false, str2, false, e6Var);
        this.b1 = n2Var;
    }

    @Override // org.telegram.ui.Components.hq0
    public final void R0(a0.i iVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        AndroidUtilities.runOnUIThread(new wm(this.b1, iVar, i10, 14), 100L);
    }
}
