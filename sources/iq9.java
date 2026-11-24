// default package

import android.os.Bundle;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class iq9 extends kq9 {
    public final /* synthetic */ TLRPC.User b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iq9(String str, TLRPC.User user) {
        super(str);
        this.b = user;
    }

    @Override // kq9
    public final String b() {
        return l7c.r(this.b);
    }

    @Override // kq9
    public final void c(d dVar) {
        TLRPC.User user = this.b;
        if (user.id != y6c.h(y6c.t0).e()) {
            dVar.presentFragment(ProfileActivity.P2(user.id));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", user.id);
        bundle.putBoolean("my_profile", true);
        dVar.presentFragment(new ProfileActivity(bundle, null));
    }

    @Override // kq9
    public final void d(ImageReceiver imageReceiver) {
        pb0 pb0Var = new pb0((wjb) null);
        TLRPC.User user = this.b;
        pb0Var.q(user);
        imageReceiver.U(user, pb0Var, null);
    }
}
