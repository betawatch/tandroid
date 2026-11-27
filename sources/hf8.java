// default package

import android.media.MediaRouter;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
