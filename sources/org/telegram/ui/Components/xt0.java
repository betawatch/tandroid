package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class xt0 extends fr0 {
    public final /* synthetic */ org.telegram.ui.ActionBar.n2 c1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xt0(Context context, String str, String str2, org.telegram.ui.ActionBar.d6 d6Var, org.telegram.ui.ActionBar.n2 n2Var) {
        super(context, null, str, false, str2, false, d6Var);
        this.c1 = n2Var;
    }

    @Override // org.telegram.ui.Components.fr0
    public final void T0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        AndroidUtilities.runOnUIThread(new org.telegram.ui.i4(this.c1, hVar, i10, 20), 100L);
    }
}
