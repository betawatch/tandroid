package a9;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.tasks.Task;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class j0 extends com.google.android.gms.common.api.j {
    public static int l = 1;

    public j0(Context context, com.google.android.gms.common.api.i iVar) {
        super(context, z8.c.a, z8.b.a, iVar);
    }

    public Intent f() {
        int h = h();
        int i3 = h - 1;
        if (h == 0) {
            throw null;
        }
        com.google.android.gms.common.api.b bVar = this.e;
        Context context = this.a;
        if (i3 == 2) {
            c6.h.a.a("getFallbackSignInIntent()", new Object[0]);
            Intent a10 = c6.h.a(context, (GoogleSignInOptions) bVar);
            a10.setAction("com.google.android.gms.auth.APPAUTH_SIGN_IN");
            return a10;
        }
        if (i3 == 3) {
            return c6.h.a(context, (GoogleSignInOptions) bVar);
        }
        c6.h.a.a("getNoImplementationSignInIntent()", new Object[0]);
        Intent a11 = c6.h.a(context, (GoogleSignInOptions) bVar);
        a11.setAction("com.google.android.gms.auth.NO_IMPL");
        return a11;
    }

    public Task g() {
        BasePendingResult basePendingResult;
        boolean z10 = h() == 3;
        c6.h.a.a("Signing out", new Object[0]);
        c6.h.b(this.a);
        com.google.android.gms.common.api.internal.n0 n0Var = this.i;
        if (z10) {
            BasePendingResult rVar = new com.google.android.gms.common.api.internal.r(n0Var, 0);
            rVar.a(Status.e);
            basePendingResult = rVar;
        } else {
            c6.g gVar = new c6.g(n0Var, 0);
            n0Var.b.d(1, gVar);
            basePendingResult = gVar;
        }
        return p6.m.m(basePendingResult, new mb.b(21));
    }

    public synchronized int h() {
        int i3;
        try {
            i3 = l;
            if (i3 == 1) {
                Context context = this.a;
                m6.d dVar = m6.d.e;
                int d = dVar.d(context, 12451000);
                if (d == 0) {
                    i3 = 4;
                    l = 4;
                } else if (dVar.b(d, context, null) != null || a7.f.a(context, "com.google.android.gms.auth.api.fallback") == 0) {
                    i3 = 2;
                    l = 2;
                } else {
                    i3 = 3;
                    l = 3;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return i3;
    }
}
