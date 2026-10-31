package i7;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import m.p3;
import org.telegram.messenger.zs;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class c extends n6.g {
    public final Bundle U;

    public c(Context context, Looper looper, k kVar, l lVar, p3 p3Var) {
        super(context, looper, zs.p3, p3Var, kVar, lVar, 0);
        this.U = new Bundle();
    }

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
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.ISignInService");
        return queryLocalInterface instanceof i ? (i) queryLocalInterface : new i(iBinder, "com.google.android.gms.auth.api.identity.internal.ISignInService", 5);
    }

    @Override // n6.g
    public final k6.c[] s() {
        return d.b;
    }

    @Override // n6.g
    public final Bundle u() {
        return this.U;
    }

    @Override // n6.g
    public final String w() {
        return "com.google.android.gms.auth.api.identity.internal.ISignInService";
    }

    @Override // n6.g
    public final String x() {
        return "com.google.android.gms.auth.api.identity.service.signin.START";
    }

    @Override // n6.g
    public final boolean z() {
        return true;
    }
}
