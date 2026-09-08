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
import org.telegram.messenger.BuildConfig;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public abstract class h4 extends v7.q5 implements i9.w {
    public static final boolean d;
    public static final Logger e;
    public static final v7.o5 f;
    public static final Object h;
    public volatile Object a;
    public volatile b4 b;
    public volatile g4 c;

    static {
        boolean z10;
        v7.o5 d4Var;
        Throwable th2;
        Throwable th3;
        try {
            z10 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z10 = false;
        }
        d = z10;
        e = Logger.getLogger(h4.class.getName());
        Throwable th4 = null;
        try {
            d4Var = new f4();
            th3 = null;
            th2 = null;
        } catch (Error | RuntimeException e7) {
            try {
                th2 = e7;
                d4Var = new c4(AtomicReferenceFieldUpdater.newUpdater(g4.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(g4.class, g4.class, "b"), AtomicReferenceFieldUpdater.newUpdater(h4.class, g4.class, "c"), AtomicReferenceFieldUpdater.newUpdater(h4.class, b4.class, "b"), AtomicReferenceFieldUpdater.newUpdater(h4.class, Object.class, "a"));
            } catch (Error | RuntimeException e10) {
                th4 = e10;
                d4Var = new d4();
                th2 = e7;
            }
            th3 = th4;
        }
        f = d4Var;
        if (th3 != null) {
            Logger logger = e;
            Level level = Level.SEVERE;
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th3);
        }
        h = new Object();
    }

    public static Object f(h4 h4Var) {
        Object obj;
        boolean z10 = false;
        while (true) {
            try {
                obj = h4Var.get();
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

    public static void h(h4 h4Var) {
        for (g4 b10 = f.b(h4Var); b10 != null; b10 = b10.b) {
            Thread thread = b10.a;
            if (thread != null) {
                b10.a = null;
                LockSupport.unpark(thread);
            }
        }
        h4Var.e();
        b4 a2 = f.a(h4Var);
        b4 b4Var = null;
        while (a2 != null) {
            b4 b4Var2 = a2.c;
            a2.c = b4Var;
            b4Var = a2;
            a2 = b4Var2;
        }
        while (b4Var != null) {
            Runnable runnable = b4Var.a;
            b4 b4Var3 = b4Var.c;
            runnable.getClass();
            Executor executor = b4Var.b;
            executor.getClass();
            i(runnable, executor);
            b4Var = b4Var3;
        }
    }

    public static void i(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e7) {
            e.logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", com.google.android.gms.internal.vision.e2.j("RuntimeException while executing runnable ", String.valueOf(runnable), " with executor ", String.valueOf(executor)), (Throwable) e7);
        }
    }

    public static final Object k(Object obj) {
        if (obj instanceof z3) {
            Throwable th2 = ((z3) obj).b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th2);
            throw cancellationException;
        }
        if (obj instanceof a4) {
            throw new ExecutionException(((a4) obj).a);
        }
        if (obj == h) {
            return null;
        }
        return obj;
    }

    @Override // i9.w
    public final void a(Runnable runnable, Executor executor) {
        b4 b4Var;
        b4 b4Var2 = b4.d;
        if (!isDone() && (b4Var = this.b) != b4Var2) {
            b4 b4Var3 = new b4(runnable, executor);
            do {
                b4Var3.c = b4Var;
                if (f.e(this, b4Var, b4Var3)) {
                    return;
                } else {
                    b4Var = this.b;
                }
            } while (b4Var != b4Var2);
        }
        i(runnable, executor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String c() {
        if (this instanceof ScheduledFuture) {
            return org.telegram.ui.Cells.p6.h(((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS), "remaining delay=[", " ms]");
        }
        return null;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        z3 z3Var;
        Object obj = this.a;
        if (obj != null) {
            return false;
        }
        if (d) {
            z3Var = new z3(new CancellationException("Future.cancel() was called."), z10);
        } else {
            z3Var = z10 ? z3.c : z3.d;
            z3Var.getClass();
        }
        if (!f.f(this, obj, z3Var)) {
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
                sb2.append(BuildConfig.BETA_URL);
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
        g4 g4Var = g4.c;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.a;
        if (obj2 != null) {
            return k(obj2);
        }
        g4 g4Var2 = this.c;
        if (g4Var2 != g4Var) {
            g4 g4Var3 = new g4();
            do {
                v7.o5 o5Var = f;
                o5Var.c(g4Var3, g4Var2);
                if (o5Var.g(this, g4Var2, g4Var3)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            j(g4Var3);
                            throw new InterruptedException();
                        }
                        obj = this.a;
                    } while (obj == null);
                    return k(obj);
                }
                g4Var2 = this.c;
            } while (g4Var2 != g4Var);
        }
        Object obj3 = this.a;
        obj3.getClass();
        return k(obj3);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.a instanceof z3;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.a != null;
    }

    public final void j(g4 g4Var) {
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
                    } else if (!f.g(this, g4Var2, g4Var4)) {
                        break;
                    }
                    g4Var2 = g4Var4;
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
        if (this.a instanceof z3) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            g(sb2);
        } else {
            int length = sb2.length();
            sb2.append("PENDING");
            try {
                concat = c();
                int i10 = d0.a;
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
    public final Object get(long j3, TimeUnit timeUnit) {
        long j10;
        long nanoTime;
        g4 g4Var = g4.c;
        long nanos = timeUnit.toNanos(j3);
        if (!Thread.interrupted()) {
            Object obj = this.a;
            if (obj != null) {
                return k(obj);
            }
            long j11 = 0;
            long nanoTime2 = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                g4 g4Var2 = this.c;
                if (g4Var2 != g4Var) {
                    g4 g4Var3 = new g4();
                    while (true) {
                        v7.o5 o5Var = f;
                        o5Var.c(g4Var3, g4Var2);
                        if (o5Var.g(this, g4Var2, g4Var3)) {
                            j10 = j11;
                            while (true) {
                                LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.a;
                                    if (obj2 != null) {
                                        return k(obj2);
                                    }
                                    nanoTime = nanoTime2 - System.nanoTime();
                                    if (nanoTime < 1000) {
                                        j(g4Var3);
                                        break;
                                    }
                                    nanos = nanoTime;
                                } else {
                                    j(g4Var3);
                                    throw new InterruptedException();
                                }
                            }
                        } else {
                            long j12 = j11;
                            g4Var2 = this.c;
                            if (g4Var2 == g4Var) {
                                break;
                            }
                            j11 = j12;
                        }
                    }
                }
                Object obj3 = this.a;
                obj3.getClass();
                return k(obj3);
            }
            j10 = 0;
            if (nanos > j10) {
                Object obj4 = this.a;
                if (obj4 != null) {
                    return k(obj4);
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
                String h4Var = toString();
                String obj5 = timeUnit.toString();
                Locale locale = Locale.ROOT;
                String lowerCase = obj5.toLowerCase(locale);
                String str = "Waited " + j3 + " " + timeUnit.toString().toLowerCase(locale);
                if (nanos + 1000 < j10) {
                    String concat = str.concat(" (plus ");
                    long j13 = -nanos;
                    long convert = timeUnit.convert(j13, TimeUnit.NANOSECONDS);
                    long nanos2 = j13 - timeUnit.toNanos(convert);
                    boolean z10 = true;
                    if (convert != j10 && nanos2 <= 1000) {
                        z10 = false;
                    }
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
                throw new TimeoutException(a4.a.C(str, " for ", h4Var));
            }
        } else {
            throw new InterruptedException();
        }
    }

    public void e() {
    }
}
