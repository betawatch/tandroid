package h9;

import j$.util.Collection;
import java.util.Arrays;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public abstract class r0 extends d0 implements m1, Collection {
    public static final /* synthetic */ int d = 0;
    public transient s1 b;
    public transient t0 c;

    @Override // h9.d0, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return ((y1) this).e.b(obj) > 0;
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m1)) {
            return false;
        }
        m1 m1Var = (m1) obj;
        y1 y1Var = (y1) this;
        if (y1Var.size() != m1Var.size()) {
            return false;
        }
        r0 r0Var = (r0) m1Var;
        if (p().size() != r0Var.p().size()) {
            return false;
        }
        for (o1 o1Var : r0Var.p()) {
            if (y1Var.e.b(o1Var.a) != o1Var.a()) {
                return false;
            }
        }
        return true;
    }

    @Override // h9.d0
    public final i0 f() {
        s1 s1Var = this.b;
        if (s1Var != null) {
            return s1Var;
        }
        i0 f10 = super.f();
        this.b = (s1) f10;
        return f10;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return o.o(p());
    }

    @Override // h9.d0
    public final int i(int i7, Object[] objArr) {
        g2 it = p().iterator();
        while (it.hasNext()) {
            o1 o1Var = (o1) it.next();
            Arrays.fill(objArr, i7, o1Var.a() + i7, o1Var.a);
            i7 += o1Var.a();
        }
        return i7;
    }

    @Override // h9.d0
    /* renamed from: n */
    public final g2 iterator() {
        return new o0(p().iterator());
    }

    public abstract t0 o();

    public final t0 p() {
        t0 t0Var = this.c;
        if (t0Var == null) {
            t0Var = isEmpty() ? z1.s : new q0(this, 0);
            this.c = t0Var;
        }
        return t0Var;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return p().toString();
    }
}
