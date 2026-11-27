package androidx.car.app;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements da9 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ CarAppBinder b;

    public /* synthetic */ c(CarAppBinder carAppBinder, byte b) {
        this.a = b;
        this.b = carAppBinder;
    }

    @Override // da9
    public final Object a() {
        Object lambda$onAppPause$3;
        Object lambda$onAppStart$1;
        Object lambda$onAppStop$4;
        Object lambda$onAppResume$2;
        byte b = this.a;
        CarAppBinder carAppBinder = this.b;
        switch (b) {
            case 0:
                lambda$onAppPause$3 = carAppBinder.lambda$onAppPause$3();
                return lambda$onAppPause$3;
            case 1:
                lambda$onAppStart$1 = carAppBinder.lambda$onAppStart$1();
                return lambda$onAppStart$1;
            case 2:
                lambda$onAppStop$4 = carAppBinder.lambda$onAppStop$4();
                return lambda$onAppStop$4;
            default:
                lambda$onAppResume$2 = carAppBinder.lambda$onAppResume$2();
                return lambda$onAppResume$2;
        }
    }
}
