package e9;

import j$.util.Collection;
import java.util.Arrays;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract class w0 extends i0 implements r1, Collection {
    public static final /* synthetic */ int d = 0;
    public transient x1 b;
    public transient y0 c;

    @Override // e9.i0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return ((d2) this).e.b(obj) > 0;
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r1)) {
            return false;
        }
        r1 r1Var = (r1) obj;
        d2 d2Var = (d2) this;
        if (d2Var.size() != r1Var.size()) {
            return false;
        }
        w0 w0Var = (w0) r1Var;
        if (t().size() != w0Var.t().size()) {
            return false;
        }
        for (t1 t1Var : w0Var.t()) {
            if (d2Var.e.b(t1Var.a) != t1Var.a()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return s.n(t());
    }

    @Override // e9.i0
    public final n0 l() {
        x1 x1Var = this.b;
        if (x1Var != null) {
            return x1Var;
        }
        n0 l4 = super.l();
        this.b = (x1) l4;
        return l4;
    }

    @Override // e9.i0
    public final int m(int i10, Object[] objArr) {
        m2 it = t().iterator();
        while (it.hasNext()) {
            t1 t1Var = (t1) it.next();
            Arrays.fill(objArr, i10, t1Var.a() + i10, t1Var.a);
            i10 += t1Var.a();
        }
        return i10;
    }

    @Override // e9.i0
    /* renamed from: r */
    public final m2 iterator() {
        return new t0(t().iterator());
    }

    public abstract y0 s();

    public final y0 t() {
        y0 y0Var = this.c;
        if (y0Var == null) {
            y0Var = isEmpty() ? e2.s : new v0(this, 0);
            this.c = y0Var;
        }
        return y0Var;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return t().toString();
    }
}
