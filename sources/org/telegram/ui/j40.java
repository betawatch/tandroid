package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.voip.GroupCallMessage;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class j40 implements lh.a {
    public final /* synthetic */ k60 a;

    public j40(k60 k60Var) {
        this.a = k60Var;
    }

    public final void a(GroupCallMessage groupCallMessage) {
        org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
        if (R == null) {
            return;
        }
        boolean z10 = R instanceof ProfileActivity;
        k60 k60Var = this.a;
        if (z10 && ((ProfileActivity) R).a() == groupCallMessage.fromId) {
            k60Var.dismiss();
            return;
        }
        int P0 = k60Var.P0();
        Bundle bundle = new Bundle();
        long j3 = groupCallMessage.fromId;
        if (j3 > 0) {
            bundle.putLong("user_id", j3);
        } else {
            bundle.putLong("chat_id", -j3);
        }
        long j10 = groupCallMessage.fromId;
        boolean z11 = true;
        if (j10 == k60Var.d.getUserConfig().getClientUserId()) {
            bundle.putBoolean("my_profile", true);
        }
        ProfileActivity profileActivity = new ProfileActivity(bundle, null);
        if (P0 > 0 && P0 != Integer.MAX_VALUE) {
            z11 = false;
        }
        R.presentFragment(profileActivity, false, z11);
        k60Var.dismiss();
    }
}
