package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class gy0 extends org.telegram.ui.Components.sp0 {
    public final /* synthetic */ hy0 X0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gy0(hy0 hy0Var, Activity activity, String str) {
        super(activity, null, str, false, null, false, null);
        this.X0 = hy0Var;
    }

    @Override // org.telegram.ui.Components.sp0
    public final void R0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (z10) {
            AndroidUtilities.runOnUIThread(new zs0(this, hVar, i10, 19), 250L);
        }
    }
}
