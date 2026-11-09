package fi;

import android.os.Bundle;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.id;
import org.telegram.messenger.p10;
import org.telegram.messenger.t10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
        return id.M0(2131743546, null);
    }

    @Override // fi.p6
    public final String b() {
        return t10.p(this.b);
    }

    @Override // fi.p6
    public final void c(org.telegram.ui.ActionBar.f2 f2Var) {
        TLRPC.User user = this.b;
        if (user.id != p10.i(p10.s0).e()) {
            f2Var.presentFragment(ProfileActivity.D4(user.id));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", user.id);
        bundle.putBoolean("my_profile", true);
        f2Var.presentFragment(new ProfileActivity(bundle, null));
    }

    @Override // fi.p6
    public final void d(ImageReceiver imageReceiver) {
        org.telegram.ui.Components.w8 w8Var = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.g6) null);
        TLRPC.User user = this.b;
        w8Var.r(user);
        imageReceiver.i0(user, w8Var, null);
    }
}
