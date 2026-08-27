package a6;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import m.t3;
import y5.g;
import y5.p;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class d extends g {
    public final p Q;

    public d(Context context, Looper looper, t3 t3Var, p pVar, k kVar, l lVar) {
        super(context, looper, 270, t3Var, kVar, lVar, 0);
        this.Q = pVar;
    }

    @Override // y5.g, com.google.android.gms.common.api.c
    public final int k() {
        return 203400000;
    }

    @Override // y5.g
    public final IInterface q(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return queryLocalInterface instanceof a ? (a) queryLocalInterface : new a(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService", 10);
    }

    @Override // y5.g
    public final v5.c[] r() {
        return v6.b.b;
    }

    @Override // y5.g
    public final Bundle t() {
        p pVar = this.Q;
        pVar.getClass();
        Bundle bundle = new Bundle();
        String str = pVar.a;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    @Override // y5.g
    public final String v() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // y5.g
    public final String w() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // y5.g
    public final boolean y() {
        return true;
    }
}
