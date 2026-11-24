// default package

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
