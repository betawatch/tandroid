package f7;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import m.s3;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class l extends b6.g {
    public final a0.k R;
    public final a0.k S;
    public final a0.k T;

    public l(Context context, Looper looper, com.google.android.gms.common.api.k kVar, com.google.android.gms.common.api.l lVar, s3 s3Var) {
        super(context, looper, 23, s3Var, kVar, lVar, 0);
        this.R = new a0.k(0);
        this.S = new a0.k(0);
        this.T = new a0.k(0);
    }

    @Override // b6.g
    public final void A(int i10) {
        super.A(i10);
        synchronized (this.R) {
            this.R.clear();
        }
        synchronized (this.S) {
            this.S.clear();
        }
        synchronized (this.T) {
            this.T.clear();
        }
    }

    @Override // b6.g
    public final boolean C() {
        return true;
    }

    @Override // b6.g, com.google.android.gms.common.api.c
    public final int k() {
        return 11717000;
    }

    @Override // b6.g
    public final IInterface q(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        return queryLocalInterface instanceof a0 ? (a0) queryLocalInterface : new a0(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService", 4);
    }

    @Override // b6.g
    public final y5.c[] r() {
        return u7.k.a;
    }

    @Override // b6.g
    public final String v() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    @Override // b6.g
    public final String w() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }
}
