package l7;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import m.t3;
import x5.g;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class a extends g {
    public final Context Q;

    public a(Context context, Looper looper, k kVar, l lVar, t3 t3Var) {
        super(context, looper, 45, t3Var, kVar, lVar, 0);
        this.Q = context;
    }

    @Override // x5.g
    public final boolean C() {
        return true;
    }

    @Override // x5.g, com.google.android.gms.common.api.c
    public final int l() {
        return 12200000;
    }

    @Override // x5.g
    public final /* bridge */ /* synthetic */ IInterface q(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.safetynet.internal.ISafetyNetService");
        return queryLocalInterface instanceof c ? (c) queryLocalInterface : new c(iBinder);
    }

    @Override // x5.g
    public final String v() {
        return "com.google.android.gms.safetynet.internal.ISafetyNetService";
    }

    @Override // x5.g
    public final String w() {
        return "com.google.android.gms.safetynet.service.START";
    }
}
