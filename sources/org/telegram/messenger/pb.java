package org.telegram.messenger;

import android.os.SystemClock;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class pb {
    public final /* synthetic */ int a;
    public final /* synthetic */ fc b;

    public pb(fc fcVar, int i7) {
        this.b = fcVar;
        this.a = i7;
    }

    public final void a(y8 y8Var, final String str, final long j3, final long j10, final boolean z10) {
        this.b.u.put(str, new long[]{j3, j10});
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j11 = y8Var.S;
        if (j11 == 0 || j11 < elapsedRealtime - 100 || j3 == j10) {
            y8Var.S = elapsedRealtime;
            final int i7 = this.a;
            g0.h3(new Runnable() { // from class: org.telegram.messenger.lb
                @Override // java.lang.Runnable
                public final void run() {
                    ns.f(i7).k(ns.W1, str, Long.valueOf(j3), Long.valueOf(j10), Boolean.valueOf(z10));
                }
            });
        }
    }
}
