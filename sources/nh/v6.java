package nh;

import android.os.Bundle;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class v6 extends x6 {
    public final /* synthetic */ TLRPC.User b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v6(String str, TLRPC.User user) {
        super(str);
        this.b = user;
    }

    @Override // nh.x6
    public final String a() {
        return LocaleController.getString(R.string.ViewProfile);
    }

    @Override // nh.x6
    public final String b() {
        return UserObject.getUserName(this.b);
    }

    @Override // nh.x6
    public final void c(org.telegram.ui.ActionBar.o2 o2Var) {
        TLRPC.User user = this.b;
        if (user.id != UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId()) {
            o2Var.presentFragment(ProfileActivity.m4(user.id));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", user.id);
        bundle.putBoolean("my_profile", true);
        o2Var.presentFragment(new ProfileActivity(bundle, null));
    }

    @Override // nh.x6
    public final void d(ImageReceiver imageReceiver) {
        org.telegram.ui.Components.e9 e9Var = new org.telegram.ui.Components.e9((org.telegram.ui.ActionBar.c6) null);
        TLRPC.User user = this.b;
        e9Var.r(user);
        imageReceiver.setForUserOrChat(user, e9Var);
    }
}
