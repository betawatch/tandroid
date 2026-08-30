package a8;

import android.content.Context;
import android.content.Intent;
import b6.m;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.api.internal.t0;
import com.google.android.gms.common.api.internal.u;
import com.google.android.gms.tasks.Task;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class e extends com.google.android.gms.common.api.j {
    public static int k = 1;

    public e(Context context, com.google.android.gms.common.api.i iVar) {
        super(context, l8.j.a, l8.i.a, iVar);
    }

    public Intent f() {
        int h = h();
        int i10 = h - 1;
        if (h == 0) {
            throw null;
        }
        com.google.android.gms.common.api.b bVar = this.d;
        Context context = this.a;
        if (i10 == 2) {
            o5.h.a.f("getFallbackSignInIntent()", new Object[0]);
            Intent a2 = o5.h.a(context, (GoogleSignInOptions) bVar);
            a2.setAction("com.google.android.gms.auth.APPAUTH_SIGN_IN");
            return a2;
        }
        if (i10 == 3) {
            return o5.h.a(context, (GoogleSignInOptions) bVar);
        }
        o5.h.a.f("getNoImplementationSignInIntent()", new Object[0]);
        Intent a10 = o5.h.a(context, (GoogleSignInOptions) bVar);
        a10.setAction("com.google.android.gms.auth.NO_IMPL");
        return a10;
    }

    public Task g() {
        BasePendingResult basePendingResult;
        boolean z4 = h() == 3;
        o5.h.a.f("Signing out", new Object[0]);
        o5.h.b(this.a);
        t0 t0Var = this.h;
        if (z4) {
            BasePendingResult uVar = new u(t0Var, 0);
            uVar.a(Status.e);
            basePendingResult = uVar;
        } else {
            o5.g gVar = new o5.g(t0Var, 0);
            t0Var.b.d(1, gVar);
            basePendingResult = gVar;
        }
        return m.n(basePendingResult, new db.a(3));
    }

    public synchronized int h() {
        int i10;
        try {
            i10 = k;
            if (i10 == 1) {
                Context context = this.a;
                y5.d dVar = y5.d.d;
                int d = dVar.d(context, 12451000);
                if (d == 0) {
                    i10 = 4;
                    k = 4;
                } else if (dVar.b(context, null, d) != null || m6.e.a(context, "com.google.android.gms.auth.api.fallback") == 0) {
                    i10 = 2;
                    k = 2;
                } else {
                    i10 = 3;
                    k = 3;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return i10;
    }
}
