package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class jv extends br0 {
    public final /* synthetic */ wv X0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jv(wv wvVar, Context context, String str, String str2, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, null, str, false, str2, false, d6Var);
        this.X0 = wvVar;
    }

    @Override // org.telegram.ui.Components.br0
    public final void O0(a0.i iVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        AndroidUtilities.runOnUIThread(new zm(this, iVar, i10, 1), 100L);
    }
}
