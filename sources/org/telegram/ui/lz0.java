package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class lz0 extends org.telegram.ui.Components.hq0 {
    public final /* synthetic */ mz0 b1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lz0(mz0 mz0Var, Activity activity, String str) {
        super(activity, null, str, false, null, false, null);
        this.b1 = mz0Var;
    }

    @Override // org.telegram.ui.Components.hq0
    public final void R0(a0.i iVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (z10) {
            AndroidUtilities.runOnUIThread(new rx0(this, iVar, i10, 13), 250L);
        }
    }
}
