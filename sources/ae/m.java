package ae;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public class m extends n0 implements l, ld.d, k2 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater f = AtomicIntegerFieldUpdater.newUpdater(m.class, "_decisionAndIndex$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "_state$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater n = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;
    public final jd.c d;
    public final jd.h e;

    public m(int i10, jd.c cVar) {
        super(i10);
        this.d = cVar;
        this.e = cVar.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = b.a;
    }

    public static Object E(z1 z1Var, Object obj, int i10, sd.l lVar) {
        if (obj instanceof v) {
            return obj;
        }
        if (i10 != 1 && i10 != 2) {
            return obj;
        }
        if (lVar != null || (z1Var instanceof k)) {
            return new u(obj, z1Var instanceof k ? (k) z1Var : null, lVar, (Throwable) null, 16);
        }
        return obj;
    }

    public static void y(z1 z1Var, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + z1Var + ", already has " + obj).toString());
    }

    public final void A() {
        jd.c cVar = this.d;
        Throwable th2 = null;
        fe.h hVar = cVar instanceof fe.h ? (fe.h) cVar : null;
        if (hVar != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = fe.h.n;
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(hVar);
                da.a aVar = fe.a.d;
                if (obj == aVar) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(hVar, aVar, this)) {
                        if (atomicReferenceFieldUpdater.get(hVar) != aVar) {
                            break;
                        }
                    }
                    break loop0;
                } else {
                    if (!(obj instanceof Throwable)) {
                        throw new IllegalStateException(("Inconsistent state " + obj).toString());
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(hVar, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(hVar) != obj) {
                            throw new IllegalArgumentException("Failed requirement.");
                        }
                    }
                    th2 = (Throwable) obj;
                }
            }
            if (th2 == null) {
                return;
            }
            o();
            n(th2);
        }
    }

    public final void B(sd.l lVar, Object obj) {
        C(obj, this.c, lVar);
    }

    public final void C(Object obj, int i10, sd.l lVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof z1) {
                Object E = E((z1) obj2, obj, i10, lVar);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, E)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (!x()) {
                    o();
                }
                p(i10);
                return;
            }
            if (obj2 instanceof n) {
                n nVar = (n) obj2;
                if (n.c.compareAndSet(nVar, 0, 1)) {
                    if (lVar != null) {
                        l(lVar, nVar.a);
                        return;
                    }
                    return;
                }
            }
            throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
        }
    }

    public final void D(b0 b0Var) {
        jd.c cVar = this.d;
        fe.h hVar = cVar instanceof fe.h ? (fe.h) cVar : null;
        C(hd.i.a, (hVar != null ? hVar.d : null) == b0Var ? 4 : this.c, null);
    }

    public final da.a F(sd.l lVar, Object obj) {
        da.a aVar = g0.a;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof z1)) {
                return null;
            }
            Object E = E((z1) obj2, obj, this.c, lVar);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, E)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    break;
                }
            }
            if (!x()) {
                o();
            }
            return aVar;
        }
    }

    @Override // ae.l
    public final da.a a(sd.l lVar, Object obj) {
        return F(lVar, obj);
    }

    @Override // ae.k2
    public final void b(fe.t tVar, int i10) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i11;
        do {
            atomicIntegerFieldUpdater = f;
            i11 = atomicIntegerFieldUpdater.get(this);
            if ((i11 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i11, ((i11 >> 29) << 29) + i10));
        v(tVar);
    }

    @Override // ae.n0
    public final void c(Object obj, CancellationException cancellationException) {
        CancellationException cancellationException2;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof z1) {
                throw new IllegalStateException("Not completed");
            }
            if (obj2 instanceof v) {
                return;
            }
            if (!(obj2 instanceof u)) {
                cancellationException2 = cancellationException;
                u uVar = new u(obj2, (k) null, (sd.l) null, cancellationException2, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, uVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                return;
            }
            u uVar2 = (u) obj2;
            if (uVar2.e != null) {
                throw new IllegalStateException("Must be called at most once");
            }
            u a2 = u.a(uVar2, null, cancellationException, 15);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, a2)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    cancellationException2 = cancellationException;
                }
            }
            k kVar = uVar2.b;
            if (kVar != null) {
                k(kVar, cancellationException);
            }
            sd.l lVar = uVar2.c;
            if (lVar != null) {
                l(lVar, cancellationException);
                return;
            }
            return;
            cancellationException = cancellationException2;
        }
    }

    @Override // ae.l
    public final void e(Object obj) {
        p(this.c);
    }

    @Override // ae.n0
    public final jd.c f() {
        return this.d;
    }

    @Override // ae.n0
    public final Throwable g(Object obj) {
        Throwable g10 = super.g(obj);
        if (g10 != null) {
            return g10;
        }
        return null;
    }

    @Override // ld.d
    public final ld.d getCallerFrame() {
        jd.c cVar = this.d;
        if (cVar instanceof ld.d) {
            return (ld.d) cVar;
        }
        return null;
    }

    @Override // jd.c
    public final jd.h getContext() {
        return this.e;
    }

    @Override // ae.n0
    public final Object h(Object obj) {
        return obj instanceof u ? ((u) obj).a : obj;
    }

    @Override // ae.n0
    public final Object j() {
        return h.get(this);
    }

    public final void k(k kVar, Throwable th2) {
        try {
            kVar.a(th2);
        } catch (Throwable th3) {
            g0.m(new x("Exception in invokeOnCancellation handler for " + this, th3), this.e);
        }
    }

    public final void l(sd.l lVar, Throwable th2) {
        try {
            lVar.invoke(th2);
        } catch (Throwable th3) {
            g0.m(new x("Exception in resume onCancellation handler for " + this, th3), this.e);
        }
    }

    public final void m(fe.t tVar, Throwable th2) {
        jd.h hVar = this.e;
        int i10 = f.get(this) & 536870911;
        if (i10 == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            tVar.h(i10, hVar);
        } catch (Throwable th3) {
            g0.m(new x("Exception in invokeOnCancellation handler for " + this, th3), hVar);
        }
    }

    public final boolean n(Throwable th2) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof z1)) {
                return false;
            }
            n nVar = new n(this, th2, (obj instanceof k) || (obj instanceof fe.t));
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, nVar)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            z1 z1Var = (z1) obj;
            if (z1Var instanceof k) {
                k((k) obj, th2);
            } else if (z1Var instanceof fe.t) {
                m((fe.t) obj, th2);
            }
            if (!x()) {
                o();
            }
            p(this.c);
            return true;
        }
    }

    public final void o() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = n;
        q0 q0Var = (q0) atomicReferenceFieldUpdater.get(this);
        if (q0Var == null) {
            return;
        }
        q0Var.dispose();
        atomicReferenceFieldUpdater.set(this, y1.a);
    }

    public final void p(int i10) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i11;
        do {
            atomicIntegerFieldUpdater = f;
            i11 = atomicIntegerFieldUpdater.get(this);
            int i12 = i11 >> 29;
            if (i12 != 0) {
                if (i12 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                boolean z10 = i10 == 4;
                jd.c cVar = this.d;
                if (!z10 && (cVar instanceof fe.h)) {
                    boolean z11 = i10 == 1 || i10 == 2;
                    int i13 = this.c;
                    if (z11 == (i13 == 1 || i13 == 2)) {
                        fe.h hVar = (fe.h) cVar;
                        b0 b0Var = hVar.d;
                        jd.h context = hVar.e.getContext();
                        if (b0Var.e()) {
                            b0Var.c(context, this);
                            return;
                        }
                        y0 a2 = e2.a();
                        if (a2.c >= 4294967296L) {
                            id.e eVar = a2.e;
                            if (eVar == null) {
                                eVar = new id.e();
                                a2.e = eVar;
                            }
                            eVar.addLast(this);
                            return;
                        }
                        a2.h(true);
                        try {
                            g0.s(this, cVar, true);
                            do {
                            } while (a2.j());
                        } finally {
                            try {
                                return;
                            } finally {
                            }
                        }
                        return;
                    }
                }
                g0.s(this, cVar, z10);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i11, TLObject.FLAG_30 + (536870911 & i11)));
    }

    public Throwable q(w1 w1Var) {
        return w1Var.getCancellationException();
    }

    public final Object r() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i10;
        h1 h1Var;
        boolean x10 = x();
        do {
            atomicIntegerFieldUpdater = f;
            i10 = atomicIntegerFieldUpdater.get(this);
            int i11 = i10 >> 29;
            if (i11 != 0) {
                if (i11 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                if (x10) {
                    A();
                }
                Object obj = h.get(this);
                if (obj instanceof v) {
                    throw ((v) obj).a;
                }
                int i12 = this.c;
                if ((i12 != 1 && i12 != 2) || (h1Var = (h1) this.e.get(c0.b)) == null || h1Var.isActive()) {
                    return h(obj);
                }
                CancellationException cancellationException = h1Var.getCancellationException();
                c(obj, cancellationException);
                throw cancellationException;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, TLObject.FLAG_29 + (536870911 & i10)));
        if (((q0) n.get(this)) == null) {
            t();
        }
        if (x10) {
            A();
        }
        return kd.a.a;
    }

    @Override // jd.c
    public final void resumeWith(Object obj) {
        Throwable a2 = hd.f.a(obj);
        if (a2 != null) {
            obj = new v(a2, false);
        }
        C(obj, this.c, null);
    }

    public final void s() {
        q0 t10 = t();
        if (t10 == null || (h.get(this) instanceof z1)) {
            return;
        }
        t10.dispose();
        n.set(this, y1.a);
    }

    public final q0 t() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        h1 h1Var = (h1) this.e.get(c0.b);
        if (h1Var == null) {
            return null;
        }
        q0 n10 = g0.n(h1Var, true, new o(this), 2);
        do {
            atomicReferenceFieldUpdater = n;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, n10)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return n10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(z());
        sb2.append('(');
        sb2.append(g0.t(this.d));
        sb2.append("){");
        Object obj = h.get(this);
        sb2.append(obj instanceof z1 ? "Active" : obj instanceof n ? "Cancelled" : "Completed");
        sb2.append("}@");
        sb2.append(g0.k(this));
        return sb2.toString();
    }

    public final void u(sd.l lVar) {
        v(new j(lVar, 1));
    }

    public final void v(z1 z1Var) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof b) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, z1Var)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            boolean z10 = true;
            if (obj instanceof k ? true : obj instanceof fe.t) {
                y(z1Var, obj);
                throw null;
            }
            if (obj instanceof v) {
                v vVar = (v) obj;
                if (!v.b.compareAndSet(vVar, 0, 1)) {
                    y(z1Var, obj);
                    throw null;
                }
                if (obj instanceof n) {
                    Throwable th2 = vVar.a;
                    if (z1Var instanceof k) {
                        k((k) z1Var, th2);
                        return;
                    } else {
                        m((fe.t) z1Var, th2);
                        return;
                    }
                }
                return;
            }
            if (obj instanceof u) {
                u uVar = (u) obj;
                if (uVar.b != null) {
                    y(z1Var, obj);
                    throw null;
                }
                if (z1Var instanceof fe.t) {
                    return;
                }
                k kVar = (k) z1Var;
                Throwable th3 = uVar.e;
                if (th3 != null) {
                    k(kVar, th3);
                    return;
                }
                u a2 = u.a(uVar, kVar, null, 29);
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj, a2)) {
                        break;
                    } else if (atomicReferenceFieldUpdater.get(this) != obj) {
                        z10 = false;
                        break;
                    }
                }
                if (z10) {
                    return;
                }
            } else {
                if (z1Var instanceof fe.t) {
                    return;
                }
                u uVar2 = new u(obj, (k) z1Var, (sd.l) null, (Throwable) null, 28);
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj, uVar2)) {
                        break;
                    } else if (atomicReferenceFieldUpdater.get(this) != obj) {
                        z10 = false;
                        break;
                    }
                }
                if (z10) {
                    return;
                }
            }
        }
    }

    public final boolean w() {
        return h.get(this) instanceof z1;
    }

    public final boolean x() {
        if (this.c != 2) {
            return false;
        }
        jd.c cVar = this.d;
        kotlin.jvm.internal.i.c(cVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return fe.h.n.get((fe.h) cVar) != null;
    }

    public String z() {
        return "CancellableContinuation";
    }
}
