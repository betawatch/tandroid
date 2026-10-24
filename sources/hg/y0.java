package hg;

import android.location.Location;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class y0 implements SendMessagesHelper.LocationProvider.LocationProviderDelegate {
    public final /* synthetic */ j1 a;

    public y0(j1 j1Var) {
        this.a = j1Var;
    }

    @Override // org.telegram.messenger.SendMessagesHelper.LocationProvider.LocationProviderDelegate
    public final void onLocationAcquired(Location location) {
        j1 j1Var = this.a;
        TLRPC.User user = j1Var.w0;
        if (user == null || !user.bot_inline_geo) {
            return;
        }
        j1Var.z0 = location;
        j1Var.T(true, user, j1Var.r0, "");
    }

    @Override // org.telegram.messenger.SendMessagesHelper.LocationProvider.LocationProviderDelegate
    public final void onUnableLocationAcquire() {
        this.a.Q();
    }
}
