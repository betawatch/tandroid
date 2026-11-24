package androidx.car.app.utils;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements q69 {
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

    @Override // q69
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
