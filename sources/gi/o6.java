package gi;

import android.os.Bundle;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.bd;
import org.telegram.messenger.h10;
import org.telegram.messenger.l10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class o6 extends q6 {
    public final /* synthetic */ TLRPC.User b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o6(String str, TLRPC.User user) {
        super(str);
        this.b = user;
    }

    @Override // gi.q6
    public final String a() {
        return bd.M0(2131743556, null);
    }

    @Override // gi.q6
    public final String b() {
        return l10.p(this.b);
    }

    @Override // gi.q6
    public final void c(org.telegram.ui.ActionBar.d2 d2Var) {
        TLRPC.User user = this.b;
        if (user.id != h10.i(h10.t0).e()) {
            d2Var.presentFragment(ProfileActivity.A4(user.id));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", user.id);
        bundle.putBoolean("my_profile", true);
        d2Var.presentFragment(new ProfileActivity(bundle, null));
    }

    @Override // gi.q6
    public final void d(ImageReceiver imageReceiver) {
        org.telegram.ui.Components.u8 u8Var = new org.telegram.ui.Components.u8((org.telegram.ui.ActionBar.e6) null);
        TLRPC.User user = this.b;
        u8Var.r(user);
        imageReceiver.i0(user, u8Var, null);
    }
}
