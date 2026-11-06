package jg;

import android.location.Location;
import org.telegram.messenger.cz;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class x0 implements cz {
    public final /* synthetic */ i1 a;

    public x0(i1 i1Var) {
        this.a = i1Var;
    }

    @Override // org.telegram.messenger.cz
    public final void C() {
        this.a.Q();
    }

    @Override // org.telegram.messenger.cz
    public final void K(Location location) {
        i1 i1Var = this.a;
        TLRPC.User user = i1Var.w0;
        if (user == null || !user.bot_inline_geo) {
            return;
        }
        i1Var.z0 = location;
        i1Var.T(true, user, i1Var.r0, "");
    }
}
