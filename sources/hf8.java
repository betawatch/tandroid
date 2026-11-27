// default package

import android.media.MediaRouter;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
