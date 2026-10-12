package e9;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public class o0 extends q implements f1, Serializable {
    public final transient c2 e;
    public final transient int f;

    public o0(c2 c2Var, int i10) {
        this.e = c2Var;
        this.f = i10;
    }

    @Override // e9.p, e9.n1
    public final Collection a() {
        return (i0) super.a();
    }

    @Override // e9.p
    public final boolean c(Object obj) {
        return obj != null && super.c(obj);
    }

    @Override // e9.n1
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // e9.p
    public final Map d() {
        throw new AssertionError("should never be called");
    }

    @Override // e9.p
    public final Collection e() {
        return new s0(this);
    }

    @Override // e9.p
    public final Set f() {
        throw new AssertionError("unreachable");
    }

    @Override // e9.p
    public final Iterator g() {
        return new r0(this);
    }

    @Override // e9.n1
    public final Collection get(Object obj) {
        n0 n0Var = (n0) this.e.get(obj);
        if (n0Var != null) {
            return n0Var;
        }
        l0 l0Var = n0.b;
        return x1.e;
    }

    @Override // e9.p, e9.n1
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public q0 b() {
        return this.e;
    }

    @Override // e9.p, e9.n1
    public final Set keySet() {
        c2 c2Var = this.e;
        y0 y0Var = c2Var.b;
        if (y0Var != null) {
            return y0Var;
        }
        a2 c10 = c2Var.c();
        c2Var.b = c10;
        return c10;
    }

    @Override // e9.p, e9.n1
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // e9.n1
    public final int size() {
        return this.f;
    }
}
