package m7;

import android.os.IBinder;
import android.os.IInterface;
import q6.h;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class e extends h {
    @Override // q6.d, com.google.android.gms.common.api.c
    public final int d() {
        return 12451000;
    }

    @Override // q6.d
    public final /* synthetic */ IInterface i(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
        return queryLocalInterface instanceof d ? (d) queryLocalInterface : new d(iBinder);
    }

    @Override // q6.d
    public final n6.c[] k() {
        return b.b;
    }

    @Override // q6.d
    public final String o() {
        return "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService";
    }

    @Override // q6.d
    public final String p() {
        return "com.google.android.gms.auth.api.phone.service.SmsRetrieverApiService.START";
    }

    @Override // q6.d
    public final boolean x() {
        return true;
    }
}
