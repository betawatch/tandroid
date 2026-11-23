package org.telegram.messenger;

import android.os.SystemClock;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
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
