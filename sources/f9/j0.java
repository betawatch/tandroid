package f9;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public class j0 extends m implements a1, Serializable {
    public final transient x1 e;
    public final transient int f;

    public j0(x1 x1Var, int i10) {
        this.e = x1Var;
        this.f = i10;
    }

    @Override // f9.l, f9.i1
    public final Collection a() {
        return (d0) super.a();
    }

    @Override // f9.l
    public final boolean c(Object obj) {
        return obj != null && super.c(obj);
    }

    @Override // f9.i1
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // f9.l
    public final Map d() {
        throw new AssertionError("should never be called");
    }

    @Override // f9.l
    public final Collection e() {
        return new n0(this);
    }

    @Override // f9.l
    public final Set f() {
        throw new AssertionError("unreachable");
    }

    @Override // f9.l
    public final Iterator g() {
        return new m0(this);
    }

    @Override // f9.i1
    public final Collection get(Object obj) {
        i0 i0Var = (i0) this.e.get(obj);
        if (i0Var != null) {
            return i0Var;
        }
        g0 g0Var = i0.b;
        return s1.e;
    }

    @Override // f9.l, f9.i1
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public l0 b() {
        return this.e;
    }

    @Override // f9.l, f9.i1
    public final Set keySet() {
        x1 x1Var = this.e;
        t0 t0Var = x1Var.b;
        if (t0Var != null) {
            return t0Var;
        }
        v1 c10 = x1Var.c();
        x1Var.b = c10;
        return c10;
    }

    @Override // f9.l, f9.i1
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // f9.i1
    public final int size() {
        return this.f;
    }
}
