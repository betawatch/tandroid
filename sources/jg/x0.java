package jg;

import android.location.Location;
import org.telegram.messenger.az;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class x0 implements az {
    public final /* synthetic */ h1 a;

    public x0(h1 h1Var) {
        this.a = h1Var;
    }

    @Override // org.telegram.messenger.az
    public final void c() {
        this.a.Q();
    }

    @Override // org.telegram.messenger.az
    public final void f(Location location) {
        h1 h1Var = this.a;
        TLRPC.User user = h1Var.x0;
        if (user == null || !user.bot_inline_geo) {
            return;
        }
        h1Var.A0 = location;
        h1Var.T(true, user, h1Var.s0, "");
    }
}
