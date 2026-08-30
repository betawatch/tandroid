package d6;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import b6.g;
import b6.q;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import m.s3;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class c extends g {
    public final q R;

    public c(Context context, Looper looper, s3 s3Var, q qVar, k kVar, l lVar) {
        super(context, looper, 270, s3Var, kVar, lVar, 0);
        this.R = qVar;
    }

    @Override // b6.g, com.google.android.gms.common.api.c
    public final int k() {
        return 203400000;
    }

    @Override // b6.g
    public final IInterface q(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return queryLocalInterface instanceof a ? (a) queryLocalInterface : new a(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService", 11);
    }

    @Override // b6.g
    public final y5.c[] r() {
        return y6.b.b;
    }

    @Override // b6.g
    public final Bundle t() {
        q qVar = this.R;
        qVar.getClass();
        Bundle bundle = new Bundle();
        String str = qVar.a;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    @Override // b6.g
    public final String v() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // b6.g
    public final String w() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // b6.g
    public final boolean y() {
        return true;
    }
}
