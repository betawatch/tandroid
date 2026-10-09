package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class jz0 extends org.telegram.ui.Components.mr0 {
    public final /* synthetic */ kz0 b1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jz0(kz0 kz0Var, Activity activity, String str) {
        super(activity, null, str, false, null, false, null);
        this.b1 = kz0Var;
    }

    @Override // org.telegram.ui.Components.mr0
    public final void S0(a0.i iVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (z10) {
            AndroidUtilities.runOnUIThread(new rt0(this, iVar, i10, 21), 250L);
        }
    }
}
