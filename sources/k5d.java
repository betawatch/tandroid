// default package

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class k5d extends zz4 {
    public final oib F;

    public k5d(Context context, Looper looper, ovb ovbVar, oib oibVar, f05 f05Var, g05 g05Var) {
        super(nm7.s4, f05Var, g05Var, ovbVar, context, looper);
        this.F = oibVar;
    }

    @Override // hh0
    public final IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return queryLocalInterface instanceof c5d ? (c5d) queryLocalInterface : new c5d(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService", (byte) 1);
    }

    @Override // hh0
    public final o94[] f() {
        return wfd.c;
    }

    @Override // hh0
    public final Bundle h() {
        oib oibVar = this.F;
        oibVar.getClass();
        Bundle bundle = new Bundle();
        String str = oibVar.a;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    @Override // hh0
    public final int i() {
        return 203400000;
    }

    @Override // hh0
    public final String l() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // hh0
    public final String n() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // hh0
    public final boolean p() {
        return true;
    }
}
