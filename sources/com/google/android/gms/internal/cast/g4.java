package com.google.android.gms.internal.cast;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.telegram.messenger.BuildConfig;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class g4 extends h7.z5 implements t8.a {
    public static final boolean d;
    public static final Logger e;
    public static final h7.x5 f;
    public static final Object h;
    public volatile Object a;
    public volatile a4 b;
    public volatile f4 c;

    static {
        boolean z10;
        h7.x5 c4Var;
        Throwable th2;
        Throwable th3;
        try {
            z10 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z10 = false;
        }
        d = z10;
        e = Logger.getLogger(g4.class.getName());
        Throwable th4 = null;
        try {
            c4Var = new e4();
            th3 = null;
            th2 = null;
        } catch (Error | RuntimeException e10) {
            try {
                th2 = e10;
                c4Var = new b4(AtomicReferenceFieldUpdater.newUpdater(f4.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(f4.class, f4.class, "b"), AtomicReferenceFieldUpdater.newUpdater(g4.class, f4.class, "c"), AtomicReferenceFieldUpdater.newUpdater(g4.class, a4.class, "b"), AtomicReferenceFieldUpdater.newUpdater(g4.class, Object.class, "a"));
            } catch (Error | RuntimeException e11) {
                th4 = e11;
                c4Var = new c4();
                th2 = e10;
            }
            th3 = th4;
        }
        f = c4Var;
        if (th3 != null) {
            Logger logger = e;
            Level level = Level.SEVERE;
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th3);
        }
        h = new Object();
    }

    public static Object e(g4 g4Var) {
        Object obj;
        boolean z10 = false;
        while (true) {
            try {
                obj = g4Var.get();
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

    public static void g(g4 g4Var) {
        for (f4 b10 = f.b(g4Var); b10 != null; b10 = b10.b) {
            Thread thread = b10.a;
            if (thread != null) {
                b10.a = null;
                LockSupport.unpark(thread);
            }
        }
        g4Var.c();
        a4 a2 = f.a(g4Var);
        a4 a4Var = null;
        while (a2 != null) {
            a4 a4Var2 = a2.c;
            a2.c = a4Var;
            a4Var = a2;
            a2 = a4Var2;
        }
        while (a4Var != null) {
            a4.g gVar = a4Var.a;
            a4 a4Var3 = a4Var.c;
            gVar.getClass();
            c2.f fVar = a4Var.b;
            fVar.getClass();
            try {
                fVar.execute(gVar);
            } catch (RuntimeException e10) {
                e.logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", j7.l1.n("RuntimeException while executing runnable ", String.valueOf(gVar), " with executor ", String.valueOf(fVar)), (Throwable) e10);
            }
            a4Var = a4Var3;
        }
    }

    public static final Object i(Object obj) {
        if (obj instanceof y3) {
            Throwable th2 = ((y3) obj).b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th2);
            throw cancellationException;
        }
        if (obj instanceof z3) {
            throw new ExecutionException(((z3) obj).a);
        }
        if (obj == h) {
            return null;
        }
        return obj;
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
        y3 y3Var;
        Object obj = this.a;
        if (obj != null) {
            return false;
        }
        if (d) {
            y3Var = new y3(new CancellationException("Future.cancel() was called."), z10);
        } else {
            y3Var = z10 ? y3.c : y3.d;
            y3Var.getClass();
        }
        if (!f.e(this, obj, y3Var)) {
            return false;
        }
        g(this);
        return true;
    }

    public final void f(StringBuilder sb2) {
        try {
            Object e10 = e(this);
            sb2.append("SUCCESS, result=[");
            if (e10 == null) {
                sb2.append(BuildConfig.BETA_URL);
            } else if (e10 == this) {
                sb2.append("this future");
            } else {
                sb2.append(e10.getClass().getName());
                sb2.append("@");
                sb2.append(Integer.toHexString(System.identityHashCode(e10)));
            }
            sb2.append("]");
        } catch (CancellationException unused) {
            sb2.append("CANCELLED");
        } catch (RuntimeException e11) {
            sb2.append("UNKNOWN, cause=[");
            sb2.append(e11.getClass());
            sb2.append(" thrown from get()]");
        } catch (ExecutionException e12) {
            sb2.append("FAILURE, cause=[");
            sb2.append(e12.getCause());
            sb2.append("]");
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        f4 f4Var = f4.c;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.a;
        if (obj2 != null) {
            return i(obj2);
        }
        f4 f4Var2 = this.c;
        if (f4Var2 != f4Var) {
            f4 f4Var3 = new f4();
            do {
                h7.x5 x5Var = f;
                x5Var.c(f4Var3, f4Var2);
                if (x5Var.f(this, f4Var2, f4Var3)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            h(f4Var3);
                            throw new InterruptedException();
                        }
                        obj = this.a;
                    } while (obj == null);
                    return i(obj);
                }
                f4Var2 = this.c;
            } while (f4Var2 != f4Var);
        }
        Object obj3 = this.a;
        obj3.getClass();
        return i(obj3);
    }

    public final void h(f4 f4Var) {
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
                    } else if (!f.f(this, f4Var2, f4Var4)) {
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
    public final boolean isCancelled() {
        return this.a instanceof y3;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.a != null;
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
        if (this.a instanceof y3) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            f(sb2);
        } else {
            int length = sb2.length();
            sb2.append("PENDING");
            try {
                concat = b();
                int i10 = b0.a;
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
                f(sb2);
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
        f4 f4Var = f4.c;
        long nanos = timeUnit.toNanos(j10);
        if (!Thread.interrupted()) {
            Object obj = this.a;
            if (obj != null) {
                return i(obj);
            }
            long j12 = 0;
            long nanoTime2 = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                f4 f4Var2 = this.c;
                if (f4Var2 != f4Var) {
                    f4 f4Var3 = new f4();
                    while (true) {
                        h7.x5 x5Var = f;
                        x5Var.c(f4Var3, f4Var2);
                        if (x5Var.f(this, f4Var2, f4Var3)) {
                            j11 = j12;
                            while (true) {
                                LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.a;
                                    if (obj2 != null) {
                                        return i(obj2);
                                    }
                                    nanoTime = nanoTime2 - System.nanoTime();
                                    if (nanoTime < 1000) {
                                        h(f4Var3);
                                        break;
                                    }
                                    nanos = nanoTime;
                                } else {
                                    h(f4Var3);
                                    throw new InterruptedException();
                                }
                            }
                        } else {
                            long j13 = j12;
                            f4Var2 = this.c;
                            if (f4Var2 == f4Var) {
                                break;
                            }
                            j12 = j13;
                        }
                    }
                }
                Object obj3 = this.a;
                obj3.getClass();
                return i(obj3);
            }
            j11 = 0;
            if (nanos > j11) {
                Object obj4 = this.a;
                if (obj4 != null) {
                    return i(obj4);
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
                String g4Var = toString();
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
                throw new TimeoutException(a4.w.y(str, " for ", g4Var));
            }
        } else {
            throw new InterruptedException();
        }
    }

    public void c() {
    }
}
