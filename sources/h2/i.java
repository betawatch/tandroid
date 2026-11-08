package h2;

import android.os.SystemClock;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class i {
    public final g0 a;
    public boolean b;

    public i() {
        this(g0.a);
    }

    public final synchronized void a() {
        while (!this.b) {
            this.a.getClass();
            wait();
        }
    }

    public final synchronized void b() {
        boolean z9 = false;
        while (!this.b) {
            try {
                this.a.getClass();
                wait();
            } catch (InterruptedException unused) {
                z9 = true;
            }
        }
        if (z9) {
            Thread.currentThread().interrupt();
        }
    }

    public final synchronized boolean c(long j3) {
        if (j3 <= 0) {
            return this.b;
        }
        this.a.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = j3 + elapsedRealtime;
        if (j10 < elapsedRealtime) {
            b();
        } else {
            boolean z9 = false;
            while (!this.b && elapsedRealtime < j10) {
                try {
                    this.a.getClass();
                    wait(j10 - elapsedRealtime);
                } catch (InterruptedException unused) {
                    z9 = true;
                }
                this.a.getClass();
                elapsedRealtime = SystemClock.elapsedRealtime();
            }
            if (z9) {
                Thread.currentThread().interrupt();
            }
        }
        return this.b;
    }

    public final synchronized void d() {
        this.b = false;
    }

    public final synchronized boolean e() {
        if (this.b) {
            return false;
        }
        this.b = true;
        notifyAll();
        return true;
    }

    public i(g0 g0Var) {
        this.a = g0Var;
    }
}
