package hi;

import android.os.Bundle;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.o10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final class k6 extends m6 {
    public final /* synthetic */ TLRPC.User b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k6(String str, TLRPC.User user) {
        super(str);
        this.b = user;
    }

    @Override // hi.m6
    public final String a() {
        return gd.N0(2131743303, null);
    }

    @Override // hi.m6
    public final String b() {
        return o10.q(this.b);
    }

    @Override // hi.m6
    public final void c(org.telegram.ui.ActionBar.g2 g2Var) {
        TLRPC.User user = this.b;
        if (user.id != j10.i(j10.t0).e()) {
            g2Var.presentFragment(ProfileActivity.D4(user.id));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", user.id);
        bundle.putBoolean("my_profile", true);
        g2Var.presentFragment(new ProfileActivity(bundle, null));
    }

    @Override // hi.m6
    public final void d(ImageReceiver imageReceiver) {
        org.telegram.ui.Components.b9 b9Var = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.h6) null);
        TLRPC.User user = this.b;
        b9Var.r(user);
        imageReceiver.i0(user, b9Var, null);
    }
}
