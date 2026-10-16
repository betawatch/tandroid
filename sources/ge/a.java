package ge;

import be.a0;
import be.b0;
import be.c2;
import be.d2;
import be.f0;
import be.g1;
import be.h2;
import be.x0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.telegram.tgnet.ConnectionsManager;
import v7.g8;
import v7.i8;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public abstract class a {
    public static final a6.i a;
    public static final a6.i b;
    public static final a6.i c;
    public static final a6.i d;
    public static final a6.i e;
    public static final a6.i f;

    static {
        int i10 = 22;
        a = new a6.i("NO_DECISION", i10);
        b = new a6.i("CLOSED", i10);
        c = new a6.i("UNDEFINED", i10);
        d = new a6.i("REUSABLE_CLAIMED", i10);
        e = new a6.i("CONDITION_FALSE", i10);
        f = new a6.i("NO_THREAD_ELEMENTS", i10);
    }

    public static final Object a(t tVar, long j10, td.p pVar) {
        while (true) {
            if (tVar.c >= j10 && !tVar.d()) {
                return tVar;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.a;
            Object obj = atomicReferenceFieldUpdater.get(tVar);
            a6.i iVar = b;
            if (obj == iVar) {
                return iVar;
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

    public static final void c(Throwable th2, kd.h hVar) {
        Throwable runtimeException;
        Iterator it = f.a.iterator();
        while (it.hasNext()) {
            try {
                ((ce.b) it.next()).c(th2);
            } catch (Throwable th3) {
                if (th2 == th3) {
                    runtimeException = th2;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th3);
                    g8.a(runtimeException, th2);
                }
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, runtimeException);
            }
        }
        try {
            g8.a(th2, new g(hVar));
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

    public static final void f(kd.h hVar, Object obj) {
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

    public static final void g(Object obj, kd.c cVar) {
        if (!(cVar instanceof h)) {
            cVar.resumeWith(obj);
            return;
        }
        h hVar = (h) cVar;
        a0 a0Var = hVar.d;
        md.c cVar2 = hVar.e;
        Throwable a2 = id.f.a(obj);
        Object vVar = a2 == null ? obj : new be.v(a2, false);
        cVar2.getContext();
        if (a0Var.d()) {
            hVar.f = vVar;
            hVar.c = 1;
            a0Var.c(cVar2.getContext(), hVar);
            return;
        }
        x0 a10 = d2.a();
        if (a10.c >= 4294967296L) {
            hVar.f = vVar;
            hVar.c = 1;
            jd.e eVar = a10.e;
            if (eVar == null) {
                eVar = new jd.e();
                a10.e = eVar;
            }
            eVar.addLast(hVar);
            return;
        }
        a10.h(true);
        try {
            g1 g1Var = (g1) cVar2.getContext().get(b0.b);
            if (g1Var == null || g1Var.isActive()) {
                Object obj2 = hVar.h;
                kd.h context = cVar2.getContext();
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
                hVar.b(vVar, cancellationException);
                hVar.resumeWith(i8.a(cancellationException));
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
    public static final long i(String str, long j10, long j11, long j12) {
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
                        z10 = false;
                        i13 = 1;
                    } else if (charAt == '-') {
                        j13 = Long.MIN_VALUE;
                        i13 = 1;
                    }
                }
            } else {
                z10 = false;
            }
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
            l4 = z10 ? Long.valueOf(j14) : Long.valueOf(-j14);
            if (l4 != null) {
                throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + str2 + '\'').toString());
            }
            long longValue = l4.longValue();
            if (j11 <= longValue && longValue <= j12) {
                return longValue;
            }
            throw new IllegalStateException(("System property '" + str + "' should be in range " + j11 + ".." + j12 + ", but is '" + longValue + '\'').toString());
        }
        l4 = null;
        if (l4 != null) {
        }
    }

    public static int j(int i10, int i11, String str) {
        return (int) i(str, i10, 1, (i11 & 8) != 0 ? ConnectionsManager.DEFAULT_DATACENTER_ID : 2097150);
    }

    public static final Object k(kd.h hVar, Object obj) {
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
