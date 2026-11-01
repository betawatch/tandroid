package androidx.car.app.utils;

import android.graphics.Rect;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements b {
    public final /* synthetic */ int a;
    public final /* synthetic */ RemoteUtils$SurfaceCallbackStub b;
    public final /* synthetic */ Rect c;

    public /* synthetic */ f(RemoteUtils$SurfaceCallbackStub remoteUtils$SurfaceCallbackStub, Rect rect, int i10) {
        this.a = i10;
        this.b = remoteUtils$SurfaceCallbackStub;
        this.c = rect;
    }

    @Override // androidx.car.app.utils.b
    public final Object a() {
        Object lambda$onVisibleAreaChanged$1;
        Object lambda$onStableAreaChanged$2;
        switch (this.a) {
            case 0:
                lambda$onVisibleAreaChanged$1 = this.b.lambda$onVisibleAreaChanged$1(this.c);
                return lambda$onVisibleAreaChanged$1;
            default:
                lambda$onStableAreaChanged$2 = this.b.lambda$onStableAreaChanged$2(this.c);
                return lambda$onStableAreaChanged$2;
        }
    }
}
