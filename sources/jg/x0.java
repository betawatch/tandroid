package jg;

import android.location.Location;
import org.telegram.messenger.vy;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class x0 implements vy {
    public final /* synthetic */ h1 a;

    public x0(h1 h1Var) {
        this.a = h1Var;
    }

    @Override // org.telegram.messenger.vy
    public final void b() {
        this.a.Q();
    }

    @Override // org.telegram.messenger.vy
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
