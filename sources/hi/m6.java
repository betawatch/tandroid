package hi;

import android.os.Bundle;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.messenger.q10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class m6 extends o6 {
    public final /* synthetic */ TLRPC.User b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m6(String str, TLRPC.User user) {
        super(str);
        this.b = user;
    }

    @Override // hi.o6
    public final String a() {
        return hd.M0(2131743546, null);
    }

    @Override // hi.o6
    public final String b() {
        return q10.p(this.b);
    }

    @Override // hi.o6
    public final void c(org.telegram.ui.ActionBar.e2 e2Var) {
        TLRPC.User user = this.b;
        if (user.id != m10.i(m10.t0).e()) {
            e2Var.presentFragment(ProfileActivity.C4(user.id));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", user.id);
        bundle.putBoolean("my_profile", true);
        e2Var.presentFragment(new ProfileActivity(bundle, null));
    }

    @Override // hi.o6
    public final void d(ImageReceiver imageReceiver) {
        org.telegram.ui.Components.t8 t8Var = new org.telegram.ui.Components.t8((org.telegram.ui.ActionBar.e6) null);
        TLRPC.User user = this.b;
        t8Var.r(user);
        imageReceiver.i0(user, t8Var, null);
    }
}
