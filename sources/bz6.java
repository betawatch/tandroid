// default package

import android.location.Location;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class bz6 implements v3a {
    public final /* synthetic */ kz6 a;

    public bz6(kz6 kz6Var) {
        this.a = kz6Var;
    }

    @Override // v3a
    public final void S() {
        this.a.Q();
    }

    @Override // v3a
    public final void X(Location location) {
        kz6 kz6Var = this.a;
        TLRPC.User user = kz6Var.x0;
        if (user == null || !user.bot_inline_geo) {
            return;
        }
        kz6Var.A0 = location;
        kz6Var.T(true, user, kz6Var.s0, "");
    }
}
