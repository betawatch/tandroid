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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public abstract class f4 extends j7.c6 implements v8.a {
    public static final boolean d;
    public static final Logger e;
    public static final j7.a6 f;
    public static final Object h;
    public volatile Object a;
    public volatile z3 b;
    public volatile e4 c;

    static {
        boolean z4;
        j7.a6 b4Var;
        Throwable th2;
        Throwable th3;
        try {
            z4 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z4 = false;
        }
        d = z4;
        e = Logger.getLogger(f4.class.getName());
        Throwable th4 = null;
        try {
            b4Var = new d4();
            th3 = null;
            th2 = null;
        } catch (Error | RuntimeException e6) {
            try {
                th2 = e6;
                b4Var = new a4(AtomicReferenceFieldUpdater.newUpdater(e4.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(e4.class, e4.class, "b"), AtomicReferenceFieldUpdater.newUpdater(f4.class, e4.class, "c"), AtomicReferenceFieldUpdater.newUpdater(f4.class, z3.class, "b"), AtomicReferenceFieldUpdater.newUpdater(f4.class, Object.class, "a"));
            } catch (Error | RuntimeException e10) {
                th4 = e10;
                b4Var = new b4();
                th2 = e6;
            }
            th3 = th4;
        }
        f = b4Var;
        if (th3 != null) {
            Logger logger = e;
            Level level = Level.SEVERE;
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th3);
        }
        h = new Object();
    }

    public static Object e(f4 f4Var) {
        Object obj;
        boolean z4 = false;
        while (true) {
            try {
                obj = f4Var.get();
                break;
            } catch (InterruptedException unused) {
                z4 = true;
            } catch (Throwable th2) {
                if (z4) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z4) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public static void g(f4 f4Var) {
        for (e4 b10 = f.b(f4Var); b10 != null; b10 = b10.b) {
            Thread thread = b10.a;
            if (thread != null) {
                b10.a = null;
                LockSupport.unpark(thread);
            }
        }
        f4Var.c();
        z3 a2 = f.a(f4Var);
        z3 z3Var = null;
        while (a2 != null) {
            z3 z3Var2 = a2.c;
            a2.c = z3Var;
            z3Var = a2;
            a2 = z3Var2;
        }
        while (z3Var != null) {
            ag.d dVar = z3Var.a;
            z3 z3Var3 = z3Var.c;
            dVar.getClass();
            c2.f fVar = z3Var.b;
            fVar.getClass();
            try {
                fVar.execute(dVar);
            } catch (RuntimeException e6) {
                e.logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", e2.c.k("RuntimeException while executing runnable ", String.valueOf(dVar), " with executor ", String.valueOf(fVar)), (Throwable) e6);
            }
            z3Var = z3Var3;
        }
    }

    public static final Object i(Object obj) {
        if (obj instanceof x3) {
            Throwable th2 = ((x3) obj).b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th2);
            throw cancellationException;
        }
        if (obj instanceof y3) {
            throw new ExecutionException(((y3) obj).a);
        }
        if (obj == h) {
            return null;
        }
        return obj;
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
        x3 x3Var;
        Object obj = this.a;
        if (obj != null) {
            return false;
        }
        if (d) {
            x3Var = new x3(new CancellationException("Future.cancel() was called."), z4);
        } else {
            x3Var = z4 ? x3.c : x3.d;
            x3Var.getClass();
        }
        if (!f.e(this, obj, x3Var)) {
            return false;
        }
        g(this);
        return true;
    }

    public final void f(StringBuilder sb) {
        try {
            Object e6 = e(this);
            sb.append("SUCCESS, result=[");
            if (e6 == null) {
                sb.append(BuildConfig.BETA_URL);
            } else if (e6 == this) {
                sb.append("this future");
            } else {
                sb.append(e6.getClass().getName());
                sb.append("@");
                sb.append(Integer.toHexString(System.identityHashCode(e6)));
            }
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e10) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e10.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e11) {
            sb.append("FAILURE, cause=[");
            sb.append(e11.getCause());
            sb.append("]");
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        e4 e4Var = e4.c;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.a;
        if (obj2 != null) {
            return i(obj2);
        }
        e4 e4Var2 = this.c;
        if (e4Var2 != e4Var) {
            e4 e4Var3 = new e4();
            do {
                j7.a6 a6Var = f;
                a6Var.c(e4Var3, e4Var2);
                if (a6Var.f(this, e4Var2, e4Var3)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            h(e4Var3);
                            throw new InterruptedException();
                        }
                        obj = this.a;
                    } while (obj == null);
                    return i(obj);
                }
                e4Var2 = this.c;
            } while (e4Var2 != e4Var);
        }
        Object obj3 = this.a;
        obj3.getClass();
        return i(obj3);
    }

    public final void h(e4 e4Var) {
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
                    } else if (!f.f(this, e4Var2, e4Var4)) {
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
    public final boolean isCancelled() {
        return this.a instanceof x3;
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
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (this.a instanceof x3) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            f(sb);
        } else {
            int length = sb.length();
            sb.append("PENDING");
            try {
                concat = b();
                int i10 = a0.a;
                if (concat != null) {
                }
                concat = null;
            } catch (RuntimeException | StackOverflowError e6) {
                concat = "Exception thrown from implementation: ".concat(String.valueOf(e6.getClass()));
            }
            if (concat != null) {
                sb.append(", info=[");
                sb.append(concat);
                sb.append("]");
            }
            if (isDone()) {
                sb.delete(length, sb.length());
                f(sb);
            }
        }
        sb.append("]");
        return sb.toString();
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
        e4 e4Var = e4.c;
        long nanos = timeUnit.toNanos(j10);
        if (!Thread.interrupted()) {
            Object obj = this.a;
            if (obj != null) {
                return i(obj);
            }
            long j12 = 0;
            long nanoTime2 = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                e4 e4Var2 = this.c;
                if (e4Var2 != e4Var) {
                    e4 e4Var3 = new e4();
                    while (true) {
                        j7.a6 a6Var = f;
                        a6Var.c(e4Var3, e4Var2);
                        if (a6Var.f(this, e4Var2, e4Var3)) {
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
                                        h(e4Var3);
                                        break;
                                    }
                                    nanos = nanoTime;
                                } else {
                                    h(e4Var3);
                                    throw new InterruptedException();
                                }
                            }
                        } else {
                            long j13 = j12;
                            e4Var2 = this.c;
                            if (e4Var2 == e4Var) {
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
                String f4Var = toString();
                String obj5 = timeUnit.toString();
                Locale locale = Locale.ROOT;
                String lowerCase = obj5.toLowerCase(locale);
                String str = "Waited " + j10 + " " + timeUnit.toString().toLowerCase(locale);
                if (nanos + 1000 < j11) {
                    String concat = str.concat(" (plus ");
                    long j14 = -nanos;
                    long convert = timeUnit.convert(j14, TimeUnit.NANOSECONDS);
                    long nanos2 = j14 - timeUnit.toNanos(convert);
                    boolean z4 = true;
                    if (convert != j11 && nanos2 <= 1000) {
                        z4 = false;
                    }
                    if (convert > j11) {
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
                throw new TimeoutException(android.support.v4.media.a.z(str, " for ", f4Var));
            }
        } else {
            throw new InterruptedException();
        }
    }

    public void c() {
    }
}
