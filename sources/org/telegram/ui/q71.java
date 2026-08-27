package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class q71 extends org.telegram.ui.Components.sp0 {
    public final /* synthetic */ x71 X0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q71(x71 x71Var, Activity activity, String str) {
        super(activity, null, str, false, null, false, null);
        this.X0 = x71Var;
    }

    @Override // org.telegram.ui.Components.sp0
    public final void R0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (z10) {
            AndroidUtilities.runOnUIThread(new m21(this, hVar, i10), 250L);
        }
    }
}
