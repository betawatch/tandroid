package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class mz0 extends org.telegram.ui.Components.lq0 {
    public final /* synthetic */ ProfileActivity Y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mz0(ProfileActivity profileActivity, Activity activity, String str, String str2) {
        super(activity, null, str, false, str2, false, null);
        this.Y0 = profileActivity;
    }

    @Override // org.telegram.ui.Components.lq0
    public final void R0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z4) {
        if (z4) {
            AndroidUtilities.runOnUIThread(new gr0(this, hVar, i10, 25), 250L);
        }
    }
}
