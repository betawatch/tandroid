package of;

import android.location.Location;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class v0 implements SendMessagesHelper.LocationProvider.LocationProviderDelegate {
    public final /* synthetic */ f1 a;

    public v0(f1 f1Var) {
        this.a = f1Var;
    }

    @Override // org.telegram.messenger.SendMessagesHelper.LocationProvider.LocationProviderDelegate
    public final void onLocationAcquired(Location location) {
        f1 f1Var = this.a;
        TLRPC.User user = f1Var.s0;
        if (user == null || !user.bot_inline_geo) {
            return;
        }
        f1Var.v0 = location;
        f1Var.T(true, user, f1Var.n0, "");
    }

    @Override // org.telegram.messenger.SendMessagesHelper.LocationProvider.LocationProviderDelegate
    public final void onUnableLocationAcquire() {
        this.a.Q();
    }
}
