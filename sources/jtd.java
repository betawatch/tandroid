// default package

import j$.util.Objects;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class jtd extends rod implements prd {
    public prd n;
    public ScheduledFuture r;

    public static Object e(Object obj) {
        if (obj instanceof znd) {
            RuntimeException runtimeException = ((znd) obj).b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(runtimeException);
            throw cancellationException;
        }
        if (!(obj instanceof cod)) {
            if (obj == rod.d) {
                return null;
            }
            return obj;
        }
        Throwable th = ((cod) obj).a;
        if (th != null) {
            throw new ExecutionException(th);
        }
        rod.e.c().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "getDoneValue", "Failure.exception is unexpectedly null.");
        throw new ExecutionException(cod.c.a);
    }

    public static boolean g(Object obj) {
        return !(obj instanceof aod);
    }

    public static Object h(prd prdVar) {
        Object obj;
        Throwable d;
        if (prdVar instanceof jtd) {
            Object obj2 = ((jtd) prdVar).a;
            if (obj2 instanceof znd) {
                znd zndVar = (znd) obj2;
                if (zndVar.a) {
                    RuntimeException runtimeException = zndVar.b;
                    obj2 = runtimeException != null ? new znd(false, runtimeException) : znd.d;
                }
            }
            Objects.requireNonNull(obj2);
            return obj2;
        }
        if ((prdVar instanceof rod) && (d = ((rod) prdVar).d()) != null) {
            return new cod(d);
        }
        boolean isCancelled = prdVar.isCancelled();
        boolean z = true;
        if ((!rod.f) && isCancelled) {
            znd zndVar2 = znd.d;
            Objects.requireNonNull(zndVar2);
            return zndVar2;
        }
        boolean z2 = false;
        while (true) {
            try {
                try {
                    obj = prdVar.get();
                    break;
                } catch (InterruptedException unused) {
                    z2 = z;
                } catch (Throwable th) {
                    if (z2) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (Error e) {
                e = e;
                return new cod(e);
            } catch (CancellationException e2) {
                return !isCancelled ? new cod(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(prdVar)), e2)) : new znd(false, e2);
            } catch (ExecutionException e3) {
                return isCancelled ? new znd(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(prdVar)), e3)) : new cod(e3.getCause());
            } catch (Exception e4) {
                e = e4;
                return new cod(e);
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        return isCancelled ? new znd(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(prdVar)))) : obj == null ? rod.d : obj;
    }

    public static void j(jtd jtdVar) {
        dod dodVar;
        dod dodVar2 = null;
        while (true) {
            jtdVar.getClass();
            for (lod b = rod.h.b(jtdVar); b != null; b = b.b) {
                Thread thread = b.a;
                if (thread != null) {
                    b.a = null;
                    LockSupport.unpark(thread);
                }
            }
            prd prdVar = jtdVar.n;
            if ((prdVar != null) & (jtdVar.a instanceof znd)) {
                Object obj = jtdVar.a;
                prdVar.cancel((obj instanceof znd) && ((znd) obj).a);
            }
            ScheduledFuture scheduledFuture = jtdVar.r;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            jtdVar.n = null;
            jtdVar.r = null;
            dod dodVar3 = dodVar2;
            dod a = rod.h.a(jtdVar);
            dod dodVar4 = dodVar3;
            while (a != null) {
                dod dodVar5 = a.c;
                a.c = dodVar4;
                dodVar4 = a;
                a = dodVar5;
            }
            while (dodVar4 != null) {
                Runnable runnable = dodVar4.a;
                dodVar = dodVar4.c;
                Objects.requireNonNull(runnable);
                if (runnable instanceof aod) {
                    aod aodVar = (aod) runnable;
                    jtdVar = aodVar.a;
                    if (jtdVar.a == aodVar) {
                        if (rod.h.f(jtdVar, aodVar, h(aodVar.b))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = dodVar4.b;
                    Objects.requireNonNull(executor);
                    k(runnable, executor);
                }
                dodVar4 = dodVar;
            }
            return;
            dodVar2 = dodVar;
        }
    }

    public static void k(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            rod.e.c().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", qd4.q("RuntimeException while executing runnable ", String.valueOf(runnable), " with executor ", String.valueOf(executor)), (Throwable) e);
        }
    }

    @Override // prd
    public final void c(Runnable runnable, Executor executor) {
        dod dodVar;
        dod dodVar2 = dod.d;
        if (executor == null) {
            p3d.h("Executor was null.");
            return;
        }
        if (!isDone() && (dodVar = this.b) != dodVar2) {
            dod dodVar3 = new dod(runnable, executor);
            do {
                dodVar3.c = dodVar;
                if (rod.h.e(this, dodVar, dodVar3)) {
                    return;
                } else {
                    dodVar = this.b;
                }
            } while (dodVar != dodVar2);
        }
        k(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        znd zndVar;
        Object obj = this.a;
        if (!(obj == null) && !(obj instanceof aod)) {
            return false;
        }
        if (rod.f) {
            zndVar = new znd(z, new CancellationException("Future.cancel() was called."));
        } else {
            zndVar = z ? znd.c : znd.d;
            Objects.requireNonNull(zndVar);
        }
        boolean z2 = false;
        while (true) {
            if (rod.h.f(this, obj, zndVar)) {
                j(this);
                if (!(obj instanceof aod)) {
                    break;
                }
                prd prdVar = ((aod) obj).b;
                if (!(prdVar instanceof jtd)) {
                    prdVar.cancel(z);
                    break;
                }
                this = (jtd) prdVar;
                obj = this.a;
                if (!(obj == null) && !(obj instanceof aod)) {
                    break;
                }
                z2 = true;
            } else {
                obj = this.a;
                if (g(obj)) {
                    return z2;
                }
            }
        }
        return true;
    }

    @Override // rod
    public final Throwable d() {
        if (!(this instanceof jtd)) {
            return null;
        }
        Object obj = this.a;
        if (obj instanceof cod) {
            return ((cod) obj).a;
        }
        return null;
    }

    public final String f() {
        prd prdVar = this.n;
        ScheduledFuture scheduledFuture = this.r;
        if (prdVar == null) {
            return null;
        }
        String y = qd4.y("inputFuture=[", prdVar.toString(), "]");
        if (scheduledFuture != null) {
            long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
            if (delay > 0) {
                return y + ", remaining delay=[" + delay + " ms]";
            }
        }
        return y;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ca  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00bd -> B:33:0x0080). Please report as a decompilation issue!!! */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(long j, TimeUnit timeUnit) {
        long j2;
        long nanoTime;
        lod lodVar = lod.c;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.a;
        if ((obj != null) && g(obj)) {
            return e(obj);
        }
        long j3 = 0;
        long nanoTime2 = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            lod lodVar2 = this.c;
            if (lodVar2 != lodVar) {
                lod lodVar3 = new lod();
                while (true) {
                    o5f o5fVar = rod.h;
                    o5fVar.c(lodVar3, lodVar2);
                    j2 = j3;
                    if (!o5fVar.g(this, lodVar2, lodVar3)) {
                        lodVar2 = this.c;
                        if (lodVar2 == lodVar) {
                            break;
                        }
                        j3 = j2;
                    } else {
                        while (true) {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                a(lodVar3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.a;
                            if ((obj2 != null) && g(obj2)) {
                                return e(obj2);
                            }
                            nanoTime = nanoTime2 - System.nanoTime();
                            if (nanoTime < 1000) {
                                a(lodVar3);
                                break;
                            }
                            nanos = nanoTime;
                        }
                    }
                }
            }
            Object obj3 = this.a;
            Objects.requireNonNull(obj3);
            return e(obj3);
        }
        j2 = 0;
        if (nanos <= j2) {
            String jtdVar = toString();
            String obj4 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = obj4.toLowerCase(locale);
            String str = "Waited " + j + " " + timeUnit.toString().toLowerCase(locale);
            if (nanos + 1000 < j2) {
                String concat = str.concat(" (plus ");
                long j4 = -nanos;
                long convert = timeUnit.convert(j4, TimeUnit.NANOSECONDS);
                long nanos2 = j4 - timeUnit.toNanos(convert);
                boolean z = convert == j2 || nanos2 > 1000;
                if (convert > j2) {
                    String str2 = concat + convert + " " + lowerCase;
                    if (z) {
                        str2 = str2.concat(",");
                    }
                    concat = str2.concat(" ");
                }
                if (z) {
                    concat = ik8.n(nanos2, concat, " nanoseconds ");
                }
                str = concat.concat("delay)");
            }
            if (isDone()) {
                throw new TimeoutException(str.concat(" but future completed as timeout expired"));
            }
            throw new TimeoutException(qd4.y(str, " for ", jtdVar));
        }
        Object obj5 = this.a;
        if ((obj5 != null) && g(obj5)) {
            return e(obj5);
        }
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        nanoTime = nanoTime2 - System.nanoTime();
        nanos = nanoTime;
        if (nanos <= j2) {
        }
    }

    public final void i(StringBuilder sb) {
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
            } catch (ExecutionException e) {
                sb.append("FAILURE, cause=[");
                sb.append(e.getCause());
                sb.append("]");
                return;
            } catch (Exception e2) {
                sb.append("UNKNOWN, cause=[");
                sb.append(e2.getClass());
                sb.append(" thrown from get()]");
                return;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        sb.append("SUCCESS, result=[");
        if (obj == null) {
            sb.append("null");
        } else if (obj == this) {
            sb.append("this future");
        } else {
            sb.append(obj.getClass().getName());
            sb.append("@");
            sb.append(Integer.toHexString(System.identityHashCode(obj)));
        }
        sb.append("]");
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.a instanceof znd;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.a;
        return (obj != null) & g(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a6, code lost:
    
        if (r3.isEmpty() != false) goto L32;
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
        if (this.a instanceof znd) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            i(sb);
        } else {
            int length = sb.length();
            sb.append("PENDING");
            Object obj = this.a;
            if (obj instanceof aod) {
                sb.append(", setFuture=[");
                prd prdVar = ((aod) obj).b;
                try {
                    if (prdVar == this) {
                        sb.append("this future");
                    } else {
                        sb.append(prdVar);
                    }
                } catch (Throwable th) {
                    if ((th instanceof Error) && !(th instanceof StackOverflowError)) {
                        throw th;
                    }
                    sb.append("Exception thrown from implementation: ");
                    sb.append(th.getClass());
                }
                sb.append("]");
            } else {
                try {
                    concat = f();
                    if (concat != null) {
                    }
                    concat = null;
                } catch (Throwable th2) {
                    if ((th2 instanceof Error) && !(th2 instanceof StackOverflowError)) {
                        throw th2;
                    }
                    concat = "Exception thrown from implementation: ".concat(String.valueOf(th2.getClass()));
                }
                if (concat != null) {
                    ik8.z(", info=[", concat, "]", sb);
                }
            }
            if (isDone()) {
                sb.delete(length, sb.length());
                i(sb);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        lod lodVar = lod.c;
        if (!Thread.interrupted()) {
            Object obj2 = this.a;
            if ((obj2 != null) & g(obj2)) {
                return e(obj2);
            }
            lod lodVar2 = this.c;
            if (lodVar2 != lodVar) {
                lod lodVar3 = new lod();
                do {
                    o5f o5fVar = rod.h;
                    o5fVar.c(lodVar3, lodVar2);
                    if (o5fVar.g(this, lodVar2, lodVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.a;
                            } else {
                                a(lodVar3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & g(obj)));
                        return e(obj);
                    }
                    lodVar2 = this.c;
                } while (lodVar2 != lodVar);
            }
            Object obj3 = this.a;
            Objects.requireNonNull(obj3);
            return e(obj3);
        }
        throw new InterruptedException();
    }
}
