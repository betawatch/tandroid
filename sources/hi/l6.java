package hi;

import android.os.Bundle;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.o10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class l6 extends n6 {
    public final /* synthetic */ TLRPC.User b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l6(String str, TLRPC.User user) {
        super(str);
        this.b = user;
    }

    @Override // hi.n6
    public final String a() {
        return gd.M0(2131743309, null);
    }

    @Override // hi.n6
    public final String b() {
        return o10.q(this.b);
    }

    @Override // hi.n6
    public final void c(org.telegram.ui.ActionBar.h2 h2Var) {
        TLRPC.User user = this.b;
        if (user.id != j10.i(j10.t0).e()) {
            h2Var.presentFragment(ProfileActivity.D4(user.id));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", user.id);
        bundle.putBoolean("my_profile", true);
        h2Var.presentFragment(new ProfileActivity(bundle, null));
    }

    @Override // hi.n6
    public final void d(ImageReceiver imageReceiver) {
        org.telegram.ui.Components.b9 b9Var = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.i6) null);
        TLRPC.User user = this.b;
        b9Var.r(user);
        imageReceiver.i0(user, b9Var, null);
    }
}
