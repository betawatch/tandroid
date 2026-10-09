package ae;

import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.telegram.tgnet.TLObject;
import v7.a8;
import v7.p7;
import v7.q7;
import v7.y7;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public abstract class g0 {
    public static final da.a a = new da.a("RESUME_TOKEN");
    public static final da.a b = new da.a("REMOVED_TASK");
    public static final da.a c = new da.a("CLOSED_EMPTY");
    public static final da.a d = new da.a("COMPLETING_ALREADY");
    public static final da.a e = new da.a("COMPLETING_WAITING_CHILDREN");
    public static final da.a f = new da.a("COMPLETING_RETRY");
    public static final da.a g = new da.a("TOO_LATE_TO_CANCEL");
    public static final da.a h = new da.a("SEALED");
    public static final s0 i = new s0(false);
    public static final s0 j = new s0(true);

    public static t a() {
        t tVar = new t(true);
        tVar.x(null);
        return tVar;
    }

    public static final fe.e b(jd.h hVar) {
        if (hVar.get(c0.b) == null) {
            hVar = hVar.plus(new k1());
        }
        return new fe.e(hVar);
    }

    public static k0 c(d0 d0Var, sd.p pVar) {
        e0 e0Var = e0.a;
        jd.h i10 = i(d0Var.c(), jd.i.a, true);
        he.e eVar = o0.a;
        if (i10 != eVar && i10.get(jd.d.a) == null) {
            i10 = i10.plus(eVar);
        }
        e0 e0Var2 = e0.a;
        k0 k0Var = new k0(i10, true);
        k0Var.L(e0Var, k0Var, pVar);
        return k0Var;
    }

    public static final Object d(j0[] j0VarArr, ld.j jVar) {
        if (j0VarArr.length == 0) {
            return id.o.a;
        }
        e eVar = new e(j0VarArr);
        m mVar = new m(1, w7.h.b(jVar));
        mVar.s();
        int length = j0VarArr.length;
        c[] cVarArr = new c[length];
        for (int i10 = 0; i10 < length; i10++) {
            j0 j0Var = j0VarArr[i10];
            j0Var.start();
            c cVar = new c(eVar, mVar);
            cVar.f = n(j0Var, false, cVar, 3);
            cVarArr[i10] = cVar;
        }
        d dVar = new d(cVarArr);
        for (int i11 = 0; i11 < length; i11++) {
            c cVar2 = cVarArr[i11];
            cVar2.getClass();
            c.n.set(cVar2, dVar);
        }
        if (m.h.get(mVar) instanceof z1) {
            mVar.v(dVar);
        } else {
            dVar.b();
        }
        Object r10 = mVar.r();
        kd.a aVar = kd.a.a;
        return r10;
    }

    public static final void e(jd.h hVar, CancellationException cancellationException) {
        h1 h1Var = (h1) hVar.get(c0.b);
        if (h1Var != null) {
            h1Var.cancel(cancellationException);
        }
    }

    public static final Object f(sd.p pVar, jd.c cVar) {
        fe.s sVar = new fe.s(cVar, cVar.getContext());
        Object a2 = q7.a(sVar, sVar, pVar);
        kd.a aVar = kd.a.a;
        return a2;
    }

    public static final Object g(long j3, ld.c cVar) {
        if (j3 > 0) {
            m mVar = new m(1, w7.h.b(cVar));
            mVar.s();
            if (j3 < Long.MAX_VALUE) {
                j(mVar.e).b(j3, mVar);
            }
            Object r10 = mVar.r();
            if (r10 == kd.a.a) {
                return r10;
            }
        }
        return hd.i.a;
    }

    public static final void h(jd.h hVar) {
        h1 h1Var = (h1) hVar.get(c0.b);
        if (h1Var != null && !h1Var.isActive()) {
            throw h1Var.getCancellationException();
        }
    }

    public static final jd.h i(jd.h hVar, jd.h hVar2, boolean z10) {
        Boolean bool = Boolean.FALSE;
        y yVar = y.d;
        boolean booleanValue = ((Boolean) hVar.fold(bool, yVar)).booleanValue();
        boolean booleanValue2 = ((Boolean) hVar2.fold(bool, yVar)).booleanValue();
        if (!booleanValue && !booleanValue2) {
            return hVar.plus(hVar2);
        }
        y yVar2 = new y(2, 2);
        jd.i iVar = jd.i.a;
        jd.h hVar3 = (jd.h) hVar.fold(iVar, yVar2);
        Object obj = hVar2;
        if (booleanValue2) {
            obj = hVar2.fold(iVar, y.c);
        }
        return hVar3.plus((jd.h) obj);
    }

    public static final l0 j(jd.h hVar) {
        jd.f fVar = hVar.get(jd.d.a);
        l0 l0Var = fVar instanceof l0 ? (l0) fVar : null;
        return l0Var == null ? i0.a : l0Var;
    }

    public static final String k(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final m l(jd.c cVar) {
        m mVar;
        m mVar2;
        if (!(cVar instanceof fe.h)) {
            return new m(1, cVar);
        }
        fe.h hVar = (fe.h) cVar;
        da.a aVar = fe.a.d;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = fe.h.n;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(hVar);
            mVar = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(hVar, aVar);
                mVar2 = null;
                break;
            }
            if (obj instanceof m) {
                while (!atomicReferenceFieldUpdater.compareAndSet(hVar, obj, aVar)) {
                    if (atomicReferenceFieldUpdater.get(hVar) != obj) {
                        break;
                    }
                }
                mVar2 = (m) obj;
                break loop0;
            }
            if (obj != aVar && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
        if (mVar2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = m.h;
            Object obj2 = atomicReferenceFieldUpdater2.get(mVar2);
            if (!(obj2 instanceof u) || ((u) obj2).d == null) {
                m.f.set(mVar2, 536870911);
                atomicReferenceFieldUpdater2.set(mVar2, b.a);
                mVar = mVar2;
            } else {
                mVar2.o();
            }
            if (mVar != null) {
                return mVar;
            }
        }
        return new m(2, cVar);
    }

    public static final void m(Throwable th2, jd.h hVar) {
        try {
            be.b bVar = (be.b) hVar.get(c0.a);
            if (bVar != null) {
                bVar.c(th2);
            } else {
                fe.a.c(th2, hVar);
            }
        } catch (Throwable th3) {
            if (th2 != th3) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th3);
                y7.a(runtimeException, th2);
                th2 = runtimeException;
            }
            fe.a.c(th2, hVar);
        }
    }

    public static q0 n(h1 h1Var, boolean z10, m1 m1Var, int i10) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        boolean z11 = (i10 & 2) != 0;
        return h1Var instanceof w1 ? ((w1) h1Var).y(z10, z11, m1Var) : h1Var.invokeOnCompletion(z10, z11, new l1(1, m1Var, f1.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object o(Collection collection, ld.c cVar) {
        g gVar;
        int i10;
        Iterator it;
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i11 = gVar.c;
            if ((i11 & TLObject.FLAG_31) != 0) {
                gVar.c = i11 - TLObject.FLAG_31;
                Object obj = gVar.b;
                kd.a aVar = kd.a.a;
                i10 = gVar.c;
                if (i10 != 0) {
                    a8.b(obj);
                    it = collection.iterator();
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = gVar.a;
                    a8.b(obj);
                }
                while (it.hasNext()) {
                    h1 h1Var = (h1) it.next();
                    gVar.a = it;
                    gVar.c = 1;
                    if (h1Var.join(gVar) == aVar) {
                        return aVar;
                    }
                }
                return hd.i.a;
            }
        }
        gVar = new g(cVar);
        Object obj2 = gVar.b;
        kd.a aVar2 = kd.a.a;
        i10 = gVar.c;
        if (i10 != 0) {
        }
        while (it.hasNext()) {
        }
        return hd.i.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0050 -> B:10:0x0053). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object p(h1[] h1VarArr, ld.c cVar) {
        f fVar;
        int i10;
        int i11;
        h1[] h1VarArr2;
        int length;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i12 = fVar.e;
            if ((i12 & TLObject.FLAG_31) != 0) {
                fVar.e = i12 - TLObject.FLAG_31;
                Object obj = fVar.d;
                kd.a aVar = kd.a.a;
                i10 = fVar.e;
                if (i10 != 0) {
                    a8.b(obj);
                    i11 = 0;
                    h1VarArr2 = h1VarArr;
                    length = h1VarArr.length;
                    if (i11 < length) {
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    length = fVar.c;
                    i11 = fVar.b;
                    h1[] h1VarArr3 = (h1[]) fVar.a;
                    a8.b(obj);
                    h1VarArr2 = h1VarArr3;
                    i11++;
                    if (i11 < length) {
                        h1 h1Var = h1VarArr2[i11];
                        fVar.a = h1VarArr2;
                        fVar.b = i11;
                        fVar.c = length;
                        fVar.e = 1;
                        if (h1Var.join(fVar) == aVar) {
                            return aVar;
                        }
                        i11++;
                        if (i11 < length) {
                            return hd.i.a;
                        }
                    }
                }
            }
        }
        fVar = new f(cVar);
        Object obj2 = fVar.d;
        kd.a aVar2 = kd.a.a;
        i10 = fVar.e;
        if (i10 != 0) {
        }
    }

    public static b2 q(d0 d0Var, sd.p pVar) {
        e0 e0Var = e0.a;
        jd.h i10 = i(d0Var.c(), jd.i.a, true);
        he.e eVar = o0.a;
        if (i10 != eVar && i10.get(jd.d.a) == null) {
            i10 = i10.plus(eVar);
        }
        e0 e0Var2 = e0.a;
        b2 b2Var = new b2(i10, true);
        b2Var.L(e0Var, b2Var, pVar);
        return b2Var;
    }

    public static final Object r(Object obj) {
        return obj instanceof v ? a8.a(((v) obj).a) : obj;
    }

    public static final void s(m mVar, jd.c cVar, boolean z10) {
        Object obj = m.h.get(mVar);
        Throwable g10 = mVar.g(obj);
        Object a2 = g10 != null ? a8.a(g10) : mVar.h(obj);
        if (!z10) {
            cVar.resumeWith(a2);
            return;
        }
        kotlin.jvm.internal.i.c(cVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        fe.h hVar = (fe.h) cVar;
        ld.c cVar2 = hVar.e;
        Object obj2 = hVar.h;
        jd.h context = cVar2.getContext();
        Object k10 = fe.a.k(context, obj2);
        i2 v = k10 != fe.a.f ? v(cVar2, context, k10) : null;
        try {
            cVar2.resumeWith(a2);
            if (v == null || v.M()) {
                fe.a.f(context, k10);
            }
        } catch (Throwable th2) {
            if (v == null || v.M()) {
                fe.a.f(context, k10);
            }
            throw th2;
        }
    }

    public static final String t(jd.c cVar) {
        Object a2;
        if (cVar instanceof fe.h) {
            return cVar.toString();
        }
        try {
            a2 = cVar + '@' + k(cVar);
        } catch (Throwable th2) {
            a2 = a8.a(th2);
        }
        if (hd.f.a(a2) != null) {
            a2 = cVar.getClass().getName() + '@' + k(cVar);
        }
        return (String) a2;
    }

    public static final Object u(Object obj) {
        c1 c1Var;
        d1 d1Var = obj instanceof d1 ? (d1) obj : null;
        return (d1Var == null || (c1Var = d1Var.a) == null) ? obj : c1Var;
    }

    public static final i2 v(jd.c cVar, jd.h hVar, Object obj) {
        i2 i2Var = null;
        if ((cVar instanceof ld.d) && hVar.get(j2.a) != null) {
            ld.d dVar = (ld.d) cVar;
            while (true) {
                if ((dVar instanceof m0) || (dVar = dVar.getCallerFrame()) == null) {
                    break;
                }
                if (dVar instanceof i2) {
                    i2Var = (i2) dVar;
                    break;
                }
            }
            if (i2Var != null) {
                i2Var.N(hVar, obj);
            }
        }
        return i2Var;
    }

    public static final Object w(jd.h hVar, sd.p pVar, jd.c cVar) {
        Object u10;
        jd.h context = cVar.getContext();
        jd.h plus = !((Boolean) hVar.fold(Boolean.FALSE, y.d)).booleanValue() ? context.plus(hVar) : i(context, hVar, false);
        h(plus);
        if (plus == context) {
            fe.s sVar = new fe.s(cVar, plus);
            u10 = q7.a(sVar, sVar, pVar);
        } else {
            jd.d dVar = jd.d.a;
            if (kotlin.jvm.internal.i.a(plus.get(dVar), context.get(dVar))) {
                i2 i2Var = new i2(cVar, plus);
                jd.h hVar2 = i2Var.c;
                Object k10 = fe.a.k(hVar2, null);
                try {
                    Object a2 = q7.a(i2Var, i2Var, pVar);
                    fe.a.f(hVar2, k10);
                    u10 = a2;
                } catch (Throwable th2) {
                    fe.a.f(hVar2, k10);
                    throw th2;
                }
            } else {
                m0 m0Var = new m0(cVar, plus);
                p7.a(pVar, m0Var, m0Var);
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = m0.e;
                while (true) {
                    int i10 = atomicIntegerFieldUpdater.get(m0Var);
                    if (i10 != 0) {
                        if (i10 != 2) {
                            throw new IllegalStateException("Already suspended");
                        }
                        u10 = u(m0Var.u());
                        if (u10 instanceof v) {
                            throw ((v) u10).a;
                        }
                    } else if (atomicIntegerFieldUpdater.compareAndSet(m0Var, 0, 1)) {
                        u10 = kd.a.a;
                        break;
                    }
                }
            }
        }
        kd.a aVar = kd.a.a;
        return u10;
    }

    public static final Object x(long j3, sd.p pVar, jd.c cVar) {
        Object vVar;
        Object B;
        if (j3 <= 0) {
            throw new f2("Timed out immediately", null);
        }
        g2 g2Var = new g2(j3, cVar);
        n(g2Var, false, new r0(j(g2Var.d.getContext()).a(g2Var.e, g2Var, g2Var.c), 0), 3);
        try {
            kotlin.jvm.internal.s.a(2, pVar);
            vVar = pVar.invoke(g2Var, g2Var);
        } catch (Throwable th2) {
            vVar = new v(th2, false);
        }
        Object obj = kd.a.a;
        if (vVar == obj || (B = g2Var.B(vVar)) == e) {
            return obj;
        }
        if (B instanceof v) {
            Throwable th3 = ((v) B).a;
            if (!(th3 instanceof f2)) {
                throw th3;
            }
            if (((f2) th3).a != g2Var) {
                throw th3;
            }
            if (vVar instanceof v) {
                throw ((v) vVar).a;
            }
        } else {
            vVar = u(B);
        }
        return vVar;
    }
}
