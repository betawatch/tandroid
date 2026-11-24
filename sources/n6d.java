// default package

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class n6d extends xx4 {
    public final Context F;

    public n6d(ey4 ey4Var, fy4 fy4Var, ntb ntbVar, Context context, Looper looper) {
        super(45, ey4Var, fy4Var, ntbVar, context, looper);
        this.F = context;
    }

    @Override // gg0
    public final /* bridge */ /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.safetynet.internal.ISafetyNetService");
        return queryLocalInterface instanceof hce ? (hce) queryLocalInterface : new hce(iBinder);
    }

    @Override // gg0
    public final int i() {
        return 12200000;
    }

    @Override // gg0
    public final String l() {
        return "com.google.android.gms.safetynet.internal.ISafetyNetService";
    }

    @Override // gg0
    public final String n() {
        return "com.google.android.gms.safetynet.service.START";
    }

    @Override // gg0
    public final boolean x() {
        return true;
    }
}
