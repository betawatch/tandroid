package h9;

import j$.util.Collection;
import java.util.Arrays;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public abstract class r0 extends d0 implements n1, Collection {
    public static final /* synthetic */ int d = 0;
    public transient t1 b;
    public transient t0 c;

    @Override // h9.d0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return ((z1) this).e.b(obj) > 0;
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n1)) {
            return false;
        }
        n1 n1Var = (n1) obj;
        z1 z1Var = (z1) this;
        if (z1Var.size() != n1Var.size()) {
            return false;
        }
        r0 r0Var = (r0) n1Var;
        if (p().size() != r0Var.p().size()) {
            return false;
        }
        for (p1 p1Var : r0Var.p()) {
            if (z1Var.e.b(p1Var.a) != p1Var.a()) {
                return false;
            }
        }
        return true;
    }

    @Override // h9.d0
    public final i0 f() {
        t1 t1Var = this.b;
        if (t1Var != null) {
            return t1Var;
        }
        i0 f10 = super.f();
        this.b = (t1) f10;
        return f10;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return o.o(p());
    }

    @Override // h9.d0
    public final int i(int i7, Object[] objArr) {
        h2 it = p().iterator();
        while (it.hasNext()) {
            p1 p1Var = (p1) it.next();
            Arrays.fill(objArr, i7, p1Var.a() + i7, p1Var.a);
            i7 += p1Var.a();
        }
        return i7;
    }

    @Override // h9.d0
    /* renamed from: n */
    public final h2 iterator() {
        return new o0(p().iterator());
    }

    public abstract t0 o();

    public final t0 p() {
        t0 t0Var = this.c;
        if (t0Var == null) {
            t0Var = isEmpty() ? a2.s : new q0(this, 0);
            this.c = t0Var;
        }
        return t0Var;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return p().toString();
    }
}
