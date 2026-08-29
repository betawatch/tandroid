package b6;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import m.s3;
import z5.g;
import z5.p;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class d extends g {
    public final p Q;

    public d(Context context, Looper looper, s3 s3Var, p pVar, k kVar, l lVar) {
        super(context, looper, 270, s3Var, kVar, lVar, 0);
        this.Q = pVar;
    }

    @Override // z5.g, com.google.android.gms.common.api.c
    public final int k() {
        return 203400000;
    }

    @Override // z5.g
    public final IInterface q(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return queryLocalInterface instanceof a ? (a) queryLocalInterface : new a(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService", 10);
    }

    @Override // z5.g
    public final w5.c[] r() {
        return w6.b.b;
    }

    @Override // z5.g
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

    @Override // z5.g
    public final String v() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // z5.g
    public final String w() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // z5.g
    public final boolean y() {
        return true;
    }
}
