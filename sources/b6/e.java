package b6;

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
import m.r3;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class e extends o6.g {
    public final GoogleSignInOptions U;

    public e(Context context, Looper looper, r3 r3Var, GoogleSignInOptions googleSignInOptions, com.google.android.gms.common.api.k kVar, com.google.android.gms.common.api.l lVar) {
        super(context, looper, 91, r3Var, kVar, lVar, 0);
        a6.b bVar;
        Set<Scope> set = (Set) r3Var.b;
        if (googleSignInOptions != null) {
            bVar = new a6.b();
            bVar.a = new HashSet();
            bVar.h = new HashMap();
            bVar.a = new HashSet(googleSignInOptions.b);
            bVar.b = googleSignInOptions.e;
            bVar.c = googleSignInOptions.f;
            bVar.d = googleSignInOptions.d;
            bVar.e = googleSignInOptions.h;
            bVar.f = googleSignInOptions.c;
            bVar.g = googleSignInOptions.n;
            bVar.h = GoogleSignInOptions.c(googleSignInOptions.r);
            bVar.i = googleSignInOptions.s;
        } else {
            bVar = new a6.b();
            bVar.a = new HashSet();
            bVar.h = new HashMap();
        }
        bVar.i = j7.e.a();
        if (!set.isEmpty()) {
            for (Scope scope : set) {
                HashSet hashSet = bVar.a;
                hashSet.add(scope);
                hashSet.addAll(Arrays.asList(new Scope[0]));
            }
        }
        HashSet hashSet2 = bVar.a;
        if (hashSet2.contains(GoogleSignInOptions.E)) {
            Scope scope2 = GoogleSignInOptions.y;
            if (hashSet2.contains(scope2)) {
                hashSet2.remove(scope2);
            }
        }
        if (bVar.d && (bVar.f == null || !hashSet2.isEmpty())) {
            hashSet2.add(GoogleSignInOptions.x);
        }
        this.U = new GoogleSignInOptions(3, new ArrayList(hashSet2), bVar.f, bVar.d, bVar.b, bVar.c, bVar.e, bVar.g, bVar.h, bVar.i);
    }

    @Override // o6.g, com.google.android.gms.common.api.c
    public final int l() {
        return 12451000;
    }

    @Override // o6.g, com.google.android.gms.common.api.c
    public final Intent o() {
        return h.a(this.n, this.U);
    }

    @Override // o6.g
    public final IInterface q(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        return queryLocalInterface instanceof k ? (k) queryLocalInterface : new k(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService", 6);
    }

    @Override // o6.g
    public final String v() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    @Override // o6.g
    public final String w() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }
}
