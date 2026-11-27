// default package

import android.os.Bundle;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
