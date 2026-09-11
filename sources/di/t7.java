package di;

import android.os.Bundle;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes4.dex */
public final class t7 extends v7 {
    public final /* synthetic */ TLRPC.User b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t7(String str, TLRPC.User user) {
        super(str);
        this.b = user;
    }

    @Override // di.v7
    public final String a() {
        return LocaleController.getString(R.string.ViewProfile);
    }

    @Override // di.v7
    public final String b() {
        return UserObject.getUserName(this.b);
    }

    @Override // di.v7
    public final void c(org.telegram.ui.ActionBar.n2 n2Var) {
        TLRPC.User user = this.b;
        if (user.id != UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId()) {
            n2Var.presentFragment(ProfileActivity.m4(user.id));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", user.id);
        bundle.putBoolean("my_profile", true);
        n2Var.presentFragment(new ProfileActivity(bundle, null));
    }

    @Override // di.v7
    public final void d(ImageReceiver imageReceiver) {
        org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9((org.telegram.ui.ActionBar.f6) null);
        TLRPC.User user = this.b;
        i9Var.r(user);
        imageReceiver.setForUserOrChat(user, i9Var);
    }
}
