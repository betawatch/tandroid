package org.telegram.messenger;

import android.os.SystemClock;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final class ob {
    public final /* synthetic */ int a;
    public final /* synthetic */ ec b;

    public ob(ec ecVar, int i7) {
        this.b = ecVar;
        this.a = i7;
    }

    public final void a(y8 y8Var, final String str, final long j3, final long j10, final boolean z10) {
        this.b.u.put(str, new long[]{j3, j10});
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j11 = y8Var.S;
        if (j11 == 0 || j11 < elapsedRealtime - 100 || j3 == j10) {
            y8Var.S = elapsedRealtime;
            final int i7 = this.a;
            g0.g3(new Runnable() { // from class: org.telegram.messenger.kb
                @Override // java.lang.Runnable
                public final void run() {
                    ks.f(i7).k(ks.W1, str, Long.valueOf(j3), Long.valueOf(j10), Boolean.valueOf(z10));
                }
            });
        }
    }
}
