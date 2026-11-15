package jg;

import android.location.Location;
import org.telegram.messenger.az;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
