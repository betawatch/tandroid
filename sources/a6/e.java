package a6;

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
import m.p3;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class e extends n6.g {
    public final GoogleSignInOptions U;

    public e(Context context, Looper looper, p3 p3Var, GoogleSignInOptions googleSignInOptions, com.google.android.gms.common.api.k kVar, com.google.android.gms.common.api.l lVar) {
        super(context, looper, 91, p3Var, kVar, lVar, 0);
        z5.a aVar;
        Set<Scope> set = (Set) p3Var.b;
        if (googleSignInOptions != null) {
            aVar = new z5.a();
            aVar.a = new HashSet();
            aVar.h = new HashMap();
            aVar.a = new HashSet(googleSignInOptions.b);
            aVar.b = googleSignInOptions.e;
            aVar.c = googleSignInOptions.f;
            aVar.d = googleSignInOptions.d;
            aVar.e = googleSignInOptions.h;
            aVar.f = googleSignInOptions.c;
            aVar.g = googleSignInOptions.n;
            aVar.h = GoogleSignInOptions.c(googleSignInOptions.r);
            aVar.i = googleSignInOptions.s;
        } else {
            aVar = new z5.a();
            aVar.a = new HashSet();
            aVar.h = new HashMap();
        }
        aVar.i = i7.e.a();
        if (!set.isEmpty()) {
            for (Scope scope : set) {
                HashSet hashSet = aVar.a;
                hashSet.add(scope);
                hashSet.addAll(Arrays.asList(new Scope[0]));
            }
        }
        HashSet hashSet2 = aVar.a;
        if (hashSet2.contains(GoogleSignInOptions.E)) {
            Scope scope2 = GoogleSignInOptions.y;
            if (hashSet2.contains(scope2)) {
                hashSet2.remove(scope2);
            }
        }
        if (aVar.d && (aVar.f == null || !hashSet2.isEmpty())) {
            hashSet2.add(GoogleSignInOptions.x);
        }
        this.U = new GoogleSignInOptions(3, new ArrayList(hashSet2), aVar.f, aVar.d, aVar.b, aVar.c, aVar.e, aVar.g, aVar.h, aVar.i);
    }

    @Override // n6.g, com.google.android.gms.common.api.c
    public final int l() {
        return 12451000;
    }

    @Override // n6.g, com.google.android.gms.common.api.c
    public final Intent o() {
        return h.a(this.n, this.U);
    }

    @Override // n6.g
    public final IInterface q(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        return queryLocalInterface instanceof k ? (k) queryLocalInterface : new k(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService", 5);
    }

    @Override // n6.g
    public final String v() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    @Override // n6.g
    public final String w() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }
}
