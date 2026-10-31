package o8;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import m.p3;
import n6.u;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class a extends n6.g implements com.google.android.gms.common.api.c {
    public final boolean U;
    public final p3 V;
    public final Bundle W;
    public final Integer X;

    public a(Context context, Looper looper, p3 p3Var, Bundle bundle, k kVar, l lVar) {
        super(context, looper, 44, p3Var, kVar, lVar, 0);
        this.U = true;
        this.V = p3Var;
        this.W = bundle;
        this.X = (Integer) p3Var.h;
    }

    public final void H() {
        f(new n6.c(this));
    }

    public final void I(c cVar) {
        try {
            this.V.getClass();
            Account account = new Account("<<default account>>", "com.google");
            GoogleSignInAccount b10 = "<<default account>>".equals(account.name) ? a6.b.a(this.n).b() : null;
            Integer num = this.X;
            n6.l.g(num);
            u uVar = new u(2, account, num.intValue(), b10);
            e eVar = (e) v();
            g gVar = new g(1, uVar);
            Parcel J0 = eVar.J0();
            k7.a.c(J0, gVar);
            k7.a.d(J0, cVar);
            eVar.K0(J0, 12);
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                cVar.C(new h(1, new k6.a(8, null), null));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }

    @Override // n6.g, com.google.android.gms.common.api.c
    public final int m() {
        return 12451000;
    }

    @Override // n6.g, com.google.android.gms.common.api.c
    public final boolean q() {
        return this.U;
    }

    @Override // n6.g
    public final IInterface r(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return queryLocalInterface instanceof e ? (e) queryLocalInterface : new e(iBinder, "com.google.android.gms.signin.internal.ISignInService", 6);
    }

    @Override // n6.g
    public final Bundle u() {
        p3 p3Var = this.V;
        boolean equals = this.n.getPackageName().equals((String) p3Var.d);
        Bundle bundle = this.W;
        if (!equals) {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", (String) p3Var.d);
        }
        return bundle;
    }

    @Override // n6.g
    public final String w() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // n6.g
    public final String x() {
        return "com.google.android.gms.signin.service.START";
    }
}
