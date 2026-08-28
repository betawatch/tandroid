package b7;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import m.t3;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class m extends x5.g {
    public final a0.k Q;
    public final a0.k R;
    public final a0.k S;

    public m(Context context, Looper looper, com.google.android.gms.common.api.k kVar, com.google.android.gms.common.api.l lVar, t3 t3Var) {
        super(context, looper, 23, t3Var, kVar, lVar, 0);
        this.Q = new a0.k(0);
        this.R = new a0.k(0);
        this.S = new a0.k(0);
    }

    @Override // x5.g
    public final void A(int i9) {
        super.A(i9);
        synchronized (this.Q) {
            this.Q.clear();
        }
        synchronized (this.R) {
            this.R.clear();
        }
        synchronized (this.S) {
            this.S.clear();
        }
    }

    @Override // x5.g
    public final boolean C() {
        return true;
    }

    @Override // x5.g, com.google.android.gms.common.api.c
    public final int l() {
        return 11717000;
    }

    @Override // x5.g
    public final IInterface q(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        return queryLocalInterface instanceof c0 ? (c0) queryLocalInterface : new c0(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService", 0);
    }

    @Override // x5.g
    public final u5.c[] r() {
        return q7.l.a;
    }

    @Override // x5.g
    public final String v() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    @Override // x5.g
    public final String w() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }
}
