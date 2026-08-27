package id;

import h7.h7;
import h7.i6;
import h7.k6;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public abstract class f0 {
    public static final ec.a a;
    public static final ec.a b;
    public static final ec.a c;
    public static final ec.a d;
    public static final ec.a e;
    public static final ec.a f;
    public static final ec.a g;
    public static final ec.a h;
    public static final r0 i = new r0(false);
    public static final r0 j = new r0(true);

    static {
        int i10 = 3;
        a = new ec.a("RESUME_TOKEN", i10);
        b = new ec.a("REMOVED_TASK", i10);
        c = new ec.a("CLOSED_EMPTY", i10);
        d = new ec.a("COMPLETING_ALREADY", i10);
        e = new ec.a("COMPLETING_WAITING_CHILDREN", i10);
        f = new ec.a("COMPLETING_RETRY", i10);
        g = new ec.a("TOO_LATE_TO_CANCEL", i10);
        h = new ec.a("SEALED", i10);
    }

    public static t a() {
        t tVar = new t(true);
        tVar.x(null);
        return tVar;
    }

    public static final nd.e b(rc.h hVar) {
        if (hVar.get(b0.b) == null) {
            hVar = hVar.plus(new j1());
        }
        return new nd.e(hVar);
    }

    public static j0 c(c0 c0Var, ad.p pVar) {
        d0 d0Var = d0.a;
        rc.h i10 = i(c0Var.c(), rc.i.a, true);
        pd.e eVar = n0.a;
        if (i10 != eVar && i10.get(rc.d.a) == null) {
            i10 = i10.plus(eVar);
        }
        d0 d0Var2 = d0.a;
        j0 j0Var = new j0(i10, true);
        j0Var.L(d0Var, j0Var, pVar);
        return j0Var;
    }

    public static final Object d(i0[] i0VarArr, tc.i iVar) {
        if (i0VarArr.length == 0) {
            return qc.o.a;
        }
        e eVar = new e(i0VarArr);
        m mVar = new m(1, h7.b(iVar));
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
        Object r10 = mVar.r();
        sc.a aVar = sc.a.a;
        return r10;
    }

    public static final void e(rc.h hVar, CancellationException cancellationException) {
        g1 g1Var = (g1) hVar.get(b0.b);
        if (g1Var != null) {
            g1Var.cancel(cancellationException);
        }
    }

    public static final Object f(ad.p pVar, rc.c cVar) {
        nd.s sVar = new nd.s(cVar, cVar.getContext());
        Object a2 = h7.i0.a(sVar, sVar, pVar);
        sc.a aVar = sc.a.a;
        return a2;
    }

    public static final Object g(long j10, tc.c cVar) {
        if (j10 > 0) {
            m mVar = new m(1, h7.b(cVar));
            mVar.s();
            if (j10 < Long.MAX_VALUE) {
                j(mVar.e).a(j10, mVar);
            }
            Object r10 = mVar.r();
            if (r10 == sc.a.a) {
                return r10;
            }
        }
        return pc.i.a;
    }

    public static final void h(rc.h hVar) {
        g1 g1Var = (g1) hVar.get(b0.b);
        if (g1Var != null && !g1Var.isActive()) {
            throw g1Var.getCancellationException();
        }
    }

    public static final rc.h i(rc.h hVar, rc.h hVar2, boolean z10) {
        Boolean bool = Boolean.FALSE;
        x xVar = x.d;
        boolean booleanValue = ((Boolean) hVar.fold(bool, xVar)).booleanValue();
        boolean booleanValue2 = ((Boolean) hVar2.fold(bool, xVar)).booleanValue();
        if (!booleanValue && !booleanValue2) {
            return hVar.plus(hVar2);
        }
        x xVar2 = new x(2, 2);
        rc.i iVar = rc.i.a;
        rc.h hVar3 = (rc.h) hVar.fold(iVar, xVar2);
        Object obj = hVar2;
        if (booleanValue2) {
            obj = hVar2.fold(iVar, x.c);
        }
        return hVar3.plus((rc.h) obj);
    }

    public static final k0 j(rc.h hVar) {
        rc.f fVar = hVar.get(rc.d.a);
        k0 k0Var = fVar instanceof k0 ? (k0) fVar : null;
        return k0Var == null ? h0.a : k0Var;
    }

    public static final String k(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final m l(rc.c cVar) {
        m mVar;
        m mVar2;
        if (!(cVar instanceof nd.h)) {
            return new m(1, cVar);
        }
        nd.h hVar = (nd.h) cVar;
        ec.a aVar = nd.a.d;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = nd.h.n;
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

    public static final void m(Throwable th, rc.h hVar) {
        try {
            jd.b bVar = (jd.b) hVar.get(b0.a);
            if (bVar != null) {
                bVar.c(th);
            } else {
                nd.a.c(th, hVar);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                i6.a(runtimeException, th);
                th = runtimeException;
            }
            nd.a.c(th, hVar);
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
    public static final Object o(Collection collection, tc.c cVar) {
        g gVar;
        int i10;
        Iterator it;
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i11 = gVar.c;
            if ((i11 & TLObject.FLAG_31) != 0) {
                gVar.c = i11 - TLObject.FLAG_31;
                Object obj = gVar.b;
                sc.a aVar = sc.a.a;
                i10 = gVar.c;
                if (i10 != 0) {
                    k6.b(obj);
                    it = collection.iterator();
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = gVar.a;
                    k6.b(obj);
                }
                while (it.hasNext()) {
                    g1 g1Var = (g1) it.next();
                    gVar.a = it;
                    gVar.c = 1;
                    if (g1Var.join(gVar) == aVar) {
                        return aVar;
                    }
                }
                return pc.i.a;
            }
        }
        gVar = new g(cVar);
        Object obj2 = gVar.b;
        sc.a aVar2 = sc.a.a;
        i10 = gVar.c;
        if (i10 != 0) {
        }
        while (it.hasNext()) {
        }
        return pc.i.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0050 -> B:10:0x0053). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object p(g1[] g1VarArr, tc.c cVar) {
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
                sc.a aVar = sc.a.a;
                i10 = fVar.e;
                if (i10 != 0) {
                    k6.b(obj);
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
                    k6.b(obj);
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
                            return pc.i.a;
                        }
                    }
                }
            }
        }
        fVar = new f(cVar);
        Object obj2 = fVar.d;
        sc.a aVar2 = sc.a.a;
        i10 = fVar.e;
        if (i10 != 0) {
        }
    }

    public static a2 q(c0 c0Var, ad.p pVar) {
        d0 d0Var = d0.a;
        rc.h i10 = i(c0Var.c(), rc.i.a, true);
        pd.e eVar = n0.a;
        if (i10 != eVar && i10.get(rc.d.a) == null) {
            i10 = i10.plus(eVar);
        }
        d0 d0Var2 = d0.a;
        a2 a2Var = new a2(i10, true);
        a2Var.L(d0Var, a2Var, pVar);
        return a2Var;
    }

    public static final Object r(Object obj) {
        return obj instanceof v ? k6.a(((v) obj).a) : obj;
    }

    public static final void s(m mVar, rc.c cVar, boolean z10) {
        Object obj = m.h.get(mVar);
        Throwable g10 = mVar.g(obj);
        Object a2 = g10 != null ? k6.a(g10) : mVar.h(obj);
        if (!z10) {
            cVar.resumeWith(a2);
            return;
        }
        kotlin.jvm.internal.j.c(cVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        nd.h hVar = (nd.h) cVar;
        tc.c cVar2 = hVar.e;
        Object obj2 = hVar.h;
        rc.h context = cVar2.getContext();
        Object k10 = nd.a.k(context, obj2);
        h2 v = k10 != nd.a.f ? v(cVar2, context, k10) : null;
        try {
            cVar2.resumeWith(a2);
            if (v == null || v.M()) {
                nd.a.f(context, k10);
            }
        } catch (Throwable th) {
            if (v == null || v.M()) {
                nd.a.f(context, k10);
            }
            throw th;
        }
    }

    public static final String t(rc.c cVar) {
        Object a2;
        if (cVar instanceof nd.h) {
            return cVar.toString();
        }
        try {
            a2 = cVar + '@' + k(cVar);
        } catch (Throwable th) {
            a2 = k6.a(th);
        }
        if (pc.f.a(a2) != null) {
            a2 = cVar.getClass().getName() + '@' + k(cVar);
        }
        return (String) a2;
    }

    public static final Object u(Object obj) {
        b1 b1Var;
        c1 c1Var = obj instanceof c1 ? (c1) obj : null;
        return (c1Var == null || (b1Var = c1Var.a) == null) ? obj : b1Var;
    }

    public static final h2 v(rc.c cVar, rc.h hVar, Object obj) {
        h2 h2Var = null;
        if ((cVar instanceof tc.d) && hVar.get(i2.a) != null) {
            tc.d dVar = (tc.d) cVar;
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

    public static final Object w(rc.h hVar, ad.p pVar, rc.c cVar) {
        Object u10;
        rc.h context = cVar.getContext();
        rc.h plus = !((Boolean) hVar.fold(Boolean.FALSE, x.d)).booleanValue() ? context.plus(hVar) : i(context, hVar, false);
        h(plus);
        if (plus == context) {
            nd.s sVar = new nd.s(cVar, plus);
            u10 = h7.i0.a(sVar, sVar, pVar);
        } else {
            rc.d dVar = rc.d.a;
            if (kotlin.jvm.internal.j.a(plus.get(dVar), context.get(dVar))) {
                h2 h2Var = new h2(cVar, plus);
                rc.h hVar2 = h2Var.c;
                Object k10 = nd.a.k(hVar2, null);
                try {
                    Object a2 = h7.i0.a(h2Var, h2Var, pVar);
                    nd.a.f(hVar2, k10);
                    u10 = a2;
                } catch (Throwable th) {
                    nd.a.f(hVar2, k10);
                    throw th;
                }
            } else {
                l0 l0Var = new l0(cVar, plus);
                h7.h0.a(pVar, l0Var, l0Var);
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
                        u10 = sc.a.a;
                        break;
                    }
                }
            }
        }
        sc.a aVar = sc.a.a;
        return u10;
    }

    public static final Object x(long j10, ad.p pVar, rc.c cVar) {
        Object vVar;
        Object B;
        if (j10 <= 0) {
            throw new e2("Timed out immediately", null);
        }
        f2 f2Var = new f2(j10, cVar);
        n(f2Var, false, new q0(j(f2Var.d.getContext()).b(f2Var.e, f2Var, f2Var.c), 0), 3);
        try {
            kotlin.jvm.internal.t.a(2, pVar);
            vVar = pVar.invoke(f2Var, f2Var);
        } catch (Throwable th) {
            vVar = new v(th, false);
        }
        Object obj = sc.a.a;
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
