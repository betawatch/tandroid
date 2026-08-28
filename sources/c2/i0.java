package c2;

import android.media.MediaRouter;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class i0 extends MediaRouter.VolumeCallback {
    public final h0 a;

    public i0(h0 h0Var) {
        this.a = h0Var;
    }

    @Override // android.media.MediaRouter.VolumeCallback
    public final void onVolumeSetRequest(MediaRouter.RouteInfo routeInfo, int i9) {
        this.a.a(routeInfo, i9);
    }

    @Override // android.media.MediaRouter.VolumeCallback
    public final void onVolumeUpdateRequest(MediaRouter.RouteInfo routeInfo, int i9) {
        this.a.b(routeInfo, i9);
    }
}
