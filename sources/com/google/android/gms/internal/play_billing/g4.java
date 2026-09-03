package com.google.android.gms.internal.play_billing;

import j7.q6;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public class g4 implements t0 {
    public static final boolean d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger e = Logger.getLogger(g4.class.getName());
    public static final q6 f;
    public static final Object h;
    public volatile Object a;
    public volatile v2 b;
    public volatile f4 c;

    static {
        q6 e4Var;
        try {
            e4Var = new s3(AtomicReferenceFieldUpdater.newUpdater(f4.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(f4.class, f4.class, "b"), AtomicReferenceFieldUpdater.newUpdater(g4.class, f4.class, "c"), AtomicReferenceFieldUpdater.newUpdater(g4.class, v2.class, "b"), AtomicReferenceFieldUpdater.newUpdater(g4.class, Object.class, "a"));
            th = null;
        } catch (Throwable th2) {
            th = th2;
            e4Var = new e4();
        }
        Throwable th3 = th;
        f = e4Var;
        if (th3 != null) {
            e.logp(Level.SEVERE, "com.android.billingclient.util.concurrent.AbstractResolvableFuture", "<clinit>", "SafeAtomicHelper is broken!", th3);
        }
        h = new Object();
    }

    public static void c(g4 g4Var) {
        f4 f4Var;
        q6 q6Var;
        v2 v2Var;
        v2 v2Var2;
        v2 v2Var3;
        do {
            f4Var = g4Var.c;
            q6Var = f;
        } while (!q6Var.e(g4Var, f4Var, f4.c));
        while (true) {
            v2Var = null;
            if (f4Var == null) {
                break;
            }
            Thread thread = f4Var.a;
            if (thread != null) {
                f4Var.a = null;
                LockSupport.unpark(thread);
            }
            f4Var = f4Var.b;
        }
        do {
            v2Var2 = g4Var.b;
        } while (!q6Var.c(g4Var, v2Var2, v2.d));
        while (true) {
            v2Var3 = v2Var;
            v2Var = v2Var2;
            if (v2Var == null) {
                break;
            }
            v2Var2 = v2Var.c;
            v2Var.c = v2Var3;
        }
        while (v2Var3 != null) {
            Runnable runnable = v2Var3.a;
            v2 v2Var4 = v2Var3.c;
            e(runnable, v2Var3.b);
            v2Var3 = v2Var4;
        }
    }

    public static void e(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e6) {
            e.logp(Level.SEVERE, "com.android.billingclient.util.concurrent.AbstractResolvableFuture", "executeListener", e2.c.k("RuntimeException while executing runnable ", String.valueOf(runnable), " with executor ", String.valueOf(executor)), (Throwable) e6);
        }
    }

    public static final Object g(Object obj) {
        if (obj instanceof j1) {
            Throwable th2 = ((j1) obj).a;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th2);
            throw cancellationException;
        }
        if (obj instanceof g2) {
            throw new ExecutionException(((g2) obj).a);
        }
        if (obj == h) {
            return null;
        }
        return obj;
    }

    @Override // com.google.android.gms.internal.play_billing.t0
    public final void a(Runnable runnable, Executor executor) {
        executor.getClass();
        v2 v2Var = this.b;
        v2 v2Var2 = v2.d;
        if (v2Var != v2Var2) {
            v2 v2Var3 = new v2(runnable, executor);
            do {
                v2Var3.c = v2Var;
                if (f.c(this, v2Var, v2Var3)) {
                    return;
                } else {
                    v2Var = this.b;
                }
            } while (v2Var != v2Var2);
        }
        e(runnable, executor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String b() {
        if (this instanceof ScheduledFuture) {
            return e2.c.i(((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS), "remaining delay=[", " ms]");
        }
        return null;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z4) {
        Object obj = this.a;
        if (obj != null) {
            return false;
        }
        if (!f.d(this, obj, d ? new j1(new CancellationException("Future.cancel() was called.")) : z4 ? j1.b : j1.c)) {
            return false;
        }
        c(this);
        return true;
    }

    public final void d(StringBuilder sb) {
        Object obj;
        boolean z4 = false;
        while (true) {
            try {
                try {
                    obj = get();
                    break;
                } catch (InterruptedException unused) {
                    z4 = true;
                } catch (Throwable th2) {
                    if (z4) {
                        Thread.currentThread().interrupt();
                    }
                    throw th2;
                }
            } catch (CancellationException unused2) {
                sb.append("CANCELLED");
                return;
            } catch (RuntimeException e6) {
                sb.append("UNKNOWN, cause=[");
                sb.append(e6.getClass());
                sb.append(" thrown from get()]");
                return;
            } catch (ExecutionException e10) {
                sb.append("FAILURE, cause=[");
                sb.append(e10.getCause());
                sb.append("]");
                return;
            }
        }
        if (z4) {
            Thread.currentThread().interrupt();
        }
        sb.append("SUCCESS, result=[");
        sb.append(obj == this ? "this future" : String.valueOf(obj));
        sb.append("]");
    }

    public final void f(f4 f4Var) {
        f4Var.a = null;
        while (true) {
            f4 f4Var2 = this.c;
            if (f4Var2 != f4.c) {
                f4 f4Var3 = null;
                while (f4Var2 != null) {
                    f4 f4Var4 = f4Var2.b;
                    if (f4Var2.a != null) {
                        f4Var3 = f4Var2;
                    } else if (f4Var3 != null) {
                        f4Var3.b = f4Var4;
                        if (f4Var3.a == null) {
                            break;
                        }
                    } else if (!f.e(this, f4Var2, f4Var4)) {
                        break;
                    }
                    f4Var2 = f4Var4;
                }
                return;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.a;
        if (obj2 != null) {
            return g(obj2);
        }
        f4 f4Var = this.c;
        f4 f4Var2 = f4.c;
        if (f4Var != f4Var2) {
            f4 f4Var3 = new f4();
            do {
                q6 q6Var = f;
                q6Var.a(f4Var3, f4Var);
                if (q6Var.e(this, f4Var, f4Var3)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            f(f4Var3);
                            throw new InterruptedException();
                        }
                        obj = this.a;
                    } while (obj == null);
                    return g(obj);
                }
                f4Var = this.c;
            } while (f4Var != f4Var2);
        }
        return g(this.a);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.a instanceof j1;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.a != null;
    }

    public final String toString() {
        String concat;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.a instanceof j1) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            d(sb);
        } else {
            try {
                concat = b();
            } catch (RuntimeException e6) {
                concat = "Exception thrown from implementation: ".concat(String.valueOf(e6.getClass()));
            }
            if (concat != null && !concat.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(concat);
                sb.append("]");
            } else if (isDone()) {
                d(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j10);
        if (!Thread.interrupted()) {
            Object obj = this.a;
            if (obj != null) {
                return g(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                f4 f4Var = this.c;
                f4 f4Var2 = f4.c;
                if (f4Var != f4Var2) {
                    f4 f4Var3 = new f4();
                    do {
                        q6 q6Var = f;
                        q6Var.a(f4Var3, f4Var);
                        if (q6Var.e(this, f4Var, f4Var3)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.a;
                                    if (obj2 != null) {
                                        return g(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    f(f4Var3);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            f(f4Var3);
                        } else {
                            f4Var = this.c;
                        }
                    } while (f4Var != f4Var2);
                }
                return g(this.a);
            }
            while (nanos > 0) {
                Object obj3 = this.a;
                if (obj3 != null) {
                    return g(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String g4Var = toString();
            String obj4 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = obj4.toLowerCase(locale);
            String str = "Waited " + j10 + " " + timeUnit.toString().toLowerCase(locale);
            if (nanos + 1000 < 0) {
                String concat = str.concat(" (plus ");
                long j11 = -nanos;
                long convert = timeUnit.convert(j11, TimeUnit.NANOSECONDS);
                long nanos2 = j11 - timeUnit.toNanos(convert);
                boolean z4 = true;
                if (convert != 0 && nanos2 <= 1000) {
                    z4 = false;
                }
                if (convert > 0) {
                    String str2 = concat + convert + " " + lowerCase;
                    if (z4) {
                        str2 = str2.concat(",");
                    }
                    concat = str2.concat(" ");
                }
                if (z4) {
                    concat = concat + nanos2 + " nanoseconds ";
                }
                str = concat.concat("delay)");
            }
            if (isDone()) {
                throw new TimeoutException(str.concat(" but future completed as timeout expired"));
            }
            throw new TimeoutException(android.support.v4.media.a.z(str, " for ", g4Var));
        }
        throw new InterruptedException();
    }
}
