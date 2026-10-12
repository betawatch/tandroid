package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class au0 extends jr0 {
    public final /* synthetic */ org.telegram.ui.ActionBar.m2 b1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public au0(Context context, String str, String str2, org.telegram.ui.ActionBar.c6 c6Var, org.telegram.ui.ActionBar.m2 m2Var) {
        super(context, null, str, false, str2, false, c6Var);
        this.b1 = m2Var;
    }

    @Override // org.telegram.ui.Components.jr0
    public final void S0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        AndroidUtilities.runOnUIThread(new org.telegram.ui.gm(this.b1, hVar, i10, 16), 100L);
    }
}
