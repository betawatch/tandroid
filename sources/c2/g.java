package c2;

import android.media.MediaRouter2;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class g extends MediaRouter2.ControllerCallback {
    public final /* synthetic */ l a;

    public g(l lVar) {
        this.a = lVar;
    }

    @Override // android.media.MediaRouter2.ControllerCallback
    public final void onControllerUpdated(MediaRouter2.RoutingController routingController) {
        this.a.r(routingController);
    }
}
