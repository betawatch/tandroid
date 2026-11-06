package l7;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import m.q3;
import org.telegram.messenger.qs;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class c extends q6.h {
    public final Bundle F;

    public c(Context context, Looper looper, k kVar, l lVar, q3 q3Var) {
        super(context, looper, qs.p3, q3Var, kVar, lVar, 0);
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
