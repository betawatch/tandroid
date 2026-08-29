package com.google.android.gms.internal.play_billing;

import h7.o6;
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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public class f4 implements t0 {
    public static final boolean d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger e = Logger.getLogger(f4.class.getName());
    public static final o6 f;
    public static final Object h;
    public volatile Object a;
    public volatile u2 b;
    public volatile e4 c;

    static {
        o6 d4Var;
        try {
            d4Var = new r3(AtomicReferenceFieldUpdater.newUpdater(e4.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(e4.class, e4.class, "b"), AtomicReferenceFieldUpdater.newUpdater(f4.class, e4.class, "c"), AtomicReferenceFieldUpdater.newUpdater(f4.class, u2.class, "b"), AtomicReferenceFieldUpdater.newUpdater(f4.class, Object.class, "a"));
            th = null;
        } catch (Throwable th2) {
            th = th2;
            d4Var = new d4();
        }
        Throwable th3 = th;
        f = d4Var;
        if (th3 != null) {
            e.logp(Level.SEVERE, "com.android.billingclient.util.concurrent.AbstractResolvableFuture", "<clinit>", "SafeAtomicHelper is broken!", th3);
        }
        h = new Object();
    }

    public static void c(f4 f4Var) {
        e4 e4Var;
        o6 o6Var;
        u2 u2Var;
        u2 u2Var2;
        u2 u2Var3;
        do {
            e4Var = f4Var.c;
            o6Var = f;
        } while (!o6Var.e(f4Var, e4Var, e4.c));
        while (true) {
            u2Var = null;
            if (e4Var == null) {
                break;
            }
            Thread thread = e4Var.a;
            if (thread != null) {
                e4Var.a = null;
                LockSupport.unpark(thread);
            }
            e4Var = e4Var.b;
        }
        do {
            u2Var2 = f4Var.b;
        } while (!o6Var.c(f4Var, u2Var2, u2.d));
        while (true) {
            u2Var3 = u2Var;
            u2Var = u2Var2;
            if (u2Var == null) {
                break;
            }
            u2Var2 = u2Var.c;
            u2Var.c = u2Var3;
        }
        while (u2Var3 != null) {
            Runnable runnable = u2Var3.a;
            u2 u2Var4 = u2Var3.c;
            e(runnable, u2Var3.b);
            u2Var3 = u2Var4;
        }
    }

    public static void e(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            e.logp(Level.SEVERE, "com.android.billingclient.util.concurrent.AbstractResolvableFuture", "executeListener", j7.l1.n("RuntimeException while executing runnable ", String.valueOf(runnable), " with executor ", String.valueOf(executor)), (Throwable) e10);
        }
    }

    public static final Object g(Object obj) {
        if (obj instanceof i1) {
            Throwable th2 = ((i1) obj).a;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th2);
            throw cancellationException;
        }
        if (obj instanceof f2) {
            throw new ExecutionException(((f2) obj).a);
        }
        if (obj == h) {
            return null;
        }
        return obj;
    }

    @Override // com.google.android.gms.internal.play_billing.t0
    public final void a(Runnable runnable, Executor executor) {
        executor.getClass();
        u2 u2Var = this.b;
        u2 u2Var2 = u2.d;
        if (u2Var != u2Var2) {
            u2 u2Var3 = new u2(runnable, executor);
            do {
                u2Var3.c = u2Var;
                if (f.c(this, u2Var, u2Var3)) {
                    return;
                } else {
                    u2Var = this.b;
                }
            } while (u2Var != u2Var2);
        }
        e(runnable, executor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String b() {
        if (this instanceof ScheduledFuture) {
            return com.google.android.recaptcha.internal.a.l(((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS), "remaining delay=[", " ms]");
        }
        return null;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        Object obj = this.a;
        if (obj != null) {
            return false;
        }
        if (!f.d(this, obj, d ? new i1(new CancellationException("Future.cancel() was called.")) : z10 ? i1.b : i1.c)) {
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
                } catch (Throwable th2) {
                    if (z10) {
                        Thread.currentThread().interrupt();
                    }
                    throw th2;
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

    public final void f(e4 e4Var) {
        e4Var.a = null;
        while (true) {
            e4 e4Var2 = this.c;
            if (e4Var2 != e4.c) {
                e4 e4Var3 = null;
                while (e4Var2 != null) {
                    e4 e4Var4 = e4Var2.b;
                    if (e4Var2.a != null) {
                        e4Var3 = e4Var2;
                    } else if (e4Var3 != null) {
                        e4Var3.b = e4Var4;
                        if (e4Var3.a == null) {
                            break;
                        }
                    } else if (!f.e(this, e4Var2, e4Var4)) {
                        break;
                    }
                    e4Var2 = e4Var4;
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
        e4 e4Var = this.c;
        e4 e4Var2 = e4.c;
        if (e4Var != e4Var2) {
            e4 e4Var3 = new e4();
            do {
                o6 o6Var = f;
                o6Var.a(e4Var3, e4Var);
                if (o6Var.e(this, e4Var, e4Var3)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            f(e4Var3);
                            throw new InterruptedException();
                        }
                        obj = this.a;
                    } while (obj == null);
                    return g(obj);
                }
                e4Var = this.c;
            } while (e4Var != e4Var2);
        }
        return g(this.a);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.a instanceof i1;
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
        if (this.a instanceof i1) {
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
                e4 e4Var = this.c;
                e4 e4Var2 = e4.c;
                if (e4Var != e4Var2) {
                    e4 e4Var3 = new e4();
                    do {
                        o6 o6Var = f;
                        o6Var.a(e4Var3, e4Var);
                        if (o6Var.e(this, e4Var, e4Var3)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.a;
                                    if (obj2 != null) {
                                        return g(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    f(e4Var3);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            f(e4Var3);
                        } else {
                            e4Var = this.c;
                        }
                    } while (e4Var != e4Var2);
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
            String f4Var = toString();
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
            throw new TimeoutException(a4.w.y(str, " for ", f4Var));
        }
        throw new InterruptedException();
    }
}
