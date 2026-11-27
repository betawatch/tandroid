// default package

import android.media.MediaRouter;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class hf8 extends aw6 {
    public final MediaRouter.RouteInfo a;

    public hf8(MediaRouter.RouteInfo routeInfo) {
        this.a = routeInfo;
    }

    @Override // aw6
    public final void f(int i) {
        this.a.requestSetVolume(i);
    }

    @Override // aw6
    public final void i(int i) {
        this.a.requestUpdateVolume(i);
    }
}
