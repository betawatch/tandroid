package di;

import android.os.Bundle;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class p7 extends r7 {
    public final /* synthetic */ TLRPC.User b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p7(String str, TLRPC.User user) {
        super(str);
        this.b = user;
    }

    @Override // di.r7
    public final String a() {
        return LocaleController.getString(R.string.ViewProfile);
    }

    @Override // di.r7
    public final String b() {
        return UserObject.getUserName(this.b);
    }

    @Override // di.r7
    public final void c(org.telegram.ui.ActionBar.m2 m2Var) {
        TLRPC.User user = this.b;
        if (user.id != UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId()) {
            m2Var.presentFragment(ProfileActivity.m4(user.id));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", user.id);
        bundle.putBoolean("my_profile", true);
        m2Var.presentFragment(new ProfileActivity(bundle, null));
    }

    @Override // di.r7
    public final void d(ImageReceiver imageReceiver) {
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9((org.telegram.ui.ActionBar.c6) null);
        TLRPC.User user = this.b;
        k9Var.r(user);
        imageReceiver.setForUserOrChat(user, k9Var);
    }
}
