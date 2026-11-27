// default package

import android.location.Location;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class i17 implements n7a {
    public final /* synthetic */ r17 a;

    public i17(r17 r17Var) {
        this.a = r17Var;
    }

    @Override // n7a
    public final void O() {
        this.a.Q();
    }

    @Override // n7a
    public final void T(Location location) {
        r17 r17Var = this.a;
        TLRPC.User user = r17Var.x0;
        if (user == null || !user.bot_inline_geo) {
            return;
        }
        r17Var.A0 = location;
        r17Var.T(true, user, r17Var.s0, "");
    }
}
