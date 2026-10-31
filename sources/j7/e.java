package j7;

import android.os.IBinder;
import android.os.IInterface;
import n6.g;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class e extends g {
    @Override // n6.g
    public final boolean D() {
        return true;
    }

    @Override // n6.g, com.google.android.gms.common.api.c
    public final int m() {
        return 12451000;
    }

    @Override // n6.g
    public final /* synthetic */ IInterface r(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
        return queryLocalInterface instanceof d ? (d) queryLocalInterface : new d(iBinder);
    }

    @Override // n6.g
    public final k6.c[] s() {
        return b.b;
    }

    @Override // n6.g
    public final String w() {
        return "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService";
    }

    @Override // n6.g
    public final String x() {
        return "com.google.android.gms.auth.api.phone.service.SmsRetrieverApiService.START";
    }
}
