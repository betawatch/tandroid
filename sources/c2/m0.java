package c2;

import android.media.MediaRouter;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
