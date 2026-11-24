package androidx.car.app.utils;

import android.graphics.Rect;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements s89 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ RemoteUtils$SurfaceCallbackStub b;
    public final /* synthetic */ Rect c;

    public /* synthetic */ c(RemoteUtils$SurfaceCallbackStub remoteUtils$SurfaceCallbackStub, Rect rect, byte b) {
        this.a = b;
        this.b = remoteUtils$SurfaceCallbackStub;
        this.c = rect;
    }

    @Override // s89
    public final Object a() {
        Object lambda$onVisibleAreaChanged$1;
        Object lambda$onStableAreaChanged$2;
        byte b = this.a;
        Rect rect = this.c;
        RemoteUtils$SurfaceCallbackStub remoteUtils$SurfaceCallbackStub = this.b;
        switch (b) {
            case 0:
                lambda$onVisibleAreaChanged$1 = remoteUtils$SurfaceCallbackStub.lambda$onVisibleAreaChanged$1(rect);
                return lambda$onVisibleAreaChanged$1;
            default:
                lambda$onStableAreaChanged$2 = remoteUtils$SurfaceCallbackStub.lambda$onStableAreaChanged$2(rect);
                return lambda$onStableAreaChanged$2;
        }
    }
}
