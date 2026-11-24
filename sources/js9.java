// default package

import android.os.Bundle;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class js9 extends ls9 {
    public final /* synthetic */ TLRPC.User b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public js9(String str, TLRPC.User user) {
        super(str);
        this.b = user;
    }

    @Override // ls9
    public final String b() {
        return m9c.r(this.b);
    }

    @Override // ls9
    public final void c(d dVar) {
        TLRPC.User user = this.b;
        if (user.id != z8c.h(z8c.t0).e()) {
            dVar.presentFragment(ProfileActivity.S2(user.id));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", user.id);
        bundle.putBoolean("my_profile", true);
        dVar.presentFragment(new ProfileActivity(bundle, null));
    }

    @Override // ls9
    public final void d(ImageReceiver imageReceiver) {
        pc0 pc0Var = new pc0((ylb) null);
        TLRPC.User user = this.b;
        pc0Var.q(user);
        imageReceiver.U(user, pc0Var, null);
    }
}
