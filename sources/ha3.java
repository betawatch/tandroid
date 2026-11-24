// default package

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class ha3 extends i44 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;
    public static final ha3 w;
    public static final long x;

    static {
        Long l;
        ha3 ha3Var = new ha3();
        w = ha3Var;
        ha3Var.g(false);
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        x = TimeUnit.MILLISECONDS.toNanos(l.longValue());
    }

    @Override // i44, dd3
    public final no3 a(long j, nob nobVar, sw2 sw2Var) {
        long j2 = j > 0 ? j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j : 0L;
        if (j2 >= 4611686018427387903L) {
            return sj7.a;
        }
        long nanoTime = System.nanoTime();
        f44 f44Var = new f44(j2 + nanoTime, nobVar);
        p(nanoTime, f44Var);
        return f44Var;
    }

    @Override // i44
    public final void j(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.j(runnable);
    }

    @Override // i44
    public final Thread m() {
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
                thread.setContextClassLoader(w.getClass().getClassLoader());
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    @Override // i44
    public final void o(long j, g44 g44Var) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    public final synchronized void q() {
        int i = debugStatus;
        if (i == 2 || i == 3) {
            debugStatus = 3;
            Unsafe unsafe = ex.a;
            unsafe.putObjectVolatile(this, i44.r, (Object) null);
            unsafe.putObjectVolatile(this, i44.h, (Object) null);
            notifyAll();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean n;
        dnb.a.set(this);
        try {
            synchronized (this) {
                int i = debugStatus;
                if (i == 2 || i == 3) {
                    _thread = null;
                    q();
                    if (n()) {
                    }
                } else {
                    debugStatus = 1;
                    notifyAll();
                    long j = Long.MAX_VALUE;
                    while (true) {
                        Thread.interrupted();
                        long h = h();
                        if (h == Long.MAX_VALUE) {
                            long nanoTime = System.nanoTime();
                            if (j == Long.MAX_VALUE) {
                                j = x + nanoTime;
                            }
                            long j2 = j - nanoTime;
                            if (j2 <= 0) {
                                _thread = null;
                                q();
                                if (n()) {
                                    return;
                                }
                            } else if (h > j2) {
                                h = j2;
                            }
                        } else {
                            j = Long.MAX_VALUE;
                        }
                        if (h > 0) {
                            int i2 = debugStatus;
                            if (!(i2 == 2 || i2 == 3)) {
                                LockSupport.parkNanos(this, h);
                            } else if (n) {
                                return;
                            }
                        }
                    }
                }
            }
        } finally {
            _thread = null;
            q();
            if (!n()) {
                m();
            }
        }
    }

    @Override // i44, d44
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // vw2
    public final String toString() {
        return "DefaultExecutor";
    }
}
