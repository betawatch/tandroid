package h3;

import android.os.Looper;
import android.os.SystemClock;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class e2 {
    public final d2 a;
    public final q0 b;
    public final d5.a0 c;
    public int d;
    public Object e;
    public final Looper f;
    public boolean g;
    public boolean h;
    public boolean i;

    public e2(q0 q0Var, d2 d2Var, r2 r2Var, int i9, d5.a0 a0Var, Looper looper) {
        this.b = q0Var;
        this.a = d2Var;
        this.f = looper;
        this.c = a0Var;
    }

    public final synchronized void a(long j10) {
        boolean z10;
        d5.a.i(this.g);
        d5.a.i(this.f.getThread() != Thread.currentThread());
        this.c.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime() + j10;
        while (true) {
            z10 = this.i;
            if (z10 || j10 <= 0) {
                break;
            }
            this.c.getClass();
            wait(j10);
            this.c.getClass();
            j10 = elapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (!z10) {
            throw new TimeoutException("Message delivery timed out.");
        }
    }

    public final synchronized void b(boolean z10) {
        this.h = z10 | this.h;
        this.i = true;
        notifyAll();
    }

    public final void c() {
        d5.a.i(!this.g);
        this.g = true;
        q0 q0Var = this.b;
        synchronized (q0Var) {
            if (!q0Var.K && q0Var.s.getThread().isAlive()) {
                q0Var.n.a(14, this).b();
                return;
            }
            d5.a.K("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            b(false);
        }
    }
}
