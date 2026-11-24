// default package

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class b2f extends zz4 {
    @Override // hh0
    public final /* bridge */ /* synthetic */ IInterface b(IBinder iBinder) {
        iBinder.getClass();
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.recaptchabase.internal.IRecaptchaBaseService");
        return queryLocalInterface instanceof s0e ? (s0e) queryLocalInterface : new s0e(iBinder);
    }

    @Override // hh0
    public final o94[] f() {
        return qgd.c;
    }

    @Override // hh0
    public final int i() {
        return 17895000;
    }

    @Override // hh0
    public final String l() {
        return "com.google.android.gms.recaptchabase.internal.IRecaptchaBaseService";
    }

    @Override // hh0
    public final String n() {
        return "com.google.android.gms.recaptchabase.service.START";
    }

    @Override // hh0
    public final boolean p() {
        return true;
    }

    @Override // hh0
    public final boolean x() {
        return false;
    }
}
