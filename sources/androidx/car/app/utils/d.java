package androidx.car.app.utils;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements a {
    public final /* synthetic */ int a;
    public final /* synthetic */ RemoteUtils$SurfaceCallbackStub b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;

    public /* synthetic */ d(RemoteUtils$SurfaceCallbackStub remoteUtils$SurfaceCallbackStub, float f10, float f11, int i7) {
        this.a = i7;
        this.b = remoteUtils$SurfaceCallbackStub;
        this.c = f10;
        this.d = f11;
    }

    @Override // androidx.car.app.utils.a
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
