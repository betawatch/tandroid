package ci;

import android.os.Bundle;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final class t7 extends v7 {
    public final /* synthetic */ TLRPC.User b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t7(String str, TLRPC.User user) {
        super(str);
        this.b = user;
    }

    @Override // ci.v7
    public final String a() {
        return LocaleController.getString(R.string.ViewProfile);
    }

    @Override // ci.v7
    public final String b() {
        return UserObject.getUserName(this.b);
    }

    @Override // ci.v7
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

    @Override // ci.v7
    public final void d(ImageReceiver imageReceiver) {
        org.telegram.ui.Components.f9 f9Var = new org.telegram.ui.Components.f9((org.telegram.ui.ActionBar.f6) null);
        TLRPC.User user = this.b;
        f9Var.r(user);
        imageReceiver.setForUserOrChat(user, f9Var);
    }
}
