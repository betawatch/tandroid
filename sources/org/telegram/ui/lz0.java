package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
            AndroidUtilities.runOnUIThread(new iy0(this, iVar, i10, 7), 250L);
        }
    }
}
