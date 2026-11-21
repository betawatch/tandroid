package l7;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import m.o3;
import tg.y;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final class g extends q6.h {
    public final z5.b F;

    public g(Context context, Looper looper, o3 o3Var, z5.b bVar, k kVar, l lVar) {
        super(context, looper, 68, o3Var, kVar, lVar, 0);
        bVar = bVar == null ? z5.b.c : bVar;
        y yVar = new y(9, (byte) 0);
        yVar.b = Boolean.FALSE;
        z5.b bVar2 = z5.b.c;
        bVar.getClass();
        yVar.b = Boolean.valueOf(bVar.a);
        yVar.c = bVar.b;
        yVar.c = e.a();
        this.F = new z5.b(yVar);
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
