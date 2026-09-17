package b8;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import m.p3;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public final class a extends n6.g {
    public final Context U;

    public a(Context context, Looper looper, k kVar, l lVar, p3 p3Var) {
        super(context, looper, 45, p3Var, kVar, lVar, 0);
        this.U = context;
    }

    @Override // n6.g
    public final boolean C() {
        return true;
    }

    @Override // n6.g, com.google.android.gms.common.api.c
    public final int l() {
        return 12200000;
    }

    @Override // n6.g
    public final /* bridge */ /* synthetic */ IInterface q(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.safetynet.internal.ISafetyNetService");
        return queryLocalInterface instanceof d ? (d) queryLocalInterface : new d(iBinder);
    }

    @Override // n6.g
    public final String v() {
        return "com.google.android.gms.safetynet.internal.ISafetyNetService";
    }

    @Override // n6.g
    public final String w() {
        return "com.google.android.gms.safetynet.service.START";
    }
}
