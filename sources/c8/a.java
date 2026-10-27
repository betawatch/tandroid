package c8;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import m.r3;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class a extends o6.g {
    public final Context U;

    public a(Context context, Looper looper, k kVar, l lVar, r3 r3Var) {
        super(context, looper, 45, r3Var, kVar, lVar, 0);
        this.U = context;
    }

    @Override // o6.g
    public final boolean C() {
        return true;
    }

    @Override // o6.g, com.google.android.gms.common.api.c
    public final int l() {
        return 12200000;
    }

    @Override // o6.g
    public final /* bridge */ /* synthetic */ IInterface q(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.safetynet.internal.ISafetyNetService");
        return queryLocalInterface instanceof d ? (d) queryLocalInterface : new d(iBinder);
    }

    @Override // o6.g
    public final String v() {
        return "com.google.android.gms.safetynet.internal.ISafetyNetService";
    }

    @Override // o6.g
    public final String w() {
        return "com.google.android.gms.safetynet.service.START";
    }
}
