package i7;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import m.r3;
import og.u0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class g extends n6.g {
    public final w5.b U;

    public g(Context context, Looper looper, r3 r3Var, w5.b bVar, k kVar, l lVar) {
        super(context, looper, 68, r3Var, kVar, lVar, 0);
        bVar = bVar == null ? w5.b.c : bVar;
        u0 u0Var = new u0(20);
        u0Var.b = Boolean.FALSE;
        w5.b bVar2 = w5.b.c;
        bVar.getClass();
        u0Var.b = Boolean.valueOf(bVar.a);
        u0Var.c = bVar.b;
        u0Var.c = e.a();
        this.U = new w5.b(u0Var);
    }

    @Override // n6.g, com.google.android.gms.common.api.c
    public final int l() {
        return 12800000;
    }

    @Override // n6.g
    public final IInterface q(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        return queryLocalInterface instanceof h ? (h) queryLocalInterface : new h(iBinder, "com.google.android.gms.auth.api.credentials.internal.ICredentialsService", 5);
    }

    @Override // n6.g
    public final Bundle t() {
        w5.b bVar = this.U;
        bVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("consumer_package", null);
        bundle.putBoolean("force_save_dialog", bVar.a);
        bundle.putString("log_session_id", bVar.b);
        return bundle;
    }

    @Override // n6.g
    public final String v() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    @Override // n6.g
    public final String w() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }
}
