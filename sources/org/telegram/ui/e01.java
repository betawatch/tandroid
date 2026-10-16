package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class e01 extends org.telegram.ui.Components.ir0 {
    public final /* synthetic */ ProfileActivity b1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e01(ProfileActivity profileActivity, Activity activity, String str, String str2) {
        super(activity, null, str, false, str2, false, null);
        this.b1 = profileActivity;
    }

    @Override // org.telegram.ui.Components.ir0
    public final void S0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (z10) {
            AndroidUtilities.runOnUIThread(new rr0(this, hVar, i10, 28), 250L);
        }
    }
}
