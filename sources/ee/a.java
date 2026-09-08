package ee;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.telegram.tgnet.ConnectionsManager;
import v7.r7;
import v7.t7;
import zd.a0;
import zd.b0;
import zd.b2;
import zd.c2;
import zd.e0;
import zd.f1;
import zd.g2;
import zd.w0;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public abstract class a {
    public static final d9.f a = new d9.f("NO_DECISION", 1);
    public static final d9.f b = new d9.f("CLOSED", 1);
    public static final d9.f c = new d9.f("UNDEFINED", 1);
    public static final d9.f d = new d9.f("REUSABLE_CLAIMED", 1);
    public static final d9.f e = new d9.f("CONDITION_FALSE", 1);
    public static final d9.f f = new d9.f("NO_THREAD_ELEMENTS", 1);

    public static final Object a(t tVar, long j3, rd.p pVar) {
        while (true) {
            if (tVar.c >= j3 && !tVar.d()) {
                return tVar;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.a;
            Object obj = atomicReferenceFieldUpdater.get(tVar);
            d9.f fVar = b;
            if (obj == fVar) {
                return fVar;
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

    public static final void c(id.h hVar, Throwable th2) {
        Throwable runtimeException;
        Iterator it = f.a.iterator();
        while (it.hasNext()) {
            try {
                ((ae.b) it.next()).c(th2);
            } catch (Throwable th3) {
                if (th2 == th3) {
                    runtimeException = th2;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th3);
                    r7.a(runtimeException, th2);
                }
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, runtimeException);
            }
        }
        try {
            r7.a(th2, new g(hVar));
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

    public static final void f(id.h hVar, Object obj) {
        if (obj == f) {
            return;
        }
        if (!(obj instanceof y)) {
            Object fold = hVar.fold(null, w.d);
            kotlin.jvm.internal.i.c(fold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            a4.a.y(fold);
            throw null;
        }
        y yVar = (y) obj;
        b2[] b2VarArr = yVar.b;
        int length = b2VarArr.length - 1;
        if (length < 0) {
            return;
        }
        b2 b2Var = b2VarArr[length];
        kotlin.jvm.internal.i.b(null);
        Object obj2 = yVar.a[length];
        throw null;
    }

    public static final void g(Object obj, id.c cVar) {
        if (!(cVar instanceof h)) {
            cVar.resumeWith(obj);
            return;
        }
        h hVar = (h) cVar;
        a0 a0Var = hVar.d;
        kd.c cVar2 = hVar.e;
        Throwable a2 = gd.f.a(obj);
        Object vVar = a2 == null ? obj : new zd.v(a2, false);
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
            hd.e eVar = a10.e;
            if (eVar == null) {
                eVar = new hd.e();
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
                id.h context = cVar2.getContext();
                Object k10 = k(context, obj2);
                g2 v = k10 != f ? e0.v(cVar2, context, k10) : null;
                try {
                    cVar2.resumeWith(obj);
                } finally {
                    if (v == null || v.M()) {
                        f(context, k10);
                    }
                }
            } else {
                CancellationException cancellationException = f1Var.getCancellationException();
                hVar.c(vVar, cancellationException);
                hVar.resumeWith(t7.a(cancellationException));
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
    public static final long i(String str, long j3, long j10, long j11) {
        String str2;
        Long l4;
        boolean z10;
        int i10;
        int i11;
        int i12 = v.a;
        try {
            str2 = System.getProperty(str);
        } catch (SecurityException unused) {
            str2 = null;
        }
        if (str2 == null) {
            return j3;
        }
        int length = str2.length();
        if (length != 0) {
            int i13 = 0;
            char charAt = str2.charAt(0);
            long j12 = -9223372036854775807L;
            if (charAt < '0') {
                z10 = true;
                if (length != 1) {
                    if (charAt == '+') {
                        i13 = 1;
                    } else if (charAt == '-') {
                        j12 = Long.MIN_VALUE;
                        i13 = 1;
                        long j13 = 0;
                        long j14 = -256204778801521550L;
                        while (i13 < length) {
                            int digit = Character.digit((int) str2.charAt(i13), 10);
                            if (digit >= 0) {
                                if (j13 >= j14) {
                                    i10 = length;
                                    i11 = i13;
                                } else if (j14 == -256204778801521550L) {
                                    i10 = length;
                                    i11 = i13;
                                    j14 = j12 / 10;
                                    if (j13 < j14) {
                                    }
                                }
                                long j15 = j13 * 10;
                                long j16 = digit;
                                if (j15 >= j12 + j16) {
                                    j13 = j15 - j16;
                                    i13 = i11 + 1;
                                    length = i10;
                                }
                            }
                        }
                        l4 = !z10 ? Long.valueOf(j13) : Long.valueOf(-j13);
                        if (l4 == null) {
                            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + str2 + '\'').toString());
                        }
                        long longValue = l4.longValue();
                        if (j10 <= longValue && longValue <= j11) {
                            return longValue;
                        }
                        throw new IllegalStateException(("System property '" + str + "' should be in range " + j10 + ".." + j11 + ", but is '" + longValue + '\'').toString());
                    }
                }
            }
            z10 = false;
            long j132 = 0;
            long j142 = -256204778801521550L;
            while (i13 < length) {
            }
            if (!z10) {
            }
            if (l4 == null) {
            }
        }
        l4 = null;
        if (l4 == null) {
        }
    }

    public static int j(int i10, int i11, String str) {
        return (int) i(str, i10, 1, (i11 & 8) != 0 ? ConnectionsManager.DEFAULT_DATACENTER_ID : 2097150);
    }

    public static final Object k(id.h hVar, Object obj) {
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
        a4.a.y(obj);
        throw null;
    }
}
