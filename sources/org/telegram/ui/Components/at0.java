package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class at0 extends lq0 {
    public final /* synthetic */ org.telegram.ui.ActionBar.p2 Y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public at0(Context context, String str, String str2, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.ActionBar.p2 p2Var) {
        super(context, null, str, false, str2, false, f6Var);
        this.Y0 = p2Var;
    }

    @Override // org.telegram.ui.Components.lq0
    public final void R0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z4) {
        AndroidUtilities.runOnUIThread(new ey(this.Y0, hVar, i10, 12), 100L);
    }
}
