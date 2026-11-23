package e8;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import m.o3;
import q6.h;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class a extends h {
    public final Context F;

    public a(Context context, Looper looper, k kVar, l lVar, o3 o3Var) {
        super(context, looper, 45, o3Var, kVar, lVar, 0);
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
