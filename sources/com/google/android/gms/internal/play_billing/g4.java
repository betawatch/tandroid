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
import org.telegram.ui.Cells.p6;
import v7.z5;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public class g4 implements t0 {
    public static final boolean d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger e = Logger.getLogger(g4.class.getName());
    public static final z5 f;
    public static final Object h;
    public volatile Object a;
    public volatile v2 b;
    public volatile f4 c;

    static {
        z5 e4Var;
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

    public static void d(g4 g4Var) {
        f4 f4Var;
        z5 z5Var;
        v2 v2Var;
        v2 v2Var2;
        v2 v2Var3;
        do {
            f4Var = g4Var.c;
            z5Var = f;
        } while (!z5Var.e(g4Var, f4Var, f4.c));
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
        } while (!z5Var.c(g4Var, v2Var2, v2.d));
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
            e.logp(Level.SEVERE, "com.android.billingclient.util.concurrent.AbstractResolvableFuture", "executeListener", com.google.android.gms.internal.vision.e2.j("RuntimeException while executing runnable ", String.valueOf(runnable), " with executor ", String.valueOf(executor)), (Throwable) e7);
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
            return p6.h(((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS), "remaining delay=[", " ms]");
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

    public final void g(f4 f4Var) {
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
            return h(obj2);
        }
        f4 f4Var = this.c;
        f4 f4Var2 = f4.c;
        if (f4Var != f4Var2) {
            f4 f4Var3 = new f4();
            do {
                z5 z5Var = f;
                z5Var.a(f4Var3, f4Var);
                if (z5Var.e(this, f4Var, f4Var3)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            g(f4Var3);
                            throw new InterruptedException();
                        }
                        obj = this.a;
                    } while (obj == null);
                    return h(obj);
                }
                f4Var = this.c;
            } while (f4Var != f4Var2);
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
    public final Object get(long j3, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j3);
        if (!Thread.interrupted()) {
            Object obj = this.a;
            if (obj != null) {
                return h(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                f4 f4Var = this.c;
                f4 f4Var2 = f4.c;
                if (f4Var != f4Var2) {
                    f4 f4Var3 = new f4();
                    do {
                        z5 z5Var = f;
                        z5Var.a(f4Var3, f4Var);
                        if (z5Var.e(this, f4Var, f4Var3)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.a;
                                    if (obj2 != null) {
                                        return h(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    g(f4Var3);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            g(f4Var3);
                        } else {
                            f4Var = this.c;
                        }
                    } while (f4Var != f4Var2);
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
            String g4Var = toString();
            String obj4 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = obj4.toLowerCase(locale);
            String str = "Waited " + j3 + " " + timeUnit.toString().toLowerCase(locale);
            if (nanos + 1000 < 0) {
                String concat = str.concat(" (plus ");
                long j10 = -nanos;
                long convert = timeUnit.convert(j10, TimeUnit.NANOSECONDS);
                long nanos2 = j10 - timeUnit.toNanos(convert);
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
            throw new TimeoutException(a4.a.C(str, " for ", g4Var));
        }
        throw new InterruptedException();
    }
}
