package bi;

import android.os.Bundle;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class u8 extends w8 {
    public final /* synthetic */ TLRPC.User b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u8(String str, TLRPC.User user) {
        super(str);
        this.b = user;
    }

    @Override // bi.w8
    public final String a() {
        return LocaleController.getString(R.string.ViewProfile);
    }

    @Override // bi.w8
    public final String b() {
        return UserObject.getUserName(this.b);
    }

    @Override // bi.w8
    public final void c(org.telegram.ui.ActionBar.p2 p2Var) {
        TLRPC.User user = this.b;
        if (user.id != UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId()) {
            p2Var.presentFragment(ProfileActivity.m4(user.id));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", user.id);
        bundle.putBoolean("my_profile", true);
        p2Var.presentFragment(new ProfileActivity(bundle, null));
    }

    @Override // bi.w8
    public final void d(ImageReceiver imageReceiver) {
        org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9((org.telegram.ui.ActionBar.f6) null);
        TLRPC.User user = this.b;
        g9Var.r(user);
        imageReceiver.setForUserOrChat(user, g9Var);
    }
}
