package b8;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import m.p3;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
