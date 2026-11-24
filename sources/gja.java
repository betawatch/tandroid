// default package

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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class gja extends zz4 {
    public final boolean F;
    public final ovb G;
    public final Bundle H;
    public final Integer I;

    public gja(Context context, Looper looper, ovb ovbVar, Bundle bundle, f05 f05Var, g05 g05Var) {
        super(44, f05Var, g05Var, ovbVar, context, looper);
        this.F = true;
        this.G = ovbVar;
        this.H = bundle;
        this.I = (Integer) ovbVar.h;
    }

    public final void B(b3d b3dVar) {
        try {
            this.G.getClass();
            Account account = new Account("<<default account>>", "com.google");
            GoogleSignInAccount b = "<<default account>>".equals(account.name) ? f3b.a(this.h).b() : null;
            Integer num = this.I;
            ite.h(num);
            l5d l5dVar = new l5d(2, account, num.intValue(), b);
            t4d t4dVar = (t4d) k();
            y4d y4dVar = new y4d(1, l5dVar);
            Parcel c = t4dVar.c();
            g4d.b(c, y4dVar);
            g4d.c(c, b3dVar);
            t4dVar.d(c, 12);
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                b3dVar.U(new e5d(1, new ot2(8, null, null), null));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }

    @Override // hh0
    public final IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return queryLocalInterface instanceof t4d ? (t4d) queryLocalInterface : new t4d(iBinder, "com.google.android.gms.signin.internal.ISignInService", (byte) 1);
    }

    @Override // hh0
    public final Bundle h() {
        ovb ovbVar = this.G;
        boolean equals = this.h.getPackageName().equals((String) ovbVar.d);
        Bundle bundle = this.H;
        if (!equals) {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", (String) ovbVar.d);
        }
        return bundle;
    }

    @Override // hh0
    public final int i() {
        return 12451000;
    }

    @Override // hh0
    public final String l() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // hh0
    public final String n() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // hh0
    public final boolean w() {
        return this.F;
    }
}
