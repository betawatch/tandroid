// default package

import android.location.Location;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
