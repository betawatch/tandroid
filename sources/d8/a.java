package d8;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import m.o3;
import p6.h;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class a extends h {
    public final Context F;

    public a(Context context, Looper looper, k kVar, l lVar, o3 o3Var) {
        super(context, looper, 45, o3Var, kVar, lVar, 0);
        this.F = context;
    }

    @Override // p6.d, com.google.android.gms.common.api.c
    public final int d() {
        return 12200000;
    }

    @Override // p6.d
    public final /* bridge */ /* synthetic */ IInterface g(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.safetynet.internal.ISafetyNetService");
        return queryLocalInterface instanceof c ? (c) queryLocalInterface : new c(iBinder);
    }

    @Override // p6.d
    public final String n() {
        return "com.google.android.gms.safetynet.internal.ISafetyNetService";
    }

    @Override // p6.d
    public final String o() {
        return "com.google.android.gms.safetynet.service.START";
    }

    @Override // p6.d
    public final boolean w() {
        return true;
    }
}
