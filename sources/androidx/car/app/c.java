package androidx.car.app;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
