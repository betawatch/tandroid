package hd;

import g7.g7;
import g7.w5;
import g7.y5;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class f0 {
    public static final e5.c a = new e5.c("RESUME_TOKEN", 2);
    public static final e5.c b = new e5.c("REMOVED_TASK", 2);
    public static final e5.c c = new e5.c("CLOSED_EMPTY", 2);
    public static final e5.c d = new e5.c("COMPLETING_ALREADY", 2);
    public static final e5.c e = new e5.c("COMPLETING_WAITING_CHILDREN", 2);
    public static final e5.c f = new e5.c("COMPLETING_RETRY", 2);
    public static final e5.c g = new e5.c("TOO_LATE_TO_CANCEL", 2);
    public static final e5.c h = new e5.c("SEALED", 2);
    public static final r0 i = new r0(false);
    public static final r0 j = new r0(true);

    public static t a() {
        t tVar = new t(true);
        tVar.x(null);
        return tVar;
    }

    public static final md.e b(qc.h hVar) {
        if (hVar.get(b0.b) == null) {
            hVar = hVar.plus(new j1());
        }
        return new md.e(hVar);
    }

    public static j0 c(c0 c0Var, zc.p pVar) {
        d0 d0Var = d0.a;
        qc.h i9 = i(c0Var.c(), qc.i.a, true);
        od.e eVar = n0.a;
        if (i9 != eVar && i9.get(qc.d.a) == null) {
            i9 = i9.plus(eVar);
        }
        d0 d0Var2 = d0.a;
        j0 j0Var = new j0(i9, true);
        j0Var.L(d0Var, j0Var, pVar);
        return j0Var;
    }

    public static final Object d(i0[] i0VarArr, sc.i iVar) {
        if (i0VarArr.length == 0) {
            return pc.o.a;
        }
        e eVar = new e(i0VarArr);
        m mVar = new m(1, g7.b(iVar));
        mVar.s();
        int length = i0VarArr.length;
        c[] cVarArr = new c[length];
        for (int i9 = 0; i9 < length; i9++) {
            i0 i0Var = i0VarArr[i9];
            i0Var.start();
            c cVar = new c(eVar, mVar);
            cVar.f = n(i0Var, false, cVar, 3);
            cVarArr[i9] = cVar;
        }
        d dVar = new d(cVarArr);
        for (int i10 = 0; i10 < length; i10++) {
            c cVar2 = cVarArr[i10];
            cVar2.getClass();
            c.n.set(cVar2, dVar);
        }
        if (m.h.get(mVar) instanceof y1) {
            mVar.v(dVar);
        } else {
            dVar.b();
        }
        Object r10 = mVar.r();
        rc.a aVar = rc.a.a;
        return r10;
    }

    public static final void e(qc.h hVar, CancellationException cancellationException) {
        g1 g1Var = (g1) hVar.get(b0.b);
        if (g1Var != null) {
            g1Var.cancel(cancellationException);
        }
    }

    public static final Object f(zc.p pVar, qc.c cVar) {
        md.s sVar = new md.s(cVar, cVar.getContext());
        Object a2 = g7.g0.a(sVar, sVar, pVar);
        rc.a aVar = rc.a.a;
        return a2;
    }

    public static final Object g(long j10, sc.c cVar) {
        if (j10 > 0) {
            m mVar = new m(1, g7.b(cVar));
            mVar.s();
            if (j10 < Long.MAX_VALUE) {
                j(mVar.e).b(j10, mVar);
            }
            Object r10 = mVar.r();
            if (r10 == rc.a.a) {
                return r10;
            }
        }
        return oc.i.a;
    }

    public static final void h(qc.h hVar) {
        g1 g1Var = (g1) hVar.get(b0.b);
        if (g1Var != null && !g1Var.isActive()) {
            throw g1Var.getCancellationException();
        }
    }

    public static final qc.h i(qc.h hVar, qc.h hVar2, boolean z10) {
        Boolean bool = Boolean.FALSE;
        x xVar = x.d;
        boolean booleanValue = ((Boolean) hVar.fold(bool, xVar)).booleanValue();
        boolean booleanValue2 = ((Boolean) hVar2.fold(bool, xVar)).booleanValue();
        if (!booleanValue && !booleanValue2) {
            return hVar.plus(hVar2);
        }
        x xVar2 = new x(2, 2);
        qc.i iVar = qc.i.a;
        qc.h hVar3 = (qc.h) hVar.fold(iVar, xVar2);
        Object obj = hVar2;
        if (booleanValue2) {
            obj = hVar2.fold(iVar, x.c);
        }
        return hVar3.plus((qc.h) obj);
    }

    public static final k0 j(qc.h hVar) {
        qc.f fVar = hVar.get(qc.d.a);
        k0 k0Var = fVar instanceof k0 ? (k0) fVar : null;
        return k0Var == null ? h0.a : k0Var;
    }

    public static final String k(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final m l(qc.c cVar) {
        m mVar;
        m mVar2;
        if (!(cVar instanceof md.h)) {
            return new m(1, cVar);
        }
        md.h hVar = (md.h) cVar;
        e5.c cVar2 = md.a.d;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = md.h.n;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(hVar);
            mVar = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(hVar, cVar2);
                mVar2 = null;
                break;
            }
            if (obj instanceof m) {
                while (!atomicReferenceFieldUpdater.compareAndSet(hVar, obj, cVar2)) {
                    if (atomicReferenceFieldUpdater.get(hVar) != obj) {
                        break;
                    }
                }
                mVar2 = (m) obj;
                break loop0;
            }
            if (obj != cVar2 && !(obj instanceof Throwable)) {
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

    public static final void m(Throwable th, qc.h hVar) {
        try {
            id.b bVar = (id.b) hVar.get(b0.a);
            if (bVar != null) {
                bVar.c(th);
            } else {
                md.a.c(th, hVar);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                w5.a(runtimeException, th);
                th = runtimeException;
            }
            md.a.c(th, hVar);
        }
    }

    public static p0 n(g1 g1Var, boolean z10, l1 l1Var, int i9) {
        if ((i9 & 1) != 0) {
            z10 = false;
        }
        boolean z11 = (i9 & 2) != 0;
        return g1Var instanceof v1 ? ((v1) g1Var).y(z10, z11, l1Var) : g1Var.invokeOnCompletion(z10, z11, new k1(1, l1Var, e1.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object o(Collection collection, sc.c cVar) {
        g gVar;
        int i9;
        Iterator it;
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i10 = gVar.c;
            if ((i10 & TLObject.FLAG_31) != 0) {
                gVar.c = i10 - TLObject.FLAG_31;
                Object obj = gVar.b;
                rc.a aVar = rc.a.a;
                i9 = gVar.c;
                if (i9 != 0) {
                    y5.b(obj);
                    it = collection.iterator();
                } else {
                    if (i9 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = gVar.a;
                    y5.b(obj);
                }
                while (it.hasNext()) {
                    g1 g1Var = (g1) it.next();
                    gVar.a = it;
                    gVar.c = 1;
                    if (g1Var.join(gVar) == aVar) {
                        return aVar;
                    }
                }
                return oc.i.a;
            }
        }
        gVar = new g(cVar);
        Object obj2 = gVar.b;
        rc.a aVar2 = rc.a.a;
        i9 = gVar.c;
        if (i9 != 0) {
        }
        while (it.hasNext()) {
        }
        return oc.i.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0050 -> B:10:0x0053). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object p(g1[] g1VarArr, sc.c cVar) {
        f fVar;
        int i9;
        int i10;
        g1[] g1VarArr2;
        int length;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i11 = fVar.e;
            if ((i11 & TLObject.FLAG_31) != 0) {
                fVar.e = i11 - TLObject.FLAG_31;
                Object obj = fVar.d;
                rc.a aVar = rc.a.a;
                i9 = fVar.e;
                if (i9 != 0) {
                    y5.b(obj);
                    i10 = 0;
                    g1VarArr2 = g1VarArr;
                    length = g1VarArr.length;
                    if (i10 < length) {
                    }
                } else {
                    if (i9 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    length = fVar.c;
                    i10 = fVar.b;
                    g1[] g1VarArr3 = (g1[]) fVar.a;
                    y5.b(obj);
                    g1VarArr2 = g1VarArr3;
                    i10++;
                    if (i10 < length) {
                        g1 g1Var = g1VarArr2[i10];
                        fVar.a = g1VarArr2;
                        fVar.b = i10;
                        fVar.c = length;
                        fVar.e = 1;
                        if (g1Var.join(fVar) == aVar) {
                            return aVar;
                        }
                        i10++;
                        if (i10 < length) {
                            return oc.i.a;
                        }
                    }
                }
            }
        }
        fVar = new f(cVar);
        Object obj2 = fVar.d;
        rc.a aVar2 = rc.a.a;
        i9 = fVar.e;
        if (i9 != 0) {
        }
    }

    public static a2 q(c0 c0Var, zc.p pVar) {
        d0 d0Var = d0.a;
        qc.h i9 = i(c0Var.c(), qc.i.a, true);
        od.e eVar = n0.a;
        if (i9 != eVar && i9.get(qc.d.a) == null) {
            i9 = i9.plus(eVar);
        }
        d0 d0Var2 = d0.a;
        a2 a2Var = new a2(i9, true);
        a2Var.L(d0Var, a2Var, pVar);
        return a2Var;
    }

    public static final Object r(Object obj) {
        return obj instanceof v ? y5.a(((v) obj).a) : obj;
    }

    public static final void s(m mVar, qc.c cVar, boolean z10) {
        Object obj = m.h.get(mVar);
        Throwable g10 = mVar.g(obj);
        Object a2 = g10 != null ? y5.a(g10) : mVar.h(obj);
        if (!z10) {
            cVar.resumeWith(a2);
            return;
        }
        kotlin.jvm.internal.i.c(cVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        md.h hVar = (md.h) cVar;
        sc.c cVar2 = hVar.e;
        Object obj2 = hVar.h;
        qc.h context = cVar2.getContext();
        Object k10 = md.a.k(context, obj2);
        h2 v = k10 != md.a.f ? v(cVar2, context, k10) : null;
        try {
            cVar2.resumeWith(a2);
            if (v == null || v.M()) {
                md.a.f(context, k10);
            }
        } catch (Throwable th) {
            if (v == null || v.M()) {
                md.a.f(context, k10);
            }
            throw th;
        }
    }

    public static final String t(qc.c cVar) {
        Object a2;
        if (cVar instanceof md.h) {
            return cVar.toString();
        }
        try {
            a2 = cVar + '@' + k(cVar);
        } catch (Throwable th) {
            a2 = y5.a(th);
        }
        if (oc.f.a(a2) != null) {
            a2 = cVar.getClass().getName() + '@' + k(cVar);
        }
        return (String) a2;
    }

    public static final Object u(Object obj) {
        b1 b1Var;
        c1 c1Var = obj instanceof c1 ? (c1) obj : null;
        return (c1Var == null || (b1Var = c1Var.a) == null) ? obj : b1Var;
    }

    public static final h2 v(qc.c cVar, qc.h hVar, Object obj) {
        h2 h2Var = null;
        if ((cVar instanceof sc.d) && hVar.get(i2.a) != null) {
            sc.d dVar = (sc.d) cVar;
            while (true) {
                if ((dVar instanceof l0) || (dVar = dVar.getCallerFrame()) == null) {
                    break;
                }
                if (dVar instanceof h2) {
                    h2Var = (h2) dVar;
                    break;
                }
            }
            if (h2Var != null) {
                h2Var.N(hVar, obj);
            }
        }
        return h2Var;
    }

    public static final Object w(qc.h hVar, zc.p pVar, qc.c cVar) {
        Object u10;
        qc.h context = cVar.getContext();
        qc.h plus = !((Boolean) hVar.fold(Boolean.FALSE, x.d)).booleanValue() ? context.plus(hVar) : i(context, hVar, false);
        h(plus);
        if (plus == context) {
            md.s sVar = new md.s(cVar, plus);
            u10 = g7.g0.a(sVar, sVar, pVar);
        } else {
            qc.d dVar = qc.d.a;
            if (kotlin.jvm.internal.i.a(plus.get(dVar), context.get(dVar))) {
                h2 h2Var = new h2(cVar, plus);
                qc.h hVar2 = h2Var.c;
                Object k10 = md.a.k(hVar2, null);
                try {
                    Object a2 = g7.g0.a(h2Var, h2Var, pVar);
                    md.a.f(hVar2, k10);
                    u10 = a2;
                } catch (Throwable th) {
                    md.a.f(hVar2, k10);
                    throw th;
                }
            } else {
                l0 l0Var = new l0(cVar, plus);
                g7.f0.a(pVar, l0Var, l0Var);
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = l0.e;
                while (true) {
                    int i9 = atomicIntegerFieldUpdater.get(l0Var);
                    if (i9 != 0) {
                        if (i9 != 2) {
                            throw new IllegalStateException("Already suspended");
                        }
                        u10 = u(l0Var.u());
                        if (u10 instanceof v) {
                            throw ((v) u10).a;
                        }
                    } else if (atomicIntegerFieldUpdater.compareAndSet(l0Var, 0, 1)) {
                        u10 = rc.a.a;
                        break;
                    }
                }
            }
        }
        rc.a aVar = rc.a.a;
        return u10;
    }

    public static final Object x(long j10, zc.p pVar, qc.c cVar) {
        Object vVar;
        Object B;
        if (j10 <= 0) {
            throw new e2("Timed out immediately", null);
        }
        f2 f2Var = new f2(j10, cVar);
        n(f2Var, false, new q0(j(f2Var.d.getContext()).a(f2Var.e, f2Var, f2Var.c), 0), 3);
        try {
            kotlin.jvm.internal.s.a(2, pVar);
            vVar = pVar.invoke(f2Var, f2Var);
        } catch (Throwable th) {
            vVar = new v(th, false);
        }
        Object obj = rc.a.a;
        if (vVar == obj || (B = f2Var.B(vVar)) == e) {
            return obj;
        }
        if (B instanceof v) {
            Throwable th2 = ((v) B).a;
            if (!(th2 instanceof e2)) {
                throw th2;
            }
            if (((e2) th2).a != f2Var) {
                throw th2;
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
