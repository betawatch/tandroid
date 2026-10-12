package hg;

import android.location.Location;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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
