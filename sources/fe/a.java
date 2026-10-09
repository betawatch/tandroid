package fe;

import ae.b0;
import ae.c0;
import ae.d2;
import ae.e2;
import ae.g0;
import ae.h1;
import ae.i2;
import ae.y0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.telegram.tgnet.ConnectionsManager;
import v7.a8;
import v7.y7;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public abstract class a {
    public static final da.a a = new da.a("NO_DECISION");
    public static final da.a b = new da.a("CLOSED");
    public static final da.a c = new da.a("UNDEFINED");
    public static final da.a d = new da.a("REUSABLE_CLAIMED");
    public static final da.a e = new da.a("CONDITION_FALSE");
    public static final da.a f = new da.a("NO_THREAD_ELEMENTS");

    public static final Object a(t tVar, long j3, sd.p pVar) {
        while (true) {
            if (tVar.c >= j3 && !tVar.d()) {
                return tVar;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.a;
            Object obj = atomicReferenceFieldUpdater.get(tVar);
            da.a aVar = b;
            if (obj == aVar) {
                return aVar;
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

    public static final void c(Throwable th2, jd.h hVar) {
        Throwable runtimeException;
        Iterator it = f.a.iterator();
        while (it.hasNext()) {
            try {
                ((be.b) it.next()).c(th2);
            } catch (Throwable th3) {
                if (th2 == th3) {
                    runtimeException = th2;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th3);
                    y7.a(runtimeException, th2);
                }
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, runtimeException);
            }
        }
        try {
            y7.a(th2, new g(hVar));
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

    public static final void f(jd.h hVar, Object obj) {
        if (obj == f) {
            return;
        }
        if (!(obj instanceof y)) {
            Object fold = hVar.fold(null, w.d);
            kotlin.jvm.internal.i.c(fold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            a1.g.z(fold);
            throw null;
        }
        y yVar = (y) obj;
        d2[] d2VarArr = yVar.b;
        int length = d2VarArr.length - 1;
        if (length < 0) {
            return;
        }
        d2 d2Var = d2VarArr[length];
        kotlin.jvm.internal.i.b(null);
        Object obj2 = yVar.a[length];
        throw null;
    }

    public static final void g(Object obj, jd.c cVar) {
        if (!(cVar instanceof h)) {
            cVar.resumeWith(obj);
            return;
        }
        h hVar = (h) cVar;
        b0 b0Var = hVar.d;
        ld.c cVar2 = hVar.e;
        Throwable a2 = hd.f.a(obj);
        Object vVar = a2 == null ? obj : new ae.v(a2, false);
        cVar2.getContext();
        if (b0Var.e()) {
            hVar.f = vVar;
            hVar.c = 1;
            b0Var.c(cVar2.getContext(), hVar);
            return;
        }
        y0 a10 = e2.a();
        if (a10.c >= 4294967296L) {
            hVar.f = vVar;
            hVar.c = 1;
            id.e eVar = a10.e;
            if (eVar == null) {
                eVar = new id.e();
                a10.e = eVar;
            }
            eVar.addLast(hVar);
            return;
        }
        a10.h(true);
        try {
            h1 h1Var = (h1) cVar2.getContext().get(c0.b);
            if (h1Var == null || h1Var.isActive()) {
                Object obj2 = hVar.h;
                jd.h context = cVar2.getContext();
                Object k10 = k(context, obj2);
                i2 v = k10 != f ? g0.v(cVar2, context, k10) : null;
                try {
                    cVar2.resumeWith(obj);
                } finally {
                    if (v == null || v.M()) {
                        f(context, k10);
                    }
                }
            } else {
                CancellationException cancellationException = h1Var.getCancellationException();
                hVar.c(vVar, cancellationException);
                hVar.resumeWith(a8.a(cancellationException));
            }
            while (a10.j()) {
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d4  */
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
                        z10 = false;
                        i13 = 1;
                    } else if (charAt == '-') {
                        j12 = Long.MIN_VALUE;
                        i13 = 1;
                    }
                }
            } else {
                z10 = false;
            }
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
            l4 = z10 ? Long.valueOf(j13) : Long.valueOf(-j13);
            if (l4 != null) {
                throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + str2 + '\'').toString());
            }
            long longValue = l4.longValue();
            if (j10 <= longValue && longValue <= j11) {
                return longValue;
            }
            throw new IllegalStateException(("System property '" + str + "' should be in range " + j10 + ".." + j11 + ", but is '" + longValue + '\'').toString());
        }
        l4 = null;
        if (l4 != null) {
        }
    }

    public static int j(int i10, int i11, String str) {
        return (int) i(str, i10, 1, (i11 & 8) != 0 ? ConnectionsManager.DEFAULT_DATACENTER_ID : 2097150);
    }

    public static final Object k(jd.h hVar, Object obj) {
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
        a1.g.z(obj);
        throw null;
    }
}
