package k7;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import m.o3;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class g extends p6.h {
    public final y5.b F;

    public g(Context context, Looper looper, o3 o3Var, y5.b bVar, k kVar, l lVar) {
        super(context, looper, 68, o3Var, kVar, lVar, 0);
        bVar = bVar == null ? y5.b.c : bVar;
        ua.b bVar2 = new ua.b(5);
        bVar2.b = Boolean.FALSE;
        y5.b bVar3 = y5.b.c;
        bVar.getClass();
        bVar2.b = Boolean.valueOf(bVar.a);
        bVar2.c = bVar.b;
        bVar2.c = e.a();
        this.F = new y5.b(bVar2);
    }

    @Override // p6.d, com.google.android.gms.common.api.c
    public final int d() {
        return 12800000;
    }

    @Override // p6.d
    public final IInterface g(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        return queryLocalInterface instanceof h ? (h) queryLocalInterface : new h(iBinder, "com.google.android.gms.auth.api.credentials.internal.ICredentialsService", 6);
    }

    @Override // p6.d
    public final Bundle k() {
        y5.b bVar = this.F;
        bVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("consumer_package", null);
        bundle.putBoolean("force_save_dialog", bVar.a);
        bundle.putString("log_session_id", bVar.b);
        return bundle;
    }

    @Override // p6.d
    public final String n() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    @Override // p6.d
    public final String o() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }
}
