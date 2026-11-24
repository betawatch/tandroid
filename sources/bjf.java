// default package

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class bjf extends zz4 {
    @Override // hh0
    public final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
        return queryLocalInterface instanceof nee ? (nee) queryLocalInterface : new nee(iBinder);
    }

    @Override // hh0
    public final o94[] f() {
        return fgd.b;
    }

    @Override // hh0
    public final int i() {
        return 12451000;
    }

    @Override // hh0
    public final String l() {
        return "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService";
    }

    @Override // hh0
    public final String n() {
        return "com.google.android.gms.auth.api.phone.service.SmsRetrieverApiService.START";
    }

    @Override // hh0
    public final boolean x() {
        return true;
    }
}
