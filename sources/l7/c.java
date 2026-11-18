package l7;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import m.o3;
import org.telegram.messenger.ks;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final class c extends q6.h {
    public final Bundle F;

    public c(Context context, Looper looper, k kVar, l lVar, o3 o3Var) {
        super(context, looper, ks.p3, o3Var, kVar, lVar, 0);
        this.F = new Bundle();
    }

    @Override // q6.d, com.google.android.gms.common.api.c
    public final int d() {
        return 17895000;
    }

    @Override // q6.d
    public final IInterface i(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.ISignInService");
        return queryLocalInterface instanceof i ? (i) queryLocalInterface : new i(iBinder, "com.google.android.gms.auth.api.identity.internal.ISignInService", 7);
    }

    @Override // q6.d
    public final n6.c[] k() {
        return d.b;
    }

    @Override // q6.d
    public final Bundle m() {
        return this.F;
    }

    @Override // q6.d
    public final String o() {
        return "com.google.android.gms.auth.api.identity.internal.ISignInService";
    }

    @Override // q6.d
    public final String p() {
        return "com.google.android.gms.auth.api.identity.service.signin.START";
    }

    @Override // q6.d
    public final boolean r() {
        return true;
    }

    @Override // q6.d
    public final boolean x() {
        return true;
    }
}
