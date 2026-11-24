// default package

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
