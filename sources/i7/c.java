package i7;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import m.s3;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public final class c extends n6.g {
    public final Bundle U;

    public c(Context context, Looper looper, k kVar, l lVar, s3 s3Var) {
        super(context, looper, 212, s3Var, kVar, lVar, 0);
        this.U = new Bundle();
    }

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
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.ISignInService");
        return queryLocalInterface instanceof i ? (i) queryLocalInterface : new i(iBinder, "com.google.android.gms.auth.api.identity.internal.ISignInService", 5);
    }

    @Override // n6.g
    public final k6.c[] r() {
        return d.b;
    }

    @Override // n6.g
    public final Bundle t() {
        return this.U;
    }

    @Override // n6.g
    public final String v() {
        return "com.google.android.gms.auth.api.identity.internal.ISignInService";
    }

    @Override // n6.g
    public final String w() {
        return "com.google.android.gms.auth.api.identity.service.signin.START";
    }

    @Override // n6.g
    public final boolean y() {
        return true;
    }
}
