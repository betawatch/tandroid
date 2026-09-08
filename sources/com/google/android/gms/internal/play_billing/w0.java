package com.google.android.gms.internal.play_billing;

import j$.util.Objects;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import org.telegram.messenger.BuildConfig;
import v7.x5;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class w0 extends l0 implements g0 {
    public t0 n;
    public ScheduledFuture r;

    public static Object e(Object obj) {
        if (obj instanceof b0) {
            Throwable th2 = ((b0) obj).b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th2);
            throw cancellationException;
        }
        if (!(obj instanceof e0)) {
            if (obj == l0.d) {
                return null;
            }
            return obj;
        }
        Throwable th3 = ((e0) obj).a;
        if (th3 != null) {
            throw new ExecutionException(th3);
        }
        l0.e.b().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "getDoneValue", "Failure.exception is unexpectedly null.");
        throw new ExecutionException(e0.c.a);
    }

    public static boolean g(Object obj) {
        return !(obj instanceof c0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Object h(t0 t0Var) {
        Object obj;
        Throwable c10;
        if (t0Var instanceof g0) {
            Object obj2 = ((w0) t0Var).a;
            if (obj2 instanceof b0) {
                b0 b0Var = (b0) obj2;
                if (b0Var.a) {
                    Throwable th2 = b0Var.b;
                    obj2 = th2 != null ? new b0(th2, false) : b0.d;
                }
            }
            Objects.requireNonNull(obj2);
            return obj2;
        }
        if ((t0Var instanceof x0) && (c10 = ((x0) t0Var).c()) != null) {
            return new e0(c10);
        }
        boolean isCancelled = t0Var.isCancelled();
        if ((!l0.f) && isCancelled) {
            b0 b0Var2 = b0.d;
            Objects.requireNonNull(b0Var2);
            return b0Var2;
        }
        boolean z10 = false;
        while (true) {
            try {
                try {
                    try {
                        obj = t0Var.get();
                        break;
                    } catch (Error e7) {
                        e = e7;
                        return new e0(e);
                    }
                } catch (InterruptedException unused) {
                    z10 = true;
                } catch (Throwable th3) {
                    if (z10) {
                        Thread.currentThread().interrupt();
                    }
                    throw th3;
                }
            } catch (Error | Exception e10) {
                e = e10;
                return new e0(e);
            } catch (CancellationException e11) {
                return !isCancelled ? new e0(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(t0Var)), e11)) : new b0(e11, false);
            } catch (ExecutionException e12) {
                return isCancelled ? new b0(new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(t0Var)), e12), false) : new e0(e12.getCause());
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        return isCancelled ? new b0(new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(t0Var))), false) : obj == null ? l0.d : obj;
    }

    public static void j(w0 w0Var) {
        f0 f0Var;
        f0 f0Var2 = null;
        while (true) {
            w0Var.getClass();
            for (k0 b10 = l0.h.b(w0Var); b10 != null; b10 = b10.b) {
                Thread thread = b10.a;
                if (thread != null) {
                    b10.a = null;
                    LockSupport.unpark(thread);
                }
            }
            t0 t0Var = w0Var.n;
            if ((w0Var.a instanceof b0) & (t0Var != null)) {
                Object obj = w0Var.a;
                t0Var.cancel((obj instanceof b0) && ((b0) obj).a);
            }
            ScheduledFuture scheduledFuture = w0Var.r;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            w0Var.n = null;
            w0Var.r = null;
            f0 f0Var3 = f0Var2;
            f0 a2 = l0.h.a(w0Var);
            f0 f0Var4 = f0Var3;
            while (a2 != null) {
                f0 f0Var5 = a2.c;
                a2.c = f0Var4;
                f0Var4 = a2;
                a2 = f0Var5;
            }
            while (f0Var4 != null) {
                Runnable runnable = f0Var4.a;
                f0Var = f0Var4.c;
                Objects.requireNonNull(runnable);
                if (runnable instanceof c0) {
                    c0 c0Var = (c0) runnable;
                    w0Var = c0Var.a;
                    if (w0Var.a == c0Var) {
                        if (l0.h.f(w0Var, c0Var, h(c0Var.b))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = f0Var4.b;
                    Objects.requireNonNull(executor);
                    k(runnable, executor);
                }
                f0Var4 = f0Var;
            }
            return;
            f0Var2 = f0Var;
        }
    }

    public static void k(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e7) {
            l0.e.b().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", com.google.android.gms.internal.vision.e2.j("RuntimeException while executing runnable ", String.valueOf(runnable), " with executor ", String.valueOf(executor)), (Throwable) e7);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.t0
    public final void b(Runnable runnable, Executor executor) {
        f0 f0Var;
        f0 f0Var2 = f0.d;
        if (executor == null) {
            throw new NullPointerException("Executor was null.");
        }
        if (!isDone() && (f0Var = this.b) != f0Var2) {
            f0 f0Var3 = new f0(runnable, executor);
            do {
                f0Var3.c = f0Var;
                if (l0.h.e(this, f0Var, f0Var3)) {
                    return;
                } else {
                    f0Var = this.b;
                }
            } while (f0Var != f0Var2);
        }
        k(runnable, executor);
    }

    @Override // com.google.android.gms.internal.play_billing.x0
    public final Throwable c() {
        if (!(this instanceof g0)) {
            return null;
        }
        Object obj = this.a;
        if (obj instanceof e0) {
            return ((e0) obj).a;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0056, code lost:
    
        return true;
     */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean cancel(boolean z10) {
        b0 b0Var;
        Object obj = this.a;
        if (!(obj instanceof c0) && !(obj == null)) {
            return false;
        }
        if (l0.f) {
            b0Var = new b0(new CancellationException("Future.cancel() was called."), z10);
        } else {
            b0Var = z10 ? b0.c : b0.d;
            Objects.requireNonNull(b0Var);
        }
        boolean z11 = false;
        w0 w0Var = this;
        while (true) {
            if (l0.h.f(w0Var, obj, b0Var)) {
                j(w0Var);
                if (!(obj instanceof c0)) {
                    break;
                }
                t0 t0Var = ((c0) obj).b;
                if (!(t0Var instanceof g0)) {
                    t0Var.cancel(z10);
                    break;
                }
                w0Var = (w0) t0Var;
                obj = w0Var.a;
                if (!(obj == null) && !(obj instanceof c0)) {
                    break;
                }
                z11 = true;
            } else {
                obj = w0Var.a;
                if (g(obj)) {
                    return z11;
                }
            }
        }
    }

    public final String f() {
        t0 t0Var = this.n;
        ScheduledFuture scheduledFuture = this.r;
        if (t0Var == null) {
            return null;
        }
        String p5 = a4.a.p("inputFuture=[", t0Var.toString(), "]");
        if (scheduledFuture == null) {
            return p5;
        }
        long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
        if (delay <= 0) {
            return p5;
        }
        return p5 + ", remaining delay=[" + delay + " ms]";
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        k0 k0Var = k0.c;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.a;
        if ((obj2 != null) && g(obj2)) {
            return e(obj2);
        }
        k0 k0Var2 = this.c;
        if (k0Var2 != k0Var) {
            k0 k0Var3 = new k0();
            do {
                x5 x5Var = l0.h;
                x5Var.c(k0Var3, k0Var2);
                if (x5Var.g(this, k0Var2, k0Var3)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            d(k0Var3);
                            throw new InterruptedException();
                        }
                        obj = this.a;
                    } while (!((obj != null) & g(obj)));
                    return e(obj);
                }
                k0Var2 = this.c;
            } while (k0Var2 != k0Var);
        }
        Object obj3 = this.a;
        Objects.requireNonNull(obj3);
        return e(obj3);
    }

    public final void i(StringBuilder sb2) {
        Object obj;
        boolean z10 = false;
        while (true) {
            try {
                try {
                    obj = get();
                    break;
                } catch (InterruptedException unused) {
                    z10 = true;
                } catch (Throwable th2) {
                    if (z10) {
                        Thread.currentThread().interrupt();
                    }
                    throw th2;
                }
            } catch (CancellationException unused2) {
                sb2.append("CANCELLED");
                return;
            } catch (ExecutionException e7) {
                sb2.append("FAILURE, cause=[");
                sb2.append(e7.getCause());
                sb2.append("]");
                return;
            } catch (Exception e10) {
                sb2.append("UNKNOWN, cause=[");
                sb2.append(e10.getClass());
                sb2.append(" thrown from get()]");
                return;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        sb2.append("SUCCESS, result=[");
        if (obj == null) {
            sb2.append(BuildConfig.BETA_URL);
        } else if (obj == this) {
            sb2.append("this future");
        } else {
            sb2.append(obj.getClass().getName());
            sb2.append("@");
            sb2.append(Integer.toHexString(System.identityHashCode(obj)));
        }
        sb2.append("]");
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.a instanceof b0;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.a;
        return (obj != null) & g(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a9, code lost:
    
        if (r3.isEmpty() != false) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        String concat;
        StringBuilder sb2 = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb2.append(getClass().getSimpleName());
        } else {
            sb2.append(getClass().getName());
        }
        sb2.append('@');
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("[status=");
        if (this.a instanceof b0) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            i(sb2);
        } else {
            int length = sb2.length();
            sb2.append("PENDING");
            Object obj = this.a;
            if (obj instanceof c0) {
                sb2.append(", setFuture=[");
                t0 t0Var = ((c0) obj).b;
                try {
                    if (t0Var == this) {
                        sb2.append("this future");
                    } else {
                        sb2.append(t0Var);
                    }
                } catch (Throwable th2) {
                    if ((th2 instanceof Error) && !(th2 instanceof StackOverflowError)) {
                        throw th2;
                    }
                    sb2.append("Exception thrown from implementation: ");
                    sb2.append(th2.getClass());
                }
                sb2.append("]");
            } else {
                try {
                    concat = f();
                    if (concat != null) {
                    }
                    concat = null;
                } catch (Throwable th3) {
                    if ((th3 instanceof Error) && !(th3 instanceof StackOverflowError)) {
                        throw th3;
                    }
                    concat = "Exception thrown from implementation: ".concat(String.valueOf(th3.getClass()));
                }
                if (concat != null) {
                    sb2.append(", info=[");
                    sb2.append(concat);
                    sb2.append("]");
                }
            }
            if (isDone()) {
                sb2.delete(length, sb2.length());
                i(sb2);
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00cd  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00c0 -> B:34:0x0080). Please report as a decompilation issue!!! */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(long j3, TimeUnit timeUnit) {
        long j10;
        long nanoTime;
        k0 k0Var = k0.c;
        long nanos = timeUnit.toNanos(j3);
        if (!Thread.interrupted()) {
            Object obj = this.a;
            if ((obj != null) & g(obj)) {
                return e(obj);
            }
            long j11 = 0;
            long nanoTime2 = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                k0 k0Var2 = this.c;
                if (k0Var2 != k0Var) {
                    k0 k0Var3 = new k0();
                    while (true) {
                        x5 x5Var = l0.h;
                        x5Var.c(k0Var3, k0Var2);
                        if (x5Var.g(this, k0Var2, k0Var3)) {
                            j10 = j11;
                            while (true) {
                                LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.a;
                                    if ((obj2 != null) & g(obj2)) {
                                        return e(obj2);
                                    }
                                    nanoTime = nanoTime2 - System.nanoTime();
                                    if (nanoTime < 1000) {
                                        d(k0Var3);
                                        break;
                                    }
                                    nanos = nanoTime;
                                } else {
                                    d(k0Var3);
                                    throw new InterruptedException();
                                }
                            }
                        } else {
                            long j12 = j11;
                            k0Var2 = this.c;
                            if (k0Var2 == k0Var) {
                                break;
                            }
                            j11 = j12;
                        }
                    }
                    nanos = nanoTime;
                    if (nanos > j10) {
                        Object obj3 = this.a;
                        if ((obj3 != null) & g(obj3)) {
                            return e(obj3);
                        }
                        if (!Thread.interrupted()) {
                            nanoTime = nanoTime2 - System.nanoTime();
                            nanos = nanoTime;
                            if (nanos > j10) {
                            }
                        } else {
                            throw new InterruptedException();
                        }
                    } else {
                        String w0Var = toString();
                        String obj4 = timeUnit.toString();
                        Locale locale = Locale.ROOT;
                        String lowerCase = obj4.toLowerCase(locale);
                        String str = "Waited " + j3 + " " + timeUnit.toString().toLowerCase(locale);
                        if (nanos + 1000 < j10) {
                            String concat = str.concat(" (plus ");
                            long j13 = -nanos;
                            long convert = timeUnit.convert(j13, TimeUnit.NANOSECONDS);
                            long nanos2 = j13 - timeUnit.toNanos(convert);
                            boolean z10 = convert == j10 || nanos2 > 1000;
                            if (convert > j10) {
                                String str2 = concat + convert + " " + lowerCase;
                                if (z10) {
                                    str2 = str2.concat(",");
                                }
                                concat = str2.concat(" ");
                            }
                            if (z10) {
                                concat = concat + nanos2 + " nanoseconds ";
                            }
                            str = concat.concat("delay)");
                        }
                        if (isDone()) {
                            throw new TimeoutException(str.concat(" but future completed as timeout expired"));
                        }
                        throw new TimeoutException(a4.a.C(str, " for ", w0Var));
                    }
                }
                Object obj5 = this.a;
                Objects.requireNonNull(obj5);
                return e(obj5);
            }
            j10 = 0;
            if (nanos > j10) {
            }
        } else {
            throw new InterruptedException();
        }
    }
}
