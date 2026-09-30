package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class iv extends wq0 {
    public final /* synthetic */ vv b1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iv(vv vvVar, Context context, String str, String str2, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, null, str, false, str2, false, d6Var);
        this.b1 = vvVar;
    }

    @Override // org.telegram.ui.Components.wq0
    public final void R0(a0.i iVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        AndroidUtilities.runOnUIThread(new ym(this, iVar, i10, 1), 100L);
    }
}
