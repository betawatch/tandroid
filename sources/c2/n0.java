package c2;

import android.media.MediaRouter;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class n0 extends s {
    public final MediaRouter.RouteInfo a;

    public n0(MediaRouter.RouteInfo routeInfo) {
        this.a = routeInfo;
    }

    @Override // c2.s
    public final void f(int i10) {
        this.a.requestSetVolume(i10);
    }

    @Override // c2.s
    public final void i(int i10) {
        this.a.requestUpdateVolume(i10);
    }
}
