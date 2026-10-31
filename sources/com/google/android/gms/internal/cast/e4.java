package com.google.android.gms.internal.cast;

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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract class e4 extends v7.t5 implements j9.y {
    public static final boolean d;
    public static final Logger e;
    public static final v7.r5 f;
    public static final Object h;
    public volatile Object a;
    public volatile y3 b;
    public volatile d4 c;

    static {
        boolean z10;
        v7.r5 a4Var;
        Throwable th2;
        Throwable th3;
        try {
            z10 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z10 = false;
        }
        d = z10;
        e = Logger.getLogger(e4.class.getName());
        Throwable th4 = null;
        try {
            a4Var = new c4();
            th3 = null;
            th2 = null;
        } catch (Error | RuntimeException e7) {
            try {
                th2 = e7;
                a4Var = new z3(AtomicReferenceFieldUpdater.newUpdater(d4.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(d4.class, d4.class, "b"), AtomicReferenceFieldUpdater.newUpdater(e4.class, d4.class, "c"), AtomicReferenceFieldUpdater.newUpdater(e4.class, y3.class, "b"), AtomicReferenceFieldUpdater.newUpdater(e4.class, Object.class, "a"));
            } catch (Error | RuntimeException e10) {
                th4 = e10;
                a4Var = new a4();
                th2 = e7;
            }
            th3 = th4;
        }
        f = a4Var;
        if (th3 != null) {
            Logger logger = e;
            Level level = Level.SEVERE;
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th3);
        }
        h = new Object();
    }

    public static Object f(e4 e4Var) {
        Object obj;
        boolean z10 = false;
        while (true) {
            try {
                obj = e4Var.get();
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th2) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public static void h(e4 e4Var) {
        for (d4 b10 = f.b(e4Var); b10 != null; b10 = b10.b) {
            Thread thread = b10.a;
            if (thread != null) {
                b10.a = null;
                LockSupport.unpark(thread);
            }
        }
        e4Var.d();
        y3 a2 = f.a(e4Var);
        y3 y3Var = null;
        while (a2 != null) {
            y3 y3Var2 = a2.c;
            a2.c = y3Var;
            y3Var = a2;
            a2 = y3Var2;
        }
        while (y3Var != null) {
            Runnable runnable = y3Var.a;
            y3 y3Var3 = y3Var.c;
            runnable.getClass();
            Executor executor = y3Var.b;
            executor.getClass();
            i(runnable, executor);
            y3Var = y3Var3;
        }
    }

    public static void i(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e7) {
            e.logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", c3.i0.n("RuntimeException while executing runnable ", String.valueOf(runnable), " with executor ", String.valueOf(executor)), (Throwable) e7);
        }
    }

    public static final Object k(Object obj) {
        if (obj instanceof w3) {
            Throwable th2 = ((w3) obj).b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th2);
            throw cancellationException;
        }
        if (obj instanceof x3) {
            throw new ExecutionException(((x3) obj).a);
        }
        if (obj == h) {
            return null;
        }
        return obj;
    }

    @Override // j9.y
    public final void a(Runnable runnable, Executor executor) {
        y3 y3Var;
        y3 y3Var2 = y3.d;
        if (!isDone() && (y3Var = this.b) != y3Var2) {
            y3 y3Var3 = new y3(runnable, executor);
            do {
                y3Var3.c = y3Var;
                if (f.e(this, y3Var, y3Var3)) {
                    return;
                } else {
                    y3Var = this.b;
                }
            } while (y3Var != y3Var2);
        }
        i(runnable, executor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String c() {
        if (this instanceof ScheduledFuture) {
            return org.telegram.ui.Cells.f1.n(((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS), "remaining delay=[", " ms]");
        }
        return null;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        w3 w3Var;
        Object obj = this.a;
        if (obj != null) {
            return false;
        }
        if (d) {
            w3Var = new w3(new CancellationException("Future.cancel() was called."), z10);
        } else {
            w3Var = z10 ? w3.c : w3.d;
            w3Var.getClass();
        }
        if (!f.f(this, obj, w3Var)) {
            return false;
        }
        h(this);
        return true;
    }

    public final void g(StringBuilder sb2) {
        try {
            Object f7 = f(this);
            sb2.append("SUCCESS, result=[");
            if (f7 == null) {
                sb2.append("null");
            } else if (f7 == this) {
                sb2.append("this future");
            } else {
                sb2.append(f7.getClass().getName());
                sb2.append("@");
                sb2.append(Integer.toHexString(System.identityHashCode(f7)));
            }
            sb2.append("]");
        } catch (CancellationException unused) {
            sb2.append("CANCELLED");
        } catch (RuntimeException e7) {
            sb2.append("UNKNOWN, cause=[");
            sb2.append(e7.getClass());
            sb2.append(" thrown from get()]");
        } catch (ExecutionException e10) {
            sb2.append("FAILURE, cause=[");
            sb2.append(e10.getCause());
            sb2.append("]");
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        d4 d4Var = d4.c;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.a;
        if (obj2 != null) {
            return k(obj2);
        }
        d4 d4Var2 = this.c;
        if (d4Var2 != d4Var) {
            d4 d4Var3 = new d4();
            do {
                v7.r5 r5Var = f;
                r5Var.c(d4Var3, d4Var2);
                if (r5Var.g(this, d4Var2, d4Var3)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            j(d4Var3);
                            throw new InterruptedException();
                        }
                        obj = this.a;
                    } while (obj == null);
                    return k(obj);
                }
                d4Var2 = this.c;
            } while (d4Var2 != d4Var);
        }
        Object obj3 = this.a;
        obj3.getClass();
        return k(obj3);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.a instanceof w3;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.a != null;
    }

    public final void j(d4 d4Var) {
        d4Var.a = null;
        while (true) {
            d4 d4Var2 = this.c;
            if (d4Var2 != d4.c) {
                d4 d4Var3 = null;
                while (d4Var2 != null) {
                    d4 d4Var4 = d4Var2.b;
                    if (d4Var2.a != null) {
                        d4Var3 = d4Var2;
                    } else if (d4Var3 != null) {
                        d4Var3.b = d4Var4;
                        if (d4Var3.a == null) {
                            break;
                        }
                    } else if (!f.g(this, d4Var2, d4Var4)) {
                        break;
                    }
                    d4Var2 = d4Var4;
                }
                return;
            }
            return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006e, code lost:
    
        if (r3.isEmpty() != false) goto L22;
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
        if (this.a instanceof w3) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            g(sb2);
        } else {
            int length = sb2.length();
            sb2.append("PENDING");
            try {
                concat = c();
                int i10 = a0.a;
                if (concat != null) {
                }
                concat = null;
            } catch (RuntimeException | StackOverflowError e7) {
                concat = "Exception thrown from implementation: ".concat(String.valueOf(e7.getClass()));
            }
            if (concat != null) {
                sb2.append(", info=[");
                sb2.append(concat);
                sb2.append("]");
            }
            if (isDone()) {
                sb2.delete(length, sb2.length());
                g(sb2);
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ab  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x009e -> B:28:0x006b). Please report as a decompilation issue!!! */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(long j10, TimeUnit timeUnit) {
        long j11;
        long nanoTime;
        d4 d4Var = d4.c;
        long nanos = timeUnit.toNanos(j10);
        if (!Thread.interrupted()) {
            Object obj = this.a;
            if (obj != null) {
                return k(obj);
            }
            long j12 = 0;
            long nanoTime2 = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                d4 d4Var2 = this.c;
                if (d4Var2 != d4Var) {
                    d4 d4Var3 = new d4();
                    while (true) {
                        v7.r5 r5Var = f;
                        r5Var.c(d4Var3, d4Var2);
                        if (r5Var.g(this, d4Var2, d4Var3)) {
                            j11 = j12;
                            while (true) {
                                LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.a;
                                    if (obj2 != null) {
                                        return k(obj2);
                                    }
                                    nanoTime = nanoTime2 - System.nanoTime();
                                    if (nanoTime < 1000) {
                                        j(d4Var3);
                                        break;
                                    }
                                    nanos = nanoTime;
                                } else {
                                    j(d4Var3);
                                    throw new InterruptedException();
                                }
                            }
                        } else {
                            long j13 = j12;
                            d4Var2 = this.c;
                            if (d4Var2 == d4Var) {
                                break;
                            }
                            j12 = j13;
                        }
                    }
                }
                Object obj3 = this.a;
                obj3.getClass();
                return k(obj3);
            }
            j11 = 0;
            if (nanos > j11) {
                Object obj4 = this.a;
                if (obj4 != null) {
                    return k(obj4);
                }
                if (!Thread.interrupted()) {
                    nanoTime = nanoTime2 - System.nanoTime();
                    nanos = nanoTime;
                    if (nanos > j11) {
                    }
                } else {
                    throw new InterruptedException();
                }
            } else {
                String e4Var = toString();
                String obj5 = timeUnit.toString();
                Locale locale = Locale.ROOT;
                String lowerCase = obj5.toLowerCase(locale);
                String str = "Waited " + j10 + " " + timeUnit.toString().toLowerCase(locale);
                if (nanos + 1000 < j11) {
                    String concat = str.concat(" (plus ");
                    long j14 = -nanos;
                    long convert = timeUnit.convert(j14, TimeUnit.NANOSECONDS);
                    long nanos2 = j14 - timeUnit.toNanos(convert);
                    boolean z10 = true;
                    if (convert != j11 && nanos2 <= 1000) {
                        z10 = false;
                    }
                    if (convert > j11) {
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
                throw new TimeoutException(a1.g.C(str, " for ", e4Var));
            }
        } else {
            throw new InterruptedException();
        }
    }

    public void d() {
    }
}
