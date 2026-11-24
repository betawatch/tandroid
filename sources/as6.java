// default package

import android.media.MediaRouter2;
import android.media.MediaRouter2$ControllerCallback;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class as6 extends MediaRouter2$ControllerCallback {
    public final /* synthetic */ fs6 a;

    public as6(fs6 fs6Var) {
        this.a = fs6Var;
    }

    public final void onControllerUpdated(MediaRouter2.RoutingController routingController) {
        this.a.r(routingController);
    }
}
