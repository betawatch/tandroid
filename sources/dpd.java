// default package

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class dpd extends zz4 {
    @Override // hh0
    public final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cloudmessaging.internal.ICloudMessagingService");
        return queryLocalInterface instanceof fvd ? (fvd) queryLocalInterface : new fvd(iBinder);
    }

    @Override // hh0
    public final o94[] f() {
        return pjd.b;
    }

    @Override // hh0
    public final int i() {
        return 261200000;
    }

    @Override // hh0
    public final String l() {
        return "com.google.android.gms.cloudmessaging.internal.ICloudMessagingService";
    }

    @Override // hh0
    public final String n() {
        return "com.google.android.gms.cloudmessaging.service.START";
    }

    @Override // hh0
    public final boolean x() {
        return true;
    }
}
