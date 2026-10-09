package ae;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import v7.v8;
import v7.y7;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public class w1 implements h1, r, a2 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(w1.class, Object.class, "_state$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(w1.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    public w1(boolean z10) {
        this._state$volatile = z10 ? g0.j : g0.i;
    }

    public static q D(fe.k kVar) {
        while (kVar.h()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = fe.k.b;
            fe.k d = kVar.d();
            if (d == null) {
                Object obj = atomicReferenceFieldUpdater.get(kVar);
                while (true) {
                    kVar = (fe.k) obj;
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
                if (kVar instanceof x1) {
                    return null;
                }
            }
        }
    }

    public static String J(Object obj) {
        if (!(obj instanceof p1)) {
            return obj instanceof c1 ? ((c1) obj).isActive() ? "Active" : "New" : obj instanceof v ? "Cancelled" : "Completed";
        }
        p1 p1Var = (p1) obj;
        return p1Var.d() ? "Cancelling" : p1Var.e() ? "Completing" : "Active";
    }

    public final boolean A(Object obj) {
        Object K;
        do {
            K = K(u(), obj);
            if (K == g0.d) {
                return false;
            }
            if (K == g0.e) {
                return true;
            }
        } while (K == g0.f);
        f(K);
        return true;
    }

    public final Object B(Object obj) {
        Object K;
        do {
            K = K(u(), obj);
            if (K == g0.d) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                v vVar = obj instanceof v ? (v) obj : null;
                throw new IllegalStateException(str, vVar != null ? vVar.a : null);
            }
        } while (K == g0.f);
        return K;
    }

    public String C() {
        return getClass().getSimpleName();
    }

    public final void E(x1 x1Var, Throwable th2) {
        Object f7 = x1Var.f();
        kotlin.jvm.internal.i.c(f7, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        x xVar = null;
        for (fe.k kVar = (fe.k) f7; !kVar.equals(x1Var); kVar = kVar.g()) {
            if (kVar instanceof j1) {
                m1 m1Var = (m1) kVar;
                try {
                    m1Var.a(th2);
                } catch (Throwable th3) {
                    if (xVar != null) {
                        y7.a(xVar, th3);
                    } else {
                        xVar = new x("Exception in completion handler " + m1Var + " for " + this, th3);
                    }
                }
            }
        }
        if (xVar != null) {
            w(xVar);
        }
        j(th2);
    }

    public final void H(m1 m1Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        x1 x1Var = new x1();
        m1Var.getClass();
        fe.k.b.set(x1Var, m1Var);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = fe.k.a;
        atomicReferenceFieldUpdater2.set(x1Var, m1Var);
        loop0: while (true) {
            if (m1Var.f() == m1Var) {
                while (!atomicReferenceFieldUpdater2.compareAndSet(m1Var, m1Var, x1Var)) {
                    if (atomicReferenceFieldUpdater2.get(m1Var) != m1Var) {
                        break;
                    }
                }
                x1Var.e(m1Var);
                break loop0;
            }
            break;
        }
        fe.k g10 = m1Var.g();
        do {
            atomicReferenceFieldUpdater = a;
            if (atomicReferenceFieldUpdater.compareAndSet(this, m1Var, g10)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == m1Var);
    }

    public final int I(Object obj) {
        boolean z10 = obj instanceof s0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
        if (z10) {
            if (((s0) obj).a) {
                return 0;
            }
            s0 s0Var = g0.j;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, s0Var)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            return 1;
        }
        if (!(obj instanceof b1)) {
            return 0;
        }
        x1 x1Var = ((b1) obj).a;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, x1Var)) {
            if (atomicReferenceFieldUpdater.get(this) != obj) {
                return -1;
            }
        }
        return 1;
    }

    public final Object K(Object obj, Object obj2) {
        if (!(obj instanceof c1)) {
            return g0.d;
        }
        if (((obj instanceof s0) || (obj instanceof m1)) && !(obj instanceof q) && !(obj2 instanceof v)) {
            c1 c1Var = (c1) obj;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
            Object d1Var = obj2 instanceof c1 ? new d1((c1) obj2) : obj2;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, c1Var, d1Var)) {
                if (atomicReferenceFieldUpdater.get(this) != c1Var) {
                    return g0.f;
                }
            }
            F(obj2);
            m(c1Var, obj2);
            return obj2;
        }
        c1 c1Var2 = (c1) obj;
        x1 t10 = t(c1Var2);
        if (t10 == null) {
            return g0.f;
        }
        q qVar = null;
        p1 p1Var = c1Var2 instanceof p1 ? (p1) c1Var2 : null;
        if (p1Var == null) {
            p1Var = new p1(t10, null);
        }
        synchronized (p1Var) {
            if (p1Var.e()) {
                return g0.d;
            }
            p1.b.set(p1Var, 1);
            if (p1Var != c1Var2) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = a;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, c1Var2, p1Var)) {
                    if (atomicReferenceFieldUpdater2.get(this) != c1Var2) {
                        return g0.f;
                    }
                }
            }
            boolean d = p1Var.d();
            v vVar = obj2 instanceof v ? (v) obj2 : null;
            if (vVar != null) {
                p1Var.a(vVar.a);
            }
            Throwable b10 = p1Var.b();
            if (d) {
                b10 = null;
            }
            if (b10 != null) {
                E(t10, b10);
            }
            q qVar2 = c1Var2 instanceof q ? (q) c1Var2 : null;
            if (qVar2 == null) {
                x1 c10 = c1Var2.c();
                if (c10 != null) {
                    qVar = D(c10);
                }
            } else {
                qVar = qVar2;
            }
            if (qVar != null) {
                while (g0.n(qVar.e, false, new o1(this, p1Var, qVar, obj2), 1) == y1.a) {
                    qVar = D(qVar);
                    if (qVar == null) {
                    }
                }
                return g0.e;
            }
            return o(p1Var, obj2);
        }
    }

    @Override // ae.h1
    public final p attachChild(r rVar) {
        q0 n10 = g0.n(this, true, new q(rVar), 2);
        kotlin.jvm.internal.i.c(n10, "null cannot be cast to non-null type kotlinx.coroutines.ChildHandle");
        return (p) n10;
    }

    public final boolean b(c1 c1Var, x1 x1Var, m1 m1Var) {
        fe.k d;
        r1 r1Var = new r1(m1Var, this, c1Var);
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = fe.k.b;
            d = x1Var.d();
            if (d == null) {
                Object obj = atomicReferenceFieldUpdater.get(x1Var);
                while (true) {
                    d = (fe.k) obj;
                    if (!d.h()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(d);
                }
            }
            fe.k.b.set(m1Var, d);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = fe.k.a;
            atomicReferenceFieldUpdater2.set(m1Var, x1Var);
            r1Var.c = x1Var;
            while (!atomicReferenceFieldUpdater2.compareAndSet(d, x1Var, r1Var)) {
                if (atomicReferenceFieldUpdater2.get(d) != x1Var) {
                    break;
                }
            }
        }
        return r1Var.a(d) == null;
    }

    @Override // ae.h1
    public final void cancel(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new i1(k(), null, this);
        }
        i(cancellationException);
    }

    @Override // jd.h
    public final Object fold(Object obj, sd.p pVar) {
        return pVar.invoke(obj, this);
    }

    public void g(Object obj) {
        f(obj);
    }

    @Override // jd.h
    public final jd.f get(jd.g gVar) {
        return v8.a(this, gVar);
    }

    @Override // ae.h1
    public final CancellationException getCancellationException() {
        CancellationException cancellationException;
        Object u10 = u();
        if (!(u10 instanceof p1)) {
            if (u10 instanceof c1) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (!(u10 instanceof v)) {
                return new i1(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            Throwable th2 = ((v) u10).a;
            cancellationException = th2 instanceof CancellationException ? (CancellationException) th2 : null;
            return cancellationException == null ? new i1(k(), th2, this) : cancellationException;
        }
        Throwable b10 = ((p1) u10).b();
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
        return new i1(concat, b10, this);
    }

    @Override // ae.h1
    public final xd.b getChildren() {
        return new xd.e(new s1(this, null), 0);
    }

    public Object getCompleted() {
        return p();
    }

    public final Throwable getCompletionExceptionOrNull() {
        Object u10 = u();
        if (u10 instanceof c1) {
            throw new IllegalStateException("This job has not completed yet");
        }
        v vVar = u10 instanceof v ? (v) u10 : null;
        if (vVar != null) {
            return vVar.a;
        }
        return null;
    }

    @Override // jd.f
    public final jd.g getKey() {
        return c0.b;
    }

    @Override // ae.h1
    public final h1 getParent() {
        p pVar = (p) b.get(this);
        if (pVar != null) {
            return pVar.getParent();
        }
        return null;
    }

    public final Object h(jd.c cVar) {
        Object u10;
        do {
            u10 = u();
            if (!(u10 instanceof c1)) {
                if (u10 instanceof v) {
                    throw ((v) u10).a;
                }
                return g0.u(u10);
            }
        } while (I(u10) < 0);
        n1 n1Var = new n1(this, w7.h.b(cVar));
        n1Var.s();
        n1Var.v(new j(g0.n(this, false, new r0(n1Var, 3), 3), 2));
        Object r10 = n1Var.r();
        kd.a aVar = kd.a.a;
        return r10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
    
        if (r0 == ae.g0.e) goto L75;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean i(Object obj) {
        da.a aVar;
        Object obj2 = g0.d;
        if (s()) {
            do {
                Object u10 = u();
                if (!(u10 instanceof c1) || ((u10 instanceof p1) && ((p1) u10).e())) {
                    obj2 = g0.d;
                    break;
                }
                obj2 = K(u10, new v(n(obj), false));
            } while (obj2 == g0.f);
        }
        if (obj2 == g0.d) {
            Throwable th2 = null;
            loop1: while (true) {
                Object u11 = u();
                if (!(u11 instanceof p1)) {
                    if (!(u11 instanceof c1)) {
                        aVar = g0.g;
                        break;
                    }
                    if (th2 == null) {
                        th2 = n(obj);
                    }
                    c1 c1Var = (c1) u11;
                    if (c1Var.isActive()) {
                        x1 t10 = t(c1Var);
                        if (t10 != null) {
                            p1 p1Var = new p1(t10, th2);
                            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, c1Var, p1Var)) {
                                if (atomicReferenceFieldUpdater.get(this) != c1Var) {
                                    break;
                                }
                            }
                            E(t10, th2);
                            aVar = g0.d;
                            break loop1;
                        }
                        continue;
                    } else {
                        Object K = K(u11, new v(th2, false));
                        if (K == g0.d) {
                            throw new IllegalStateException(("Cannot happen in " + u11).toString());
                        }
                        if (K != g0.f) {
                            obj2 = K;
                            break;
                        }
                    }
                } else {
                    synchronized (u11) {
                        if (p1.d.get((p1) u11) == g0.h) {
                            aVar = g0.g;
                        } else {
                            boolean d = ((p1) u11).d();
                            if (th2 == null) {
                                th2 = n(obj);
                            }
                            ((p1) u11).a(th2);
                            Throwable b10 = d ? null : ((p1) u11).b();
                            if (b10 != null) {
                                E(((p1) u11).a, b10);
                            }
                            aVar = g0.d;
                        }
                    }
                }
            }
            obj2 = aVar;
        }
        if (obj2 != g0.d && obj2 != g0.e) {
            if (obj2 == g0.g) {
                return false;
            }
            f(obj2);
            return true;
        }
        return true;
    }

    @Override // ae.h1
    public final q0 invokeOnCompletion(sd.l lVar) {
        return y(false, true, new e1(lVar));
    }

    @Override // ae.h1
    public boolean isActive() {
        Object u10 = u();
        return (u10 instanceof c1) && ((c1) u10).isActive();
    }

    @Override // ae.h1
    public final boolean isCancelled() {
        Object u10 = u();
        if (u10 instanceof v) {
            return true;
        }
        return (u10 instanceof p1) && ((p1) u10).d();
    }

    public final boolean j(Throwable th2) {
        if (z()) {
            return true;
        }
        boolean z10 = th2 instanceof CancellationException;
        p pVar = (p) b.get(this);
        return (pVar == null || pVar == y1.a) ? z10 : pVar.b(th2) || z10;
    }

    @Override // ae.h1
    public final Object join(jd.c cVar) {
        Object u10;
        hd.i iVar;
        do {
            u10 = u();
            boolean z10 = u10 instanceof c1;
            iVar = hd.i.a;
            if (!z10) {
                g0.h(cVar.getContext());
                return iVar;
            }
        } while (I(u10) < 0);
        m mVar = new m(1, w7.h.b(cVar));
        mVar.s();
        mVar.v(new j(g0.n(this, false, new r0(mVar, 4), 3), 2));
        Object r10 = mVar.r();
        kd.a aVar = kd.a.a;
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

    public final void m(c1 c1Var, Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
        p pVar = (p) atomicReferenceFieldUpdater.get(this);
        if (pVar != null) {
            pVar.dispose();
            atomicReferenceFieldUpdater.set(this, y1.a);
        }
        x xVar = null;
        v vVar = obj instanceof v ? (v) obj : null;
        Throwable th2 = vVar != null ? vVar.a : null;
        if (c1Var instanceof m1) {
            try {
                ((m1) c1Var).a(th2);
                return;
            } catch (Throwable th3) {
                w(new x("Exception in completion handler " + c1Var + " for " + this, th3));
                return;
            }
        }
        x1 c10 = c1Var.c();
        if (c10 != null) {
            Object f7 = c10.f();
            kotlin.jvm.internal.i.c(f7, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            for (fe.k kVar = (fe.k) f7; !kVar.equals(c10); kVar = kVar.g()) {
                if (kVar instanceof m1) {
                    m1 m1Var = (m1) kVar;
                    try {
                        m1Var.a(th2);
                    } catch (Throwable th4) {
                        if (xVar != null) {
                            y7.a(xVar, th4);
                        } else {
                            xVar = new x("Exception in completion handler " + m1Var + " for " + this, th4);
                        }
                    }
                }
            }
            if (xVar != null) {
                w(xVar);
            }
        }
    }

    @Override // jd.h
    public final jd.h minusKey(jd.g gVar) {
        return v8.b(this, gVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Throwable] */
    public final Throwable n(Object obj) {
        CancellationException cancellationException;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        w1 w1Var = (w1) ((a2) obj);
        Object u10 = w1Var.u();
        if (u10 instanceof p1) {
            cancellationException = ((p1) u10).b();
        } else if (u10 instanceof v) {
            cancellationException = ((v) u10).a;
        } else {
            if (u10 instanceof c1) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + u10).toString());
            }
            cancellationException = null;
        }
        CancellationException cancellationException2 = cancellationException instanceof CancellationException ? cancellationException : null;
        return cancellationException2 == null ? new i1("Parent job is ".concat(J(u10)), cancellationException, w1Var) : cancellationException2;
    }

    public final Object o(p1 p1Var, Object obj) {
        Throwable q6;
        v vVar = obj instanceof v ? (v) obj : null;
        Throwable th2 = vVar != null ? vVar.a : null;
        synchronized (p1Var) {
            p1Var.d();
            ArrayList f7 = p1Var.f(th2);
            q6 = q(p1Var, f7);
            if (q6 != null && f7.size() > 1) {
                Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(f7.size()));
                int size = f7.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj2 = f7.get(i10);
                    i10++;
                    Throwable th3 = (Throwable) obj2;
                    if (th3 != q6 && th3 != q6 && !(th3 instanceof CancellationException) && newSetFromMap.add(th3)) {
                        y7.a(q6, th3);
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
        Object d1Var = obj instanceof c1 ? new d1((c1) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, p1Var, d1Var) && atomicReferenceFieldUpdater.get(this) == p1Var) {
        }
        m(p1Var, obj);
        return obj;
    }

    public final Object p() {
        Object u10 = u();
        if (u10 instanceof c1) {
            throw new IllegalStateException("This job has not completed yet");
        }
        if (u10 instanceof v) {
            throw ((v) u10).a;
        }
        return g0.u(u10);
    }

    @Override // jd.h
    public final jd.h plus(jd.h hVar) {
        return v8.c(this, hVar);
    }

    public final Throwable q(p1 p1Var, ArrayList arrayList) {
        Object obj;
        Object obj2 = null;
        if (arrayList.isEmpty()) {
            if (p1Var.d()) {
                return new i1(k(), null, this);
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
        if (th3 instanceof f2) {
            int size2 = arrayList.size();
            while (true) {
                if (i10 >= size2) {
                    break;
                }
                Object obj3 = arrayList.get(i10);
                i10++;
                Throwable th4 = (Throwable) obj3;
                if (th4 != th3 && (th4 instanceof f2)) {
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

    @Override // ae.h1
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

    public final x1 t(c1 c1Var) {
        x1 c10 = c1Var.c();
        if (c10 != null) {
            return c10;
        }
        if (c1Var instanceof s0) {
            return new x1();
        }
        if (c1Var instanceof m1) {
            H((m1) c1Var);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + c1Var).toString());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(C() + '{' + J(u()) + '}');
        sb2.append('@');
        sb2.append(g0.k(this));
        return sb2.toString();
    }

    public final Object u() {
        while (true) {
            Object obj = a.get(this);
            if (!(obj instanceof fe.p)) {
                return obj;
            }
            ((fe.p) obj).a(this);
        }
    }

    public boolean v(Throwable th2) {
        return false;
    }

    public final void x(h1 h1Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
        y1 y1Var = y1.a;
        if (h1Var == null) {
            atomicReferenceFieldUpdater.set(this, y1Var);
            return;
        }
        h1Var.start();
        p attachChild = h1Var.attachChild(this);
        atomicReferenceFieldUpdater.set(this, attachChild);
        if (u() instanceof c1) {
            return;
        }
        attachChild.dispose();
        atomicReferenceFieldUpdater.set(this, y1Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c0, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final q0 y(boolean z10, boolean z11, f1 f1Var) {
        m1 m1Var;
        Throwable th2;
        if (z10) {
            m1Var = f1Var instanceof j1 ? (j1) f1Var : null;
            if (m1Var == null) {
                m1Var = new g1(f1Var);
            }
        } else {
            m1Var = f1Var instanceof m1 ? (m1) f1Var : null;
            if (m1Var == null) {
                m1Var = new r0(f1Var, 1);
            }
        }
        m1Var.d = this;
        loop0: while (true) {
            Object u10 = u();
            if (u10 instanceof s0) {
                s0 s0Var = (s0) u10;
                if (s0Var.a) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, u10, m1Var)) {
                        if (atomicReferenceFieldUpdater.get(this) != u10) {
                            break;
                        }
                    }
                    break loop0;
                }
                x1 x1Var = new x1();
                Object b1Var = s0Var.a ? x1Var : new b1(x1Var);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = a;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, s0Var, b1Var) && atomicReferenceFieldUpdater2.get(this) == s0Var) {
                }
            } else {
                if (!(u10 instanceof c1)) {
                    if (z11) {
                        v vVar = u10 instanceof v ? (v) u10 : null;
                        f1Var.a(vVar != null ? vVar.a : null);
                    }
                    return y1.a;
                }
                c1 c1Var = (c1) u10;
                x1 c10 = c1Var.c();
                if (c10 == null) {
                    H((m1) u10);
                } else {
                    q0 q0Var = y1.a;
                    if (z10 && (u10 instanceof p1)) {
                        synchronized (u10) {
                            try {
                                th2 = ((p1) u10).b();
                                if (th2 != null) {
                                    if ((f1Var instanceof q) && !((p1) u10).e()) {
                                    }
                                }
                                if (b((c1) u10, c10, m1Var)) {
                                    if (th2 == null) {
                                        return m1Var;
                                    }
                                    q0Var = m1Var;
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
                            f1Var.a(th2);
                        }
                        return q0Var;
                    }
                    if (b(c1Var, c10, m1Var)) {
                        break;
                    }
                }
            }
        }
    }

    public boolean z() {
        return this instanceof h;
    }

    @Override // ae.h1
    public final q0 invokeOnCompletion(boolean z10, boolean z11, sd.l lVar) {
        return y(z10, z11, new e1(lVar));
    }

    public void G() {
    }

    public void F(Object obj) {
    }

    public void f(Object obj) {
    }

    public void w(x xVar) {
        throw xVar;
    }
}
