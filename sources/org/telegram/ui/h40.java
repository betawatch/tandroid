package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.voip.GroupCallMessage;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class h40 implements lh.a {
    public final /* synthetic */ i60 a;

    public h40(i60 i60Var) {
        this.a = i60Var;
    }

    public final void a(GroupCallMessage groupCallMessage) {
        org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
        if (R == null) {
            return;
        }
        boolean z10 = R instanceof ProfileActivity;
        i60 i60Var = this.a;
        if (z10 && ((ProfileActivity) R).a() == groupCallMessage.fromId) {
            i60Var.dismiss();
            return;
        }
        int P0 = i60Var.P0();
        Bundle bundle = new Bundle();
        long j3 = groupCallMessage.fromId;
        if (j3 > 0) {
            bundle.putLong("user_id", j3);
        } else {
            bundle.putLong("chat_id", -j3);
        }
        long j10 = groupCallMessage.fromId;
        boolean z11 = true;
        if (j10 == i60Var.d.getUserConfig().getClientUserId()) {
            bundle.putBoolean("my_profile", true);
        }
        ProfileActivity profileActivity = new ProfileActivity(bundle, null);
        if (P0 > 0 && P0 != Integer.MAX_VALUE) {
            z11 = false;
        }
        R.presentFragment(profileActivity, false, z11);
        i60Var.dismiss();
    }
}
