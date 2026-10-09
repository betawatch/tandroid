package i7;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import m.q3;
import org.telegram.ui.ActionBar.b5;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class g extends n6.g {
    public final w5.b U;

    public g(Context context, Looper looper, q3 q3Var, w5.b bVar, k kVar, l lVar) {
        super(context, looper, 68, q3Var, kVar, lVar, 0);
        bVar = bVar == null ? w5.b.c : bVar;
        b5 b5Var = new b5(19, (byte) 0);
        b5Var.b = Boolean.FALSE;
        w5.b bVar2 = w5.b.c;
        bVar.getClass();
        b5Var.b = Boolean.valueOf(bVar.a);
        b5Var.c = bVar.b;
        b5Var.c = e.a();
        this.U = new w5.b(b5Var);
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
