package h9;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public class j0 extends m implements a1, Serializable {
    public final transient y1 e;
    public final transient int f;

    public j0(y1 y1Var, int i7) {
        this.e = y1Var;
        this.f = i7;
    }

    @Override // h9.l, h9.j1
    public final Collection a() {
        return (d0) super.a();
    }

    @Override // h9.l
    public final boolean c(Object obj) {
        return obj != null && super.c(obj);
    }

    @Override // h9.j1
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // h9.l
    public final Map d() {
        throw new AssertionError("should never be called");
    }

    @Override // h9.l
    public final Collection e() {
        return new n0(this);
    }

    @Override // h9.l
    public final Set f() {
        throw new AssertionError("unreachable");
    }

    @Override // h9.l
    public final Iterator g() {
        return new m0(this);
    }

    @Override // h9.j1
    public final Collection get(Object obj) {
        i0 i0Var = (i0) this.e.get(obj);
        if (i0Var != null) {
            return i0Var;
        }
        g0 g0Var = i0.b;
        return t1.e;
    }

    @Override // h9.l, h9.j1
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public l0 b() {
        return this.e;
    }

    @Override // h9.l, h9.j1
    public final Set keySet() {
        y1 y1Var = this.e;
        t0 t0Var = y1Var.b;
        if (t0Var != null) {
            return t0Var;
        }
        w1 d = y1Var.d();
        y1Var.b = d;
        return d;
    }

    @Override // h9.l, h9.j1
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // h9.j1
    public final int size() {
        return this.f;
    }
}
