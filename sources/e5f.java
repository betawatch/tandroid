// default package

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class e5f extends xx4 {
    @Override // gg0
    public final IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.internal.ICastService");
        return queryLocalInterface instanceof n7d ? (n7d) queryLocalInterface : new n7d(iBinder, "com.google.android.gms.cast.internal.ICastService", (byte) 3);
    }

    @Override // gg0
    public final f84[] f() {
        return ied.e;
    }

    @Override // gg0
    public final int i() {
        return 12451000;
    }

    @Override // gg0
    public final String l() {
        return "com.google.android.gms.cast.internal.ICastService";
    }

    @Override // gg0
    public final String n() {
        return "com.google.android.gms.cast.service.BIND_CAST_DEVICE_CONTROLLER_SERVICE";
    }

    @Override // gg0
    public final boolean x() {
        return true;
    }
}
