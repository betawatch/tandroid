package fg;

import android.location.Location;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class z0 implements SendMessagesHelper.LocationProvider.LocationProviderDelegate {
    public final /* synthetic */ l1 a;

    public z0(l1 l1Var) {
        this.a = l1Var;
    }

    @Override // org.telegram.messenger.SendMessagesHelper.LocationProvider.LocationProviderDelegate
    public final void onLocationAcquired(Location location) {
        l1 l1Var = this.a;
        TLRPC.User user = l1Var.w0;
        if (user == null || !user.bot_inline_geo) {
            return;
        }
        l1Var.z0 = location;
        l1Var.T(true, user, l1Var.r0, "");
    }

    @Override // org.telegram.messenger.SendMessagesHelper.LocationProvider.LocationProviderDelegate
    public final void onUnableLocationAcquire() {
        this.a.Q();
    }
}
