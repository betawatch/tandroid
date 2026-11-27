// default package

import android.os.Bundle;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final class au9 extends cu9 {
    public final /* synthetic */ TLRPC.User b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public au9(String str, TLRPC.User user) {
        super(str);
        this.b = user;
    }

    @Override // cu9
    public final String b() {
        return lbc.r(this.b);
    }

    @Override // cu9
    public final void c(e eVar) {
        TLRPC.User user = this.b;
        if (user.id != yac.h(yac.t0).e()) {
            eVar.presentFragment(ProfileActivity.Q2(user.id));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", user.id);
        bundle.putBoolean("my_profile", true);
        eVar.presentFragment(new ProfileActivity(bundle, null));
    }

    @Override // cu9
    public final void d(ImageReceiver imageReceiver) {
        rb0 rb0Var = new rb0((vnb) null);
        TLRPC.User user = this.b;
        rb0Var.q(user);
        imageReceiver.U(user, rb0Var, null);
    }
}
