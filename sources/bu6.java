// default package

import android.media.MediaRouter2;
import android.media.MediaRouter2$ControllerCallback;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class bu6 extends MediaRouter2$ControllerCallback {
    public final /* synthetic */ gu6 a;

    public bu6(gu6 gu6Var) {
        this.a = gu6Var;
    }

    public final void onControllerUpdated(MediaRouter2.RoutingController routingController) {
        this.a.r(routingController);
    }
}
