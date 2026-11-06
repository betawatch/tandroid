package l7;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import m.q3;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class g extends q6.h {
    public final z5.b F;

    public g(Context context, Looper looper, q3 q3Var, z5.b bVar, k kVar, l lVar) {
        super(context, looper, 68, q3Var, kVar, lVar, 0);
        bVar = bVar == null ? z5.b.c : bVar;
        v6.e eVar = new v6.e();
        eVar.a = Boolean.FALSE;
        z5.b bVar2 = z5.b.c;
        bVar.getClass();
        eVar.a = Boolean.valueOf(bVar.a);
        eVar.b = bVar.b;
        eVar.b = e.a();
        this.F = new z5.b(eVar);
    }

    @Override // q6.d, com.google.android.gms.common.api.c
    public final int d() {
        return 12800000;
    }

    @Override // q6.d
    public final IInterface i(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        return queryLocalInterface instanceof h ? (h) queryLocalInterface : new h(iBinder, "com.google.android.gms.auth.api.credentials.internal.ICredentialsService", 7);
    }

    @Override // q6.d
    public final Bundle m() {
        z5.b bVar = this.F;
        bVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("consumer_package", null);
        bundle.putBoolean("force_save_dialog", bVar.a);
        bundle.putString("log_session_id", bVar.b);
        return bundle;
    }

    @Override // q6.d
    public final String o() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    @Override // q6.d
    public final String p() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }
}
