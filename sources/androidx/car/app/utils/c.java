package androidx.car.app.utils;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements a {
    public final /* synthetic */ int a;
    public final /* synthetic */ RemoteUtils$SurfaceCallbackStub b;
    public final /* synthetic */ w.b c;

    public /* synthetic */ c(RemoteUtils$SurfaceCallbackStub remoteUtils$SurfaceCallbackStub, w.b bVar, int i10) {
        this.a = i10;
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
