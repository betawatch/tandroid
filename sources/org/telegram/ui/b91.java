package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class b91 extends org.telegram.ui.Components.mr0 {
    public final /* synthetic */ i91 b1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b91(i91 i91Var, Activity activity, String str) {
        super(activity, null, str, false, null, false, null);
        this.b1 = i91Var;
    }

    @Override // org.telegram.ui.Components.mr0
    public final void S0(a0.i iVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (z10) {
            AndroidUtilities.runOnUIThread(new n31(this, iVar, i10), 250L);
        }
    }
}
