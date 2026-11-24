// default package

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class b6d extends zz4 {
    public final GoogleSignInOptions F;

    public b6d(Context context, Looper looper, ovb ovbVar, GoogleSignInOptions googleSignInOptions, f05 f05Var, g05 g05Var) {
        super(91, f05Var, g05Var, ovbVar, context, looper);
        y05 y05Var;
        Set<Scope> set = (Set) ovbVar.b;
        if (googleSignInOptions != null) {
            y05Var = new y05();
            y05Var.a = new HashSet();
            y05Var.h = new HashMap();
            y05Var.a = new HashSet(googleSignInOptions.b);
            y05Var.b = googleSignInOptions.e;
            y05Var.c = googleSignInOptions.f;
            y05Var.d = googleSignInOptions.d;
            y05Var.e = googleSignInOptions.h;
            y05Var.f = googleSignInOptions.c;
            y05Var.g = googleSignInOptions.n;
            y05Var.h = GoogleSignInOptions.c(googleSignInOptions.r);
            y05Var.i = googleSignInOptions.s;
        } else {
            y05Var = new y05();
            y05Var.a = new HashSet();
            y05Var.h = new HashMap();
        }
        y05Var.i = u5d.a();
        if (!set.isEmpty()) {
            for (Scope scope : set) {
                HashSet hashSet = y05Var.a;
                hashSet.add(scope);
                hashSet.addAll(Arrays.asList(new Scope[0]));
            }
        }
        HashSet hashSet2 = y05Var.a;
        if (hashSet2.contains(GoogleSignInOptions.F)) {
            Scope scope2 = GoogleSignInOptions.E;
            if (hashSet2.contains(scope2)) {
                hashSet2.remove(scope2);
            }
        }
        if (y05Var.d && (y05Var.f == null || !hashSet2.isEmpty())) {
            hashSet2.add(GoogleSignInOptions.y);
        }
        this.F = new GoogleSignInOptions(3, new ArrayList(hashSet2), y05Var.f, y05Var.d, y05Var.b, y05Var.c, y05Var.e, y05Var.g, y05Var.h, y05Var.i);
    }

    @Override // hh0
    public final IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        return queryLocalInterface instanceof l6d ? (l6d) queryLocalInterface : new l6d(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService", (byte) 2);
    }

    @Override // hh0
    public final int i() {
        return 12451000;
    }

    @Override // hh0
    public final String l() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    @Override // hh0
    public final Intent m() {
        return j6d.a(this.h, this.F);
    }

    @Override // hh0
    public final String n() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }
}
