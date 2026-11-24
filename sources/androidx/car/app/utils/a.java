package androidx.car.app.utils;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements q69 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ RemoteUtils$SurfaceCallbackStub b;
    public final /* synthetic */ y21 c;

    public /* synthetic */ a(RemoteUtils$SurfaceCallbackStub remoteUtils$SurfaceCallbackStub, y21 y21Var, byte b) {
        this.a = b;
        this.b = remoteUtils$SurfaceCallbackStub;
        this.c = y21Var;
    }

    @Override // q69
    public final Object a() {
        Object lambda$onSurfaceDestroyed$3;
        Object lambda$onSurfaceAvailable$0;
        byte b = this.a;
        y21 y21Var = this.c;
        RemoteUtils$SurfaceCallbackStub remoteUtils$SurfaceCallbackStub = this.b;
        switch (b) {
            case 0:
                lambda$onSurfaceDestroyed$3 = remoteUtils$SurfaceCallbackStub.lambda$onSurfaceDestroyed$3(y21Var);
                return lambda$onSurfaceDestroyed$3;
            default:
                lambda$onSurfaceAvailable$0 = remoteUtils$SurfaceCallbackStub.lambda$onSurfaceAvailable$0(y21Var);
                return lambda$onSurfaceAvailable$0;
        }
    }
}
