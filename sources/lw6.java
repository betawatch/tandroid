// default package

import android.media.MediaRouter;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class lw6 extends MediaRouter.VolumeCallback {
    public final kw6 a;

    public lw6(kw6 kw6Var) {
        this.a = kw6Var;
    }

    @Override // android.media.MediaRouter.VolumeCallback
    public final void onVolumeSetRequest(MediaRouter.RouteInfo routeInfo, int i) {
        this.a.a(routeInfo, i);
    }

    @Override // android.media.MediaRouter.VolumeCallback
    public final void onVolumeUpdateRequest(MediaRouter.RouteInfo routeInfo, int i) {
        this.a.b(routeInfo, i);
    }
}
