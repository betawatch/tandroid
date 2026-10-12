package com.google.android.gms.internal.play_billing;

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
import v7.c6;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public class h4 implements t0 {
    public static final boolean d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger e = Logger.getLogger(h4.class.getName());
    public static final c6 f;
    public static final Object h;
    public volatile Object a;
    public volatile v2 b;
    public volatile g4 c;

    static {
        c6 f4Var;
        try {
            f4Var = new t3(AtomicReferenceFieldUpdater.newUpdater(g4.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(g4.class, g4.class, "b"), AtomicReferenceFieldUpdater.newUpdater(h4.class, g4.class, "c"), AtomicReferenceFieldUpdater.newUpdater(h4.class, v2.class, "b"), AtomicReferenceFieldUpdater.newUpdater(h4.class, Object.class, "a"));
            th = null;
        } catch (Throwable th2) {
            th = th2;
            f4Var = new f4();
        }
        Throwable th3 = th;
        f = f4Var;
        if (th3 != null) {
            e.logp(Level.SEVERE, "com.android.billingclient.util.concurrent.AbstractResolvableFuture", "<clinit>", "SafeAtomicHelper is broken!", th3);
        }
        h = new Object();
    }

    public static void d(h4 h4Var) {
        g4 g4Var;
        c6 c6Var;
        v2 v2Var;
        v2 v2Var2;
        v2 v2Var3;
        do {
            g4Var = h4Var.c;
            c6Var = f;
        } while (!c6Var.e(h4Var, g4Var, g4.c));
        while (true) {
            v2Var = null;
            if (g4Var == null) {
                break;
            }
            Thread thread = g4Var.a;
            if (thread != null) {
                g4Var.a = null;
                LockSupport.unpark(thread);
            }
            g4Var = g4Var.b;
        }
        do {
            v2Var2 = h4Var.b;
        } while (!c6Var.c(h4Var, v2Var2, v2.d));
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
            f(runnable, v2Var3.b);
            v2Var3 = v2Var4;
        }
    }

    public static void f(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e7) {
            e.logp(Level.SEVERE, "com.android.billingclient.util.concurrent.AbstractResolvableFuture", "executeListener", k3.k("RuntimeException while executing runnable ", String.valueOf(runnable), " with executor ", String.valueOf(executor)), (Throwable) e7);
        }
    }

    public static final Object h(Object obj) {
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
    public final void b(Runnable runnable, Executor executor) {
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
        f(runnable, executor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String c() {
        if (this instanceof ScheduledFuture) {
            return org.telegram.ui.Cells.d0.i(((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS), "remaining delay=[", " ms]");
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
        d(this);
        return true;
    }

    public final void e(StringBuilder sb2) {
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
            } catch (RuntimeException e7) {
                sb2.append("UNKNOWN, cause=[");
                sb2.append(e7.getClass());
                sb2.append(" thrown from get()]");
                return;
            } catch (ExecutionException e10) {
                sb2.append("FAILURE, cause=[");
                sb2.append(e10.getCause());
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

    public final void g(g4 g4Var) {
        g4Var.a = null;
        while (true) {
            g4 g4Var2 = this.c;
            if (g4Var2 != g4.c) {
                g4 g4Var3 = null;
                while (g4Var2 != null) {
                    g4 g4Var4 = g4Var2.b;
                    if (g4Var2.a != null) {
                        g4Var3 = g4Var2;
                    } else if (g4Var3 != null) {
                        g4Var3.b = g4Var4;
                        if (g4Var3.a == null) {
                            break;
                        }
                    } else if (!f.e(this, g4Var2, g4Var4)) {
                        break;
                    }
                    g4Var2 = g4Var4;
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
            return h(obj2);
        }
        g4 g4Var = this.c;
        g4 g4Var2 = g4.c;
        if (g4Var != g4Var2) {
            g4 g4Var3 = new g4();
            do {
                c6 c6Var = f;
                c6Var.a(g4Var3, g4Var);
                if (c6Var.e(this, g4Var, g4Var3)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            g(g4Var3);
                            throw new InterruptedException();
                        }
                        obj = this.a;
                    } while (obj == null);
                    return h(obj);
                }
                g4Var = this.c;
            } while (g4Var != g4Var2);
        }
        return h(this.a);
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
            e(sb2);
        } else {
            try {
                concat = c();
            } catch (RuntimeException e7) {
                concat = "Exception thrown from implementation: ".concat(String.valueOf(e7.getClass()));
            }
            if (concat != null && !concat.isEmpty()) {
                sb2.append("PENDING, info=[");
                sb2.append(concat);
                sb2.append("]");
            } else if (isDone()) {
                e(sb2);
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
                return h(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                g4 g4Var = this.c;
                g4 g4Var2 = g4.c;
                if (g4Var != g4Var2) {
                    g4 g4Var3 = new g4();
                    do {
                        c6 c6Var = f;
                        c6Var.a(g4Var3, g4Var);
                        if (c6Var.e(this, g4Var, g4Var3)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.a;
                                    if (obj2 != null) {
                                        return h(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    g(g4Var3);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            g(g4Var3);
                        } else {
                            g4Var = this.c;
                        }
                    } while (g4Var != g4Var2);
                }
                return h(this.a);
            }
            while (nanos > 0) {
                Object obj3 = this.a;
                if (obj3 != null) {
                    return h(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String h4Var = toString();
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
            throw new TimeoutException(a1.g.D(str, " for ", h4Var));
        }
        throw new InterruptedException();
    }
}
