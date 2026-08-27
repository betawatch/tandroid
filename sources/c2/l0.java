package c2;

import android.media.MediaRouter;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class l0 extends r {
    public final MediaRouter.RouteInfo a;

    public l0(MediaRouter.RouteInfo routeInfo) {
        this.a = routeInfo;
    }

    @Override // c2.r
    public final void f(int i10) {
        this.a.requestSetVolume(i10);
    }

    @Override // c2.r
    public final void i(int i10) {
        this.a.requestUpdateVolume(i10);
    }
}
