package fi;

import android.os.Bundle;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.hd;
import org.telegram.messenger.p10;
import org.telegram.messenger.t10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class n6 extends p6 {
    public final /* synthetic */ TLRPC.User b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n6(String str, TLRPC.User user) {
        super(str);
        this.b = user;
    }

    @Override // fi.p6
    public final String a() {
        return hd.M0(2131743547, null);
    }

    @Override // fi.p6
    public final String b() {
        return t10.p(this.b);
    }

    @Override // fi.p6
    public final void c(org.telegram.ui.ActionBar.f2 f2Var) {
        TLRPC.User user = this.b;
        if (user.id != p10.i(p10.s0).e()) {
            f2Var.presentFragment(ProfileActivity.A4(user.id));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", user.id);
        bundle.putBoolean("my_profile", true);
        f2Var.presentFragment(new ProfileActivity(bundle, null));
    }

    @Override // fi.p6
    public final void d(ImageReceiver imageReceiver) {
        org.telegram.ui.Components.w8 w8Var = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.f6) null);
        TLRPC.User user = this.b;
        w8Var.r(user);
        imageReceiver.i0(user, w8Var, null);
    }
}
