package c2;

import android.media.MediaRouter;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class m0 extends r {
    public final MediaRouter.RouteInfo a;

    public m0(MediaRouter.RouteInfo routeInfo) {
        this.a = routeInfo;
    }

    @Override // c2.r
    public final void f(int i9) {
        this.a.requestSetVolume(i9);
    }

    @Override // c2.r
    public final void i(int i9) {
        this.a.requestUpdateVolume(i9);
    }
}
