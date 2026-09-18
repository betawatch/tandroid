package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class fv extends iq0 {
    public final /* synthetic */ sv b1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fv(sv svVar, Context context, String str, String str2, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, null, str, false, str2, false, f6Var);
        this.b1 = svVar;
    }

    @Override // org.telegram.ui.Components.iq0
    public final void R0(a0.i iVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        AndroidUtilities.runOnUIThread(new wm(this, iVar, i10, 1), 100L);
    }
}
