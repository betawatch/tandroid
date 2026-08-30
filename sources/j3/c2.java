package j3;

import android.os.Looper;
import android.os.SystemClock;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class c2 {
    public final b2 a;
    public final k0 b;
    public final h5.y c;
    public int d;
    public Object e;
    public final Looper f;
    public boolean g;
    public boolean h;
    public boolean i;

    public c2(k0 k0Var, b2 b2Var, o2 o2Var, int i10, h5.y yVar, Looper looper) {
        this.b = k0Var;
        this.a = b2Var;
        this.f = looper;
        this.c = yVar;
    }

    public final synchronized void a(long j10) {
        boolean z4;
        h5.a.i(this.g);
        h5.a.i(this.f.getThread() != Thread.currentThread());
        this.c.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime() + j10;
        while (true) {
            z4 = this.i;
            if (z4 || j10 <= 0) {
                break;
            }
            this.c.getClass();
            wait(j10);
            this.c.getClass();
            j10 = elapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (!z4) {
            throw new TimeoutException("Message delivery timed out.");
        }
    }

    public final synchronized void b(boolean z4) {
        this.h = z4 | this.h;
        this.i = true;
        notifyAll();
    }

    public final void c() {
        h5.a.i(!this.g);
        this.g = true;
        k0 k0Var = this.b;
        synchronized (k0Var) {
            if (!k0Var.L && k0Var.s.getThread().isAlive()) {
                k0Var.n.a(14, this).b();
                return;
            }
            h5.a.K("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            b(false);
        }
    }
}
