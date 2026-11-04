package g9;

import j$.util.Collection;
import java.util.Arrays;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class r0 extends d0 implements m1, Collection {
    public static final /* synthetic */ int d = 0;
    public transient s1 b;
    public transient t0 c;

    @Override // g9.d0, java.util.AbstractCollection, java.util.Collection
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

    @Override // g9.d0
    public final i0 h() {
        s1 s1Var = this.b;
        if (s1Var != null) {
            return s1Var;
        }
        i0 h = super.h();
        this.b = (s1) h;
        return h;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return o.o(p());
    }

    @Override // g9.d0
    public final int i(int i3, Object[] objArr) {
        g2 it = p().iterator();
        while (it.hasNext()) {
            o1 o1Var = (o1) it.next();
            Arrays.fill(objArr, i3, o1Var.a() + i3, o1Var.a);
            i3 += o1Var.a();
        }
        return i3;
    }

    @Override // g9.d0
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
