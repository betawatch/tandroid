package com.google.android.gms.internal.cast;

import a8.ja;
import a8.la;
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
import org.telegram.ui.Components.b10;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public abstract class c4 extends la implements k9.y {
    public static final boolean d;
    public static final Logger e;
    public static final ja f;
    public static final Object h;
    public volatile Object a;
    public volatile w3 b;
    public volatile b4 c;

    static {
        boolean z10;
        ja y3Var;
        Throwable th2;
        Throwable th3;
        try {
            z10 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z10 = false;
        }
        d = z10;
        e = Logger.getLogger(c4.class.getName());
        Throwable th4 = null;
        try {
            y3Var = new a4();
            th3 = null;
            th2 = null;
        } catch (Error | RuntimeException e10) {
            try {
                th2 = e10;
                y3Var = new x3(AtomicReferenceFieldUpdater.newUpdater(b4.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(b4.class, b4.class, "b"), AtomicReferenceFieldUpdater.newUpdater(c4.class, b4.class, "c"), AtomicReferenceFieldUpdater.newUpdater(c4.class, w3.class, "b"), AtomicReferenceFieldUpdater.newUpdater(c4.class, Object.class, "a"));
            } catch (Error | RuntimeException e11) {
                th4 = e11;
                y3Var = new y3();
                th2 = e10;
            }
            th3 = th4;
        }
        f = y3Var;
        if (th3 != null) {
            Logger logger = e;
            Level level = Level.SEVERE;
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th3);
        }
        h = new Object();
    }

    public static Object f(c4 c4Var) {
        Object obj;
        boolean z10 = false;
        while (true) {
            try {
                obj = c4Var.get();
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

    public static void h(c4 c4Var) {
        for (b4 b10 = f.b(c4Var); b10 != null; b10 = b10.b) {
            Thread thread = b10.a;
            if (thread != null) {
                b10.a = null;
                LockSupport.unpark(thread);
            }
        }
        c4Var.d();
        w3 a2 = f.a(c4Var);
        w3 w3Var = null;
        while (a2 != null) {
            w3 w3Var2 = a2.c;
            a2.c = w3Var;
            w3Var = a2;
            a2 = w3Var2;
        }
        while (w3Var != null) {
            Runnable runnable = w3Var.a;
            w3 w3Var3 = w3Var.c;
            runnable.getClass();
            Executor executor = w3Var.b;
            executor.getClass();
            i(runnable, executor);
            w3Var = w3Var3;
        }
    }

    public static void i(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            e.logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", c3.h0.m("RuntimeException while executing runnable ", String.valueOf(runnable), " with executor ", String.valueOf(executor)), (Throwable) e10);
        }
    }

    public static final Object k(Object obj) {
        if (obj instanceof u3) {
            Throwable th2 = ((u3) obj).b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th2);
            throw cancellationException;
        }
        if (obj instanceof v3) {
            throw new ExecutionException(((v3) obj).a);
        }
        if (obj == h) {
            return null;
        }
        return obj;
    }

    @Override // k9.y
    public final void a(Runnable runnable, Executor executor) {
        w3 w3Var;
        w3 w3Var2 = w3.d;
        if (!isDone() && (w3Var = this.b) != w3Var2) {
            w3 w3Var3 = new w3(runnable, executor);
            do {
                w3Var3.c = w3Var;
                if (f.e(this, w3Var, w3Var3)) {
                    return;
                } else {
                    w3Var = this.b;
                }
            } while (w3Var != w3Var2);
        }
        i(runnable, executor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String c() {
        if (this instanceof ScheduledFuture) {
            return b10.i(((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS), "remaining delay=[", " ms]");
        }
        return null;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        u3 u3Var;
        Object obj = this.a;
        if (obj != null) {
            return false;
        }
        if (d) {
            u3Var = new u3(new CancellationException("Future.cancel() was called."), z10);
        } else {
            u3Var = z10 ? u3.c : u3.d;
            u3Var.getClass();
        }
        if (!f.f(this, obj, u3Var)) {
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
        b4 b4Var = b4.c;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.a;
        if (obj2 != null) {
            return k(obj2);
        }
        b4 b4Var2 = this.c;
        if (b4Var2 != b4Var) {
            b4 b4Var3 = new b4();
            do {
                ja jaVar = f;
                jaVar.c(b4Var3, b4Var2);
                if (jaVar.g(this, b4Var2, b4Var3)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            j(b4Var3);
                            throw new InterruptedException();
                        }
                        obj = this.a;
                    } while (obj == null);
                    return k(obj);
                }
                b4Var2 = this.c;
            } while (b4Var2 != b4Var);
        }
        Object obj3 = this.a;
        obj3.getClass();
        return k(obj3);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.a instanceof u3;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.a != null;
    }

    public final void j(b4 b4Var) {
        b4Var.a = null;
        while (true) {
            b4 b4Var2 = this.c;
            if (b4Var2 != b4.c) {
                b4 b4Var3 = null;
                while (b4Var2 != null) {
                    b4 b4Var4 = b4Var2.b;
                    if (b4Var2.a != null) {
                        b4Var3 = b4Var2;
                    } else if (b4Var3 != null) {
                        b4Var3.b = b4Var4;
                        if (b4Var3.a == null) {
                            break;
                        }
                    } else if (!f.g(this, b4Var2, b4Var4)) {
                        break;
                    }
                    b4Var2 = b4Var4;
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
        if (this.a instanceof u3) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            g(sb2);
        } else {
            int length = sb2.length();
            sb2.append("PENDING");
            try {
                concat = c();
                int i10 = z.a;
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
        b4 b4Var = b4.c;
        long nanos = timeUnit.toNanos(j10);
        if (!Thread.interrupted()) {
            Object obj = this.a;
            if (obj != null) {
                return k(obj);
            }
            long j12 = 0;
            long nanoTime2 = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                b4 b4Var2 = this.c;
                if (b4Var2 != b4Var) {
                    b4 b4Var3 = new b4();
                    while (true) {
                        ja jaVar = f;
                        jaVar.c(b4Var3, b4Var2);
                        if (jaVar.g(this, b4Var2, b4Var3)) {
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
                                        j(b4Var3);
                                        break;
                                    }
                                    nanos = nanoTime;
                                } else {
                                    j(b4Var3);
                                    throw new InterruptedException();
                                }
                            }
                        } else {
                            long j13 = j12;
                            b4Var2 = this.c;
                            if (b4Var2 == b4Var) {
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
                String c4Var = toString();
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
                throw new TimeoutException(a1.g.D(str, " for ", c4Var));
            }
        } else {
            throw new InterruptedException();
        }
    }

    public void d() {
    }
}
