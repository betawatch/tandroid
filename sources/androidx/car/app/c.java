package androidx.car.app;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements q69 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ CarAppBinder b;

    public /* synthetic */ c(CarAppBinder carAppBinder, byte b) {
        this.a = b;
        this.b = carAppBinder;
    }

    @Override // q69
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
