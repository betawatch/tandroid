package od;

import i7.a7;
import i7.c7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import jd.a0;
import jd.b0;
import jd.b2;
import jd.c2;
import jd.e0;
import jd.f1;
import jd.g2;
import jd.w0;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class a {
    public static final fc.a a = new fc.a("NO_DECISION", 2);
    public static final fc.a b = new fc.a("CLOSED", 2);
    public static final fc.a c = new fc.a("UNDEFINED", 2);
    public static final fc.a d = new fc.a("REUSABLE_CLAIMED", 2);
    public static final fc.a e = new fc.a("CONDITION_FALSE", 2);
    public static final fc.a f = new fc.a("NO_THREAD_ELEMENTS", 2);

    public static final Object a(u uVar, long j10, bd.p pVar) {
        while (true) {
            if (uVar.c >= j10 && !uVar.d()) {
                return uVar;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.a;
            Object obj = atomicReferenceFieldUpdater.get(uVar);
            fc.a aVar = b;
            if (obj == aVar) {
                return aVar;
            }
            u uVar2 = (u) ((d) obj);
            if (uVar2 == null) {
                uVar2 = (u) pVar.invoke(Long.valueOf(uVar.c + 1), uVar);
                while (!atomicReferenceFieldUpdater.compareAndSet(uVar, null, uVar2)) {
                    if (atomicReferenceFieldUpdater.get(uVar) != null) {
                        break;
                    }
                }
                if (uVar.d()) {
                    uVar.e();
                }
            }
            uVar = uVar2;
        }
    }

    public static final u b(Object obj) {
        if (obj != b) {
            return (u) obj;
        }
        throw new IllegalStateException("Does not contain segment");
    }

    public static final void c(Throwable th2, sc.h hVar) {
        Throwable runtimeException;
        Iterator it = f.a.iterator();
        while (it.hasNext()) {
            try {
                ((kd.b) it.next()).c(th2);
            } catch (Throwable th3) {
                if (th2 == th3) {
                    runtimeException = th2;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th3);
                    a7.a(runtimeException, th2);
                }
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, runtimeException);
            }
        }
        try {
            a7.a(th2, new g(hVar));
        } catch (Throwable unused) {
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th2);
    }

    public static final boolean d(Object obj) {
        return obj == b;
    }

    public static final Object e(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    public static final void f(sc.h hVar, Object obj) {
        if (obj == f) {
            return;
        }
        if (!(obj instanceof z)) {
            Object fold = hVar.fold(null, x.d);
            kotlin.jvm.internal.j.c(fold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            a4.w.u(fold);
            throw null;
        }
        z zVar = (z) obj;
        b2[] b2VarArr = zVar.b;
        int length = b2VarArr.length - 1;
        if (length < 0) {
            return;
        }
        b2 b2Var = b2VarArr[length];
        kotlin.jvm.internal.j.b(null);
        Object obj2 = zVar.a[length];
        throw null;
    }

    public static final void g(Object obj, sc.c cVar) {
        if (!(cVar instanceof h)) {
            cVar.resumeWith(obj);
            return;
        }
        h hVar = (h) cVar;
        a0 a0Var = hVar.d;
        uc.c cVar2 = hVar.e;
        Throwable a2 = qc.f.a(obj);
        Object vVar = a2 == null ? obj : new jd.v(a2, false);
        cVar2.getContext();
        if (a0Var.e()) {
            hVar.f = vVar;
            hVar.c = 1;
            a0Var.c(cVar2.getContext(), hVar);
            return;
        }
        w0 a10 = c2.a();
        if (a10.c >= 4294967296L) {
            hVar.f = vVar;
            hVar.c = 1;
            rc.e eVar = a10.e;
            if (eVar == null) {
                eVar = new rc.e();
                a10.e = eVar;
            }
            eVar.addLast(hVar);
            return;
        }
        a10.h(true);
        try {
            f1 f1Var = (f1) cVar2.getContext().get(b0.b);
            if (f1Var == null || f1Var.isActive()) {
                Object obj2 = hVar.h;
                sc.h context = cVar2.getContext();
                Object k9 = k(context, obj2);
                g2 v = k9 != f ? e0.v(cVar2, context, k9) : null;
                try {
                    cVar2.resumeWith(obj);
                } finally {
                    if (v == null || v.M()) {
                        f(context, k9);
                    }
                }
            } else {
                CancellationException cancellationException = f1Var.getCancellationException();
                hVar.c(vVar, cancellationException);
                hVar.resumeWith(c7.a(cancellationException));
            }
            while (a10.j()) {
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long i(String str, long j10, long j11, long j12) {
        String str2;
        Long l10;
        boolean z10;
        int i10;
        int i11;
        int i12 = w.a;
        try {
            str2 = System.getProperty(str);
        } catch (SecurityException unused) {
            str2 = null;
        }
        if (str2 == null) {
            return j10;
        }
        int length = str2.length();
        if (length != 0) {
            int i13 = 0;
            char charAt = str2.charAt(0);
            long j13 = -9223372036854775807L;
            if (charAt < '0') {
                z10 = true;
                if (length != 1) {
                    if (charAt == '+') {
                        i13 = 1;
                    } else if (charAt == '-') {
                        j13 = Long.MIN_VALUE;
                        i13 = 1;
                        long j14 = 0;
                        long j15 = -256204778801521550L;
                        while (i13 < length) {
                            int digit = Character.digit((int) str2.charAt(i13), 10);
                            if (digit >= 0) {
                                if (j14 >= j15) {
                                    i10 = length;
                                    i11 = i13;
                                } else if (j15 == -256204778801521550L) {
                                    i10 = length;
                                    i11 = i13;
                                    j15 = j13 / 10;
                                    if (j14 < j15) {
                                    }
                                }
                                long j16 = j14 * 10;
                                long j17 = digit;
                                if (j16 >= j13 + j17) {
                                    j14 = j16 - j17;
                                    i13 = i11 + 1;
                                    length = i10;
                                }
                            }
                        }
                        l10 = !z10 ? Long.valueOf(j14) : Long.valueOf(-j14);
                        if (l10 == null) {
                            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + str2 + '\'').toString());
                        }
                        long longValue = l10.longValue();
                        if (j11 <= longValue && longValue <= j12) {
                            return longValue;
                        }
                        throw new IllegalStateException(("System property '" + str + "' should be in range " + j11 + ".." + j12 + ", but is '" + longValue + '\'').toString());
                    }
                }
            }
            z10 = false;
            long j142 = 0;
            long j152 = -256204778801521550L;
            while (i13 < length) {
            }
            if (!z10) {
            }
            if (l10 == null) {
            }
        }
        l10 = null;
        if (l10 == null) {
        }
    }

    public static int j(int i10, int i11, String str) {
        return (int) i(str, i10, 1, (i11 & 8) != 0 ? ConnectionsManager.DEFAULT_DATACENTER_ID : 2097150);
    }

    public static final Object k(sc.h hVar, Object obj) {
        if (obj == null) {
            obj = hVar.fold(0, x.c);
            kotlin.jvm.internal.j.b(obj);
        }
        if (obj == 0) {
            return f;
        }
        if (obj instanceof Integer) {
            return hVar.fold(new z(((Number) obj).intValue(), hVar), x.e);
        }
        a4.w.u(obj);
        throw null;
    }
}
