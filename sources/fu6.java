// default package

import android.media.MediaRouter2;
import android.media.MediaRouter2$ControllerCallback;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class fu6 extends MediaRouter2$ControllerCallback {
    public final /* synthetic */ ku6 a;

    public fu6(ku6 ku6Var) {
        this.a = ku6Var;
    }

    public final void onControllerUpdated(MediaRouter2.RoutingController routingController) {
        this.a.r(routingController);
    }
}
