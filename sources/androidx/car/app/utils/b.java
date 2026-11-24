package androidx.car.app.utils;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements s89 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ RemoteUtils$SurfaceCallbackStub b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;

    public /* synthetic */ b(RemoteUtils$SurfaceCallbackStub remoteUtils$SurfaceCallbackStub, float f, float f2, byte b) {
        this.a = b;
        this.b = remoteUtils$SurfaceCallbackStub;
        this.c = f;
        this.d = f2;
    }

    @Override // s89
    public final Object a() {
        Object lambda$onClick$7;
        Object lambda$onScroll$4;
        Object lambda$onFling$5;
        byte b = this.a;
        float f = this.d;
        float f2 = this.c;
        RemoteUtils$SurfaceCallbackStub remoteUtils$SurfaceCallbackStub = this.b;
        switch (b) {
            case 0:
                lambda$onClick$7 = remoteUtils$SurfaceCallbackStub.lambda$onClick$7(f2, f);
                return lambda$onClick$7;
            case 1:
                lambda$onScroll$4 = remoteUtils$SurfaceCallbackStub.lambda$onScroll$4(f2, f);
                return lambda$onScroll$4;
            default:
                lambda$onFling$5 = remoteUtils$SurfaceCallbackStub.lambda$onFling$5(f2, f);
                return lambda$onFling$5;
        }
    }
}
