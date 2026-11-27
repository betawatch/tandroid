// default package

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class i8d extends d05 {
    public final Bundle F;

    public i8d(k05 k05Var, l05 l05Var, oxb oxbVar, Context context, Looper looper) {
        super(jn7.o3, k05Var, l05Var, oxbVar, context, looper);
        this.F = new Bundle();
    }

    @Override // hg0
    public final IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.ISignInService");
        return queryLocalInterface instanceof c9d ? (c9d) queryLocalInterface : new c9d(iBinder, "com.google.android.gms.auth.api.identity.internal.ISignInService", (byte) 2);
    }

    @Override // hg0
    public final a94[] f() {
        return rid.b;
    }

    @Override // hg0
    public final Bundle h() {
        return this.F;
    }

    @Override // hg0
    public final int i() {
        return 17895000;
    }

    @Override // hg0
    public final String l() {
        return "com.google.android.gms.auth.api.identity.internal.ISignInService";
    }

    @Override // hg0
    public final String n() {
        return "com.google.android.gms.auth.api.identity.service.signin.START";
    }

    @Override // hg0
    public final boolean p() {
        return true;
    }

    @Override // hg0
    public final boolean x() {
        return true;
    }
}
