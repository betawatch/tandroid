package androidx.car.app;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Parcelable;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements da9 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ CarAppBinder b;
    public final /* synthetic */ Parcelable c;

    public /* synthetic */ b(CarAppBinder carAppBinder, Parcelable parcelable, byte b) {
        this.a = b;
        this.b = carAppBinder;
        this.c = parcelable;
    }

    @Override // da9
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
