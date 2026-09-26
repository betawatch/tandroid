package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class bz0 extends org.telegram.ui.Components.uq0 {
    public final /* synthetic */ cz0 b1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bz0(cz0 cz0Var, Activity activity, String str) {
        super(activity, null, str, false, null, false, null);
        this.b1 = cz0Var;
    }

    @Override // org.telegram.ui.Components.uq0
    public final void R0(a0.i iVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (z10) {
            AndroidUtilities.runOnUIThread(new jx0(this, iVar, i10, 12), 250L);
        }
    }
}
