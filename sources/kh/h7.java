package kh;

import android.os.Bundle;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class h7 extends j7 {
    public final /* synthetic */ TLRPC.User b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h7(String str, TLRPC.User user) {
        super(str);
        this.b = user;
    }

    @Override // kh.j7
    public final String a() {
        return LocaleController.getString(R.string.ViewProfile);
    }

    @Override // kh.j7
    public final String b() {
        return UserObject.getUserName(this.b);
    }

    @Override // kh.j7
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

    @Override // kh.j7
    public final void d(ImageReceiver imageReceiver) {
        org.telegram.ui.Components.z8 z8Var = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.b6) null);
        TLRPC.User user = this.b;
        z8Var.r(user);
        imageReceiver.setForUserOrChat(user, z8Var);
    }
}
