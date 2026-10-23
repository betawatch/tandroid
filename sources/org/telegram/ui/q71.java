package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class q71 extends org.telegram.ui.Components.fr0 {
    public final /* synthetic */ x71 c1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q71(x71 x71Var, Activity activity, String str) {
        super(activity, null, str, false, null, false, null);
        this.c1 = x71Var;
    }

    @Override // org.telegram.ui.Components.fr0
    public final void T0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (z10) {
            AndroidUtilities.runOnUIThread(new k71(this, hVar, i10), 250L);
        }
    }
}
