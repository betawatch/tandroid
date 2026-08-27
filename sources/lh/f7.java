package lh;

import android.os.Bundle;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class f7 extends h7 {
    public final /* synthetic */ TLRPC.User b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f7(String str, TLRPC.User user) {
        super(str);
        this.b = user;
    }

    @Override // lh.h7
    public final String a() {
        return LocaleController.getString(R.string.ViewProfile);
    }

    @Override // lh.h7
    public final String b() {
        return UserObject.getUserName(this.b);
    }

    @Override // lh.h7
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

    @Override // lh.h7
    public final void d(ImageReceiver imageReceiver) {
        org.telegram.ui.Components.y8 y8Var = new org.telegram.ui.Components.y8((org.telegram.ui.ActionBar.c6) null);
        TLRPC.User user = this.b;
        y8Var.r(user);
        imageReceiver.setForUserOrChat(user, y8Var);
    }
}
