package j7;

import android.os.IBinder;
import android.os.IInterface;
import kotlin.jvm.internal.j;
import p6.h;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class e extends h {
    @Override // p6.d, com.google.android.gms.common.api.c
    public final int d() {
        return 17895000;
    }

    @Override // p6.d
    public final IInterface g(IBinder iBinder) {
        j.e(iBinder, "iBinder");
        int i3 = c.b;
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
        return queryLocalInterface instanceof d ? (d) queryLocalInterface : new b(iBinder);
    }

    @Override // p6.d
    public final m6.c[] i() {
        return s7.b.c;
    }

    @Override // p6.d
    public final String n() {
        return "com.google.android.gms.identitycredentials.internal.IIdentityCredentialService";
    }

    @Override // p6.d
    public final String o() {
        return "com.google.android.gms.identitycredentials.service.START";
    }

    @Override // p6.d
    public final boolean q() {
        return true;
    }

    @Override // p6.d
    public final boolean w() {
        return true;
    }
}
