package j6;

import android.os.IBinder;
import android.os.IInterface;
import f6.y;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class s extends q6.h {
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
        return y.e;
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
