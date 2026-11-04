package org.telegram.messenger;

import android.os.SystemClock;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class jb {
    public final /* synthetic */ int a;
    public final /* synthetic */ zb b;

    public jb(zb zbVar, int i3) {
        this.b = zbVar;
        this.a = i3;
    }

    public final void a(y8 y8Var, final String str, final long j10, final long j11, final boolean z10) {
        this.b.u.put(str, new long[]{j10, j11});
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j12 = y8Var.S;
        if (j12 == 0 || j12 < elapsedRealtime - 100 || j10 == j11) {
            y8Var.S = elapsedRealtime;
            final int i3 = this.a;
            g0.h3(new Runnable() { // from class: org.telegram.messenger.fb
                @Override // java.lang.Runnable
                public final void run() {
                    hs.f(i3).k(hs.W1, str, Long.valueOf(j10), Long.valueOf(j11), Boolean.valueOf(z10));
                }
            });
        }
    }
}
