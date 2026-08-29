package j3;

import android.os.Looper;
import android.os.SystemClock;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class e2 {
    public final d2 a;
    public final q0 b;
    public final f5.y c;
    public int d;
    public Object e;
    public final Looper f;
    public boolean g;
    public boolean h;
    public boolean i;

    public e2(q0 q0Var, d2 d2Var, r2 r2Var, int i10, f5.y yVar, Looper looper) {
        this.b = q0Var;
        this.a = d2Var;
        this.f = looper;
        this.c = yVar;
    }

    public final synchronized void a(long j10) {
        boolean z10;
        f5.a.i(this.g);
        f5.a.i(this.f.getThread() != Thread.currentThread());
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
        f5.a.i(!this.g);
        this.g = true;
        q0 q0Var = this.b;
        synchronized (q0Var) {
            if (!q0Var.K && q0Var.s.getThread().isAlive()) {
                q0Var.n.a(14, this).b();
                return;
            }
            f5.a.K("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            b(false);
        }
    }
}
