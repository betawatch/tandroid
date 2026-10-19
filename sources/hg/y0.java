package hg;

import android.location.Location;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
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
