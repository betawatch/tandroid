package androidx.car.app.utils;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements d {
    public final /* synthetic */ int a;
    public final /* synthetic */ RemoteUtils$SurfaceCallbackStub b;
    public final /* synthetic */ w.b c;

    public /* synthetic */ f(RemoteUtils$SurfaceCallbackStub remoteUtils$SurfaceCallbackStub, w.b bVar, int i9) {
        this.a = i9;
        this.b = remoteUtils$SurfaceCallbackStub;
        this.c = bVar;
    }

    @Override // androidx.car.app.utils.d
    public final Object a() {
        Object lambda$onSurfaceDestroyed$3;
        Object lambda$onSurfaceAvailable$0;
        switch (this.a) {
            case 0:
                lambda$onSurfaceDestroyed$3 = this.b.lambda$onSurfaceDestroyed$3(this.c);
                return lambda$onSurfaceDestroyed$3;
            default:
                lambda$onSurfaceAvailable$0 = this.b.lambda$onSurfaceAvailable$0(this.c);
                return lambda$onSurfaceAvailable$0;
        }
    }
}
