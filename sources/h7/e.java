package h7;

import android.os.IBinder;
import android.os.IInterface;
import kotlin.jvm.internal.i;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class e extends n6.g {
    @Override // n6.g
    public final boolean C() {
        return true;
    }

    @Override // n6.g, com.google.android.gms.common.api.c
    public final int l() {
        return 17895000;
    }

    @Override // n6.g
    public final IInterface q(IBinder iBinder) {
        i.e(iBinder, "iBinder");
        int i10 = c.b;
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
        return queryLocalInterface instanceof d ? (d) queryLocalInterface : new b(iBinder);
    }

    @Override // n6.g
    public final k6.c[] r() {
        return q7.b.c;
    }

    @Override // n6.g
    public final String v() {
        return "com.google.android.gms.identitycredentials.internal.IIdentityCredentialService";
    }

    @Override // n6.g
    public final String w() {
        return "com.google.android.gms.identitycredentials.service.START";
    }

    @Override // n6.g
    public final boolean y() {
        return true;
    }
}
