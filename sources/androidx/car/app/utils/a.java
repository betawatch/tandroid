package androidx.car.app.utils;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements da9 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ RemoteUtils$SurfaceCallbackStub b;
    public final /* synthetic */ h31 c;

    public /* synthetic */ a(RemoteUtils$SurfaceCallbackStub remoteUtils$SurfaceCallbackStub, h31 h31Var, byte b) {
        this.a = b;
        this.b = remoteUtils$SurfaceCallbackStub;
        this.c = h31Var;
    }

    @Override // da9
    public final Object a() {
        Object lambda$onSurfaceDestroyed$3;
        Object lambda$onSurfaceAvailable$0;
        byte b = this.a;
        h31 h31Var = this.c;
        RemoteUtils$SurfaceCallbackStub remoteUtils$SurfaceCallbackStub = this.b;
        switch (b) {
            case 0:
                lambda$onSurfaceDestroyed$3 = remoteUtils$SurfaceCallbackStub.lambda$onSurfaceDestroyed$3(h31Var);
                return lambda$onSurfaceDestroyed$3;
            default:
                lambda$onSurfaceAvailable$0 = remoteUtils$SurfaceCallbackStub.lambda$onSurfaceAvailable$0(h31Var);
                return lambda$onSurfaceAvailable$0;
        }
    }
}
