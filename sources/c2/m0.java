package c2;

import android.media.MediaRouter;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class m0 extends s {
    public final MediaRouter.RouteInfo a;

    public m0(MediaRouter.RouteInfo routeInfo) {
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
