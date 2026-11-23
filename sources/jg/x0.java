package jg;

import android.location.Location;
import org.telegram.messenger.wy;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class x0 implements wy {
    public final /* synthetic */ h1 a;

    public x0(h1 h1Var) {
        this.a = h1Var;
    }

    @Override // org.telegram.messenger.wy
    public final void b() {
        this.a.Q();
    }

    @Override // org.telegram.messenger.wy
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
