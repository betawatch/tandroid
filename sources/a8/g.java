package a8;

import android.os.IBinder;
import android.os.IInterface;
import kotlin.jvm.internal.i;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class g extends n6.g {
    @Override // n6.g
    public final boolean D() {
        return false;
    }

    @Override // n6.g, com.google.android.gms.common.api.c
    public final int m() {
        return 17895000;
    }

    @Override // n6.g
    public final /* bridge */ /* synthetic */ IInterface r(IBinder iBinder) {
        i.e(iBinder, "iBinder");
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.recaptchabase.internal.IRecaptchaBaseService");
        return queryLocalInterface instanceof c ? (c) queryLocalInterface : new c(iBinder);
    }

    @Override // n6.g
    public final k6.c[] s() {
        return l8.f.c;
    }

    @Override // n6.g
    public final String w() {
        return "com.google.android.gms.recaptchabase.internal.IRecaptchaBaseService";
    }

    @Override // n6.g
    public final String x() {
        return "com.google.android.gms.recaptchabase.service.START";
    }

    @Override // n6.g
    public final boolean z() {
        return true;
    }
}
