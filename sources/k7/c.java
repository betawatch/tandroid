package k7;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import m.o3;
import org.telegram.messenger.hs;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class c extends p6.h {
    public final Bundle F;

    public c(Context context, Looper looper, k kVar, l lVar, o3 o3Var) {
        super(context, looper, hs.p3, o3Var, kVar, lVar, 0);
        this.F = new Bundle();
    }

    @Override // p6.d, com.google.android.gms.common.api.c
    public final int d() {
        return 17895000;
    }

    @Override // p6.d
    public final IInterface g(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.ISignInService");
        return queryLocalInterface instanceof i ? (i) queryLocalInterface : new i(iBinder, "com.google.android.gms.auth.api.identity.internal.ISignInService", 6);
    }

    @Override // p6.d
    public final m6.c[] i() {
        return d.b;
    }

    @Override // p6.d
    public final Bundle k() {
        return this.F;
    }

    @Override // p6.d
    public final String n() {
        return "com.google.android.gms.auth.api.identity.internal.ISignInService";
    }

    @Override // p6.d
    public final String o() {
        return "com.google.android.gms.auth.api.identity.service.signin.START";
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
