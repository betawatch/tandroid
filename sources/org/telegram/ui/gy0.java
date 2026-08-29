package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class gy0 extends org.telegram.ui.Components.dq0 {
    public final /* synthetic */ hy0 X0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gy0(hy0 hy0Var, Activity activity, String str) {
        super(activity, null, str, false, null, false, null);
        this.X0 = hy0Var;
    }

    @Override // org.telegram.ui.Components.dq0
    public final void R0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (z10) {
            AndroidUtilities.runOnUIThread(new av0(this, hVar, i10, 16), 250L);
        }
    }
}
