package androidx.car.app.utils;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements b {
    public final /* synthetic */ int a;
    public final /* synthetic */ RemoteUtils$SurfaceCallbackStub b;
    public final /* synthetic */ w.b c;

    public /* synthetic */ d(RemoteUtils$SurfaceCallbackStub remoteUtils$SurfaceCallbackStub, w.b bVar, int i10) {
        this.a = i10;
        this.b = remoteUtils$SurfaceCallbackStub;
        this.c = bVar;
    }

    @Override // androidx.car.app.utils.b
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
