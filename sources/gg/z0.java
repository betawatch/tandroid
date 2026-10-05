package gg;

import android.location.Location;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class z0 implements SendMessagesHelper.LocationProvider.LocationProviderDelegate {
    public final /* synthetic */ k1 a;

    public z0(k1 k1Var) {
        this.a = k1Var;
    }

    @Override // org.telegram.messenger.SendMessagesHelper.LocationProvider.LocationProviderDelegate
    public final void onLocationAcquired(Location location) {
        k1 k1Var = this.a;
        TLRPC.User user = k1Var.w0;
        if (user == null || !user.bot_inline_geo) {
            return;
        }
        k1Var.z0 = location;
        k1Var.T(true, user, k1Var.r0, "");
    }

    @Override // org.telegram.messenger.SendMessagesHelper.LocationProvider.LocationProviderDelegate
    public final void onUnableLocationAcquire() {
        this.a.Q();
    }
}
