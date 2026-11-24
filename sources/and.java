// default package

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class and extends xx4 {
    @Override // gg0
    public final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cloudmessaging.internal.ICloudMessagingService");
        return queryLocalInterface instanceof ctd ? (ctd) queryLocalInterface : new ctd(iBinder);
    }

    @Override // gg0
    public final f84[] f() {
        return ohd.b;
    }

    @Override // gg0
    public final int i() {
        return 261200000;
    }

    @Override // gg0
    public final String l() {
        return "com.google.android.gms.cloudmessaging.internal.ICloudMessagingService";
    }

    @Override // gg0
    public final String n() {
        return "com.google.android.gms.cloudmessaging.service.START";
    }

    @Override // gg0
    public final boolean x() {
        return true;
    }
}
