// default package

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class i3d extends xx4 {
    public final ngb F;

    public i3d(Context context, Looper looper, ntb ntbVar, ngb ngbVar, ey4 ey4Var, fy4 fy4Var) {
        super(kk7.s4, ey4Var, fy4Var, ntbVar, context, looper);
        this.F = ngbVar;
    }

    @Override // gg0
    public final IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return queryLocalInterface instanceof a3d ? (a3d) queryLocalInterface : new a3d(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService", (byte) 1);
    }

    @Override // gg0
    public final f84[] f() {
        return udd.c;
    }

    @Override // gg0
    public final Bundle h() {
        ngb ngbVar = this.F;
        ngbVar.getClass();
        Bundle bundle = new Bundle();
        String str = ngbVar.a;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    @Override // gg0
    public final int i() {
        return 203400000;
    }

    @Override // gg0
    public final String l() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // gg0
    public final String n() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // gg0
    public final boolean p() {
        return true;
    }
}
