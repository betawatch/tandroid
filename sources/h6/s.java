package h6;

import android.os.IBinder;
import android.os.IInterface;
import d6.y;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class s extends o6.g {
    @Override // o6.g
    public final boolean C() {
        return true;
    }

    @Override // o6.g, com.google.android.gms.common.api.c
    public final int l() {
        return 12451000;
    }

    @Override // o6.g
    public final IInterface q(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.internal.ICastService");
        return queryLocalInterface instanceof i ? (i) queryLocalInterface : new i(iBinder, "com.google.android.gms.cast.internal.ICastService", 2);
    }

    @Override // o6.g
    public final l6.c[] r() {
        return y.e;
    }

    @Override // o6.g
    public final String v() {
        return "com.google.android.gms.cast.internal.ICastService";
    }

    @Override // o6.g
    public final String w() {
        return "com.google.android.gms.cast.service.BIND_CAST_DEVICE_CONTROLLER_SERVICE";
    }
}
