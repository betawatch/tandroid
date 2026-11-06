package k7;

import android.os.IBinder;
import android.os.IInterface;
import kotlin.jvm.internal.j;
import q6.h;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class e extends h {
    @Override // q6.d, com.google.android.gms.common.api.c
    public final int d() {
        return 17895000;
    }

    @Override // q6.d
    public final IInterface i(IBinder iBinder) {
        j.e(iBinder, "iBinder");
        int i7 = c.b;
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
        return queryLocalInterface instanceof d ? (d) queryLocalInterface : new b(iBinder);
    }

    @Override // q6.d
    public final n6.c[] k() {
        return t7.b.c;
    }

    @Override // q6.d
    public final String o() {
        return "com.google.android.gms.identitycredentials.internal.IIdentityCredentialService";
    }

    @Override // q6.d
    public final String p() {
        return "com.google.android.gms.identitycredentials.service.START";
    }

    @Override // q6.d
    public final boolean r() {
        return true;
    }

    @Override // q6.d
    public final boolean x() {
        return true;
    }
}
