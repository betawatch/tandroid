package d7;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import m.s3;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class k extends z5.g {
    public final a0.k Q;
    public final a0.k R;
    public final a0.k S;

    public k(Context context, Looper looper, com.google.android.gms.common.api.k kVar, com.google.android.gms.common.api.l lVar, s3 s3Var) {
        super(context, looper, 23, s3Var, kVar, lVar, 0);
        this.Q = new a0.k(0);
        this.R = new a0.k(0);
        this.S = new a0.k(0);
    }

    @Override // z5.g
    public final void A(int i10) {
        super.A(i10);
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

    @Override // z5.g
    public final boolean C() {
        return true;
    }

    @Override // z5.g, com.google.android.gms.common.api.c
    public final int k() {
        return 11717000;
    }

    @Override // z5.g
    public final IInterface q(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        return queryLocalInterface instanceof z ? (z) queryLocalInterface : new z(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService", 3);
    }

    @Override // z5.g
    public final w5.c[] r() {
        return s7.k.a;
    }

    @Override // z5.g
    public final String v() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    @Override // z5.g
    public final String w() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }
}
