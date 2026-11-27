package androidx.car.app.utils;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
