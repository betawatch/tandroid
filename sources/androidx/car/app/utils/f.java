package androidx.car.app.utils;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements c {
    public final /* synthetic */ int a;
    public final /* synthetic */ RemoteUtils$SurfaceCallbackStub b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;

    public /* synthetic */ f(RemoteUtils$SurfaceCallbackStub remoteUtils$SurfaceCallbackStub, float f7, float f10, int i10) {
        this.a = i10;
        this.b = remoteUtils$SurfaceCallbackStub;
        this.c = f7;
        this.d = f10;
    }

    @Override // androidx.car.app.utils.c
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
