package androidx.car.app.utils;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements b {
    public final /* synthetic */ int a;
    public final /* synthetic */ RemoteUtils$SurfaceCallbackStub b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;

    public /* synthetic */ e(RemoteUtils$SurfaceCallbackStub remoteUtils$SurfaceCallbackStub, float f7, float f10, int i10) {
        this.a = i10;
        this.b = remoteUtils$SurfaceCallbackStub;
        this.c = f7;
        this.d = f10;
    }

    @Override // androidx.car.app.utils.b
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
