package jg;

import android.location.Location;
import org.telegram.messenger.cz;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
