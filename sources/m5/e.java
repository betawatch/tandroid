package m5;

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
import m.s3;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class e extends z5.g {
    public final GoogleSignInOptions Q;

    public e(Context context, Looper looper, s3 s3Var, GoogleSignInOptions googleSignInOptions, com.google.android.gms.common.api.k kVar, com.google.android.gms.common.api.l lVar) {
        super(context, looper, 91, s3Var, kVar, lVar, 0);
        l5.a aVar;
        Set<Scope> set = (Set) s3Var.b;
        if (googleSignInOptions != null) {
            aVar = new l5.a();
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
            aVar = new l5.a();
            aVar.a = new HashSet();
            aVar.h = new HashMap();
        }
        aVar.i = u6.e.a();
        if (!set.isEmpty()) {
            for (Scope scope : set) {
                HashSet hashSet = aVar.a;
                hashSet.add(scope);
                hashSet.addAll(Arrays.asList(new Scope[0]));
            }
        }
        HashSet hashSet2 = aVar.a;
        if (hashSet2.contains(GoogleSignInOptions.A)) {
            Scope scope2 = GoogleSignInOptions.y;
            if (hashSet2.contains(scope2)) {
                hashSet2.remove(scope2);
            }
        }
        if (aVar.d && (aVar.f == null || !hashSet2.isEmpty())) {
            hashSet2.add(GoogleSignInOptions.x);
        }
        this.Q = new GoogleSignInOptions(3, new ArrayList(hashSet2), aVar.f, aVar.d, aVar.b, aVar.c, aVar.e, aVar.g, aVar.h, aVar.i);
    }

    @Override // z5.g, com.google.android.gms.common.api.c
    public final int k() {
        return 12451000;
    }

    @Override // z5.g, com.google.android.gms.common.api.c
    public final Intent o() {
        return h.a(this.n, this.Q);
    }

    @Override // z5.g
    public final IInterface q(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        return queryLocalInterface instanceof k ? (k) queryLocalInterface : new k(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService", 9);
    }

    @Override // z5.g
    public final String v() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    @Override // z5.g
    public final String w() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }
}
