package androidx.car.app;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Parcelable;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements q69 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ CarAppBinder b;
    public final /* synthetic */ Parcelable c;

    public /* synthetic */ b(CarAppBinder carAppBinder, Parcelable parcelable, byte b) {
        this.a = b;
        this.b = carAppBinder;
        this.c = parcelable;
    }

    @Override // q69
    public final Object a() {
        Object lambda$onConfigurationChanged$6;
        Object lambda$onNewIntent$5;
        byte b = this.a;
        Parcelable parcelable = this.c;
        CarAppBinder carAppBinder = this.b;
        switch (b) {
            case 0:
                lambda$onConfigurationChanged$6 = carAppBinder.lambda$onConfigurationChanged$6((Configuration) parcelable);
                return lambda$onConfigurationChanged$6;
            default:
                lambda$onNewIntent$5 = carAppBinder.lambda$onNewIntent$5((Intent) parcelable);
                return lambda$onNewIntent$5;
        }
    }
}
