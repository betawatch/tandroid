package b9;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.tasks.Task;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class j0 extends com.google.android.gms.common.api.j {
    public static int l = 1;

    public j0(Context context, com.google.android.gms.common.api.i iVar) {
        super(context, a9.c.a, a9.b.a, iVar);
    }

    public Intent f() {
        int h = h();
        int i7 = h - 1;
        if (h == 0) {
            throw null;
        }
        com.google.android.gms.common.api.b bVar = this.e;
        Context context = this.a;
        if (i7 == 2) {
            d6.h.a.a("getFallbackSignInIntent()", new Object[0]);
            Intent a10 = d6.h.a(context, (GoogleSignInOptions) bVar);
            a10.setAction("com.google.android.gms.auth.APPAUTH_SIGN_IN");
            return a10;
        }
        if (i7 == 3) {
            return d6.h.a(context, (GoogleSignInOptions) bVar);
        }
        d6.h.a.a("getNoImplementationSignInIntent()", new Object[0]);
        Intent a11 = d6.h.a(context, (GoogleSignInOptions) bVar);
        a11.setAction("com.google.android.gms.auth.NO_IMPL");
        return a11;
    }

    public Task g() {
        BasePendingResult basePendingResult;
        boolean z9 = h() == 3;
        d6.h.a.a("Signing out", new Object[0]);
        d6.h.b(this.a);
        com.google.android.gms.common.api.internal.n0 n0Var = this.i;
        if (z9) {
            BasePendingResult rVar = new com.google.android.gms.common.api.internal.r(n0Var, 0);
            rVar.a(Status.e);
            basePendingResult = rVar;
        } else {
            d6.g gVar = new d6.g(n0Var, 0);
            n0Var.b.d(1, gVar);
            basePendingResult = gVar;
        }
        return q6.m.m(basePendingResult, new w7.s(21, false));
    }

    public synchronized int h() {
        int i7;
        try {
            i7 = l;
            if (i7 == 1) {
                Context context = this.a;
                n6.d dVar = n6.d.e;
                int d = dVar.d(context, 12451000);
                if (d == 0) {
                    i7 = 4;
                    l = 4;
                } else if (dVar.b(d, context, null) != null || b7.f.a(context, "com.google.android.gms.auth.api.fallback") == 0) {
                    i7 = 2;
                    l = 2;
                } else {
                    i7 = 3;
                    l = 3;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return i7;
    }
}
