package com.google.android.gms.internal.play_billing;

import f7.b6;
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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class g4 implements t0 {
    public static final boolean d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger e = Logger.getLogger(g4.class.getName());
    public static final b6 f;
    public static final Object h;
    public volatile Object a;
    public volatile v2 b;
    public volatile f4 c;

    static {
        b6 e4Var;
        try {
            e4Var = new s3(AtomicReferenceFieldUpdater.newUpdater(f4.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(f4.class, f4.class, "b"), AtomicReferenceFieldUpdater.newUpdater(g4.class, f4.class, "c"), AtomicReferenceFieldUpdater.newUpdater(g4.class, v2.class, "b"), AtomicReferenceFieldUpdater.newUpdater(g4.class, Object.class, "a"));
            th = null;
        } catch (Throwable th) {
            th = th;
            e4Var = new e4();
        }
        Throwable th2 = th;
        f = e4Var;
        if (th2 != null) {
            e.logp(Level.SEVERE, "com.android.billingclient.util.concurrent.AbstractResolvableFuture", "<clinit>", "SafeAtomicHelper is broken!", th2);
        }
        h = new Object();
    }

    public static void c(g4 g4Var) {
        f4 f4Var;
        b6 b6Var;
        v2 v2Var;
        v2 v2Var2;
        v2 v2Var3;
        do {
            f4Var = g4Var.c;
            b6Var = f;
        } while (!b6Var.e(g4Var, f4Var, f4.c));
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
        } while (!b6Var.c(g4Var, v2Var2, v2.d));
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
        } catch (RuntimeException e10) {
            e.logp(Level.SEVERE, "com.android.billingclient.util.concurrent.AbstractResolvableFuture", "executeListener", j3.r0.o("RuntimeException while executing runnable ", String.valueOf(runnable), " with executor ", String.valueOf(executor)), (Throwable) e10);
        }
    }

    public static final Object g(Object obj) {
        if (obj instanceof j1) {
            Throwable th = ((j1) obj).a;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
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
            return aa.d.n(((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS), "remaining delay=[", " ms]");
        }
        return null;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        Object obj = this.a;
        if (obj != null) {
            return false;
        }
        if (!f.d(this, obj, d ? new j1(new CancellationException("Future.cancel() was called.")) : z10 ? j1.b : j1.c)) {
            return false;
        }
        c(this);
        return true;
    }

    public final void d(StringBuilder sb2) {
        Object obj;
        boolean z10 = false;
        while (true) {
            try {
                try {
                    obj = get();
                    break;
                } catch (InterruptedException unused) {
                    z10 = true;
                } catch (Throwable th) {
                    if (z10) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (CancellationException unused2) {
                sb2.append("CANCELLED");
                return;
            } catch (RuntimeException e10) {
                sb2.append("UNKNOWN, cause=[");
                sb2.append(e10.getClass());
                sb2.append(" thrown from get()]");
                return;
            } catch (ExecutionException e11) {
                sb2.append("FAILURE, cause=[");
                sb2.append(e11.getCause());
                sb2.append("]");
                return;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        sb2.append("SUCCESS, result=[");
        sb2.append(obj == this ? "this future" : String.valueOf(obj));
        sb2.append("]");
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
                b6 b6Var = f;
                b6Var.a(f4Var3, f4Var);
                if (b6Var.e(this, f4Var, f4Var3)) {
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
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("[status=");
        if (this.a instanceof j1) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            d(sb2);
        } else {
            try {
                concat = b();
            } catch (RuntimeException e10) {
                concat = "Exception thrown from implementation: ".concat(String.valueOf(e10.getClass()));
            }
            if (concat != null && !concat.isEmpty()) {
                sb2.append("PENDING, info=[");
                sb2.append(concat);
                sb2.append("]");
            } else if (isDone()) {
                d(sb2);
            } else {
                sb2.append("PENDING");
            }
        }
        sb2.append("]");
        return sb2.toString();
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
                        b6 b6Var = f;
                        b6Var.a(f4Var3, f4Var);
                        if (b6Var.e(this, f4Var, f4Var3)) {
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
                boolean z10 = true;
                if (convert != 0 && nanos2 <= 1000) {
                    z10 = false;
                }
                if (convert > 0) {
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
            throw new TimeoutException(aa.d.z(str, " for ", g4Var));
        }
        throw new InterruptedException();
    }
}
