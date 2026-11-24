// default package

import android.location.Location;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
