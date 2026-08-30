package androidx.car.app;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements androidx.car.app.utils.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ CarAppBinder b;

    public /* synthetic */ c(CarAppBinder carAppBinder, int i10) {
        this.a = i10;
        this.b = carAppBinder;
    }

    @Override // androidx.car.app.utils.d
    public final Object a() {
        Object lambda$onAppPause$3;
        Object lambda$onAppStart$1;
        Object lambda$onAppStop$4;
        Object lambda$onAppResume$2;
        switch (this.a) {
            case 0:
                lambda$onAppPause$3 = this.b.lambda$onAppPause$3();
                return lambda$onAppPause$3;
            case 1:
                lambda$onAppStart$1 = this.b.lambda$onAppStart$1();
                return lambda$onAppStart$1;
            case 2:
                lambda$onAppStop$4 = this.b.lambda$onAppStop$4();
                return lambda$onAppStop$4;
            default:
                lambda$onAppResume$2 = this.b.lambda$onAppResume$2();
                return lambda$onAppResume$2;
        }
    }
}
