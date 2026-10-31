package n7;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class l1 extends n6.g {
    @Override // n6.g
    public final boolean D() {
        return true;
    }

    @Override // n6.g, com.google.android.gms.common.api.c
    public final int m() {
        return 13000000;
    }

    @Override // n6.g
    public final IInterface r(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fido.fido2.internal.regular.IFido2AppService");
        return queryLocalInterface instanceof m1 ? (m1) queryLocalInterface : new m1(iBinder, "com.google.android.gms.fido.fido2.internal.regular.IFido2AppService");
    }

    @Override // n6.g
    public final k6.c[] s() {
        return new k6.c[]{z6.a.b, z6.a.a};
    }

    @Override // n6.g
    public final Bundle u() {
        Bundle bundle = new Bundle();
        bundle.putString("FIDO2_ACTION_START_SERVICE", "com.google.android.gms.fido.fido2.regular.START");
        return bundle;
    }

    @Override // n6.g
    public final String w() {
        return "com.google.android.gms.fido.fido2.internal.regular.IFido2AppService";
    }

    @Override // n6.g
    public final String x() {
        return "com.google.android.gms.fido.fido2.regular.START";
    }
}
