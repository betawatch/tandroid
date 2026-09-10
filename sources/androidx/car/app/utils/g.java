package androidx.car.app.utils;

import android.graphics.Rect;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements c {
    public final /* synthetic */ int a;
    public final /* synthetic */ RemoteUtils$SurfaceCallbackStub b;
    public final /* synthetic */ Rect c;

    public /* synthetic */ g(RemoteUtils$SurfaceCallbackStub remoteUtils$SurfaceCallbackStub, Rect rect, int i10) {
        this.a = i10;
        this.b = remoteUtils$SurfaceCallbackStub;
        this.c = rect;
    }

    @Override // androidx.car.app.utils.c
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
