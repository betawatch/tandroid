package i7;

import android.os.IBinder;
import android.os.IInterface;
import kotlin.jvm.internal.i;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class e extends o6.g {
    @Override // o6.g
    public final boolean C() {
        return true;
    }

    @Override // o6.g, com.google.android.gms.common.api.c
    public final int l() {
        return 17895000;
    }

    @Override // o6.g
    public final IInterface q(IBinder iBinder) {
        i.e(iBinder, "iBinder");
        int i10 = c.b;
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
        return queryLocalInterface instanceof d ? (d) queryLocalInterface : new b(iBinder);
    }

    @Override // o6.g
    public final l6.c[] r() {
        return r7.b.c;
    }

    @Override // o6.g
    public final String v() {
        return "com.google.android.gms.identitycredentials.internal.IIdentityCredentialService";
    }

    @Override // o6.g
    public final String w() {
        return "com.google.android.gms.identitycredentials.service.START";
    }

    @Override // o6.g
    public final boolean y() {
        return true;
    }
}
