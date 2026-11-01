package org.telegram.messenger;

import android.os.SystemClock;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class sb {
    public final /* synthetic */ int a;
    public final /* synthetic */ ic b;

    public sb(ic icVar, int i10) {
        this.b = icVar;
        this.a = i10;
    }

    public final void a(d9 d9Var, final String str, final long j10, final long j11, final boolean z10) {
        this.b.u.put(str, new long[]{j10, j11});
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j12 = d9Var.S;
        if (j12 == 0 || j12 < elapsedRealtime - 100 || j10 == j11) {
            d9Var.S = elapsedRealtime;
            final int i10 = this.a;
            i0.g3(new Runnable() { // from class: org.telegram.messenger.nb
                @Override // java.lang.Runnable
                public final void run() {
                    at.f(i10).k(at.W1, str, Long.valueOf(j10), Long.valueOf(j11), Boolean.valueOf(z10));
                }
            });
        }
    }
}
