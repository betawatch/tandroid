package fi;

import android.os.Bundle;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class d7 extends f7 {
    public final /* synthetic */ TLRPC.User b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d7(String str, TLRPC.User user) {
        super(str);
        this.b = user;
    }

    @Override // fi.f7
    public final String a() {
        return LocaleController.getString(R.string.ViewProfile);
    }

    @Override // fi.f7
    public final String b() {
        return UserObject.getUserName(this.b);
    }

    @Override // fi.f7
    public final void c(org.telegram.ui.ActionBar.r2 r2Var) {
        TLRPC.User user = this.b;
        if (user.id != UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId()) {
            r2Var.presentFragment(ProfileActivity.t4(user.id));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", user.id);
        bundle.putBoolean("my_profile", true);
        r2Var.presentFragment(new ProfileActivity(bundle, null));
    }

    @Override // fi.f7
    public final void d(ImageReceiver imageReceiver) {
        org.telegram.ui.Components.j9 j9Var = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.u6) null);
        TLRPC.User user = this.b;
        j9Var.r(user);
        imageReceiver.setForUserOrChat(user, j9Var);
    }
}
