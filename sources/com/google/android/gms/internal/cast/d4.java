package com.google.android.gms.internal.cast;

import b8.ga;
import b8.ia;
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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class d4 extends ia implements l9.y {
    public static final boolean d;
    public static final Logger e;
    public static final ga f;
    public static final Object h;
    public volatile Object a;
    public volatile x3 b;
    public volatile c4 c;

    static {
        boolean z10;
        ga z3Var;
        Throwable th2;
        Throwable th3;
        try {
            z10 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z10 = false;
        }
        d = z10;
        e = Logger.getLogger(d4.class.getName());
        Throwable th4 = null;
        try {
            z3Var = new b4();
            th3 = null;
            th2 = null;
        } catch (Error | RuntimeException e10) {
            try {
                th2 = e10;
                z3Var = new y3(AtomicReferenceFieldUpdater.newUpdater(c4.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(c4.class, c4.class, "b"), AtomicReferenceFieldUpdater.newUpdater(d4.class, c4.class, "c"), AtomicReferenceFieldUpdater.newUpdater(d4.class, x3.class, "b"), AtomicReferenceFieldUpdater.newUpdater(d4.class, Object.class, "a"));
            } catch (Error | RuntimeException e11) {
                th4 = e11;
                z3Var = new z3();
                th2 = e10;
            }
            th3 = th4;
        }
        f = z3Var;
        if (th3 != null) {
            Logger logger = e;
            Level level = Level.SEVERE;
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th3);
        }
        h = new Object();
    }

    public static Object f(d4 d4Var) {
        Object obj;
        boolean z10 = false;
        while (true) {
            try {
                obj = d4Var.get();
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

    public static void h(d4 d4Var) {
        for (c4 b10 = f.b(d4Var); b10 != null; b10 = b10.b) {
            Thread thread = b10.a;
            if (thread != null) {
                b10.a = null;
                LockSupport.unpark(thread);
            }
        }
        d4Var.e();
        x3 a10 = f.a(d4Var);
        x3 x3Var = null;
        while (a10 != null) {
            x3 x3Var2 = a10.c;
            a10.c = x3Var;
            x3Var = a10;
            a10 = x3Var2;
        }
        while (x3Var != null) {
            Runnable runnable = x3Var.a;
            x3 x3Var3 = x3Var.c;
            runnable.getClass();
            Executor executor = x3Var.b;
            executor.getClass();
            i(runnable, executor);
            x3Var = x3Var3;
        }
    }

    public static void i(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            e.logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", com.google.android.recaptcha.internal.a.k("RuntimeException while executing runnable ", String.valueOf(runnable), " with executor ", String.valueOf(executor)), (Throwable) e10);
        }
    }

    public static final Object k(Object obj) {
        if (obj instanceof v3) {
            Throwable th2 = ((v3) obj).b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th2);
            throw cancellationException;
        }
        if (obj instanceof w3) {
            throw new ExecutionException(((w3) obj).a);
        }
        if (obj == h) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String a() {
        if (this instanceof ScheduledFuture) {
            return t4.c.e(((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS), "remaining delay=[", " ms]");
        }
        return null;
    }

    @Override // l9.y
    public final void b(Runnable runnable, Executor executor) {
        x3 x3Var;
        x3 x3Var2 = x3.d;
        if (!isDone() && (x3Var = this.b) != x3Var2) {
            x3 x3Var3 = new x3(runnable, executor);
            do {
                x3Var3.c = x3Var;
                if (f.e(this, x3Var, x3Var3)) {
                    return;
                } else {
                    x3Var = this.b;
                }
            } while (x3Var != x3Var2);
        }
        i(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        v3 v3Var;
        Object obj = this.a;
        if (obj != null) {
            return false;
        }
        if (d) {
            v3Var = new v3(new CancellationException("Future.cancel() was called."), z10);
        } else {
            v3Var = z10 ? v3.c : v3.d;
            v3Var.getClass();
        }
        if (!f.f(this, obj, v3Var)) {
            return false;
        }
        h(this);
        return true;
    }

    public final void g(StringBuilder sb2) {
        try {
            Object f10 = f(this);
            sb2.append("SUCCESS, result=[");
            if (f10 == null) {
                sb2.append("null");
            } else if (f10 == this) {
                sb2.append("this future");
            } else {
                sb2.append(f10.getClass().getName());
                sb2.append("@");
                sb2.append(Integer.toHexString(System.identityHashCode(f10)));
            }
            sb2.append("]");
        } catch (CancellationException unused) {
            sb2.append("CANCELLED");
        } catch (RuntimeException e10) {
            sb2.append("UNKNOWN, cause=[");
            sb2.append(e10.getClass());
            sb2.append(" thrown from get()]");
        } catch (ExecutionException e11) {
            sb2.append("FAILURE, cause=[");
            sb2.append(e11.getCause());
            sb2.append("]");
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        c4 c4Var = c4.c;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.a;
        if (obj2 != null) {
            return k(obj2);
        }
        c4 c4Var2 = this.c;
        if (c4Var2 != c4Var) {
            c4 c4Var3 = new c4();
            do {
                ga gaVar = f;
                gaVar.c(c4Var3, c4Var2);
                if (gaVar.g(this, c4Var2, c4Var3)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            j(c4Var3);
                            throw new InterruptedException();
                        }
                        obj = this.a;
                    } while (obj == null);
                    return k(obj);
                }
                c4Var2 = this.c;
            } while (c4Var2 != c4Var);
        }
        Object obj3 = this.a;
        obj3.getClass();
        return k(obj3);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.a instanceof v3;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.a != null;
    }

    public final void j(c4 c4Var) {
        c4Var.a = null;
        while (true) {
            c4 c4Var2 = this.c;
            if (c4Var2 != c4.c) {
                c4 c4Var3 = null;
                while (c4Var2 != null) {
                    c4 c4Var4 = c4Var2.b;
                    if (c4Var2.a != null) {
                        c4Var3 = c4Var2;
                    } else if (c4Var3 != null) {
                        c4Var3.b = c4Var4;
                        if (c4Var3.a == null) {
                            break;
                        }
                    } else if (!f.g(this, c4Var2, c4Var4)) {
                        break;
                    }
                    c4Var2 = c4Var4;
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
        if (this.a instanceof v3) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            g(sb2);
        } else {
            int length = sb2.length();
            sb2.append("PENDING");
            try {
                concat = a();
                int i3 = a0.a;
                if (concat != null) {
                }
                concat = null;
            } catch (RuntimeException | StackOverflowError e10) {
                concat = "Exception thrown from implementation: ".concat(String.valueOf(e10.getClass()));
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
        c4 c4Var = c4.c;
        long nanos = timeUnit.toNanos(j10);
        if (!Thread.interrupted()) {
            Object obj = this.a;
            if (obj != null) {
                return k(obj);
            }
            long j12 = 0;
            long nanoTime2 = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                c4 c4Var2 = this.c;
                if (c4Var2 != c4Var) {
                    c4 c4Var3 = new c4();
                    while (true) {
                        ga gaVar = f;
                        gaVar.c(c4Var3, c4Var2);
                        if (gaVar.g(this, c4Var2, c4Var3)) {
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
                                        j(c4Var3);
                                        break;
                                    }
                                    nanos = nanoTime;
                                } else {
                                    j(c4Var3);
                                    throw new InterruptedException();
                                }
                            }
                        } else {
                            long j13 = j12;
                            c4Var2 = this.c;
                            if (c4Var2 == c4Var) {
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
                String d4Var = toString();
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
                throw new TimeoutException(a1.g.C(str, " for ", d4Var));
            }
        } else {
            throw new InterruptedException();
        }
    }

    public void e() {
    }
}
