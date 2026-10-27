package ce;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public class m extends m0 implements l, nd.d, j2 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater f = AtomicIntegerFieldUpdater.newUpdater(m.class, "_decisionAndIndex$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "_state$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater n = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;
    public final ld.c d;
    public final ld.h e;

    public m(int i10, ld.c cVar) {
        super(i10);
        this.d = cVar;
        this.e = cVar.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = b.a;
    }

    public static Object E(y1 y1Var, Object obj, int i10, ud.l lVar) {
        if (obj instanceof v) {
            return obj;
        }
        if (i10 != 1 && i10 != 2) {
            return obj;
        }
        if (lVar != null || (y1Var instanceof k)) {
            return new u(obj, y1Var instanceof k ? (k) y1Var : null, lVar, (Throwable) null, 16);
        }
        return obj;
    }

    public static void y(y1 y1Var, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + y1Var + ", already has " + obj).toString());
    }

    public final void A() {
        ld.c cVar = this.d;
        Throwable th2 = null;
        he.h hVar = cVar instanceof he.h ? (he.h) cVar : null;
        if (hVar != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = he.h.n;
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(hVar);
                he.v vVar = he.a.d;
                if (obj == vVar) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(hVar, vVar, this)) {
                        if (atomicReferenceFieldUpdater.get(hVar) != vVar) {
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

    public final void B(ud.l lVar, Object obj) {
        C(obj, this.c, lVar);
    }

    public final void C(Object obj, int i10, ud.l lVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof y1) {
                Object E = E((y1) obj2, obj, i10, lVar);
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

    public final void D(a0 a0Var) {
        ld.c cVar = this.d;
        he.h hVar = cVar instanceof he.h ? (he.h) cVar : null;
        C(jd.i.a, (hVar != null ? hVar.d : null) == a0Var ? 4 : this.c, null);
    }

    public final he.v F(ud.l lVar, Object obj) {
        he.v vVar = f0.a;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof y1)) {
                return null;
            }
            Object E = E((y1) obj2, obj, this.c, lVar);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, E)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    break;
                }
            }
            if (!x()) {
                o();
            }
            return vVar;
        }
    }

    @Override // ce.j2
    public final void a(he.t tVar, int i10) {
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

    @Override // ce.m0
    public final void b(Object obj, CancellationException cancellationException) {
        CancellationException cancellationException2;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof y1) {
                throw new IllegalStateException("Not completed");
            }
            if (obj2 instanceof v) {
                return;
            }
            if (!(obj2 instanceof u)) {
                cancellationException2 = cancellationException;
                u uVar = new u(obj2, (k) null, (ud.l) null, cancellationException2, 14);
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
            ud.l lVar = uVar2.c;
            if (lVar != null) {
                l(lVar, cancellationException);
                return;
            }
            return;
            cancellationException = cancellationException2;
        }
    }

    @Override // ce.m0
    public final ld.c c() {
        return this.d;
    }

    @Override // ce.l
    public final he.v d(ud.l lVar, Object obj) {
        return F(lVar, obj);
    }

    @Override // ce.l
    public final void f(Object obj) {
        p(this.c);
    }

    @Override // ce.m0
    public final Throwable g(Object obj) {
        Throwable g7 = super.g(obj);
        if (g7 != null) {
            return g7;
        }
        return null;
    }

    @Override // nd.d
    public final nd.d getCallerFrame() {
        ld.c cVar = this.d;
        if (cVar instanceof nd.d) {
            return (nd.d) cVar;
        }
        return null;
    }

    @Override // ld.c
    public final ld.h getContext() {
        return this.e;
    }

    @Override // ce.m0
    public final Object h(Object obj) {
        return obj instanceof u ? ((u) obj).a : obj;
    }

    @Override // ce.m0
    public final Object j() {
        return h.get(this);
    }

    public final void k(k kVar, Throwable th2) {
        try {
            kVar.a(th2);
        } catch (Throwable th3) {
            f0.m(new androidx.car.app.j("Exception in invokeOnCancellation handler for " + this, th3), this.e);
        }
    }

    public final void l(ud.l lVar, Throwable th2) {
        try {
            lVar.invoke(th2);
        } catch (Throwable th3) {
            f0.m(new androidx.car.app.j("Exception in resume onCancellation handler for " + this, th3), this.e);
        }
    }

    public final void m(he.t tVar, Throwable th2) {
        ld.h hVar = this.e;
        int i10 = f.get(this) & 536870911;
        if (i10 == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            tVar.h(i10, hVar);
        } catch (Throwable th3) {
            f0.m(new androidx.car.app.j("Exception in invokeOnCancellation handler for " + this, th3), hVar);
        }
    }

    public final boolean n(Throwable th2) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof y1)) {
                return false;
            }
            n nVar = new n(this, th2, (obj instanceof k) || (obj instanceof he.t));
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, nVar)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            y1 y1Var = (y1) obj;
            if (y1Var instanceof k) {
                k((k) obj, th2);
            } else if (y1Var instanceof he.t) {
                m((he.t) obj, th2);
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
        p0 p0Var = (p0) atomicReferenceFieldUpdater.get(this);
        if (p0Var == null) {
            return;
        }
        p0Var.dispose();
        atomicReferenceFieldUpdater.set(this, x1.a);
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
                ld.c cVar = this.d;
                if (!z10 && (cVar instanceof he.h)) {
                    boolean z11 = i10 == 1 || i10 == 2;
                    int i13 = this.c;
                    if (z11 == (i13 == 1 || i13 == 2)) {
                        he.h hVar = (he.h) cVar;
                        a0 a0Var = hVar.d;
                        ld.h context = hVar.e.getContext();
                        if (a0Var.d()) {
                            a0Var.c(context, this);
                            return;
                        }
                        x0 a2 = d2.a();
                        if (a2.c >= 4294967296L) {
                            kd.e eVar = a2.e;
                            if (eVar == null) {
                                eVar = new kd.e();
                                a2.e = eVar;
                            }
                            eVar.addLast(this);
                            return;
                        }
                        a2.h(true);
                        try {
                            f0.s(this, cVar, true);
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
                f0.s(this, cVar, z10);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i11, TLObject.FLAG_30 + (536870911 & i11)));
    }

    public Throwable q(v1 v1Var) {
        return v1Var.getCancellationException();
    }

    public final Object r() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i10;
        g1 g1Var;
        boolean x9 = x();
        do {
            atomicIntegerFieldUpdater = f;
            i10 = atomicIntegerFieldUpdater.get(this);
            int i11 = i10 >> 29;
            if (i11 != 0) {
                if (i11 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                if (x9) {
                    A();
                }
                Object obj = h.get(this);
                if (obj instanceof v) {
                    throw ((v) obj).a;
                }
                int i12 = this.c;
                if ((i12 != 1 && i12 != 2) || (g1Var = (g1) this.e.get(b0.b)) == null || g1Var.isActive()) {
                    return h(obj);
                }
                CancellationException cancellationException = g1Var.getCancellationException();
                b(obj, cancellationException);
                throw cancellationException;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, TLObject.FLAG_29 + (536870911 & i10)));
        if (((p0) n.get(this)) == null) {
            t();
        }
        if (x9) {
            A();
        }
        return md.a.a;
    }

    @Override // ld.c
    public final void resumeWith(Object obj) {
        Throwable a2 = jd.f.a(obj);
        if (a2 != null) {
            obj = new v(a2, false);
        }
        C(obj, this.c, null);
    }

    public final void s() {
        p0 t10 = t();
        if (t10 == null || (h.get(this) instanceof y1)) {
            return;
        }
        t10.dispose();
        n.set(this, x1.a);
    }

    public final p0 t() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        g1 g1Var = (g1) this.e.get(b0.b);
        if (g1Var == null) {
            return null;
        }
        p0 n10 = f0.n(g1Var, true, new o(this), 2);
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
        sb2.append(f0.t(this.d));
        sb2.append("){");
        Object obj = h.get(this);
        sb2.append(obj instanceof y1 ? "Active" : obj instanceof n ? "Cancelled" : "Completed");
        sb2.append("}@");
        sb2.append(f0.k(this));
        return sb2.toString();
    }

    public final void u(ud.l lVar) {
        v(new j(lVar, 1));
    }

    public final void v(y1 y1Var) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof b) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, y1Var)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            boolean z10 = true;
            if (obj instanceof k ? true : obj instanceof he.t) {
                y(y1Var, obj);
                throw null;
            }
            if (obj instanceof v) {
                v vVar = (v) obj;
                if (!v.b.compareAndSet(vVar, 0, 1)) {
                    y(y1Var, obj);
                    throw null;
                }
                if (obj instanceof n) {
                    Throwable th2 = vVar.a;
                    if (y1Var instanceof k) {
                        k((k) y1Var, th2);
                        return;
                    } else {
                        m((he.t) y1Var, th2);
                        return;
                    }
                }
                return;
            }
            if (obj instanceof u) {
                u uVar = (u) obj;
                if (uVar.b != null) {
                    y(y1Var, obj);
                    throw null;
                }
                if (y1Var instanceof he.t) {
                    return;
                }
                k kVar = (k) y1Var;
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
                if (y1Var instanceof he.t) {
                    return;
                }
                u uVar2 = new u(obj, (k) y1Var, (ud.l) null, (Throwable) null, 28);
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
        return h.get(this) instanceof y1;
    }

    public final boolean x() {
        if (this.c != 2) {
            return false;
        }
        ld.c cVar = this.d;
        kotlin.jvm.internal.i.c(cVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return he.h.n.get((he.h) cVar) != null;
    }

    public String z() {
        return "CancellableContinuation";
    }
}
