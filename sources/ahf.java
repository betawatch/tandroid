// default package

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class ahf extends xx4 {
    @Override // gg0
    public final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
        return queryLocalInterface instanceof mce ? (mce) queryLocalInterface : new mce(iBinder);
    }

    @Override // gg0
    public final f84[] f() {
        return eed.b;
    }

    @Override // gg0
    public final int i() {
        return 12451000;
    }

    @Override // gg0
    public final String l() {
        return "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService";
    }

    @Override // gg0
    public final String n() {
        return "com.google.android.gms.auth.api.phone.service.SmsRetrieverApiService.START";
    }

    @Override // gg0
    public final boolean x() {
        return true;
    }
}
