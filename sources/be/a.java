package be;

import b8.gb;
import b8.ib;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import k2.p1;
import org.telegram.tgnet.ConnectionsManager;
import wd.a1;
import wd.a2;
import wd.b0;
import wd.t0;
import wd.u1;
import wd.v1;
import wd.x;
import wd.y;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class a {
    public static final t a;
    public static final t b;
    public static final t c;
    public static final t d;
    public static final ae.j e = new ae.j(2);
    public static final ae.j f = new ae.j(3);
    public static final ae.j g = new ae.j(4);

    static {
        int i3 = 0;
        a = new t("CLOSED", i3);
        b = new t("UNDEFINED", i3);
        c = new t("REUSABLE_CLAIMED", i3);
        d = new t("NO_THREAD_ELEMENTS", i3);
    }

    public static final void a(int i3) {
        if (i3 < 1) {
            throw new IllegalArgumentException(p1.i(i3, "Expected positive parallelism level, but got ").toString());
        }
    }

    public static final Object b(r rVar, long j10, od.p pVar) {
        while (true) {
            if (rVar.c >= j10 && !rVar.d()) {
                return rVar;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b.a;
            Object obj = atomicReferenceFieldUpdater.get(rVar);
            t tVar = a;
            if (obj == tVar) {
                return tVar;
            }
            r rVar2 = (r) ((b) obj);
            if (rVar2 == null) {
                rVar2 = (r) pVar.invoke(Long.valueOf(rVar.c + 1), rVar);
                while (!atomicReferenceFieldUpdater.compareAndSet(rVar, null, rVar2)) {
                    if (atomicReferenceFieldUpdater.get(rVar) != null) {
                        break;
                    }
                }
                if (rVar.d()) {
                    rVar.e();
                }
            }
            rVar = rVar2;
        }
    }

    public static final r c(Object obj) {
        if (obj != a) {
            return (r) obj;
        }
        throw new IllegalStateException("Does not contain segment");
    }

    public static final void d(fd.h hVar, Throwable th2) {
        Throwable runtimeException;
        Iterator it = d.a.iterator();
        while (it.hasNext()) {
            try {
                ((xd.b) it.next()).c(th2);
            } catch (Throwable th3) {
                if (th2 == th3) {
                    runtimeException = th2;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th3);
                    gb.a(runtimeException, th2);
                }
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, runtimeException);
            }
        }
        try {
            gb.a(th2, new e(hVar));
        } catch (Throwable unused) {
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th2);
    }

    public static final boolean e(Object obj) {
        return obj == a;
    }

    public static final Object f(Object obj, Object obj2) {
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

    public static final void g(fd.h hVar, Object obj) {
        if (obj == d) {
            return;
        }
        if (!(obj instanceof w)) {
            Object fold = hVar.fold(null, f);
            kotlin.jvm.internal.j.c(fold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            a1.g.z(fold);
            throw null;
        }
        w wVar = (w) obj;
        u1[] u1VarArr = wVar.b;
        int length = u1VarArr.length - 1;
        if (length < 0) {
            return;
        }
        u1 u1Var = u1VarArr[length];
        kotlin.jvm.internal.j.b(null);
        Object obj2 = wVar.a[length];
        throw null;
    }

    public static final void h(fd.c cVar, Object obj) {
        if (!(cVar instanceof f)) {
            cVar.resumeWith(obj);
            return;
        }
        f fVar = (f) cVar;
        x xVar = fVar.d;
        hd.c cVar2 = fVar.e;
        Throwable a10 = dd.g.a(obj);
        Object vVar = a10 == null ? obj : new wd.v(a10, false);
        if (xVar.e(cVar2.getContext())) {
            fVar.f = vVar;
            fVar.c = 1;
            xVar.c(cVar2.getContext(), fVar);
            return;
        }
        t0 a11 = v1.a();
        if (a11.c >= 4294967296L) {
            fVar.f = vVar;
            fVar.c = 1;
            ed.e eVar = a11.e;
            if (eVar == null) {
                eVar = new ed.e();
                a11.e = eVar;
            }
            eVar.addLast(fVar);
            return;
        }
        a11.i(true);
        try {
            a1 a1Var = (a1) cVar2.getContext().get(y.b);
            if (a1Var == null || a1Var.isActive()) {
                Object obj2 = fVar.h;
                fd.h context = cVar2.getContext();
                Object l10 = l(context, obj2);
                a2 x10 = l10 != d ? b0.x(cVar2, context, l10) : null;
                try {
                    cVar2.resumeWith(obj);
                } finally {
                    if (x10 == null || x10.T()) {
                        g(context, l10);
                    }
                }
            } else {
                fVar.resumeWith(ib.a(a1Var.getCancellationException()));
            }
            while (a11.k()) {
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long i(String str, long j10, long j11, long j12) {
        String str2;
        Long l10;
        boolean z10;
        int i3;
        int i10;
        int i11 = u.a;
        try {
            str2 = System.getProperty(str);
        } catch (SecurityException unused) {
            str2 = null;
        }
        if (str2 == null) {
            return j10;
        }
        kotlin.jvm.internal.j.e(str2, "<this>");
        int length = str2.length();
        if (length != 0) {
            int i12 = 0;
            char charAt = str2.charAt(0);
            long j13 = -9223372036854775807L;
            if (kotlin.jvm.internal.j.f(charAt, 48) < 0) {
                z10 = true;
                if (length != 1) {
                    if (charAt == '+') {
                        z10 = false;
                        i12 = 1;
                    } else if (charAt == '-') {
                        j13 = Long.MIN_VALUE;
                        i12 = 1;
                    }
                }
            } else {
                z10 = false;
            }
            long j14 = 0;
            long j15 = -256204778801521550L;
            while (i12 < length) {
                int digit = Character.digit((int) str2.charAt(i12), 10);
                if (digit >= 0) {
                    if (j14 >= j15) {
                        i3 = length;
                        i10 = i12;
                    } else if (j15 == -256204778801521550L) {
                        i3 = length;
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
                        length = i3;
                    }
                }
            }
            l10 = z10 ? Long.valueOf(j14) : Long.valueOf(-j14);
            if (l10 != null) {
                throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + str2 + '\'').toString());
            }
            long longValue = l10.longValue();
            if (j11 <= longValue && longValue <= j12) {
                return longValue;
            }
            throw new IllegalStateException(("System property '" + str + "' should be in range " + j11 + ".." + j12 + ", but is '" + longValue + '\'').toString());
        }
        l10 = null;
        if (l10 != null) {
        }
    }

    public static int j(int i3, int i10, String str) {
        return (int) i(str, i3, 1, (i10 & 8) != 0 ? ConnectionsManager.DEFAULT_DATACENTER_ID : 2097150);
    }

    public static final Object k(fd.h hVar) {
        Object fold = hVar.fold(0, e);
        kotlin.jvm.internal.j.b(fold);
        return fold;
    }

    public static final Object l(fd.h hVar, Object obj) {
        if (obj == null) {
            obj = k(hVar);
        }
        if (obj == 0) {
            return d;
        }
        if (obj instanceof Integer) {
            return hVar.fold(new w(((Number) obj).intValue(), hVar), g);
        }
        a1.g.z(obj);
        throw null;
    }
}
