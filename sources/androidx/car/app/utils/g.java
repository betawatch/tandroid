package androidx.car.app.utils;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements d {
    public final /* synthetic */ int a;
    public final /* synthetic */ RemoteUtils$SurfaceCallbackStub b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;

    public /* synthetic */ g(RemoteUtils$SurfaceCallbackStub remoteUtils$SurfaceCallbackStub, float f10, float f11, int i9) {
        this.a = i9;
        this.b = remoteUtils$SurfaceCallbackStub;
        this.c = f10;
        this.d = f11;
    }

    @Override // androidx.car.app.utils.d
    public final Object a() {
        Object lambda$onClick$7;
        Object lambda$onScroll$4;
        Object lambda$onFling$5;
        switch (this.a) {
            case 0:
                lambda$onClick$7 = this.b.lambda$onClick$7(this.c, this.d);
                return lambda$onClick$7;
            case 1:
                lambda$onScroll$4 = this.b.lambda$onScroll$4(this.c, this.d);
                return lambda$onScroll$4;
            default:
                lambda$onFling$5 = this.b.lambda$onFling$5(this.c, this.d);
                return lambda$onFling$5;
        }
    }
}
