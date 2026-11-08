package e8;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import m.q3;
import q6.h;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class a extends h {
    public final Context F;

    public a(Context context, Looper looper, k kVar, l lVar, q3 q3Var) {
        super(context, looper, 45, q3Var, kVar, lVar, 0);
        this.F = context;
    }

    @Override // q6.d, com.google.android.gms.common.api.c
    public final int d() {
        return 12200000;
    }

    @Override // q6.d
    public final /* bridge */ /* synthetic */ IInterface i(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.safetynet.internal.ISafetyNetService");
        return queryLocalInterface instanceof c ? (c) queryLocalInterface : new c(iBinder);
    }

    @Override // q6.d
    public final String o() {
        return "com.google.android.gms.safetynet.internal.ISafetyNetService";
    }

    @Override // q6.d
    public final String p() {
        return "com.google.android.gms.safetynet.service.START";
    }

    @Override // q6.d
    public final boolean x() {
        return true;
    }
}
