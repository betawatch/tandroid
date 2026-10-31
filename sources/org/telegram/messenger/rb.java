package org.telegram.messenger;

import android.os.SystemClock;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class rb {
    public final /* synthetic */ int a;
    public final /* synthetic */ hc b;

    public rb(hc hcVar, int i10) {
        this.b = hcVar;
        this.a = i10;
    }

    public final void a(d9 d9Var, final String str, final long j10, final long j11, final boolean z10) {
        this.b.u.put(str, new long[]{j10, j11});
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j12 = d9Var.S;
        if (j12 == 0 || j12 < elapsedRealtime - 100 || j10 == j11) {
            d9Var.S = elapsedRealtime;
            final int i10 = this.a;
            i0.g3(new Runnable() { // from class: org.telegram.messenger.mb
                @Override // java.lang.Runnable
                public final void run() {
                    zs.f(i10).k(zs.W1, str, Long.valueOf(j10), Long.valueOf(j11), Boolean.valueOf(z10));
                }
            });
        }
    }
}
