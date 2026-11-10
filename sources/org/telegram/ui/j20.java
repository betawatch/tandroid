package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.voip.GroupCallMessage;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class j20 implements nh.a {
    public final /* synthetic */ f40 a;

    public j20(f40 f40Var) {
        this.a = f40Var;
    }

    public final void a(GroupCallMessage groupCallMessage) {
        org.telegram.ui.ActionBar.f2 Q = LaunchActivity.Q();
        if (Q == null) {
            return;
        }
        boolean z9 = Q instanceof ProfileActivity;
        f40 f40Var = this.a;
        if (z9 && ((ProfileActivity) Q).a() == groupCallMessage.fromId) {
            f40Var.dismiss();
            return;
        }
        int R0 = f40Var.R0();
        Bundle bundle = new Bundle();
        long j3 = groupCallMessage.fromId;
        if (j3 > 0) {
            bundle.putLong("user_id", j3);
        } else {
            bundle.putLong("chat_id", -j3);
        }
        boolean z10 = true;
        if (groupCallMessage.fromId == org.telegram.messenger.p10.i(f40Var.n1.a).e()) {
            bundle.putBoolean("my_profile", true);
        }
        ProfileActivity profileActivity = new ProfileActivity(bundle, null);
        if (R0 > 0 && R0 != Integer.MAX_VALUE) {
            z10 = false;
        }
        Q.presentFragment(profileActivity, false, z10);
        f40Var.dismiss();
    }
}
