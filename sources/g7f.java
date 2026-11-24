// default package

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class g7f extends zz4 {
    @Override // hh0
    public final IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.internal.ICastService");
        return queryLocalInterface instanceof p9d ? (p9d) queryLocalInterface : new p9d(iBinder, "com.google.android.gms.cast.internal.ICastService", (byte) 3);
    }

    @Override // hh0
    public final o94[] f() {
        return jgd.e;
    }

    @Override // hh0
    public final int i() {
        return 12451000;
    }

    @Override // hh0
    public final String l() {
        return "com.google.android.gms.cast.internal.ICastService";
    }

    @Override // hh0
    public final String n() {
        return "com.google.android.gms.cast.service.BIND_CAST_DEVICE_CONTROLLER_SERVICE";
    }

    @Override // hh0
    public final boolean x() {
        return true;
    }
}
