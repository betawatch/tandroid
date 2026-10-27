package j7;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import m.r3;
import m4.w1;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class g extends o6.g {
    public final x5.b U;

    public g(Context context, Looper looper, r3 r3Var, x5.b bVar, k kVar, l lVar) {
        super(context, looper, 68, r3Var, kVar, lVar, 0);
        bVar = bVar == null ? x5.b.c : bVar;
        w1 w1Var = new w1(26, (byte) 0);
        w1Var.b = Boolean.FALSE;
        x5.b bVar2 = x5.b.c;
        bVar.getClass();
        w1Var.b = Boolean.valueOf(bVar.a);
        w1Var.c = bVar.b;
        w1Var.c = e.a();
        this.U = new x5.b(w1Var);
    }

    @Override // o6.g, com.google.android.gms.common.api.c
    public final int l() {
        return 12800000;
    }

    @Override // o6.g
    public final IInterface q(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        return queryLocalInterface instanceof h ? (h) queryLocalInterface : new h(iBinder, "com.google.android.gms.auth.api.credentials.internal.ICredentialsService", 6);
    }

    @Override // o6.g
    public final Bundle t() {
        x5.b bVar = this.U;
        bVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("consumer_package", null);
        bundle.putBoolean("force_save_dialog", bVar.a);
        bundle.putString("log_session_id", bVar.b);
        return bundle;
    }

    @Override // o6.g
    public final String v() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    @Override // o6.g
    public final String w() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }
}
