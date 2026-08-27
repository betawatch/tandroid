package com.google.android.gms.internal.clearcut;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.tasks.Task;

/* loaded from: classes.dex */
public final class v0 extends com.google.android.gms.common.api.j {
    public static int k = 1;

    public v0(Context context, com.google.android.gms.common.api.i iVar) {
        super(context, i8.j.a, i8.i.a, iVar);
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
            k5.h.a.e("getFallbackSignInIntent()", new Object[0]);
            Intent a2 = k5.h.a(context, (GoogleSignInOptions) bVar);
            a2.setAction("com.google.android.gms.auth.APPAUTH_SIGN_IN");
            return a2;
        }
        if (i10 == 3) {
            return k5.h.a(context, (GoogleSignInOptions) bVar);
        }
        k5.h.a.e("getNoImplementationSignInIntent()", new Object[0]);
        Intent a3 = k5.h.a(context, (GoogleSignInOptions) bVar);
        a3.setAction("com.google.android.gms.auth.NO_IMPL");
        return a3;
    }

    public Task g() {
        BasePendingResult basePendingResult;
        boolean z10 = h() == 3;
        k5.h.a.e("Signing out", new Object[0]);
        k5.h.b(this.a);
        com.google.android.gms.common.api.internal.t0 t0Var = this.h;
        if (z10) {
            BasePendingResult uVar = new com.google.android.gms.common.api.internal.u(t0Var, 0);
            uVar.a(Status.e);
            basePendingResult = uVar;
        } else {
            k5.g gVar = new k5.g(t0Var, 0);
            t0Var.b.d(1, gVar);
            basePendingResult = gVar;
        }
        return y5.l.n(basePendingResult, new xa.a(26));
    }

    public synchronized int h() {
        int i10;
        try {
            i10 = k;
            if (i10 == 1) {
                Context context = this.a;
                v5.d dVar = v5.d.d;
                int d = dVar.d(context, 12451000);
                if (d == 0) {
                    i10 = 4;
                    k = 4;
                } else if (dVar.b(context, null, d) != null || j6.e.a(context, "com.google.android.gms.auth.api.fallback") == 0) {
                    i10 = 2;
                    k = 2;
                } else {
                    i10 = 3;
                    k = 3;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return i10;
    }
}
