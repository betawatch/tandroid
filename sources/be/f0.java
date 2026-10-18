package be;

import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.telegram.tgnet.TLObject;
import v7.g8;
import v7.i8;
import v7.t7;
import v7.u7;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public abstract class f0 {
    public static final com.google.android.gms.internal.clearcut.e a = new com.google.android.gms.internal.clearcut.e("RESUME_TOKEN", 1);
    public static final com.google.android.gms.internal.clearcut.e b = new com.google.android.gms.internal.clearcut.e("REMOVED_TASK", 1);
    public static final com.google.android.gms.internal.clearcut.e c = new com.google.android.gms.internal.clearcut.e("CLOSED_EMPTY", 1);
    public static final com.google.android.gms.internal.clearcut.e d = new com.google.android.gms.internal.clearcut.e("COMPLETING_ALREADY", 1);
    public static final com.google.android.gms.internal.clearcut.e e = new com.google.android.gms.internal.clearcut.e("COMPLETING_WAITING_CHILDREN", 1);
    public static final com.google.android.gms.internal.clearcut.e f = new com.google.android.gms.internal.clearcut.e("COMPLETING_RETRY", 1);
    public static final com.google.android.gms.internal.clearcut.e g = new com.google.android.gms.internal.clearcut.e("TOO_LATE_TO_CANCEL", 1);
    public static final com.google.android.gms.internal.clearcut.e h = new com.google.android.gms.internal.clearcut.e("SEALED", 1);
    public static final r0 i = new r0(false);
    public static final r0 j = new r0(true);

    public static t a() {
        t tVar = new t(true);
        tVar.x(null);
        return tVar;
    }

    public static final ge.e b(kd.h hVar) {
        if (hVar.get(b0.b) == null) {
            hVar = hVar.plus(new j1());
        }
        return new ge.e(hVar);
    }

    public static j0 c(c0 c0Var, td.p pVar) {
        d0 d0Var = d0.a;
        kd.h i10 = i(c0Var.c(), kd.i.a, true);
        ie.e eVar = n0.a;
        if (i10 != eVar && i10.get(kd.d.a) == null) {
            i10 = i10.plus(eVar);
        }
        d0 d0Var2 = d0.a;
        j0 j0Var = new j0(i10, true);
        j0Var.L(d0Var, j0Var, pVar);
        return j0Var;
    }

    public static final Object d(i0[] i0VarArr, md.i iVar) {
        if (i0VarArr.length == 0) {
            return jd.o.a;
        }
        e eVar = new e(i0VarArr);
        m mVar = new m(1, w7.n.b(iVar));
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
        ld.a aVar = ld.a.a;
        return r10;
    }

    public static final void e(kd.h hVar, CancellationException cancellationException) {
        g1 g1Var = (g1) hVar.get(b0.b);
        if (g1Var != null) {
            g1Var.cancel(cancellationException);
        }
    }

    public static final Object f(td.p pVar, kd.c cVar) {
        ge.s sVar = new ge.s(cVar, cVar.getContext());
        Object a2 = u7.a(sVar, sVar, pVar);
        ld.a aVar = ld.a.a;
        return a2;
    }

    public static final Object g(long j10, md.c cVar) {
        if (j10 > 0) {
            m mVar = new m(1, w7.n.b(cVar));
            mVar.s();
            if (j10 < Long.MAX_VALUE) {
                j(mVar.e).a(j10, mVar);
            }
            Object r10 = mVar.r();
            if (r10 == ld.a.a) {
                return r10;
            }
        }
        return id.i.a;
    }

    public static final void h(kd.h hVar) {
        g1 g1Var = (g1) hVar.get(b0.b);
        if (g1Var != null && !g1Var.isActive()) {
            throw g1Var.getCancellationException();
        }
    }

    public static final kd.h i(kd.h hVar, kd.h hVar2, boolean z10) {
        Boolean bool = Boolean.FALSE;
        x xVar = x.d;
        boolean booleanValue = ((Boolean) hVar.fold(bool, xVar)).booleanValue();
        boolean booleanValue2 = ((Boolean) hVar2.fold(bool, xVar)).booleanValue();
        if (!booleanValue && !booleanValue2) {
            return hVar.plus(hVar2);
        }
        x xVar2 = new x(2, 2);
        kd.i iVar = kd.i.a;
        kd.h hVar3 = (kd.h) hVar.fold(iVar, xVar2);
        Object obj = hVar2;
        if (booleanValue2) {
            obj = hVar2.fold(iVar, x.c);
        }
        return hVar3.plus((kd.h) obj);
    }

    public static final k0 j(kd.h hVar) {
        kd.f fVar = hVar.get(kd.d.a);
        k0 k0Var = fVar instanceof k0 ? (k0) fVar : null;
        return k0Var == null ? h0.a : k0Var;
    }

    public static final String k(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final m l(kd.c cVar) {
        m mVar;
        m mVar2;
        if (!(cVar instanceof ge.h)) {
            return new m(1, cVar);
        }
        ge.h hVar = (ge.h) cVar;
        com.google.android.gms.internal.clearcut.e eVar = ge.a.d;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = ge.h.n;
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

    public static final void m(Throwable th2, kd.h hVar) {
        try {
            ce.b bVar = (ce.b) hVar.get(b0.a);
            if (bVar != null) {
                bVar.c(th2);
            } else {
                ge.a.c(th2, hVar);
            }
        } catch (Throwable th3) {
            if (th2 != th3) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th3);
                g8.a(runtimeException, th2);
                th2 = runtimeException;
            }
            ge.a.c(th2, hVar);
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
    public static final Object o(Collection collection, md.c cVar) {
        g gVar;
        int i10;
        Iterator it;
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i11 = gVar.c;
            if ((i11 & TLObject.FLAG_31) != 0) {
                gVar.c = i11 - TLObject.FLAG_31;
                Object obj = gVar.b;
                ld.a aVar = ld.a.a;
                i10 = gVar.c;
                if (i10 != 0) {
                    i8.b(obj);
                    it = collection.iterator();
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = gVar.a;
                    i8.b(obj);
                }
                while (it.hasNext()) {
                    g1 g1Var = (g1) it.next();
                    gVar.a = it;
                    gVar.c = 1;
                    if (g1Var.join(gVar) == aVar) {
                        return aVar;
                    }
                }
                return id.i.a;
            }
        }
        gVar = new g(cVar);
        Object obj2 = gVar.b;
        ld.a aVar2 = ld.a.a;
        i10 = gVar.c;
        if (i10 != 0) {
        }
        while (it.hasNext()) {
        }
        return id.i.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0050 -> B:10:0x0053). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object p(g1[] g1VarArr, md.c cVar) {
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
                ld.a aVar = ld.a.a;
                i10 = fVar.e;
                if (i10 != 0) {
                    i8.b(obj);
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
                    i8.b(obj);
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
                            return id.i.a;
                        }
                    }
                }
            }
        }
        fVar = new f(cVar);
        Object obj2 = fVar.d;
        ld.a aVar2 = ld.a.a;
        i10 = fVar.e;
        if (i10 != 0) {
        }
    }

    public static a2 q(c0 c0Var, td.p pVar) {
        d0 d0Var = d0.a;
        kd.h i10 = i(c0Var.c(), kd.i.a, true);
        ie.e eVar = n0.a;
        if (i10 != eVar && i10.get(kd.d.a) == null) {
            i10 = i10.plus(eVar);
        }
        d0 d0Var2 = d0.a;
        a2 a2Var = new a2(i10, true);
        a2Var.L(d0Var, a2Var, pVar);
        return a2Var;
    }

    public static final Object r(Object obj) {
        return obj instanceof v ? i8.a(((v) obj).a) : obj;
    }

    public static final void s(m mVar, kd.c cVar, boolean z10) {
        Object obj = m.h.get(mVar);
        Throwable g10 = mVar.g(obj);
        Object a2 = g10 != null ? i8.a(g10) : mVar.h(obj);
        if (!z10) {
            cVar.resumeWith(a2);
            return;
        }
        kotlin.jvm.internal.i.c(cVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        ge.h hVar = (ge.h) cVar;
        md.c cVar2 = hVar.e;
        Object obj2 = hVar.h;
        kd.h context = cVar2.getContext();
        Object k10 = ge.a.k(context, obj2);
        h2 v = k10 != ge.a.f ? v(cVar2, context, k10) : null;
        try {
            cVar2.resumeWith(a2);
            if (v == null || v.M()) {
                ge.a.f(context, k10);
            }
        } catch (Throwable th2) {
            if (v == null || v.M()) {
                ge.a.f(context, k10);
            }
            throw th2;
        }
    }

    public static final String t(kd.c cVar) {
        Object a2;
        if (cVar instanceof ge.h) {
            return cVar.toString();
        }
        try {
            a2 = cVar + '@' + k(cVar);
        } catch (Throwable th2) {
            a2 = i8.a(th2);
        }
        if (id.f.a(a2) != null) {
            a2 = cVar.getClass().getName() + '@' + k(cVar);
        }
        return (String) a2;
    }

    public static final Object u(Object obj) {
        b1 b1Var;
        c1 c1Var = obj instanceof c1 ? (c1) obj : null;
        return (c1Var == null || (b1Var = c1Var.a) == null) ? obj : b1Var;
    }

    public static final h2 v(kd.c cVar, kd.h hVar, Object obj) {
        h2 h2Var = null;
        if ((cVar instanceof md.d) && hVar.get(i2.a) != null) {
            md.d dVar = (md.d) cVar;
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

    public static final Object w(kd.h hVar, td.p pVar, kd.c cVar) {
        Object u10;
        kd.h context = cVar.getContext();
        kd.h plus = !((Boolean) hVar.fold(Boolean.FALSE, x.d)).booleanValue() ? context.plus(hVar) : i(context, hVar, false);
        h(plus);
        if (plus == context) {
            ge.s sVar = new ge.s(cVar, plus);
            u10 = u7.a(sVar, sVar, pVar);
        } else {
            kd.d dVar = kd.d.a;
            if (kotlin.jvm.internal.i.a(plus.get(dVar), context.get(dVar))) {
                h2 h2Var = new h2(cVar, plus);
                kd.h hVar2 = h2Var.c;
                Object k10 = ge.a.k(hVar2, null);
                try {
                    Object a2 = u7.a(h2Var, h2Var, pVar);
                    ge.a.f(hVar2, k10);
                    u10 = a2;
                } catch (Throwable th2) {
                    ge.a.f(hVar2, k10);
                    throw th2;
                }
            } else {
                l0 l0Var = new l0(cVar, plus);
                t7.a(pVar, l0Var, l0Var);
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
                        u10 = ld.a.a;
                        break;
                    }
                }
            }
        }
        ld.a aVar = ld.a.a;
        return u10;
    }

    public static final Object x(long j10, td.p pVar, kd.c cVar) {
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
        Object obj = ld.a.a;
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
