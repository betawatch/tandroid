// default package

import android.location.Location;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class b17 implements w5a {
    public final /* synthetic */ k17 a;

    public b17(k17 k17Var) {
        this.a = k17Var;
    }

    @Override // w5a
    public final void Q() {
        this.a.Q();
    }

    @Override // w5a
    public final void U(Location location) {
        k17 k17Var = this.a;
        TLRPC.User user = k17Var.x0;
        if (user == null || !user.bot_inline_geo) {
            return;
        }
        k17Var.A0 = location;
        k17Var.T(true, user, k17Var.s0, "");
    }
}
