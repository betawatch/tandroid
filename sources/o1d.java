// default package

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class o1d extends xx4 {
    @Override // gg0
    public final IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientNotificationTelemetryService");
        return queryLocalInterface instanceof y2d ? (y2d) queryLocalInterface : new y2d(iBinder, "com.google.android.gms.common.internal.service.IClientNotificationTelemetryService", (byte) 1);
    }

    @Override // gg0
    public final f84[] f() {
        return udd.c;
    }

    @Override // gg0
    public final int i() {
        return 253600000;
    }

    @Override // gg0
    public final String l() {
        return "com.google.android.gms.common.internal.service.IClientNotificationTelemetryService";
    }

    @Override // gg0
    public final String n() {
        return "com.google.android.gms.common.telemetry.notification.service.START";
    }

    @Override // gg0
    public final boolean p() {
        return true;
    }
}
