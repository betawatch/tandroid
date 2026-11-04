package kg;

import android.location.Location;
import org.telegram.messenger.uy;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class u0 implements uy {
    public final /* synthetic */ e1 a;

    public u0(e1 e1Var) {
        this.a = e1Var;
    }

    @Override // org.telegram.messenger.uy
    public final void B(Location location) {
        e1 e1Var = this.a;
        TLRPC.User user = e1Var.x0;
        if (user == null || !user.bot_inline_geo) {
            return;
        }
        e1Var.A0 = location;
        e1Var.T(true, user, e1Var.s0, "");
    }

    @Override // org.telegram.messenger.uy
    public final void y() {
        this.a.Q();
    }
}
