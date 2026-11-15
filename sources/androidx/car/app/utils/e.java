package androidx.car.app.utils;

import android.graphics.Rect;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements a {
    public final /* synthetic */ int a;
    public final /* synthetic */ RemoteUtils$SurfaceCallbackStub b;
    public final /* synthetic */ Rect c;

    public /* synthetic */ e(RemoteUtils$SurfaceCallbackStub remoteUtils$SurfaceCallbackStub, Rect rect, int i7) {
        this.a = i7;
        this.b = remoteUtils$SurfaceCallbackStub;
        this.c = rect;
    }

    @Override // androidx.car.app.utils.a
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
