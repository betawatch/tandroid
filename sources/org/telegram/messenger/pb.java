package org.telegram.messenger;

import android.os.SystemClock;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
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
            g0.g3(new Runnable() { // from class: org.telegram.messenger.lb
                @Override // java.lang.Runnable
                public final void run() {
                    ls.f(i7).k(ls.W1, str, Long.valueOf(j3), Long.valueOf(j10), Boolean.valueOf(z10));
                }
            });
        }
    }
}
