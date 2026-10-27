package ce;

import a8.hd;
import a8.jd;
import a8.pe;
import a8.wc;
import a8.xc;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public abstract class f0 {
    public static final he.v a = new he.v("RESUME_TOKEN", 0);
    public static final he.v b = new he.v("REMOVED_TASK", 0);
    public static final he.v c = new he.v("CLOSED_EMPTY", 0);
    public static final he.v d = new he.v("COMPLETING_ALREADY", 0);
    public static final he.v e = new he.v("COMPLETING_WAITING_CHILDREN", 0);
    public static final he.v f = new he.v("COMPLETING_RETRY", 0);
    public static final he.v g = new he.v("TOO_LATE_TO_CANCEL", 0);
    public static final he.v h = new he.v("SEALED", 0);
    public static final r0 i = new r0(false);
    public static final r0 j = new r0(true);

    public static t a() {
        t tVar = new t(true);
        tVar.x(null);
        return tVar;
    }

    public static final he.e b(ld.h hVar) {
        if (hVar.get(b0.b) == null) {
            hVar = hVar.plus(new j1());
        }
        return new he.e(hVar);
    }

    public static j0 c(c0 c0Var, ud.p pVar) {
        d0 d0Var = d0.a;
        ld.h i10 = i(c0Var.c(), ld.i.a, true);
        je.e eVar = n0.a;
        if (i10 != eVar && i10.get(ld.d.a) == null) {
            i10 = i10.plus(eVar);
        }
        d0 d0Var2 = d0.a;
        j0 j0Var = new j0(i10, true);
        j0Var.L(d0Var, j0Var, pVar);
        return j0Var;
    }

    public static final Object d(i0[] i0VarArr, nd.i iVar) {
        if (i0VarArr.length == 0) {
            return kd.o.a;
        }
        e eVar = new e(i0VarArr);
        m mVar = new m(1, pe.b(iVar));
        mVar.s();
        int length = i0VarArr.length;
        c[] cVarArr = new c[length];
        for (int i10 = 0; i10 < length; i10++) {
            i0 i0Var = i0VarArr[i10];
            i0Var.start();
            c cVar = new c(eVar, mVar);
            cVar.f = n(i0Var, false, cVar, 3);
            cVarArr[i10] = cVar;
        }
        d dVar = new d(cVarArr);
        for (int i11 = 0; i11 < length; i11++) {
            c cVar2 = cVarArr[i11];
            cVar2.getClass();
            c.n.set(cVar2, dVar);
        }
        if (m.h.get(mVar) instanceof y1) {
            mVar.v(dVar);
        } else {
            dVar.b();
        }
        Object r6 = mVar.r();
        md.a aVar = md.a.a;
        return r6;
    }

    public static final void e(ld.h hVar, CancellationException cancellationException) {
        g1 g1Var = (g1) hVar.get(b0.b);
        if (g1Var != null) {
            g1Var.cancel(cancellationException);
        }
    }

    public static final Object f(ud.p pVar, ld.c cVar) {
        he.s sVar = new he.s(cVar, cVar.getContext());
        Object a2 = xc.a(sVar, sVar, pVar);
        md.a aVar = md.a.a;
        return a2;
    }

    public static final Object g(long j10, nd.c cVar) {
        if (j10 > 0) {
            m mVar = new m(1, pe.b(cVar));
            mVar.s();
            if (j10 < Long.MAX_VALUE) {
                j(mVar.e).a(j10, mVar);
            }
            Object r6 = mVar.r();
            if (r6 == md.a.a) {
                return r6;
            }
        }
        return jd.i.a;
    }

    public static final void h(ld.h hVar) {
        g1 g1Var = (g1) hVar.get(b0.b);
        if (g1Var != null && !g1Var.isActive()) {
            throw g1Var.getCancellationException();
        }
    }

    public static final ld.h i(ld.h hVar, ld.h hVar2, boolean z10) {
        Boolean bool = Boolean.FALSE;
        x xVar = x.d;
        boolean booleanValue = ((Boolean) hVar.fold(bool, xVar)).booleanValue();
        boolean booleanValue2 = ((Boolean) hVar2.fold(bool, xVar)).booleanValue();
        if (!booleanValue && !booleanValue2) {
            return hVar.plus(hVar2);
        }
        x xVar2 = new x(2, 2);
        ld.i iVar = ld.i.a;
        ld.h hVar3 = (ld.h) hVar.fold(iVar, xVar2);
        Object obj = hVar2;
        if (booleanValue2) {
            obj = hVar2.fold(iVar, x.c);
        }
        return hVar3.plus((ld.h) obj);
    }

    public static final k0 j(ld.h hVar) {
        ld.f fVar = hVar.get(ld.d.a);
        k0 k0Var = fVar instanceof k0 ? (k0) fVar : null;
        return k0Var == null ? h0.a : k0Var;
    }

    public static final String k(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final m l(ld.c cVar) {
        m mVar;
        m mVar2;
        if (!(cVar instanceof he.h)) {
            return new m(1, cVar);
        }
        he.h hVar = (he.h) cVar;
        he.v vVar = he.a.d;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = he.h.n;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(hVar);
            mVar = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(hVar, vVar);
                mVar2 = null;
                break;
            }
            if (obj instanceof m) {
                while (!atomicReferenceFieldUpdater.compareAndSet(hVar, obj, vVar)) {
                    if (atomicReferenceFieldUpdater.get(hVar) != obj) {
                        break;
                    }
                }
                mVar2 = (m) obj;
                break loop0;
            }
            if (obj != vVar && !(obj instanceof Throwable)) {
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

    public static final void m(Throwable th2, ld.h hVar) {
        try {
            de.b bVar = (de.b) hVar.get(b0.a);
            if (bVar != null) {
                bVar.c(th2);
            } else {
                he.a.c(th2, hVar);
            }
        } catch (Throwable th3) {
            if (th2 != th3) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th3);
                hd.a(runtimeException, th2);
                th2 = runtimeException;
            }
            he.a.c(th2, hVar);
        }
    }

    public static p0 n(g1 g1Var, boolean z10, l1 l1Var, int i10) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        boolean z11 = (i10 & 2) != 0;
        return g1Var instanceof v1 ? ((v1) g1Var).y(z10, z11, l1Var) : g1Var.invokeOnCompletion(z10, z11, new k1(1, l1Var, e1.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object o(Collection collection, nd.c cVar) {
        g gVar;
        int i10;
        Iterator it;
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i11 = gVar.c;
            if ((i11 & TLObject.FLAG_31) != 0) {
                gVar.c = i11 - TLObject.FLAG_31;
                Object obj = gVar.b;
                md.a aVar = md.a.a;
                i10 = gVar.c;
                if (i10 != 0) {
                    jd.b(obj);
                    it = collection.iterator();
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = gVar.a;
                    jd.b(obj);
                }
                while (it.hasNext()) {
                    g1 g1Var = (g1) it.next();
                    gVar.a = it;
                    gVar.c = 1;
                    if (g1Var.join(gVar) == aVar) {
                        return aVar;
                    }
                }
                return jd.i.a;
            }
        }
        gVar = new g(cVar);
        Object obj2 = gVar.b;
        md.a aVar2 = md.a.a;
        i10 = gVar.c;
        if (i10 != 0) {
        }
        while (it.hasNext()) {
        }
        return jd.i.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0050 -> B:10:0x0053). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object p(g1[] g1VarArr, nd.c cVar) {
        f fVar;
        int i10;
        int i11;
        g1[] g1VarArr2;
        int length;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i12 = fVar.e;
            if ((i12 & TLObject.FLAG_31) != 0) {
                fVar.e = i12 - TLObject.FLAG_31;
                Object obj = fVar.d;
                md.a aVar = md.a.a;
                i10 = fVar.e;
                if (i10 != 0) {
                    jd.b(obj);
                    i11 = 0;
                    g1VarArr2 = g1VarArr;
                    length = g1VarArr.length;
                    if (i11 < length) {
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    length = fVar.c;
                    i11 = fVar.b;
                    g1[] g1VarArr3 = (g1[]) fVar.a;
                    jd.b(obj);
                    g1VarArr2 = g1VarArr3;
                    i11++;
                    if (i11 < length) {
                        g1 g1Var = g1VarArr2[i11];
                        fVar.a = g1VarArr2;
                        fVar.b = i11;
                        fVar.c = length;
                        fVar.e = 1;
                        if (g1Var.join(fVar) == aVar) {
                            return aVar;
                        }
                        i11++;
                        if (i11 < length) {
                            return jd.i.a;
                        }
                    }
                }
            }
        }
        fVar = new f(cVar);
        Object obj2 = fVar.d;
        md.a aVar2 = md.a.a;
        i10 = fVar.e;
        if (i10 != 0) {
        }
    }

    public static a2 q(c0 c0Var, ud.p pVar) {
        d0 d0Var = d0.a;
        ld.h i10 = i(c0Var.c(), ld.i.a, true);
        je.e eVar = n0.a;
        if (i10 != eVar && i10.get(ld.d.a) == null) {
            i10 = i10.plus(eVar);
        }
        d0 d0Var2 = d0.a;
        a2 a2Var = new a2(i10, true);
        a2Var.L(d0Var, a2Var, pVar);
        return a2Var;
    }

    public static final Object r(Object obj) {
        return obj instanceof v ? jd.a(((v) obj).a) : obj;
    }

    public static final void s(m mVar, ld.c cVar, boolean z10) {
        Object obj = m.h.get(mVar);
        Throwable g7 = mVar.g(obj);
        Object a2 = g7 != null ? jd.a(g7) : mVar.h(obj);
        if (!z10) {
            cVar.resumeWith(a2);
            return;
        }
        kotlin.jvm.internal.i.c(cVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        he.h hVar = (he.h) cVar;
        nd.c cVar2 = hVar.e;
        Object obj2 = hVar.h;
        ld.h context = cVar2.getContext();
        Object k10 = he.a.k(context, obj2);
        h2 v = k10 != he.a.f ? v(cVar2, context, k10) : null;
        try {
            cVar2.resumeWith(a2);
            if (v == null || v.M()) {
                he.a.f(context, k10);
            }
        } catch (Throwable th2) {
            if (v == null || v.M()) {
                he.a.f(context, k10);
            }
            throw th2;
        }
    }

    public static final String t(ld.c cVar) {
        Object a2;
        if (cVar instanceof he.h) {
            return cVar.toString();
        }
        try {
            a2 = cVar + '@' + k(cVar);
        } catch (Throwable th2) {
            a2 = jd.a(th2);
        }
        if (jd.f.a(a2) != null) {
            a2 = cVar.getClass().getName() + '@' + k(cVar);
        }
        return (String) a2;
    }

    public static final Object u(Object obj) {
        b1 b1Var;
        c1 c1Var = obj instanceof c1 ? (c1) obj : null;
        return (c1Var == null || (b1Var = c1Var.a) == null) ? obj : b1Var;
    }

    public static final h2 v(ld.c cVar, ld.h hVar, Object obj) {
        h2 h2Var = null;
        if ((cVar instanceof nd.d) && hVar.get(i2.a) != null) {
            nd.d dVar = (nd.d) cVar;
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

    public static final Object w(ld.h hVar, ud.p pVar, ld.c cVar) {
        Object u10;
        ld.h context = cVar.getContext();
        ld.h plus = !((Boolean) hVar.fold(Boolean.FALSE, x.d)).booleanValue() ? context.plus(hVar) : i(context, hVar, false);
        h(plus);
        if (plus == context) {
            he.s sVar = new he.s(cVar, plus);
            u10 = xc.a(sVar, sVar, pVar);
        } else {
            ld.d dVar = ld.d.a;
            if (kotlin.jvm.internal.i.a(plus.get(dVar), context.get(dVar))) {
                h2 h2Var = new h2(cVar, plus);
                ld.h hVar2 = h2Var.c;
                Object k10 = he.a.k(hVar2, null);
                try {
                    Object a2 = xc.a(h2Var, h2Var, pVar);
                    he.a.f(hVar2, k10);
                    u10 = a2;
                } catch (Throwable th2) {
                    he.a.f(hVar2, k10);
                    throw th2;
                }
            } else {
                l0 l0Var = new l0(cVar, plus);
                wc.a(pVar, l0Var, l0Var);
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = l0.e;
                while (true) {
                    int i10 = atomicIntegerFieldUpdater.get(l0Var);
                    if (i10 != 0) {
                        if (i10 != 2) {
                            throw new IllegalStateException("Already suspended");
                        }
                        u10 = u(l0Var.u());
                        if (u10 instanceof v) {
                            throw ((v) u10).a;
                        }
                    } else if (atomicIntegerFieldUpdater.compareAndSet(l0Var, 0, 1)) {
                        u10 = md.a.a;
                        break;
                    }
                }
            }
        }
        md.a aVar = md.a.a;
        return u10;
    }

    public static final Object x(long j10, ud.p pVar, ld.c cVar) {
        Object vVar;
        Object B;
        if (j10 <= 0) {
            throw new e2("Timed out immediately", null);
        }
        f2 f2Var = new f2(j10, cVar);
        n(f2Var, false, new q0(j(f2Var.d.getContext()).b(f2Var.e, f2Var, f2Var.c), 0), 3);
        try {
            kotlin.jvm.internal.s.a(2, pVar);
            vVar = pVar.invoke(f2Var, f2Var);
        } catch (Throwable th2) {
            vVar = new v(th2, false);
        }
        Object obj = md.a.a;
        if (vVar == obj || (B = f2Var.B(vVar)) == e) {
            return obj;
        }
        if (B instanceof v) {
            Throwable th3 = ((v) B).a;
            if (!(th3 instanceof e2)) {
                throw th3;
            }
            if (((e2) th3).a != f2Var) {
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
