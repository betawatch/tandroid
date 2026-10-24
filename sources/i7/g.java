package i7;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import m.s3;
import mi.q;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class g extends n6.g {
    public final w5.b U;

    public g(Context context, Looper looper, s3 s3Var, w5.b bVar, k kVar, l lVar) {
        super(context, looper, 68, s3Var, kVar, lVar, 0);
        bVar = bVar == null ? w5.b.c : bVar;
        q qVar = new q(24, (byte) 0);
        qVar.b = Boolean.FALSE;
        w5.b bVar2 = w5.b.c;
        bVar.getClass();
        qVar.b = Boolean.valueOf(bVar.a);
        qVar.c = bVar.b;
        qVar.c = e.a();
        this.U = new w5.b(qVar);
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
