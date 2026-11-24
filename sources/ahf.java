// default package

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
