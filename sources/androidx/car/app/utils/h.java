package androidx.car.app.utils;

import android.graphics.Rect;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements d {
    public final /* synthetic */ int a;
    public final /* synthetic */ RemoteUtils$SurfaceCallbackStub b;
    public final /* synthetic */ Rect c;

    public /* synthetic */ h(RemoteUtils$SurfaceCallbackStub remoteUtils$SurfaceCallbackStub, Rect rect, int i9) {
        this.a = i9;
        this.b = remoteUtils$SurfaceCallbackStub;
        this.c = rect;
    }

    @Override // androidx.car.app.utils.d
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
