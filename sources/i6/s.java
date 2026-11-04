package i6;

import android.os.IBinder;
import android.os.IInterface;
import e6.y;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class s extends p6.h {
    @Override // p6.d, com.google.android.gms.common.api.c
    public final int d() {
        return 12451000;
    }

    @Override // p6.d
    public final IInterface g(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.internal.ICastService");
        return queryLocalInterface instanceof i ? (i) queryLocalInterface : new i(iBinder, "com.google.android.gms.cast.internal.ICastService", 2);
    }

    @Override // p6.d
    public final m6.c[] i() {
        return y.e;
    }

    @Override // p6.d
    public final String n() {
        return "com.google.android.gms.cast.internal.ICastService";
    }

    @Override // p6.d
    public final String o() {
        return "com.google.android.gms.cast.service.BIND_CAST_DEVICE_CONTROLLER_SERVICE";
    }

    @Override // p6.d
    public final boolean w() {
        return true;
    }
}
