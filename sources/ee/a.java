package ee;

import a8.la;
import a8.p0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.telegram.tgnet.ConnectionsManager;
import zd.a1;
import zd.a2;
import zd.b0;
import zd.t0;
import zd.u1;
import zd.v1;
import zd.x;
import zd.y;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public abstract class a {
    public static final com.google.android.gms.internal.clearcut.e a = new com.google.android.gms.internal.clearcut.e("CLOSED", 1);
    public static final com.google.android.gms.internal.clearcut.e b = new com.google.android.gms.internal.clearcut.e("UNDEFINED", 1);
    public static final com.google.android.gms.internal.clearcut.e c = new com.google.android.gms.internal.clearcut.e("REUSABLE_CLAIMED", 1);
    public static final com.google.android.gms.internal.clearcut.e d = new com.google.android.gms.internal.clearcut.e("NO_THREAD_ELEMENTS", 1);
    public static final b1.e e = new b1.e(5);
    public static final b1.e f = new b1.e(6);
    public static final b1.e g = new b1.e(7);

    public static final void a(int i7) {
        if (i7 < 1) {
            throw new IllegalArgumentException(jg.g.j(i7, "Expected positive parallelism level, but got ").toString());
        }
    }

    public static final Object b(r rVar, long j3, rd.p pVar) {
        while (true) {
            if (rVar.c >= j3 && !rVar.d()) {
                return rVar;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b.a;
            Object obj = atomicReferenceFieldUpdater.get(rVar);
            com.google.android.gms.internal.clearcut.e eVar = a;
            if (obj == eVar) {
                return eVar;
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

    public static final void d(id.h hVar, Throwable th2) {
        Throwable runtimeException;
        Iterator it = d.a.iterator();
        while (it.hasNext()) {
            try {
                ((ae.b) it.next()).c(th2);
            } catch (Throwable th3) {
                if (th2 == th3) {
                    runtimeException = th2;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th3);
                    la.a(runtimeException, th2);
                }
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, runtimeException);
            }
        }
        try {
            la.a(th2, new e(hVar));
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

    public static final void g(id.h hVar, Object obj) {
        if (obj == d) {
            return;
        }
        if (!(obj instanceof v)) {
            Object fold = hVar.fold(null, f);
            kotlin.jvm.internal.j.c(fold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            p0.A(fold);
            throw null;
        }
        v vVar = (v) obj;
        u1[] u1VarArr = vVar.b;
        int length = u1VarArr.length - 1;
        if (length < 0) {
            return;
        }
        u1 u1Var = u1VarArr[length];
        kotlin.jvm.internal.j.b(null);
        Object obj2 = vVar.a[length];
        throw null;
    }

    public static final void h(id.c cVar, Object obj) {
        if (!(cVar instanceof f)) {
            cVar.resumeWith(obj);
            return;
        }
        f fVar = (f) cVar;
        x xVar = fVar.d;
        kd.c cVar2 = fVar.e;
        Throwable a10 = gd.g.a(obj);
        Object vVar = a10 == null ? obj : new zd.v(a10, false);
        if (xVar.d(cVar2.getContext())) {
            fVar.f = vVar;
            fVar.c = 1;
            xVar.c(cVar2.getContext(), fVar);
            return;
        }
        t0 a11 = v1.a();
        if (a11.c >= 4294967296L) {
            fVar.f = vVar;
            fVar.c = 1;
            hd.d dVar = a11.e;
            if (dVar == null) {
                dVar = new hd.d();
                a11.e = dVar;
            }
            dVar.addLast(fVar);
            return;
        }
        a11.i(true);
        try {
            a1 a1Var = (a1) cVar2.getContext().get(y.b);
            if (a1Var == null || a1Var.isActive()) {
                Object obj2 = fVar.h;
                id.h context = cVar2.getContext();
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
                fVar.resumeWith(af.b.b(a1Var.getCancellationException()));
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
    public static final long i(String str, long j3, long j10, long j11) {
        String str2;
        Long l10;
        boolean z9;
        int i7;
        int i10;
        int i11 = t.a;
        try {
            str2 = System.getProperty(str);
        } catch (SecurityException unused) {
            str2 = null;
        }
        if (str2 == null) {
            return j3;
        }
        kotlin.jvm.internal.j.e(str2, "<this>");
        int length = str2.length();
        if (length != 0) {
            int i12 = 0;
            char charAt = str2.charAt(0);
            long j12 = -9223372036854775807L;
            if (kotlin.jvm.internal.j.f(charAt, 48) < 0) {
                z9 = true;
                if (length != 1) {
                    if (charAt == '+') {
                        z9 = false;
                        i12 = 1;
                    } else if (charAt == '-') {
                        j12 = Long.MIN_VALUE;
                        i12 = 1;
                    }
                }
            } else {
                z9 = false;
            }
            long j13 = 0;
            long j14 = -256204778801521550L;
            while (i12 < length) {
                int digit = Character.digit((int) str2.charAt(i12), 10);
                if (digit >= 0) {
                    if (j13 >= j14) {
                        i7 = length;
                        i10 = i12;
                    } else if (j14 == -256204778801521550L) {
                        i7 = length;
                        i10 = i12;
                        j14 = j12 / 10;
                        if (j13 < j14) {
                        }
                    }
                    long j15 = j13 * 10;
                    long j16 = digit;
                    if (j15 >= j12 + j16) {
                        j13 = j15 - j16;
                        i12 = i10 + 1;
                        length = i7;
                    }
                }
            }
            l10 = z9 ? Long.valueOf(j13) : Long.valueOf(-j13);
            if (l10 != null) {
                throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + str2 + '\'').toString());
            }
            long longValue = l10.longValue();
            if (j10 <= longValue && longValue <= j11) {
                return longValue;
            }
            throw new IllegalStateException(("System property '" + str + "' should be in range " + j10 + ".." + j11 + ", but is '" + longValue + '\'').toString());
        }
        l10 = null;
        if (l10 != null) {
        }
    }

    public static int j(int i7, int i10, String str) {
        return (int) i(str, i7, 1, (i10 & 8) != 0 ? ConnectionsManager.DEFAULT_DATACENTER_ID : 2097150);
    }

    public static final Object k(id.h hVar) {
        Object fold = hVar.fold(0, e);
        kotlin.jvm.internal.j.b(fold);
        return fold;
    }

    public static final Object l(id.h hVar, Object obj) {
        if (obj == null) {
            obj = k(hVar);
        }
        if (obj == 0) {
            return d;
        }
        if (obj instanceof Integer) {
            return hVar.fold(new v(((Number) obj).intValue(), hVar), g);
        }
        p0.A(obj);
        throw null;
    }
}
