package androidx.car.app;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements androidx.car.app.utils.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ CarAppBinder b;

    public /* synthetic */ c(CarAppBinder carAppBinder, int i9) {
        this.a = i9;
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
