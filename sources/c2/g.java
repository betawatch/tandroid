package c2;

import android.media.MediaRouter2;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
