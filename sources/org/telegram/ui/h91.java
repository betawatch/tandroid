package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class h91 extends org.telegram.ui.Components.ir0 {
    public final /* synthetic */ o91 b1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h91(o91 o91Var, Activity activity, String str) {
        super(activity, null, str, false, null, false, null);
        this.b1 = o91Var;
    }

    @Override // org.telegram.ui.Components.ir0
    public final void S0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (z10) {
            AndroidUtilities.runOnUIThread(new i11(this, hVar, i10), 250L);
        }
    }
}
