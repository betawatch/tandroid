package j7;

import android.os.IBinder;
import android.os.IInterface;
import n6.g;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public final class e extends g {
    @Override // n6.g
    public final boolean C() {
        return true;
    }

    @Override // n6.g, com.google.android.gms.common.api.c
    public final int l() {
        return 12451000;
    }

    @Override // n6.g
    public final /* synthetic */ IInterface q(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
        return queryLocalInterface instanceof d ? (d) queryLocalInterface : new d(iBinder);
    }

    @Override // n6.g
    public final k6.c[] r() {
        return b.b;
    }

    @Override // n6.g
    public final String v() {
        return "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService";
    }

    @Override // n6.g
    public final String w() {
        return "com.google.android.gms.auth.api.phone.service.SmsRetrieverApiService.START";
    }
}
