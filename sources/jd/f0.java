package jd;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class f0 extends v0 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;
    public static final f0 s;
    public static final long v;

    static {
        Long l10;
        f0 f0Var = new f0();
        s = f0Var;
        f0Var.h(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l10 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l10 = 1000L;
        }
        v = timeUnit.toNanos(l10.longValue());
    }

    @Override // jd.v0, jd.j0
    public final o0 a(long j10, e2 e2Var, sc.h hVar) {
        long j11 = j10 > 0 ? j10 >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j10 : 0L;
        if (j11 >= 4611686018427387903L) {
            return w1.a;
        }
        long nanoTime = System.nanoTime();
        s0 s0Var = new s0(j11 + nanoTime, e2Var);
        o(nanoTime, s0Var);
        return s0Var;
    }

    @Override // jd.w0
    public final Thread g() {
        Thread thread;
        Thread thread2 = _thread;
        if (thread2 != null) {
            return thread2;
        }
        synchronized (this) {
            thread = _thread;
            if (thread == null) {
                thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                _thread = thread;
                thread.setContextClassLoader(f0.class.getClassLoader());
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    @Override // jd.w0
    public final void k(long j10, t0 t0Var) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // jd.v0
    public final void l(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.l(runnable);
    }

    public final synchronized void p() {
        int i10 = debugStatus;
        if (i10 == 2 || i10 == 3) {
            debugStatus = 3;
            v0.h.set(this, null);
            v0.n.set(this, null);
            notifyAll();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean n10;
        c2.a.set(this);
        try {
            synchronized (this) {
                int i10 = debugStatus;
                if (i10 == 2 || i10 == 3) {
                    if (n10) {
                        return;
                    } else {
                        return;
                    }
                }
                debugStatus = 1;
                notifyAll();
                long j10 = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long i11 = i();
                    if (i11 == Long.MAX_VALUE) {
                        long nanoTime = System.nanoTime();
                        if (j10 == Long.MAX_VALUE) {
                            j10 = v + nanoTime;
                        }
                        long j11 = j10 - nanoTime;
                        if (j11 <= 0) {
                            _thread = null;
                            p();
                            if (n()) {
                                return;
                            }
                            g();
                            return;
                        }
                        if (i11 > j11) {
                            i11 = j11;
                        }
                    } else {
                        j10 = Long.MAX_VALUE;
                    }
                    if (i11 > 0) {
                        int i12 = debugStatus;
                        if (i12 == 2 || i12 == 3) {
                            _thread = null;
                            p();
                            if (n()) {
                                return;
                            }
                            g();
                            return;
                        }
                        LockSupport.parkNanos(this, i11);
                    }
                }
            }
        } finally {
            _thread = null;
            p();
            if (!n()) {
                g();
            }
        }
    }

    @Override // jd.v0, jd.w0
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }
}
