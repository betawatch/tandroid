package androidx.car.app.utils;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements s89 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ RemoteUtils$SurfaceCallbackStub b;
    public final /* synthetic */ g41 c;

    public /* synthetic */ a(RemoteUtils$SurfaceCallbackStub remoteUtils$SurfaceCallbackStub, g41 g41Var, byte b) {
        this.a = b;
        this.b = remoteUtils$SurfaceCallbackStub;
        this.c = g41Var;
    }

    @Override // s89
    public final Object a() {
        Object lambda$onSurfaceDestroyed$3;
        Object lambda$onSurfaceAvailable$0;
        byte b = this.a;
        g41 g41Var = this.c;
        RemoteUtils$SurfaceCallbackStub remoteUtils$SurfaceCallbackStub = this.b;
        switch (b) {
            case 0:
                lambda$onSurfaceDestroyed$3 = remoteUtils$SurfaceCallbackStub.lambda$onSurfaceDestroyed$3(g41Var);
                return lambda$onSurfaceDestroyed$3;
            default:
                lambda$onSurfaceAvailable$0 = remoteUtils$SurfaceCallbackStub.lambda$onSurfaceAvailable$0(g41Var);
                return lambda$onSurfaceAvailable$0;
        }
    }
}
