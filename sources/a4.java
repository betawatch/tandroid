// default package

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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class a4 implements t56 {
    public static final boolean d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger e = Logger.getLogger(a4.class.getName());
    public static final fld f;
    public static final Object h;
    public volatile Object a;
    public volatile v3 b;
    public volatile z3 c;

    static {
        fld y3Var;
        try {
            y3Var = new w3(AtomicReferenceFieldUpdater.newUpdater(z3.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(z3.class, z3.class, "b"), AtomicReferenceFieldUpdater.newUpdater(a4.class, z3.class, "c"), AtomicReferenceFieldUpdater.newUpdater(a4.class, v3.class, "b"), AtomicReferenceFieldUpdater.newUpdater(a4.class, Object.class, "a"));
            th = null;
        } catch (Throwable th) {
            th = th;
            y3Var = new y3();
        }
        f = y3Var;
        if (th != null) {
            e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        h = new Object();
    }

    public static void e(a4 a4Var) {
        v3 v3Var;
        v3 v3Var2;
        v3 v3Var3 = null;
        while (true) {
            z3 z3Var = a4Var.c;
            if (f.c(a4Var, z3Var, z3.c)) {
                while (z3Var != null) {
                    Thread thread = z3Var.a;
                    if (thread != null) {
                        z3Var.a = null;
                        LockSupport.unpark(thread);
                    }
                    z3Var = z3Var.b;
                }
                a4Var.d();
                do {
                    v3Var = a4Var.b;
                } while (!f.a(a4Var, v3Var, v3.d));
                while (true) {
                    v3Var2 = v3Var3;
                    v3Var3 = v3Var;
                    if (v3Var3 == null) {
                        break;
                    }
                    v3Var = v3Var3.c;
                    v3Var3.c = v3Var2;
                }
                while (v3Var2 != null) {
                    v3Var3 = v3Var2.c;
                    Runnable runnable = v3Var2.a;
                    if (runnable instanceof x3) {
                        x3 x3Var = (x3) runnable;
                        a4Var = x3Var.a;
                        if (a4Var.a == x3Var) {
                            if (f.b(a4Var, x3Var, h(x3Var.b))) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        f(runnable, v3Var2.b);
                    }
                    v3Var2 = v3Var3;
                }
                return;
            }
        }
    }

    public static void f(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            e.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e2);
        }
    }

    public static Object g(Object obj) {
        if (obj instanceof t3) {
            CancellationException cancellationException = ((t3) obj).b;
            CancellationException cancellationException2 = new CancellationException("Task was cancelled.");
            cancellationException2.initCause(cancellationException);
            throw cancellationException2;
        }
        if (obj instanceof u3) {
            throw new ExecutionException(((u3) obj).a);
        }
        if (obj == h) {
            return null;
        }
        return obj;
    }

    public static Object h(t56 t56Var) {
        Object obj;
        if (t56Var instanceof a4) {
            Object obj2 = ((a4) t56Var).a;
            if (!(obj2 instanceof t3)) {
                return obj2;
            }
            t3 t3Var = (t3) obj2;
            return t3Var.a ? t3Var.b != null ? new t3(false, t3Var.b) : t3.d : obj2;
        }
        boolean isCancelled = t56Var.isCancelled();
        boolean z = true;
        if ((!d) && isCancelled) {
            return t3.d;
        }
        boolean z2 = false;
        while (true) {
            try {
                try {
                    obj = t56Var.get();
                    break;
                } catch (InterruptedException unused) {
                    z2 = z;
                } catch (Throwable th) {
                    if (z2) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (CancellationException e2) {
                if (isCancelled) {
                    return new t3(false, e2);
                }
                return new u3(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + t56Var, e2));
            } catch (ExecutionException e3) {
                return new u3(e3.getCause());
            } catch (Throwable th2) {
                return new u3(th2);
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        return obj == null ? h : obj;
    }

    public final void a(StringBuilder sb) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                try {
                    obj = get();
                    break;
                } catch (InterruptedException unused) {
                    z = true;
                } catch (Throwable th) {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (CancellationException unused2) {
                sb.append("CANCELLED");
                return;
            } catch (RuntimeException e2) {
                sb.append("UNKNOWN, cause=[");
                sb.append(e2.getClass());
                sb.append(" thrown from get()]");
                return;
            } catch (ExecutionException e3) {
                sb.append("FAILURE, cause=[");
                sb.append(e3.getCause());
                sb.append("]");
                return;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        sb.append("SUCCESS, result=[");
        sb.append(obj == this ? "this future" : String.valueOf(obj));
        sb.append("]");
    }

    @Override // t56
    public final void b(Runnable runnable, Executor executor) {
        executor.getClass();
        v3 v3Var = this.b;
        v3 v3Var2 = v3.d;
        if (v3Var != v3Var2) {
            v3 v3Var3 = new v3(runnable, executor);
            do {
                v3Var3.c = v3Var;
                if (f.a(this, v3Var, v3Var3)) {
                    return;
                } else {
                    v3Var = this.b;
                }
            } while (v3Var != v3Var2);
        }
        f(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        Object obj = this.a;
        if (!(obj == null) && !(obj instanceof x3)) {
            return false;
        }
        t3 t3Var = d ? new t3(z, new CancellationException("Future.cancel() was called.")) : z ? t3.c : t3.d;
        boolean z2 = false;
        while (true) {
            if (f.b(this, obj, t3Var)) {
                e(this);
                if (!(obj instanceof x3)) {
                    break;
                }
                t56 t56Var = ((x3) obj).b;
                if (!(t56Var instanceof a4)) {
                    t56Var.cancel(z);
                    break;
                }
                this = (a4) t56Var;
                obj = this.a;
                if (!(obj == null) && !(obj instanceof x3)) {
                    break;
                }
                z2 = true;
            } else {
                obj = this.a;
                if (!(obj instanceof x3)) {
                    return z2;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00bd  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00b0 -> B:33:0x0078). Please report as a decompilation issue!!! */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(long j, TimeUnit timeUnit) {
        boolean z;
        long nanoTime;
        z3 z3Var = z3.c;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.a;
        if ((obj != null) && (!(obj instanceof x3))) {
            return g(obj);
        }
        long nanoTime2 = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            z3 z3Var2 = this.c;
            if (z3Var2 != z3Var) {
                z3 z3Var3 = new z3();
                z = true;
                do {
                    fld fldVar = f;
                    fldVar.d(z3Var3, z3Var2);
                    if (fldVar.c(this, z3Var2, z3Var3)) {
                        while (true) {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                j(z3Var3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.a;
                            if ((obj2 != null) && (!(obj2 instanceof x3))) {
                                return g(obj2);
                            }
                            nanoTime = nanoTime2 - System.nanoTime();
                            if (nanoTime < 1000) {
                                j(z3Var3);
                                break;
                            }
                            nanos = nanoTime;
                        }
                    } else {
                        z3Var2 = this.c;
                    }
                } while (z3Var2 != z3Var);
            }
            return g(this.a);
        }
        z = true;
        if (nanos <= 0) {
            String a4Var = toString();
            String obj3 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = obj3.toLowerCase(locale);
            StringBuilder o = ug8.o(j, "Waited ", " ");
            o.append(timeUnit.toString().toLowerCase(locale));
            String sb = o.toString();
            if (nanos + 1000 < 0) {
                String concat = sb.concat(" (plus ");
                long j2 = -nanos;
                long convert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
                long nanos2 = j2 - timeUnit.toNanos(convert);
                boolean z2 = (convert == 0 || nanos2 > 1000) ? z : false;
                if (convert > 0) {
                    String str = concat + convert + " " + lowerCase;
                    if (z2) {
                        str = str.concat(",");
                    }
                    concat = str.concat(" ");
                }
                if (z2) {
                    concat = ug8.n(nanos2, concat, " nanoseconds ");
                }
                sb = concat.concat("delay)");
            }
            if (isDone()) {
                throw new TimeoutException(sb.concat(" but future completed as timeout expired"));
            }
            throw new TimeoutException(tb4.y(sb, " for ", a4Var));
        }
        Object obj4 = this.a;
        if ((obj4 != null ? z : false) && (!(obj4 instanceof x3))) {
            return g(obj4);
        }
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        nanoTime = nanoTime2 - System.nanoTime();
        nanos = nanoTime;
        if (nanos <= 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String i() {
        Object obj = this.a;
        if (obj instanceof x3) {
            StringBuilder sb = new StringBuilder("setFuture=[");
            t56 t56Var = ((x3) obj).b;
            return b00.j(sb, t56Var == this ? "this future" : String.valueOf(t56Var), "]");
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.a instanceof t3;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (this.a != null) & (!(r2 instanceof x3));
    }

    public final void j(z3 z3Var) {
        z3Var.a = null;
        while (true) {
            z3 z3Var2 = this.c;
            if (z3Var2 != z3.c) {
                z3 z3Var3 = null;
                while (z3Var2 != null) {
                    z3 z3Var4 = z3Var2.b;
                    if (z3Var2.a != null) {
                        z3Var3 = z3Var2;
                    } else if (z3Var3 != null) {
                        z3Var3.b = z3Var4;
                        if (z3Var3.a == null) {
                            break;
                        }
                    } else if (f.c(this, z3Var2, z3Var4)) {
                    }
                    z3Var2 = z3Var4;
                }
                return;
            }
            return;
        }
    }

    public final boolean k(Object obj) {
        if (obj == null) {
            obj = h;
        }
        if (!f.b(this, null, obj)) {
            return false;
        }
        e(this);
        return true;
    }

    public final boolean l(Throwable th) {
        if (!f.b(this, null, new u3(th))) {
            return false;
        }
        e(this);
        return true;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.a instanceof t3) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            a(sb);
        } else {
            try {
                str = i();
            } catch (RuntimeException e2) {
                str = "Exception thrown from implementation: " + e2.getClass();
            }
            if (str != null && !str.isEmpty()) {
                ug8.z("PENDING, info=[", str, "]", sb);
            } else if (isDone()) {
                a(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public void d() {
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        z3 z3Var = z3.c;
        if (!Thread.interrupted()) {
            Object obj2 = this.a;
            if ((obj2 != null) & (!(obj2 instanceof x3))) {
                return g(obj2);
            }
            z3 z3Var2 = this.c;
            if (z3Var2 != z3Var) {
                z3 z3Var3 = new z3();
                do {
                    fld fldVar = f;
                    fldVar.d(z3Var3, z3Var2);
                    if (fldVar.c(this, z3Var2, z3Var3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.a;
                            } else {
                                j(z3Var3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof x3))));
                        return g(obj);
                    }
                    z3Var2 = this.c;
                } while (z3Var2 != z3Var);
            }
            return g(this.a);
        }
        throw new InterruptedException();
    }
}
