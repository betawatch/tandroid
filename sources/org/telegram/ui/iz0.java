package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class iz0 extends org.telegram.ui.Components.mr0 {
    public final /* synthetic */ ProfileActivity a1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iz0(ProfileActivity profileActivity, Activity activity, String str, String str2) {
        super(activity, null, str, false, str2, false, null);
        this.a1 = profileActivity;
    }

    @Override // org.telegram.ui.Components.mr0
    public final void T0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (z10) {
            AndroidUtilities.runOnUIThread(new fy0(this, hVar, i10, 6), 250L);
        }
    }
}
