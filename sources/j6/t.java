package j6;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class t extends q6.h {
    @Override // q6.d, com.google.android.gms.common.api.c
    public final int d() {
        return 12451000;
    }

    @Override // q6.d
    public final IInterface i(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.internal.ICastService");
        return queryLocalInterface instanceof i ? (i) queryLocalInterface : new i(iBinder, "com.google.android.gms.cast.internal.ICastService", 2);
    }

    @Override // q6.d
    public final n6.c[] k() {
        return f6.y.e;
    }

    @Override // q6.d
    public final String o() {
        return "com.google.android.gms.cast.internal.ICastService";
    }

    @Override // q6.d
    public final String p() {
        return "com.google.android.gms.cast.service.BIND_CAST_DEVICE_CONTROLLER_SERVICE";
    }

    @Override // q6.d
    public final boolean x() {
        return true;
    }
}
