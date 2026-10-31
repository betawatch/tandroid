package h7;

import android.os.IBinder;
import android.os.IInterface;
import kotlin.jvm.internal.i;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class e extends n6.g {
    @Override // n6.g
    public final boolean D() {
        return true;
    }

    @Override // n6.g, com.google.android.gms.common.api.c
    public final int m() {
        return 17895000;
    }

    @Override // n6.g
    public final IInterface r(IBinder iBinder) {
        i.e(iBinder, "iBinder");
        int i10 = c.b;
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
        return queryLocalInterface instanceof d ? (d) queryLocalInterface : new b(iBinder);
    }

    @Override // n6.g
    public final k6.c[] s() {
        return q7.b.c;
    }

    @Override // n6.g
    public final String w() {
        return "com.google.android.gms.identitycredentials.internal.IIdentityCredentialService";
    }

    @Override // n6.g
    public final String x() {
        return "com.google.android.gms.identitycredentials.service.START";
    }

    @Override // n6.g
    public final boolean z() {
        return true;
    }
}
