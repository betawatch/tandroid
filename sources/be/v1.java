package be;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import v7.g8;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public class v1 implements g1, r, z1 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(v1.class, Object.class, "_state$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(v1.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    public v1(boolean z10) {
        this._state$volatile = z10 ? f0.j : f0.i;
    }

    public static q D(ge.k kVar) {
        while (kVar.h()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = ge.k.b;
            ge.k d = kVar.d();
            if (d == null) {
                Object obj = atomicReferenceFieldUpdater.get(kVar);
                while (true) {
                    kVar = (ge.k) obj;
                    if (!kVar.h()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(kVar);
                }
            } else {
                kVar = d;
            }
        }
        while (true) {
            kVar = kVar.g();
            if (!kVar.h()) {
                if (kVar instanceof q) {
                    return (q) kVar;
                }
                if (kVar instanceof w1) {
                    return null;
                }
            }
        }
    }

    public static String J(Object obj) {
        if (!(obj instanceof o1)) {
            return obj instanceof b1 ? ((b1) obj).isActive() ? "Active" : "New" : obj instanceof v ? "Cancelled" : "Completed";
        }
        o1 o1Var = (o1) obj;
        return o1Var.d() ? "Cancelling" : o1Var.e() ? "Completing" : "Active";
    }

    public final boolean A(Object obj) {
        Object K;
        do {
            K = K(u(), obj);
            if (K == f0.d) {
                return false;
            }
            if (K == f0.e) {
                return true;
            }
        } while (K == f0.f);
        b(K);
        return true;
    }

    public final Object B(Object obj) {
        Object K;
        do {
            K = K(u(), obj);
            if (K == f0.d) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                v vVar = obj instanceof v ? (v) obj : null;
                throw new IllegalStateException(str, vVar != null ? vVar.a : null);
            }
        } while (K == f0.f);
        return K;
    }

    public String C() {
        return getClass().getSimpleName();
    }

    public final void E(w1 w1Var, Throwable th2) {
        Object f7 = w1Var.f();
        kotlin.jvm.internal.i.c(f7, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        androidx.car.app.j jVar = null;
        for (ge.k kVar = (ge.k) f7; !kVar.equals(w1Var); kVar = kVar.g()) {
            if (kVar instanceof i1) {
                l1 l1Var = (l1) kVar;
                try {
                    l1Var.a(th2);
                } catch (Throwable th3) {
                    if (jVar != null) {
                        g8.a(jVar, th3);
                    } else {
                        jVar = new androidx.car.app.j("Exception in completion handler " + l1Var + " for " + this, th3);
                    }
                }
            }
        }
        if (jVar != null) {
            w(jVar);
        }
        j(th2);
    }

    public final void H(l1 l1Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        w1 w1Var = new w1();
        l1Var.getClass();
        ge.k.b.set(w1Var, l1Var);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = ge.k.a;
        atomicReferenceFieldUpdater2.set(w1Var, l1Var);
        loop0: while (true) {
            if (l1Var.f() == l1Var) {
                while (!atomicReferenceFieldUpdater2.compareAndSet(l1Var, l1Var, w1Var)) {
                    if (atomicReferenceFieldUpdater2.get(l1Var) != l1Var) {
                        break;
                    }
                }
                w1Var.e(l1Var);
                break loop0;
            }
            break;
        }
        ge.k g10 = l1Var.g();
        do {
            atomicReferenceFieldUpdater = a;
            if (atomicReferenceFieldUpdater.compareAndSet(this, l1Var, g10)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == l1Var);
    }

    public final int I(Object obj) {
        boolean z10 = obj instanceof r0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
        if (z10) {
            if (((r0) obj).a) {
                return 0;
            }
            r0 r0Var = f0.j;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, r0Var)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            return 1;
        }
        if (!(obj instanceof a1)) {
            return 0;
        }
        w1 w1Var = ((a1) obj).a;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, w1Var)) {
            if (atomicReferenceFieldUpdater.get(this) != obj) {
                return -1;
            }
        }
        return 1;
    }

    public final Object K(Object obj, Object obj2) {
        if (!(obj instanceof b1)) {
            return f0.d;
        }
        if (((obj instanceof r0) || (obj instanceof l1)) && !(obj instanceof q) && !(obj2 instanceof v)) {
            b1 b1Var = (b1) obj;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
            Object c1Var = obj2 instanceof b1 ? new c1((b1) obj2) : obj2;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, b1Var, c1Var)) {
                if (atomicReferenceFieldUpdater.get(this) != b1Var) {
                    return f0.f;
                }
            }
            F(obj2);
            m(b1Var, obj2);
            return obj2;
        }
        b1 b1Var2 = (b1) obj;
        w1 t10 = t(b1Var2);
        if (t10 == null) {
            return f0.f;
        }
        q qVar = null;
        o1 o1Var = b1Var2 instanceof o1 ? (o1) b1Var2 : null;
        if (o1Var == null) {
            o1Var = new o1(t10, null);
        }
        synchronized (o1Var) {
            if (o1Var.e()) {
                return f0.d;
            }
            o1.b.set(o1Var, 1);
            if (o1Var != b1Var2) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = a;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, b1Var2, o1Var)) {
                    if (atomicReferenceFieldUpdater2.get(this) != b1Var2) {
                        return f0.f;
                    }
                }
            }
            boolean d = o1Var.d();
            v vVar = obj2 instanceof v ? (v) obj2 : null;
            if (vVar != null) {
                o1Var.a(vVar.a);
            }
            Throwable b10 = o1Var.b();
            if (d) {
                b10 = null;
            }
            if (b10 != null) {
                E(t10, b10);
            }
            q qVar2 = b1Var2 instanceof q ? (q) b1Var2 : null;
            if (qVar2 == null) {
                w1 c10 = b1Var2.c();
                if (c10 != null) {
                    qVar = D(c10);
                }
            } else {
                qVar = qVar2;
            }
            if (qVar != null) {
                while (f0.n(qVar.e, false, new n1(this, o1Var, qVar, obj2), 1) == x1.a) {
                    qVar = D(qVar);
                    if (qVar == null) {
                    }
                }
                return f0.e;
            }
            return o(o1Var, obj2);
        }
    }

    public final boolean a(b1 b1Var, w1 w1Var, l1 l1Var) {
        ge.k d;
        q1 q1Var = new q1(l1Var, this, b1Var);
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = ge.k.b;
            d = w1Var.d();
            if (d == null) {
                Object obj = atomicReferenceFieldUpdater.get(w1Var);
                while (true) {
                    d = (ge.k) obj;
                    if (!d.h()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(d);
                }
            }
            ge.k.b.set(l1Var, d);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = ge.k.a;
            atomicReferenceFieldUpdater2.set(l1Var, w1Var);
            q1Var.c = w1Var;
            while (!atomicReferenceFieldUpdater2.compareAndSet(d, w1Var, q1Var)) {
                if (atomicReferenceFieldUpdater2.get(d) != w1Var) {
                    break;
                }
            }
        }
        return q1Var.a(d) == null;
    }

    @Override // be.g1
    public final p attachChild(r rVar) {
        p0 n10 = f0.n(this, true, new q(rVar), 2);
        kotlin.jvm.internal.i.c(n10, "null cannot be cast to non-null type kotlinx.coroutines.ChildHandle");
        return (p) n10;
    }

    @Override // be.g1
    public final void cancel(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new h1(k(), null, this);
        }
        i(cancellationException);
    }

    @Override // kd.h
    public final Object fold(Object obj, td.p pVar) {
        return pVar.invoke(obj, this);
    }

    public void g(Object obj) {
        b(obj);
    }

    @Override // kd.h
    public final kd.f get(kd.g gVar) {
        return w7.k.a(this, gVar);
    }

    @Override // be.g1
    public final CancellationException getCancellationException() {
        CancellationException cancellationException;
        Object u10 = u();
        if (!(u10 instanceof o1)) {
            if (u10 instanceof b1) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (!(u10 instanceof v)) {
                return new h1(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            Throwable th2 = ((v) u10).a;
            cancellationException = th2 instanceof CancellationException ? (CancellationException) th2 : null;
            return cancellationException == null ? new h1(k(), th2, this) : cancellationException;
        }
        Throwable b10 = ((o1) u10).b();
        if (b10 == null) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        String concat = getClass().getSimpleName().concat(" is cancelling");
        cancellationException = b10 instanceof CancellationException ? (CancellationException) b10 : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        if (concat == null) {
            concat = k();
        }
        return new h1(concat, b10, this);
    }

    @Override // be.g1
    public final yd.b getChildren() {
        return new yd.e(new r1(this, null), 0);
    }

    public Object getCompleted() {
        return p();
    }

    public final Throwable getCompletionExceptionOrNull() {
        Object u10 = u();
        if (u10 instanceof b1) {
            throw new IllegalStateException("This job has not completed yet");
        }
        v vVar = u10 instanceof v ? (v) u10 : null;
        if (vVar != null) {
            return vVar.a;
        }
        return null;
    }

    @Override // kd.f
    public final kd.g getKey() {
        return b0.b;
    }

    @Override // be.g1
    public final g1 getParent() {
        p pVar = (p) b.get(this);
        if (pVar != null) {
            return pVar.getParent();
        }
        return null;
    }

    public final Object h(kd.c cVar) {
        Object u10;
        do {
            u10 = u();
            if (!(u10 instanceof b1)) {
                if (u10 instanceof v) {
                    throw ((v) u10).a;
                }
                return f0.u(u10);
            }
        } while (I(u10) < 0);
        m1 m1Var = new m1(this, w7.n.b(cVar));
        m1Var.s();
        m1Var.v(new j(f0.n(this, false, new q0(m1Var, 3), 3), 2));
        Object r10 = m1Var.r();
        ld.a aVar = ld.a.a;
        return r10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
    
        if (r0 == be.f0.e) goto L75;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean i(Object obj) {
        a6.i iVar;
        Object obj2 = f0.d;
        if (s()) {
            do {
                Object u10 = u();
                if (!(u10 instanceof b1) || ((u10 instanceof o1) && ((o1) u10).e())) {
                    obj2 = f0.d;
                    break;
                }
                obj2 = K(u10, new v(n(obj), false));
            } while (obj2 == f0.f);
        }
        if (obj2 == f0.d) {
            Throwable th2 = null;
            loop1: while (true) {
                Object u11 = u();
                if (!(u11 instanceof o1)) {
                    if (!(u11 instanceof b1)) {
                        iVar = f0.g;
                        break;
                    }
                    if (th2 == null) {
                        th2 = n(obj);
                    }
                    b1 b1Var = (b1) u11;
                    if (b1Var.isActive()) {
                        w1 t10 = t(b1Var);
                        if (t10 != null) {
                            o1 o1Var = new o1(t10, th2);
                            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, b1Var, o1Var)) {
                                if (atomicReferenceFieldUpdater.get(this) != b1Var) {
                                    break;
                                }
                            }
                            E(t10, th2);
                            iVar = f0.d;
                            break loop1;
                        }
                        continue;
                    } else {
                        Object K = K(u11, new v(th2, false));
                        if (K == f0.d) {
                            throw new IllegalStateException(("Cannot happen in " + u11).toString());
                        }
                        if (K != f0.f) {
                            obj2 = K;
                            break;
                        }
                    }
                } else {
                    synchronized (u11) {
                        if (o1.d.get((o1) u11) == f0.h) {
                            iVar = f0.g;
                        } else {
                            boolean d = ((o1) u11).d();
                            if (th2 == null) {
                                th2 = n(obj);
                            }
                            ((o1) u11).a(th2);
                            Throwable b10 = d ? null : ((o1) u11).b();
                            if (b10 != null) {
                                E(((o1) u11).a, b10);
                            }
                            iVar = f0.d;
                        }
                    }
                }
            }
            obj2 = iVar;
        }
        if (obj2 != f0.d && obj2 != f0.e) {
            if (obj2 == f0.g) {
                return false;
            }
            b(obj2);
            return true;
        }
        return true;
    }

    @Override // be.g1
    public final p0 invokeOnCompletion(td.l lVar) {
        return y(false, true, new d1(lVar));
    }

    @Override // be.g1
    public boolean isActive() {
        Object u10 = u();
        return (u10 instanceof b1) && ((b1) u10).isActive();
    }

    @Override // be.g1
    public final boolean isCancelled() {
        Object u10 = u();
        if (u10 instanceof v) {
            return true;
        }
        return (u10 instanceof o1) && ((o1) u10).d();
    }

    public final boolean j(Throwable th2) {
        if (z()) {
            return true;
        }
        boolean z10 = th2 instanceof CancellationException;
        p pVar = (p) b.get(this);
        return (pVar == null || pVar == x1.a) ? z10 : pVar.b(th2) || z10;
    }

    @Override // be.g1
    public final Object join(kd.c cVar) {
        Object u10;
        id.i iVar;
        do {
            u10 = u();
            boolean z10 = u10 instanceof b1;
            iVar = id.i.a;
            if (!z10) {
                f0.h(cVar.getContext());
                return iVar;
            }
        } while (I(u10) < 0);
        m mVar = new m(1, w7.n.b(cVar));
        mVar.s();
        mVar.v(new j(f0.n(this, false, new q0(mVar, 4), 3), 2));
        Object r10 = mVar.r();
        ld.a aVar = ld.a.a;
        if (r10 != aVar) {
            r10 = iVar;
        }
        return r10 == aVar ? r10 : iVar;
    }

    public String k() {
        return "Job was cancelled";
    }

    public boolean l(Throwable th2) {
        if (th2 instanceof CancellationException) {
            return true;
        }
        return i(th2) && r();
    }

    public final void m(b1 b1Var, Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
        p pVar = (p) atomicReferenceFieldUpdater.get(this);
        if (pVar != null) {
            pVar.dispose();
            atomicReferenceFieldUpdater.set(this, x1.a);
        }
        androidx.car.app.j jVar = null;
        v vVar = obj instanceof v ? (v) obj : null;
        Throwable th2 = vVar != null ? vVar.a : null;
        if (b1Var instanceof l1) {
            try {
                ((l1) b1Var).a(th2);
                return;
            } catch (Throwable th3) {
                w(new androidx.car.app.j("Exception in completion handler " + b1Var + " for " + this, th3));
                return;
            }
        }
        w1 c10 = b1Var.c();
        if (c10 != null) {
            Object f7 = c10.f();
            kotlin.jvm.internal.i.c(f7, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            for (ge.k kVar = (ge.k) f7; !kVar.equals(c10); kVar = kVar.g()) {
                if (kVar instanceof l1) {
                    l1 l1Var = (l1) kVar;
                    try {
                        l1Var.a(th2);
                    } catch (Throwable th4) {
                        if (jVar != null) {
                            g8.a(jVar, th4);
                        } else {
                            jVar = new androidx.car.app.j("Exception in completion handler " + l1Var + " for " + this, th4);
                        }
                    }
                }
            }
            if (jVar != null) {
                w(jVar);
            }
        }
    }

    @Override // kd.h
    public final kd.h minusKey(kd.g gVar) {
        return w7.k.b(this, gVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Throwable] */
    public final Throwable n(Object obj) {
        CancellationException cancellationException;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        v1 v1Var = (v1) ((z1) obj);
        Object u10 = v1Var.u();
        if (u10 instanceof o1) {
            cancellationException = ((o1) u10).b();
        } else if (u10 instanceof v) {
            cancellationException = ((v) u10).a;
        } else {
            if (u10 instanceof b1) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + u10).toString());
            }
            cancellationException = null;
        }
        CancellationException cancellationException2 = cancellationException instanceof CancellationException ? cancellationException : null;
        return cancellationException2 == null ? new h1("Parent job is ".concat(J(u10)), cancellationException, v1Var) : cancellationException2;
    }

    public final Object o(o1 o1Var, Object obj) {
        Throwable q6;
        v vVar = obj instanceof v ? (v) obj : null;
        Throwable th2 = vVar != null ? vVar.a : null;
        synchronized (o1Var) {
            o1Var.d();
            ArrayList f7 = o1Var.f(th2);
            q6 = q(o1Var, f7);
            if (q6 != null && f7.size() > 1) {
                Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(f7.size()));
                int size = f7.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj2 = f7.get(i10);
                    i10++;
                    Throwable th3 = (Throwable) obj2;
                    if (th3 != q6 && th3 != q6 && !(th3 instanceof CancellationException) && newSetFromMap.add(th3)) {
                        g8.a(q6, th3);
                    }
                }
            }
        }
        if (q6 != null && q6 != th2) {
            obj = new v(q6, false);
        }
        if (q6 != null && (j(q6) || v(q6))) {
            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            v.b.compareAndSet((v) obj, 0, 1);
        }
        F(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
        Object c1Var = obj instanceof b1 ? new c1((b1) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, o1Var, c1Var) && atomicReferenceFieldUpdater.get(this) == o1Var) {
        }
        m(o1Var, obj);
        return obj;
    }

    public final Object p() {
        Object u10 = u();
        if (u10 instanceof b1) {
            throw new IllegalStateException("This job has not completed yet");
        }
        if (u10 instanceof v) {
            throw ((v) u10).a;
        }
        return f0.u(u10);
    }

    @Override // kd.h
    public final kd.h plus(kd.h hVar) {
        return w7.k.c(this, hVar);
    }

    public final Throwable q(o1 o1Var, ArrayList arrayList) {
        Object obj;
        Object obj2 = null;
        if (arrayList.isEmpty()) {
            if (o1Var.d()) {
                return new h1(k(), null, this);
            }
            return null;
        }
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i11);
            i11++;
            if (!(((Throwable) obj) instanceof CancellationException)) {
                break;
            }
        }
        Throwable th2 = (Throwable) obj;
        if (th2 != null) {
            return th2;
        }
        Throwable th3 = (Throwable) arrayList.get(0);
        if (th3 instanceof e2) {
            int size2 = arrayList.size();
            while (true) {
                if (i10 >= size2) {
                    break;
                }
                Object obj3 = arrayList.get(i10);
                i10++;
                Throwable th4 = (Throwable) obj3;
                if (th4 != th3 && (th4 instanceof e2)) {
                    obj2 = obj3;
                    break;
                }
            }
            Throwable th5 = (Throwable) obj2;
            if (th5 != null) {
                return th5;
            }
        }
        return th3;
    }

    public boolean r() {
        return true;
    }

    public boolean s() {
        return this instanceof t;
    }

    @Override // be.g1
    public final boolean start() {
        int I;
        do {
            I = I(u());
            if (I == 0) {
                return false;
            }
        } while (I != 1);
        return true;
    }

    public final w1 t(b1 b1Var) {
        w1 c10 = b1Var.c();
        if (c10 != null) {
            return c10;
        }
        if (b1Var instanceof r0) {
            return new w1();
        }
        if (b1Var instanceof l1) {
            H((l1) b1Var);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + b1Var).toString());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(C() + '{' + J(u()) + '}');
        sb2.append('@');
        sb2.append(f0.k(this));
        return sb2.toString();
    }

    public final Object u() {
        while (true) {
            Object obj = a.get(this);
            if (!(obj instanceof ge.p)) {
                return obj;
            }
            ((ge.p) obj).a(this);
        }
    }

    public boolean v(Throwable th2) {
        return false;
    }

    public final void x(g1 g1Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
        x1 x1Var = x1.a;
        if (g1Var == null) {
            atomicReferenceFieldUpdater.set(this, x1Var);
            return;
        }
        g1Var.start();
        p attachChild = g1Var.attachChild(this);
        atomicReferenceFieldUpdater.set(this, attachChild);
        if (u() instanceof b1) {
            return;
        }
        attachChild.dispose();
        atomicReferenceFieldUpdater.set(this, x1Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c0, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final p0 y(boolean z10, boolean z11, e1 e1Var) {
        l1 l1Var;
        Throwable th2;
        if (z10) {
            l1Var = e1Var instanceof i1 ? (i1) e1Var : null;
            if (l1Var == null) {
                l1Var = new f1(e1Var);
            }
        } else {
            l1Var = e1Var instanceof l1 ? (l1) e1Var : null;
            if (l1Var == null) {
                l1Var = new q0(e1Var, 1);
            }
        }
        l1Var.d = this;
        loop0: while (true) {
            Object u10 = u();
            if (u10 instanceof r0) {
                r0 r0Var = (r0) u10;
                if (r0Var.a) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, u10, l1Var)) {
                        if (atomicReferenceFieldUpdater.get(this) != u10) {
                            break;
                        }
                    }
                    break loop0;
                }
                w1 w1Var = new w1();
                b1 a1Var = r0Var.a ? w1Var : new a1(w1Var);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = a;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, r0Var, a1Var) && atomicReferenceFieldUpdater2.get(this) == r0Var) {
                }
            } else {
                if (!(u10 instanceof b1)) {
                    if (z11) {
                        v vVar = u10 instanceof v ? (v) u10 : null;
                        e1Var.a(vVar != null ? vVar.a : null);
                    }
                    return x1.a;
                }
                b1 b1Var = (b1) u10;
                w1 c10 = b1Var.c();
                if (c10 == null) {
                    H((l1) u10);
                } else {
                    p0 p0Var = x1.a;
                    if (z10 && (u10 instanceof o1)) {
                        synchronized (u10) {
                            try {
                                th2 = ((o1) u10).b();
                                if (th2 != null) {
                                    if ((e1Var instanceof q) && !((o1) u10).e()) {
                                    }
                                }
                                if (a((b1) u10, c10, l1Var)) {
                                    if (th2 == null) {
                                        return l1Var;
                                    }
                                    p0Var = l1Var;
                                }
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        }
                    } else {
                        th2 = null;
                    }
                    if (th2 != null) {
                        if (z11) {
                            e1Var.a(th2);
                        }
                        return p0Var;
                    }
                    if (a(b1Var, c10, l1Var)) {
                        break;
                    }
                }
            }
        }
    }

    public boolean z() {
        return this instanceof h;
    }

    @Override // be.g1
    public final p0 invokeOnCompletion(boolean z10, boolean z11, td.l lVar) {
        return y(z10, z11, new d1(lVar));
    }

    public void G() {
    }

    public void F(Object obj) {
    }

    public void b(Object obj) {
    }

    public void w(androidx.car.app.j jVar) {
        throw jVar;
    }
}
