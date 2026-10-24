package ei;

import android.os.Bundle;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final class g7 extends i7 {
    public final /* synthetic */ TLRPC.User b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g7(String str, TLRPC.User user) {
        super(str);
        this.b = user;
    }

    @Override // ei.i7
    public final String a() {
        return LocaleController.getString(R.string.ViewProfile);
    }

    @Override // ei.i7
    public final String b() {
        return UserObject.getUserName(this.b);
    }

    @Override // ei.i7
    public final void c(org.telegram.ui.ActionBar.o2 o2Var) {
        TLRPC.User user = this.b;
        if (user.id != UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId()) {
            o2Var.presentFragment(ProfileActivity.o4(user.id));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", user.id);
        bundle.putBoolean("my_profile", true);
        o2Var.presentFragment(new ProfileActivity(bundle, null));
    }

    @Override // ei.i7
    public final void d(ImageReceiver imageReceiver) {
        org.telegram.ui.Components.h9 h9Var = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.g6) null);
        TLRPC.User user = this.b;
        h9Var.r(user);
        imageReceiver.setForUserOrChat(user, h9Var);
    }
}
