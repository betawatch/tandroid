package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class js0 extends sp0 {
    public final /* synthetic */ org.telegram.ui.ActionBar.n2 X0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public js0(Context context, String str, String str2, org.telegram.ui.ActionBar.c6 c6Var, org.telegram.ui.ActionBar.n2 n2Var) {
        super(context, null, str, false, str2, false, c6Var);
        this.X0 = n2Var;
    }

    @Override // org.telegram.ui.Components.sp0
    public final void R0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        AndroidUtilities.runOnUIThread(new km(this.X0, hVar, i10, 14), 100L);
    }
}
