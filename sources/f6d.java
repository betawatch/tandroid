// default package

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class f6d extends d05 {
    @Override // hg0
    public final IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientNotificationTelemetryService");
        return queryLocalInterface instanceof p7d ? (p7d) queryLocalInterface : new p7d(iBinder, "com.google.android.gms.common.internal.service.IClientNotificationTelemetryService", (byte) 1);
    }

    @Override // hg0
    public final a94[] f() {
        return mid.c;
    }

    @Override // hg0
    public final int i() {
        return 253600000;
    }

    @Override // hg0
    public final String l() {
        return "com.google.android.gms.common.internal.service.IClientNotificationTelemetryService";
    }

    @Override // hg0
    public final String n() {
        return "com.google.android.gms.common.telemetry.notification.service.START";
    }

    @Override // hg0
    public final boolean p() {
        return true;
    }
}
