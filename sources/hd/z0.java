package hd;

import java.lang.reflect.Method;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class z0 extends y0 implements k0 {
    public final Executor c;

    public z0(Executor executor) {
        Method method;
        this.c = executor;
        Method method2 = md.c.a;
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor instanceof ScheduledThreadPoolExecutor ? (ScheduledThreadPoolExecutor) executor : null;
            if (scheduledThreadPoolExecutor != null && (method = md.c.a) != null) {
                method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // hd.k0
    public final p0 a(long j10, f2 f2Var, qc.h hVar) {
        Executor executor = this.c;
        ScheduledFuture<?> scheduledFuture = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFuture = scheduledExecutorService.schedule(f2Var, j10, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e10) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e10);
                f0.e(hVar, cancellationException);
            }
        }
        return scheduledFuture != null ? new o0(scheduledFuture) : g0.s.a(j10, f2Var, hVar);
    }

    @Override // hd.k0
    public final void b(long j10, m mVar) {
        Executor executor = this.c;
        ScheduledFuture<?> scheduledFuture = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            androidx.biometric.j jVar = new androidx.biometric.j(this, mVar, false, 19);
            qc.h hVar = mVar.e;
            try {
                scheduledFuture = scheduledExecutorService.schedule(jVar, j10, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e10) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e10);
                f0.e(hVar, cancellationException);
            }
        }
        if (scheduledFuture != null) {
            mVar.v(new j(scheduledFuture, 0));
        } else {
            g0.s.b(j10, mVar);
        }
    }

    @Override // hd.a0
    public final void c(qc.h hVar, Runnable runnable) {
        try {
            this.c.execute(runnable);
        } catch (RejectedExecutionException e10) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e10);
            f0.e(hVar, cancellationException);
            n0.b.c(hVar, runnable);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.c;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof z0) && ((z0) obj).c == this.c;
    }

    public final int hashCode() {
        return System.identityHashCode(this.c);
    }

    @Override // hd.a0
    public final String toString() {
        return this.c.toString();
    }
}
