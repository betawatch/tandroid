package j7;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import m.r3;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class c extends o6.g {
    public final Bundle U;

    public c(Context context, Looper looper, k kVar, l lVar, r3 r3Var) {
        super(context, looper, 212, r3Var, kVar, lVar, 0);
        this.U = new Bundle();
    }

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
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.ISignInService");
        return queryLocalInterface instanceof i ? (i) queryLocalInterface : new i(iBinder, "com.google.android.gms.auth.api.identity.internal.ISignInService", 6);
    }

    @Override // o6.g
    public final l6.c[] r() {
        return d.b;
    }

    @Override // o6.g
    public final Bundle t() {
        return this.U;
    }

    @Override // o6.g
    public final String v() {
        return "com.google.android.gms.auth.api.identity.internal.ISignInService";
    }

    @Override // o6.g
    public final String w() {
        return "com.google.android.gms.auth.api.identity.service.signin.START";
    }

    @Override // o6.g
    public final boolean y() {
        return true;
    }
}
