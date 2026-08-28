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
        super(context, h8.j.a, h8.i.a, iVar);
    }

    public Intent f() {
        int h = h();
        int i9 = h - 1;
        if (h == 0) {
            throw null;
        }
        com.google.android.gms.common.api.b bVar = this.d;
        Context context = this.a;
        if (i9 == 2) {
            k5.h.a.e("getFallbackSignInIntent()", new Object[0]);
            Intent a2 = k5.h.a(context, (GoogleSignInOptions) bVar);
            a2.setAction("com.google.android.gms.auth.APPAUTH_SIGN_IN");
            return a2;
        }
        if (i9 == 3) {
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
        return x5.l.n(basePendingResult, new za.a(25));
    }

    public synchronized int h() {
        int i9;
        try {
            i9 = k;
            if (i9 == 1) {
                Context context = this.a;
                u5.d dVar = u5.d.d;
                int d = dVar.d(context, 12451000);
                if (d == 0) {
                    i9 = 4;
                    k = 4;
                } else if (dVar.b(context, null, d) != null || i6.e.a(context, "com.google.android.gms.auth.api.fallback") == 0) {
                    i9 = 2;
                    k = 2;
                } else {
                    i9 = 3;
                    k = 3;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return i9;
    }
}
