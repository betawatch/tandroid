package androidx.car.app.utils;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements a {
    public final /* synthetic */ int a;
    public final /* synthetic */ RemoteUtils$SurfaceCallbackStub b;
    public final /* synthetic */ w.b c;

    public /* synthetic */ c(RemoteUtils$SurfaceCallbackStub remoteUtils$SurfaceCallbackStub, w.b bVar, int i7) {
        this.a = i7;
        this.b = remoteUtils$SurfaceCallbackStub;
        this.c = bVar;
    }

    @Override // androidx.car.app.utils.a
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
