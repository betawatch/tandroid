// default package

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class a6d extends zz4 {
    public final z5d F;

    public a6d(Context context, Looper looper, ovb ovbVar, z5d z5dVar, f05 f05Var, g05 g05Var) {
        super(68, f05Var, g05Var, ovbVar, context, looper);
        z5dVar = z5dVar == null ? z5d.c : z5dVar;
        rhb rhbVar = new rhb((byte) 9, false);
        rhbVar.b = Boolean.FALSE;
        z5d z5dVar2 = z5d.c;
        z5dVar.getClass();
        rhbVar.b = Boolean.valueOf(z5dVar.a);
        rhbVar.c = z5dVar.b;
        rhbVar.c = u5d.a();
        this.F = new z5d(rhbVar);
    }

    @Override // hh0
    public final IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        return queryLocalInterface instanceof c6d ? (c6d) queryLocalInterface : new c6d(iBinder, "com.google.android.gms.auth.api.credentials.internal.ICredentialsService", (byte) 2);
    }

    @Override // hh0
    public final Bundle h() {
        z5d z5dVar = this.F;
        z5dVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("consumer_package", null);
        bundle.putBoolean("force_save_dialog", z5dVar.a);
        bundle.putString("log_session_id", z5dVar.b);
        return bundle;
    }

    @Override // hh0
    public final int i() {
        return 12800000;
    }

    @Override // hh0
    public final String l() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    @Override // hh0
    public final String n() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }
}
