package ld;

import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import k7.g7;
import k7.h7;
import k7.h8;
import k7.o7;
import k7.q7;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public abstract class e0 {
    public static final com.google.android.gms.internal.clearcut.e a = new com.google.android.gms.internal.clearcut.e("RESUME_TOKEN", 2);
    public static final com.google.android.gms.internal.clearcut.e b = new com.google.android.gms.internal.clearcut.e("REMOVED_TASK", 2);
    public static final com.google.android.gms.internal.clearcut.e c = new com.google.android.gms.internal.clearcut.e("CLOSED_EMPTY", 2);
    public static final com.google.android.gms.internal.clearcut.e d = new com.google.android.gms.internal.clearcut.e("COMPLETING_ALREADY", 2);
    public static final com.google.android.gms.internal.clearcut.e e = new com.google.android.gms.internal.clearcut.e("COMPLETING_WAITING_CHILDREN", 2);
    public static final com.google.android.gms.internal.clearcut.e f = new com.google.android.gms.internal.clearcut.e("COMPLETING_RETRY", 2);
    public static final com.google.android.gms.internal.clearcut.e g = new com.google.android.gms.internal.clearcut.e("TOO_LATE_TO_CANCEL", 2);
    public static final com.google.android.gms.internal.clearcut.e h = new com.google.android.gms.internal.clearcut.e("SEALED", 2);
    public static final q0 i = new q0(false);
    public static final q0 j = new q0(true);

    public static t a() {
        t tVar = new t(true);
        tVar.x(null);
        return tVar;
    }

    public static final qd.e b(uc.h hVar) {
        if (hVar.get(b0.b) == null) {
            hVar = hVar.plus(new i1());
        }
        return new qd.e(hVar);
    }

    public static i0 c(c0 c0Var, dd.p pVar) {
        d0 d0Var = d0.a;
        uc.h i10 = i(c0Var.c(), uc.i.a, true);
        sd.e eVar = m0.a;
        if (i10 != eVar && i10.get(uc.d.a) == null) {
            i10 = i10.plus(eVar);
        }
        d0 d0Var2 = d0.a;
        i0 i0Var = new i0(i10, true);
        i0Var.L(d0Var, i0Var, pVar);
        return i0Var;
    }

    public static final Object d(h0[] h0VarArr, wc.i iVar) {
        if (h0VarArr.length == 0) {
            return tc.o.a;
        }
        e eVar = new e(h0VarArr);
        m mVar = new m(1, h8.b(iVar));
        mVar.s();
        int length = h0VarArr.length;
        c[] cVarArr = new c[length];
        for (int i10 = 0; i10 < length; i10++) {
            h0 h0Var = h0VarArr[i10];
            h0Var.start();
            c cVar = new c(eVar, mVar);
            cVar.f = n(h0Var, false, cVar, 3);
            cVarArr[i10] = cVar;
        }
        d dVar = new d(cVarArr);
        for (int i11 = 0; i11 < length; i11++) {
            c cVar2 = cVarArr[i11];
            cVar2.getClass();
            c.n.set(cVar2, dVar);
        }
        if (m.h.get(mVar) instanceof x1) {
            mVar.v(dVar);
        } else {
            dVar.b();
        }
        Object r10 = mVar.r();
        vc.a aVar = vc.a.a;
        return r10;
    }

    public static final void e(uc.h hVar, CancellationException cancellationException) {
        f1 f1Var = (f1) hVar.get(b0.b);
        if (f1Var != null) {
            f1Var.cancel(cancellationException);
        }
    }

    public static final Object f(dd.p pVar, uc.c cVar) {
        qd.s sVar = new qd.s(cVar, cVar.getContext());
        Object a2 = h7.a(sVar, sVar, pVar);
        vc.a aVar = vc.a.a;
        return a2;
    }

    public static final Object g(long j10, wc.c cVar) {
        if (j10 > 0) {
            m mVar = new m(1, h8.b(cVar));
            mVar.s();
            if (j10 < Long.MAX_VALUE) {
                j(mVar.e).b(j10, mVar);
            }
            Object r10 = mVar.r();
            if (r10 == vc.a.a) {
                return r10;
            }
        }
        return sc.i.a;
    }

    public static final void h(uc.h hVar) {
        f1 f1Var = (f1) hVar.get(b0.b);
        if (f1Var != null && !f1Var.isActive()) {
            throw f1Var.getCancellationException();
        }
    }

    public static final uc.h i(uc.h hVar, uc.h hVar2, boolean z4) {
        Boolean bool = Boolean.FALSE;
        x xVar = x.d;
        boolean booleanValue = ((Boolean) hVar.fold(bool, xVar)).booleanValue();
        boolean booleanValue2 = ((Boolean) hVar2.fold(bool, xVar)).booleanValue();
        if (!booleanValue && !booleanValue2) {
            return hVar.plus(hVar2);
        }
        x xVar2 = new x(2, 2);
        uc.i iVar = uc.i.a;
        uc.h hVar3 = (uc.h) hVar.fold(iVar, xVar2);
        Object obj = hVar2;
        if (booleanValue2) {
            obj = hVar2.fold(iVar, x.c);
        }
        return hVar3.plus((uc.h) obj);
    }

    public static final j0 j(uc.h hVar) {
        uc.f fVar = hVar.get(uc.d.a);
        j0 j0Var = fVar instanceof j0 ? (j0) fVar : null;
        return j0Var == null ? g0.a : j0Var;
    }

    public static final String k(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final m l(uc.c cVar) {
        m mVar;
        m mVar2;
        if (!(cVar instanceof qd.h)) {
            return new m(1, cVar);
        }
        qd.h hVar = (qd.h) cVar;
        com.google.android.gms.internal.clearcut.e eVar = qd.a.d;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = qd.h.n;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(hVar);
            mVar = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(hVar, eVar);
                mVar2 = null;
                break;
            }
            if (obj instanceof m) {
                while (!atomicReferenceFieldUpdater.compareAndSet(hVar, obj, eVar)) {
                    if (atomicReferenceFieldUpdater.get(hVar) != obj) {
                        break;
                    }
                }
                mVar2 = (m) obj;
                break loop0;
            }
            if (obj != eVar && !(obj instanceof Throwable)) {
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

    public static final void m(Throwable th2, uc.h hVar) {
        try {
            md.b bVar = (md.b) hVar.get(b0.a);
            if (bVar != null) {
                bVar.c(th2);
            } else {
                qd.a.c(th2, hVar);
            }
        } catch (Throwable th3) {
            if (th2 != th3) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th3);
                o7.a(runtimeException, th2);
                th2 = runtimeException;
            }
            qd.a.c(th2, hVar);
        }
    }

    public static o0 n(f1 f1Var, boolean z4, k1 k1Var, int i10) {
        if ((i10 & 1) != 0) {
            z4 = false;
        }
        boolean z10 = (i10 & 2) != 0;
        return f1Var instanceof u1 ? ((u1) f1Var).y(z4, z10, k1Var) : f1Var.invokeOnCompletion(z4, z10, new j1(1, k1Var, d1.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object o(Collection collection, wc.c cVar) {
        g gVar;
        int i10;
        Iterator it;
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i11 = gVar.c;
            if ((i11 & TLObject.FLAG_31) != 0) {
                gVar.c = i11 - TLObject.FLAG_31;
                Object obj = gVar.b;
                vc.a aVar = vc.a.a;
                i10 = gVar.c;
                if (i10 != 0) {
                    q7.b(obj);
                    it = collection.iterator();
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = gVar.a;
                    q7.b(obj);
                }
                while (it.hasNext()) {
                    f1 f1Var = (f1) it.next();
                    gVar.a = it;
                    gVar.c = 1;
                    if (f1Var.join(gVar) == aVar) {
                        return aVar;
                    }
                }
                return sc.i.a;
            }
        }
        gVar = new g(cVar);
        Object obj2 = gVar.b;
        vc.a aVar2 = vc.a.a;
        i10 = gVar.c;
        if (i10 != 0) {
        }
        while (it.hasNext()) {
        }
        return sc.i.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0050 -> B:10:0x0053). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object p(f1[] f1VarArr, wc.c cVar) {
        f fVar;
        int i10;
        int i11;
        f1[] f1VarArr2;
        int length;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i12 = fVar.e;
            if ((i12 & TLObject.FLAG_31) != 0) {
                fVar.e = i12 - TLObject.FLAG_31;
                Object obj = fVar.d;
                vc.a aVar = vc.a.a;
                i10 = fVar.e;
                if (i10 != 0) {
                    q7.b(obj);
                    i11 = 0;
                    f1VarArr2 = f1VarArr;
                    length = f1VarArr.length;
                    if (i11 < length) {
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    length = fVar.c;
                    i11 = fVar.b;
                    f1[] f1VarArr3 = (f1[]) fVar.a;
                    q7.b(obj);
                    f1VarArr2 = f1VarArr3;
                    i11++;
                    if (i11 < length) {
                        f1 f1Var = f1VarArr2[i11];
                        fVar.a = f1VarArr2;
                        fVar.b = i11;
                        fVar.c = length;
                        fVar.e = 1;
                        if (f1Var.join(fVar) == aVar) {
                            return aVar;
                        }
                        i11++;
                        if (i11 < length) {
                            return sc.i.a;
                        }
                    }
                }
            }
        }
        fVar = new f(cVar);
        Object obj2 = fVar.d;
        vc.a aVar2 = vc.a.a;
        i10 = fVar.e;
        if (i10 != 0) {
        }
    }

    public static z1 q(c0 c0Var, dd.p pVar) {
        d0 d0Var = d0.a;
        uc.h i10 = i(c0Var.c(), uc.i.a, true);
        sd.e eVar = m0.a;
        if (i10 != eVar && i10.get(uc.d.a) == null) {
            i10 = i10.plus(eVar);
        }
        d0 d0Var2 = d0.a;
        z1 z1Var = new z1(i10, true);
        z1Var.L(d0Var, z1Var, pVar);
        return z1Var;
    }

    public static final Object r(Object obj) {
        return obj instanceof v ? q7.a(((v) obj).a) : obj;
    }

    public static final void s(m mVar, uc.c cVar, boolean z4) {
        Object obj = m.h.get(mVar);
        Throwable g10 = mVar.g(obj);
        Object a2 = g10 != null ? q7.a(g10) : mVar.h(obj);
        if (!z4) {
            cVar.resumeWith(a2);
            return;
        }
        kotlin.jvm.internal.j.c(cVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        qd.h hVar = (qd.h) cVar;
        wc.c cVar2 = hVar.e;
        Object obj2 = hVar.h;
        uc.h context = cVar2.getContext();
        Object k10 = qd.a.k(context, obj2);
        g2 v = k10 != qd.a.f ? v(cVar2, context, k10) : null;
        try {
            cVar2.resumeWith(a2);
            if (v == null || v.M()) {
                qd.a.f(context, k10);
            }
        } catch (Throwable th2) {
            if (v == null || v.M()) {
                qd.a.f(context, k10);
            }
            throw th2;
        }
    }

    public static final String t(uc.c cVar) {
        Object a2;
        if (cVar instanceof qd.h) {
            return cVar.toString();
        }
        try {
            a2 = cVar + '@' + k(cVar);
        } catch (Throwable th2) {
            a2 = q7.a(th2);
        }
        if (sc.f.a(a2) != null) {
            a2 = cVar.getClass().getName() + '@' + k(cVar);
        }
        return (String) a2;
    }

    public static final Object u(Object obj) {
        a1 a1Var;
        b1 b1Var = obj instanceof b1 ? (b1) obj : null;
        return (b1Var == null || (a1Var = b1Var.a) == null) ? obj : a1Var;
    }

    public static final g2 v(uc.c cVar, uc.h hVar, Object obj) {
        g2 g2Var = null;
        if ((cVar instanceof wc.d) && hVar.get(h2.a) != null) {
            wc.d dVar = (wc.d) cVar;
            while (true) {
                if ((dVar instanceof k0) || (dVar = dVar.getCallerFrame()) == null) {
                    break;
                }
                if (dVar instanceof g2) {
                    g2Var = (g2) dVar;
                    break;
                }
            }
            if (g2Var != null) {
                g2Var.N(hVar, obj);
            }
        }
        return g2Var;
    }

    public static final Object w(uc.h hVar, dd.p pVar, uc.c cVar) {
        Object u10;
        uc.h context = cVar.getContext();
        uc.h plus = !((Boolean) hVar.fold(Boolean.FALSE, x.d)).booleanValue() ? context.plus(hVar) : i(context, hVar, false);
        h(plus);
        if (plus == context) {
            qd.s sVar = new qd.s(cVar, plus);
            u10 = h7.a(sVar, sVar, pVar);
        } else {
            uc.d dVar = uc.d.a;
            if (kotlin.jvm.internal.j.a(plus.get(dVar), context.get(dVar))) {
                g2 g2Var = new g2(cVar, plus);
                uc.h hVar2 = g2Var.c;
                Object k10 = qd.a.k(hVar2, null);
                try {
                    Object a2 = h7.a(g2Var, g2Var, pVar);
                    qd.a.f(hVar2, k10);
                    u10 = a2;
                } catch (Throwable th2) {
                    qd.a.f(hVar2, k10);
                    throw th2;
                }
            } else {
                k0 k0Var = new k0(cVar, plus);
                g7.a(pVar, k0Var, k0Var);
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = k0.e;
                while (true) {
                    int i10 = atomicIntegerFieldUpdater.get(k0Var);
                    if (i10 != 0) {
                        if (i10 != 2) {
                            throw new IllegalStateException("Already suspended");
                        }
                        u10 = u(k0Var.u());
                        if (u10 instanceof v) {
                            throw ((v) u10).a;
                        }
                    } else if (atomicIntegerFieldUpdater.compareAndSet(k0Var, 0, 1)) {
                        u10 = vc.a.a;
                        break;
                    }
                }
            }
        }
        vc.a aVar = vc.a.a;
        return u10;
    }

    public static final Object x(long j10, dd.p pVar, uc.c cVar) {
        Object vVar;
        Object B;
        if (j10 <= 0) {
            throw new d2("Timed out immediately", null);
        }
        e2 e2Var = new e2(j10, cVar);
        n(e2Var, false, new p0(j(e2Var.d.getContext()).a(e2Var.e, e2Var, e2Var.c), 0), 3);
        try {
            kotlin.jvm.internal.t.a(2, pVar);
            vVar = pVar.invoke(e2Var, e2Var);
        } catch (Throwable th2) {
            vVar = new v(th2, false);
        }
        Object obj = vc.a.a;
        if (vVar == obj || (B = e2Var.B(vVar)) == e) {
            return obj;
        }
        if (B instanceof v) {
            Throwable th3 = ((v) B).a;
            if (!(th3 instanceof d2)) {
                throw th3;
            }
            if (((d2) th3).a != e2Var) {
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
