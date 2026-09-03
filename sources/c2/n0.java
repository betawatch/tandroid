package c2;

import android.media.MediaRouter;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
