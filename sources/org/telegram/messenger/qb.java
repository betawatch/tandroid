package org.telegram.messenger;

import android.os.SystemClock;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class qb {
    public final /* synthetic */ int a;
    public final /* synthetic */ gc b;

    public qb(gc gcVar, int i7) {
        this.b = gcVar;
        this.a = i7;
    }

    public final void a(y8 y8Var, final String str, final long j3, final long j10, final boolean z9) {
        this.b.u.put(str, new long[]{j3, j10});
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j11 = y8Var.S;
        if (j11 == 0 || j11 < elapsedRealtime - 100 || j3 == j10) {
            y8Var.S = elapsedRealtime;
            final int i7 = this.a;
            g0.h3(new Runnable() { // from class: org.telegram.messenger.mb
                @Override // java.lang.Runnable
                public final void run() {
                    qs.f(i7).k(qs.W1, str, Long.valueOf(j3), Long.valueOf(j10), Boolean.valueOf(z9));
                }
            });
        }
    }
}
