package md;

import g7.w5;
import g7.y5;
import hd.a0;
import hd.b0;
import hd.c2;
import hd.d2;
import hd.f0;
import hd.g1;
import hd.h2;
import hd.x0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class a {
    public static final e5.c a = new e5.c("NO_DECISION", 2);
    public static final e5.c b = new e5.c("CLOSED", 2);
    public static final e5.c c = new e5.c("UNDEFINED", 2);
    public static final e5.c d = new e5.c("REUSABLE_CLAIMED", 2);
    public static final e5.c e = new e5.c("CONDITION_FALSE", 2);
    public static final e5.c f = new e5.c("NO_THREAD_ELEMENTS", 2);

    public static final Object a(t tVar, long j10, zc.p pVar) {
        while (true) {
            if (tVar.c >= j10 && !tVar.d()) {
                return tVar;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.a;
            Object obj = atomicReferenceFieldUpdater.get(tVar);
            e5.c cVar = b;
            if (obj == cVar) {
                return cVar;
            }
            t tVar2 = (t) ((d) obj);
            if (tVar2 == null) {
                tVar2 = (t) pVar.invoke(Long.valueOf(tVar.c + 1), tVar);
                while (!atomicReferenceFieldUpdater.compareAndSet(tVar, null, tVar2)) {
                    if (atomicReferenceFieldUpdater.get(tVar) != null) {
                        break;
                    }
                }
                if (tVar.d()) {
                    tVar.e();
                }
            }
            tVar = tVar2;
        }
    }

    public static final t b(Object obj) {
        if (obj != b) {
            return (t) obj;
        }
        throw new IllegalStateException("Does not contain segment");
    }

    public static final void c(Throwable th, qc.h hVar) {
        Throwable runtimeException;
        Iterator it = f.a.iterator();
        while (it.hasNext()) {
            try {
                ((id.b) it.next()).c(th);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    w5.a(runtimeException, th);
                }
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, runtimeException);
            }
        }
        try {
            w5.a(th, new g(hVar));
        } catch (Throwable unused) {
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
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

    public static final void f(qc.h hVar, Object obj) {
        if (obj == f) {
            return;
        }
        if (!(obj instanceof y)) {
            Object fold = hVar.fold(null, w.d);
            kotlin.jvm.internal.i.c(fold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            aa.d.v(fold);
            throw null;
        }
        y yVar = (y) obj;
        c2[] c2VarArr = yVar.b;
        int length = c2VarArr.length - 1;
        if (length < 0) {
            return;
        }
        c2 c2Var = c2VarArr[length];
        kotlin.jvm.internal.i.b(null);
        Object obj2 = yVar.a[length];
        throw null;
    }

    public static final void g(Object obj, qc.c cVar) {
        if (!(cVar instanceof h)) {
            cVar.resumeWith(obj);
            return;
        }
        h hVar = (h) cVar;
        a0 a0Var = hVar.d;
        sc.c cVar2 = hVar.e;
        Throwable a2 = oc.f.a(obj);
        Object vVar = a2 == null ? obj : new hd.v(a2, false);
        cVar2.getContext();
        if (a0Var.e()) {
            hVar.f = vVar;
            hVar.c = 1;
            a0Var.c(cVar2.getContext(), hVar);
            return;
        }
        x0 a3 = d2.a();
        if (a3.c >= 4294967296L) {
            hVar.f = vVar;
            hVar.c = 1;
            pc.e eVar = a3.e;
            if (eVar == null) {
                eVar = new pc.e();
                a3.e = eVar;
            }
            eVar.addLast(hVar);
            return;
        }
        a3.h(true);
        try {
            g1 g1Var = (g1) cVar2.getContext().get(b0.b);
            if (g1Var == null || g1Var.isActive()) {
                Object obj2 = hVar.h;
                qc.h context = cVar2.getContext();
                Object k10 = k(context, obj2);
                h2 v = k10 != f ? f0.v(cVar2, context, k10) : null;
                try {
                    cVar2.resumeWith(obj);
                } finally {
                    if (v == null || v.M()) {
                        f(context, k10);
                    }
                }
            } else {
                CancellationException cancellationException = g1Var.getCancellationException();
                hVar.c(vVar, cancellationException);
                hVar.resumeWith(y5.a(cancellationException));
            }
            while (a3.j()) {
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
        int i9;
        int i10;
        int i11 = v.a;
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
            int i12 = 0;
            char charAt = str2.charAt(0);
            long j13 = -9223372036854775807L;
            if (charAt < '0') {
                z10 = true;
                if (length != 1) {
                    if (charAt == '+') {
                        i12 = 1;
                    } else if (charAt == '-') {
                        j13 = Long.MIN_VALUE;
                        i12 = 1;
                        long j14 = 0;
                        long j15 = -256204778801521550L;
                        while (i12 < length) {
                            int digit = Character.digit((int) str2.charAt(i12), 10);
                            if (digit >= 0) {
                                if (j14 >= j15) {
                                    i9 = length;
                                    i10 = i12;
                                } else if (j15 == -256204778801521550L) {
                                    i9 = length;
                                    i10 = i12;
                                    j15 = j13 / 10;
                                    if (j14 < j15) {
                                    }
                                }
                                long j16 = j14 * 10;
                                long j17 = digit;
                                if (j16 >= j13 + j17) {
                                    j14 = j16 - j17;
                                    i12 = i10 + 1;
                                    length = i9;
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
            while (i12 < length) {
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

    public static int j(int i9, int i10, String str) {
        return (int) i(str, i9, 1, (i10 & 8) != 0 ? ConnectionsManager.DEFAULT_DATACENTER_ID : 2097150);
    }

    public static final Object k(qc.h hVar, Object obj) {
        if (obj == null) {
            obj = hVar.fold(0, w.c);
            kotlin.jvm.internal.i.b(obj);
        }
        if (obj == 0) {
            return f;
        }
        if (obj instanceof Integer) {
            return hVar.fold(new y(((Number) obj).intValue(), hVar), w.e);
        }
        aa.d.v(obj);
        throw null;
    }
}
