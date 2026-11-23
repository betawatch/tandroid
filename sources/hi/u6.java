package hi;

import android.os.Bundle;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.n10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class u6 extends w6 {
    public final /* synthetic */ TLRPC.User b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u6(String str, TLRPC.User user) {
        super(str);
        this.b = user;
    }

    @Override // hi.w6
    public final String a() {
        return gd.N0(2131743296, null);
    }

    @Override // hi.w6
    public final String b() {
        return n10.q(this.b);
    }

    @Override // hi.w6
    public final void c(org.telegram.ui.ActionBar.g2 g2Var) {
        TLRPC.User user = this.b;
        if (user.id != i10.i(i10.t0).e()) {
            g2Var.presentFragment(ProfileActivity.D4(user.id));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", user.id);
        bundle.putBoolean("my_profile", true);
        g2Var.presentFragment(new ProfileActivity(bundle, null));
    }

    @Override // hi.w6
    public final void d(ImageReceiver imageReceiver) {
        org.telegram.ui.Components.a9 a9Var = new org.telegram.ui.Components.a9((org.telegram.ui.ActionBar.i6) null);
        TLRPC.User user = this.b;
        a9Var.r(user);
        imageReceiver.j0(user, a9Var, null);
    }
}
