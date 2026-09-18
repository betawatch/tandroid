package ci;

import android.os.Bundle;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
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

    @Override // ci.v7
    public final void d(ImageReceiver imageReceiver) {
        org.telegram.ui.Components.h9 h9Var = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.e6) null);
        TLRPC.User user = this.b;
        h9Var.r(user);
        imageReceiver.setForUserOrChat(user, h9Var);
    }
}
